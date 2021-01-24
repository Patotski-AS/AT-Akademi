package com.itacademy.javacore.homeWork.homeWork12.task5;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Port {
    public final Semaphore docks;
    private final int maxContainers;
    private final AtomicInteger countContainers;
    private final Lock lock = new ReentrantLock();
    private final Condition conLoading = lock.newCondition();
    private final Condition conUnloading = lock.newCondition();

    public Port(int countDocks, int maxContainers, int countContainers) {
        docks = new Semaphore(countDocks, true);
        this.maxContainers = maxContainers;
        this.countContainers = new AtomicInteger(countContainers);
        System.out.println("Количество контейнеров в порту: " + countContainers + " шт.");
    }

    public int loading(int containers) {
        lock.lock();
        int x = (containers == 0) ? 0 : new Random().nextInt(containers);
        try {
            while (x > countContainers.get()) {
                conLoading.await();
                conUnloading.signalAll();
            }
            countContainers.set(countContainers.get() - x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + " прибыл на загрузку. Загрузил " + x + " контейнер.");
            conUnloading.signalAll();
            lock.unlock();
        }
        return x;
    }

    public int unloading(int containers) {
        lock.lock();
        int x = (containers == 0) ? 0 : new Random().nextInt(containers);
        try {
            if (x > (maxContainers - countContainers.get())) {
                conUnloading.await();
                conLoading.signalAll();
            }
            countContainers.set(countContainers.get() + x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + " прибыл на выгрузку. Выгрузил " + x + " контейнер.");
            conLoading.signalAll();
            lock.unlock();
        }
        return x;
    }

    public AtomicInteger getCountContainers() {
        return countContainers;
    }

    public int getMaxContainers() {
        return maxContainers;
    }
}
