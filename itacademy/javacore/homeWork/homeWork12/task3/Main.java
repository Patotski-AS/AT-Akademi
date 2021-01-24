package com.itacademy.javacore.homeWork.homeWork12.task3;


import java.util.Random;
import java.util.concurrent.Semaphore;

//Семафор предназначен для управления въездом в туннель с односторонним движением.
//        Каждый поток обозначает движение машины по тоннелю,
//        проезд машины по которому длится от 1 до 3 секунд(случайное число от 1 до 3).
//        В тоннеле может находиться до 3 машин одновременно.
//        Пример работы с Semaphore в пакете com.company.syncexamples.semaphore в проекте threads.
public class Main {
    public static void main(String[] args) {
        Tunnel tunnel = new Tunnel(3);
        tunnel.createCars(15);
    }

    public static class Tunnel {
        private final Semaphore semaphore;

        public Tunnel(int maxCars) {
            semaphore = new Semaphore(maxCars, true);
        }
        private void driveThrough() {
            Random random = new Random();
            try {
                semaphore.acquire();
                Thread.sleep(random.nextInt(3000 - 1000 + 1) + 1000);
                System.out.println(Thread.currentThread().getName() + ", проехал через тоннель");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }

        public void createCars(int count) {
            for (int i = 0; i < count; i++)
                new Thread(() -> {
                    System.out.println(Thread.currentThread().getName() + ", подъехал к тоннелю." +
                            "Очередь: " + semaphore.getQueueLength() + " авто");
                    driveThrough();
                }, "Car-" + (i + 1)).start();
        }


    }
}
