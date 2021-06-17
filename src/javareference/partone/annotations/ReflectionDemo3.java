package javareference.partone.annotations;

// Show all annotations for a class and a method.

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnoThree {
    String str();

    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface WhatTwo {
    String description();
}

@WhatTwo(description = "An annotation test class")
@MyAnnoThree(str = "Meta3", val = 99)
class Meta3 {
    @WhatTwo(description = "An annotation test method")
    @MyAnnoThree(str = "Testing", val = 100)
    public static void myMeth() {
        Meta4 ob = new Meta4();
        try {
            Annotation[] annos = ob.getClass().getAnnotations();
            // Display all annotations for Meta3.
            System.out.println("All annotations for Meta2:");
            for (Annotation a : annos)
                System.out.println(a);
            System.out.println();
            // Display all annotations for myMeth.
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();
            System.out.println("All annotations for myMeth:");
            for (Annotation a : annos)
                System.out.println(a);
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}