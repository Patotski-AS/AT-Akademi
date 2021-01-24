package com.itacademy.javacore.homeWork.homeWork16.task4.visitor;

import com.itacademy.javacore.homeWork.homeWork16.task4.composite_visitor.AdminPart;
import com.itacademy.javacore.homeWork.homeWork16.task4.composite_visitor.Community;
import com.itacademy.javacore.homeWork.homeWork16.task4.composite_visitor.Country;
import com.itacademy.javacore.homeWork.homeWork16.task4.composite_visitor.Locality;

import java.util.Random;

public class FillingVisitor implements Visitor {
    private String name;


    @Override
    public void visit(Community community) {

    }

    @Override
    public void visit(Country country) {
        this.name = country.getName();
        for (int i = 0; i < 5; i++) {
            country.getAdminParts().add(new AdminPart(name+"_Part" + i));
        }
        for (Locality locality : country.getAdminParts()) {
            locality.accept(new FillingVisitor());
        }
    }

    @Override
    public void visit(AdminPart adminPart) {
        for (int i = 0; i < 5; i++) {
            adminPart.getLocalities()
                    .add(new Community( adminPart.getName()
                            + "_Community" + i,new Random().nextInt(500_000)+100_000));
        }



    }


}
