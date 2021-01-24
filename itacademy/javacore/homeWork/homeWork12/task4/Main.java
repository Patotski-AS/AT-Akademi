package com.itacademy.javacore.homeWork.homeWork12.task4;


import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

//Есть паром, который перевозит машины на другой берег.
//        Каждый поток обозначает движение машины.
//        Паром отправляется, когда набирается хотя бы 6 машин.
//        Использовать барьер.
//        Пример работы с CyclicBarrier в пакете com.company.syncexamples.barrier в проекте threads.
public class Main {
    public static void main(String[] args) {
        Ferry ferry = new Ferry(6);
        ferry.createCars(7);

    }

    public static class Ferry {
      private final CyclicBarrier barrier;

        public Ferry(int barrier) {
            this.barrier = new CyclicBarrier(barrier);
        }

        public void createCars(int count) {
            for (int i = 0; i < count; i++)
                new Thread(() -> {
                    System.out.println(Thread.currentThread().getName() + ", drove up to the ferry.");
                    drive();
                    System.out.println(Thread.currentThread().getName() + ", drive through the ferry" );
                }, "Car-" + (i + 1)).start();
        }

        private void drive() {
            try {
                this.barrier.await(5,TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (TimeoutException | BrokenBarrierException e) {
                barrier.reset();
            }
        }

    }
}
