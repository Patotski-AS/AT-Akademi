package com.itacademy.javacore.homeWork.homeWork15.task5;

/** "Director" */
public class Waiter {
    StandardLunchBuilder standardLunchBuilder;

    public void setStandardLunchBuilder(StandardLunchBuilder standardLunchBuilder) {
        this.standardLunchBuilder = standardLunchBuilder;
    }

    public SetLunch getStandardLunch() {
        return standardLunchBuilder.setLunch;
    }

    public void createStandardLunch(){
        standardLunchBuilder.createNewSetLunch();
        standardLunchBuilder.addFirstDish();
        standardLunchBuilder.addSecondDish();
        standardLunchBuilder.addThreeDish();
    }

    public ExtendedLunchBuilder createExtendedLunchBuilder(){
        return new ExtendedLunchBuilder();
    }





}
