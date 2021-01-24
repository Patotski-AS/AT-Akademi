package com.itacademy.javacore.homeWork.homeWork15.task5;


/*Создать класс Комплексный обед.
 Написать код приложения с помощью шаблона Builder(Строитель),
  позволяющий создавать как стандартные комплексные обеды,
   так и обеды, в которые включены дополнительные блюда из меню.
 */
public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        waiter.setStandardLunchBuilder(new SetLunchBuilder1());
        waiter.createStandardLunch();
        SetLunch standard1 = waiter.getStandardLunch();

        waiter.setStandardLunchBuilder(new SetLunchBuilder2());
        waiter.createStandardLunch();
        SetLunch standard2 = waiter.getStandardLunch();

        SetLunch extendedLunch = waiter.createExtendedLunchBuilder()
                .addFirstDish(Menu.DISH_2)
                .addSecondDish(Menu.DISH_1)
                .addThreeDish(Menu.DISH_7)
                .addAdditionalDish(Menu.DISH_5)
                .ready();


        System.out.println("Стандартный обед №1: " + standard1);
        System.out.println("Стандартный обед №2: " + standard2);
        System.out.println("Индивидуальный заказ: " + extendedLunch);

    }
}
