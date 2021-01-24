package com.itacademy.javacore.homeWork.homeWork15.task5;

/** "ConcreteBuilder" */
public class ExtendedLunchBuilder {
    private SetLunch setLunch=new SetLunch();

    public ExtendedLunchBuilder addFirstDish(Menu menu){
        setLunch.setFirstDish(menu);
        return this;
    }

    public ExtendedLunchBuilder addSecondDish(Menu menu){
        setLunch.setSecondDish(menu);
        return this;
    }

    public ExtendedLunchBuilder addThreeDish(Menu menu){
        setLunch.setThreeDish(menu);
        return this;
    }

    public ExtendedLunchBuilder addAdditionalDish(Menu menu){
        setLunch.setAdditionalDish(menu);
        return this;
    }

    public SetLunch ready(){
        return setLunch;
    }

}
