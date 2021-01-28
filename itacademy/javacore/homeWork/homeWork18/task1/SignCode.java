package com.itacademy.javacore.homeWork.homeWork18.task1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SignCode {
    Type type();
    int id ();
}
