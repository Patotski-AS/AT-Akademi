package com.itacademy.javacore.homeWork.homeWork16.task4.visitor;

import com.itacademy.javacore.homeWork.homeWork16.task4.composite_visitor.AdminPart;
import com.itacademy.javacore.homeWork.homeWork16.task4.composite_visitor.Community;
import com.itacademy.javacore.homeWork.homeWork16.task4.composite_visitor.Country;
import com.itacademy.javacore.homeWork.homeWork16.task4.composite_visitor.Locality;

public class SearchVisitor implements Visitor {
    private boolean aBoolean;
    private String name;

    public SearchVisitor(String name) {
        this.name = name;
    }

    @Override
    public void visit(Community community) {
        if (community.getName().equals(name))
            aBoolean = true;
    }

    @Override
    public void visit(Country country) {
        if (country.getName().equals(name)) {
            aBoolean = true;
        } else {
            for (Locality locality : country.getAdminParts()) {
                if (locality instanceof Community) {
                    if (locality.getName().equals(name)) {
                        aBoolean = true;
                        break;
                    }
                } else
                    locality.accept(this);
            }
        }
    }

    @Override
    public void visit(AdminPart adminPart) {
        if (adminPart.getName().equals(name))
            aBoolean = true;
        else {
            for (Locality locality : adminPart.getLocalities()) {
                if (locality instanceof Community) {
                    if (locality.getName().equals(name))
                        aBoolean = true;
                } else
                    locality.accept(this);
            }
        }
    }

    public boolean isaBoolean() {
        return aBoolean;
    }
}
