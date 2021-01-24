package com.javarush.task.task09.task0916;

import java.io.IOException;
import java.rmi.RemoteException;

/*
Перехват checked-исключений
В методе handleExceptions обработайте все checked исключения.
Нужно вывести на экран возникшее checked исключение.
Можно использовать только один блок try..catch
*/

public class Solution {
    public static void main(String[] args) {
        handleExceptions(new Solution());

    }

    public static void handleExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }catch (RemoteException b) {
            System.out.println(b.getClass());
        }
        catch (IOException a){
            System.out.println(a.getClass());
        }
        catch (NoSuchFieldException c) {
            System.out.println(c.getClass());
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}






























