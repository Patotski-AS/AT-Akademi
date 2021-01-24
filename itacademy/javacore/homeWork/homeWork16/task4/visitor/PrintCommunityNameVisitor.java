package com.itacademy.javacore.homeWork.homeWork16.task4.visitor;

import com.itacademy.javacore.homeWork.homeWork16.task4.composite_visitor.AdminPart;
import com.itacademy.javacore.homeWork.homeWork16.task4.composite_visitor.Community;
import com.itacademy.javacore.homeWork.homeWork16.task4.composite_visitor.Country;
import com.itacademy.javacore.homeWork.homeWork16.task4.composite_visitor.Locality;

public class PrintCommunityNameVisitor implements Visitor {

    @Override
    public void visit(Community community) {
        System.out.println(community.getName());
    }

    @Override
    public void visit(Country country) {
        for (Locality locality:country.getAdminParts()){
            if (locality instanceof Community)
                System.out.println(locality.getName());
            else
                locality.accept(this);
        }

    }

    @Override
    public void visit(AdminPart adminPart) {
        for (Locality locality:adminPart.getLocalities()){
            if (locality instanceof Community)
                System.out.println(locality.getName());
            else
                locality.accept(this);
        }

    }


}
