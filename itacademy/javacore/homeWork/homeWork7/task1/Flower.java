package com.itacademy.javacore.homeWork.homeWork7.task1;

public class Flower {
    private int height = 4;
    private String colorBud;

  public void blossom(){  //расцвести

    }

   public void wither(){  //завять
    }

   public void grow(){  //рости
      height++;
    }

   private class Petal {   //лепесток
    }

    class Bud {   // бутон
        Bud(String color) {
            colorBud = color;
        }
    }

   private class Stem {// Стебель

    }
   private class Sheet {   //лист

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColorBud() {
        return colorBud;
    }

    public void setColorBud(String colorBud) {
        this.colorBud = colorBud;
    }
}
