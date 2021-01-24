package com.itacademy.javacore.homeWork.homeWork12.task5;

public class Ship implements Runnable {
    private final Port port;
    private final int maxContainers;
    private int countContainers;


    public Ship(Port port, int maxContainers, int countContainers) {
        this.port = port;
        this.maxContainers = maxContainers;
        this.countContainers = countContainers;
    }

    public int getCountContainers() {
        return countContainers;
    }

    @Override
    public void run() {
        try {
            System.out.println("\t" + Thread.currentThread().getName() + " на борту: " +
                    getCountContainers() + " контенер, приплыл в порт. Очередь в док: "
                    + port.docks.getQueueLength());
            port.docks.acquire();
            if (port.getCountContainers().get() < (port.getMaxContainers()/100*10)) {
                countContainers -= port.unloading(countContainers);
                Thread.sleep(1000);
            } else {
                countContainers -= port.unloading(countContainers - 1);
                Thread.sleep(1000);
                countContainers += port.loading(maxContainers - countContainers);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("\t" + Thread.currentThread().getName() + " уплыл. На борту: " +
                    getCountContainers() + " контенер" + "\nКоличество контейнеров в порту: "
                    + port.getCountContainers() + " шт.");
            port.docks.release();
        }


    }
}
