package com.javarush.task.task20.task2015;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
��������������� ������������
�������� ���, ����� ����� �������������� ���� runner ���������� ��������.
�������� ����� ������� runner ������ ������.

Hint/���������:
����������� �� ���������� ��� ��������������, ������ ���������������� ��� ����.
*/

public class Solution implements Serializable,Runnable {
    private transient Thread runner;
    private int speed;

    public Solution(int speed) {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();
    }

    public void run() {
        // do something here, doesn't matter what
    }

    /**
     * �������������� ������������.
     * ��� ����� ���������� �������� ������:
     * private void writeObject(ObjectOutputStream out) throws IOException
     * private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     * ������ ������������/�������������� ������ �� ������ �������� :)
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        Thread thread = new Thread(this);
        thread.start();
        in.defaultReadObject();
    }

    public static void main(String[] args) {

    }
}






























