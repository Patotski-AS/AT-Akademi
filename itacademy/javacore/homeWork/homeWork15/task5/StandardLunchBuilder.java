package com.itacademy.javacore.homeWork.homeWork15.task5;

/** "Abstract Builder" */
public abstract class StandardLunchBuilder {
    protected SetLunch setLunch;

    public SetLunch getSetLunch() {
        return setLunch;
    }
    public void createNewSetLunch() {
        setLunch = new SetLunch();
    }

    public abstract void addFirstDish();
    public abstract void addSecondDish();
    public abstract void addThreeDish();
    public abstract void addAdditionalDish();

}
