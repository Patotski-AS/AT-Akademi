package com.itacademy.javacore.homeWork.homeWork13.task1;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Для этого задания пул потоков не нужен. Использовать BlockingQueue.
 * Есть 3 производителя и 2 потребителя, все разные потоки и работают все одновременно.
 * Есть очередь с 200 элементами. Производители добавляют случайное число от 1..100,
 * а потребители берут эти числа. Если в очереди элементов >= 100 производители спят,
 * если нет элементов в очереди – потребители спят. Если элементов стало <= 80,
 * производители просыпаются. Все это работает до тех пор, пока обработанных элементов не станет 10000,
 * только потом программа завершается.
 */
public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory(200);
        //Создаем производителей
        factory.createProduce(3);
        //Создаем потребитлей
        factory.createConsumer(2);
    }

    public static class Factory {
        private final BlockingQueue<Integer> queue;
        private final AtomicInteger count;


        public Factory(int queue) {
            this.queue = new ArrayBlockingQueue<>(queue);
            this.count = new AtomicInteger(0);
        }

        private synchronized void produce() {
            while (count.get() < 10000) {
                if (queue.size() >= 100) {
                    System.out.println(count + ".\t" + Thread.currentThread().getName() + " ждет");
                    while (true) {
                        if (queue.size() <= 80) {
                            System.out.println(count + ".\t" + Thread.currentThread().getName() + " возобновил работу");
                            break;
                        }
                    }
                }
                try {
                    queue.put(new Random().nextInt(100) + 1);
                    count.incrementAndGet();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(count + ".\t" + queue.size());
            }
        }

        private void consume() {
            while (count.get() < 10000) {
                if (queue.size() == 0) {
                    System.out.println(count + ".\t" + Thread.currentThread().getName() + " ждет");
                    while (true) {
                        if (queue.size() > 0 || count.get() >= 10000) {
                            System.out.println(count + ".\t" + Thread.currentThread().getName() + " возобновил работу");
                            break;
                        }

                    }
                }
                try {
                    queue.take();
                    count.incrementAndGet();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(count + ".\t" + queue.size());
            }
        }

        public void createProduce(int number) {
            for (int i = 0; i < number; i++) {
                new Thread(() -> {
                    produce();
                    System.out.println(Thread.currentThread().getName() + " отработал");
                }, "Produce-" + i).start();
            }
        }

        public void createConsumer(int number) {
            for (int i = 0; i < number; i++) {
                new Thread(() -> {
                    consume();
                    System.out.println(Thread.currentThread().getName() + " отработал");
                }, "Consumer-" + i).start();
            }
        }


    }
}
