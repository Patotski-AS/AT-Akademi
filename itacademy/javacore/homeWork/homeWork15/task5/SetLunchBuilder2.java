package com.itacademy.javacore.homeWork.homeWork15.task5;

/** "ConcreteBuilder" */
public class SetLunchBuilder2 extends StandardLunchBuilder {

    @Override
    public void addFirstDish() {
        setLunch.setFirstDish(Menu.DISH_4);
    }

    @Override
    public void addSecondDish() {
        setLunch.setSecondDish(Menu.DISH_5);
    }

    @Override
    public void addThreeDish() {
        setLunch.setThreeDish(Menu.DISH_6);
    }

    @Override
    public void addAdditionalDish() {
        setLunch.setAdditionalDish(null);
    }

}
