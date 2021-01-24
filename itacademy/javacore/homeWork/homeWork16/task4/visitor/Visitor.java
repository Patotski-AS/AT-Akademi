package com.itacademy.javacore.homeWork.homeWork16.task4.visitor;

import com.itacademy.javacore.homeWork.homeWork16.task4.composite_visitor.*;

public interface Visitor {
    void visit(AdminPart adminPart);

    void visit(Community community);

    void visit(Country country);
}
