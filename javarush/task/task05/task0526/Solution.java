package com.javarush.task.task05.task0526;

/*
Мужчина и женщина
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address
*/

public class Solution {
    public static void main(String[] args) {
        Man name1 = new Man("name1", 25,"address1");
        Man name2 = new Man("name2", 25,"address2");
        Woman name3 = new Woman("name3", 25,"address3");
        Woman name4 = new Woman("name4", 25,"address4");

        System.out.println(name1.name + " " + name1.age + " " + name1.address);
        System.out.println(name2.name + " " + name2.age + " " + name2.address);
        System.out.println(name3.name + " " + name3.age + " " + name3.address);
        System.out.println(name4.name + " " + name4.age + " " + name4.address);

        //напишите тут ваш код
    }

    public static class Man{
       String name;
       int age;
       String address;

       public Man (String name)   {
          this.name=name;
        }

       public Man (String name,int age)   {
          this.name=name;
          this.age = age;
        }

       public Man (String name,int age, String address)   {
          this.name=name;
          this.age = age;
          this.address = address;
        }

    }

    public static class Woman{
        String name;
        int age;
        String address;

        public Woman (String name)   {
            this.name=name;
        }

        public Woman (String name,int age)   {
            this.name=name;
            this.age = age;
        }

        public Woman (String name,int age, String address)   {
            this.name=name;
            this.age = age;
            this.address = address;
        }
    }



    //напишите тут ваш код
}






























