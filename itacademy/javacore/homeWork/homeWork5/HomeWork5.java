package com.itacademy.javacore.homeWork.homeWork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork5 {

    public static void main(String[] args) throws IOException {
//       task1();
//        task2();
//        task3();
//        task4();
//        task5();
    }

    //Проверка
    public static void task1() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите предложение без знаков припенания.");
        String text = reader.readLine();
        System.out.println("Количество слов в данном предложении: " + wordCounter(text));
        reader.close();
    }

    public static void task2() {
//                Создать класс Triangle, хранящий три стороны треугольника. Сделать конструктор,
//        который получает в качестве параметра 3 стороны.
//        который получает одно число и строит равносторонний треугольник с такой стороной.
//        по умолчанию(без параметров), который создает равносторонний треугольник со стороной 1.
//        Создать методы, позволяющие рассчитать периметр и площадь треугольников. Создать методы,
//        определяющие, является ли треугольник равносторонним, равнобедренным, прямоугольным.
        Triangle x1 = new Triangle();
        Triangle x2 = new Triangle(5);
        Triangle x3 = new Triangle(3, 4, 5);

        Triangle[] array = new Triangle[]{x1, x2, x3};

        for (Triangle x : array) {
            System.out.println("Треугольник со сторонами а = " + x.a + ",b = " + x.b + ",c = " + x.c + ". ");
            System.out.println("Периметр треугольника: " + x.perimeter());
            System.out.printf("Площадь треугольника: %.2f \n", x.area());
            System.out.println("Является ли треугольник равносторонним:  " + x.equilateral());
            System.out.println("Является ли треугольник равнобедренным:  " + x.isosceles());
            System.out.println("Является ли треугольник  прямоугольным:  " + x.rectangular());
            System.out.println();
        }


    }

    public static void task3() {
//Создать класс описывающие промежуток времени.
//Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//Сделать методы для получения полного количества секунд в объекте,
//сравнения двух объектов (метод должен работать аналогично compareTo в строках, т. е. возвращать отрицательное значение,
//если объект меньше объекта, с которым сравнивается, положительное, если больше, 0, если объекты равны.).
//Создать два конструктора:
//• получающий общее количество секунд
//• получающий часы, минуты и секунды по отдельности.
        TimeInterval t1 = new TimeInterval(1, 20, 55);
        TimeInterval t2 = new TimeInterval(3600);
        System.out.println(t1.compareTimeInterval(t2));

    }

    public static void task4() {
//Создать класс Book с полями: author, name, pagesAmount, readByMe, конструктором, который принимает первые три поля,
//а readByMe устанавливает в false, и с методом read (прочитать). Cоздать класс Bookshelf, с конструктором.
//который принимает количество книг, которое можно поставить на полку. Для класса Bookshelf реализовать методы addBook,
//removeBook, countReadBooks(посчитать прочитанные книги), countBooks. Использовать массив для реализации класса Bookshelf.
        Bookshelf bookshelf = new Bookshelf(5);
        Book book1 = new Book("autor1", "name1", 100);
        Book book2 = new Book("autor2", "name2", 50);
        Book book3 = new Book("autor3", "name3", 300);
        Book book4 = new Book("autor4", "name4", 180);

        book2.read();
        book4.read();

        bookshelf.addBook(book1);
        bookshelf.addBook(book2);
        bookshelf.addBook(book3);
        bookshelf.addBook(book4);

        System.out.println(Arrays.toString(bookshelf.books));
        System.out.println("Всего книг на полке: " + bookshelf.countBooks());
        System.out.println("Прочитано книг: " + bookshelf.countReadBooks());

        bookshelf.removeBook(book2);
        System.out.println(Arrays.toString(bookshelf.books));

    }

    public static void task5() {
        String text = "80298888888, +375293333333, 80337777777  +375445555555  80174555555 +375179999999 80259999999 +375258888888";
        System.out.println("Телефоны MTS:");
        printMTS(text);
        System.out.println("Телефоны A1(VELCOM):");
        printA1(text);
        System.out.println("Телефоны LIFE:");
        printLife(text);
        System.out.println("Телефоны Белтелоком:");
        printBeltelekom(text);
    }

    public static int wordCounter(String text) {
        int count = 0;
        Pattern pattern = Pattern.compile("\\b[А-Яа-я\\w]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.groupCount());
            count++;
        }
        return count;
    }

    public static class Triangle {
        int a;
        int b;
        int c;

        public Triangle(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public Triangle(int a) {
            this(a, a, a);
        }

        public Triangle() {
            this(1, 1, 1);
        }

        public int perimeter() {
            return a + b + c;
        }

        public double area() {
            double p = this.perimeter();
            return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
        }

        //        Равносторонний?
        public boolean equilateral() {
            return this.a == this.b && this.b == this.c;
        }

        //        Равнобедренный?
        public boolean isosceles() {
            return this.a == this.b || this.b == this.c || this.a == this.c;
        }

        //        Прямоугольный?
        public boolean rectangular() {
            int[] array = new int[]{this.a, this.b, this.c};
            Arrays.sort(array);
            return Math.pow(array[2], 2) == Math.pow(array[1], 2) + Math.pow(array[0], 2);
        }


    }

    public static class TimeInterval {
        int hour;
        int min;
        int sec;
        int interval;

        public TimeInterval(int hour, int min, int sec) {
            this.hour = hour;
            this.min = min;
            this.sec = sec;
            this.interval = calcInterval();
        }

        public TimeInterval(int interval) {
            calcHMS(this.interval = interval);
        }

        public int calcInterval() {
            return this.hour * 3600 + this.min * 60 + this.sec;
        }

        public void calcHMS(int interval) {
            this.hour = interval / 3600;
            this.min = (interval % 3600) / 60;
            this.sec = interval % 60;

        }

        public int compareTimeInterval(TimeInterval x) {
            return this.interval - x.interval;
        }

    }

    public static class Book {
        String author;
        String name;
        int pagesAmount;
        boolean readByMe;

        public Book(String author, String name, int pagesAmount) {
            this.author = author;
            this.name = name;
            this.pagesAmount = pagesAmount;
            this.readByMe = false;
        }

        public void read() {
            this.readByMe = true;
        }

    }

    public static class Bookshelf {
        int maxBook;
        Book[] books;

        public Bookshelf(int maxBook) {
            this.maxBook = maxBook;
            this.books = new Book[maxBook];
        }

        public void addBook(Book book) {
            if (countBooks() >= maxBook) {
                System.out.println("На книжной полке нет места!");
                return;
            }
            for (int i = 0; i < books.length; i++) {
                if (books[i] == null) {
                    books[i] = book;
                    return;
                }
            }
        }

        public void removeBook(Book book) {
            for (int i = 0; i < books.length; i++) {
                if (books[i] != null) {
                    if (books[i].equals(book)) {
                        books[i] = null;
                        return;
                    }
                }
            }
        }

        public int countReadBooks() {
            int count = 0;
            for (Book book : books) {
                if (book != null)
                    if (book.readByMe)
                        count++;
            }
            return count;
        }

        public int countBooks() {
            int count = 0;
            for (Book book : books) {
                if (book != null)
                    count++;
            }
            return count;
        }


    }

    public static void printMTS(String text) {
        Pattern pattern = Pattern.compile("(\\+375|80)((29|44|33|25|17)([1-9])\\d{6})");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            if (matcher.group(3).equals("33")) {
                System.out.println("+375" + matcher.group(2));
            } else if (matcher.group(3).equals("29")) {
                if (matcher.group(4).equals("2") ||
                        matcher.group(4).equals("5") ||
                        matcher.group(4).equals("7") ||
                        matcher.group(4).equals("8")) {
                    System.out.println("+375" + matcher.group(2));
                }
            }

        }
    }

    public static void printA1(String text) {
        Pattern pattern = Pattern.compile("(\\+375|80)((29|44|33|25|17)([1-9])\\d{6})");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            if (matcher.group(3).equals("44")) {
                System.out.println("+375" + matcher.group(2));
            } else if (matcher.group(3).equals("29")) {
                if (matcher.group(4).equals("1") ||
                        matcher.group(4).equals("3") ||
                        matcher.group(4).equals("6") ||
                        matcher.group(4).equals("9")) {
                    System.out.println("+375" + matcher.group(2));
                }
            }

        }
    }

    public static void printLife(String text) {
        Pattern pattern = Pattern.compile("(\\+375|80)((29|44|33|25|17)([1-9])\\d{6})");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            if (matcher.group(3).equals("25")) {
                System.out.println("+375" + matcher.group(2));
            }
        }
    }

    public static void printBeltelekom(String text) {
        Pattern pattern = Pattern.compile("(\\+375|80)((29|44|33|25|17)([1-9])\\d{6})");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            if (matcher.group(3).equals("17")) {
                System.out.println("+375" + matcher.group(2));
            }
        }
    }

}



