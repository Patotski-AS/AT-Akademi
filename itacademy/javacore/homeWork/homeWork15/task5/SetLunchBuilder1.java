package com.itacademy.javacore.homeWork.homeWork15.task5;

/** "ConcreteBuilder" */
public class SetLunchBuilder1 extends StandardLunchBuilder {

    @Override
    public void addFirstDish() {
        setLunch.setFirstDish(Menu.DISH_1);
    }

    @Override
    public void addSecondDish() {
        setLunch.setSecondDish(Menu.DISH_2);
    }

    @Override
    public void addThreeDish() {
        setLunch.setThreeDish(Menu.DISH_3);
    }

    @Override
    public void addAdditionalDish() {
        setLunch.setAdditionalDish(null);
    }
}
