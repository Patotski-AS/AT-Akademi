package com.itacademy.javacore.homeWork.homeWork15.task5;


/** "Product" */
public class SetLunch {
   private Menu firstDish;
   private Menu secondDish;
   private Menu threeDish;
   private Menu additionalDish;

    public void setFirstDish(Menu firstDish) {
        this.firstDish = firstDish;
    }

    public void setSecondDish(Menu secondDish) {
        this.secondDish = secondDish;
    }

    public void setThreeDish(Menu threeDish) {
        this.threeDish = threeDish;
    }

    public void setAdditionalDish(Menu additionalDish) {
        this.additionalDish = additionalDish;
    }

    @Override
    public String toString() {
        return "SetLunch{" +
                "firstDish=" + firstDish +
                ", secondDish=" + secondDish +
                ", threeDish=" + threeDish +
                ", additionalDish=" + additionalDish +
                '}';
    }
}
