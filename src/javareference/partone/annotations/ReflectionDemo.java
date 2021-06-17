package javareference.partone.annotations;

// A simple annotation type.
//@interface MyAnno {
//    String str();
//
//    int val();
//}

import java.lang.annotation.*;
import java.lang.reflect.*;

// An annotation type declaration.
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();

    int val();
}

class Meta {
    // Annotate a method.
    @MyAnno2(str = "Annotation Example", val = 100)
    public static void myMeth() {
        Meta4 ob = new Meta4();
// Obtain the annotation for this method
// and display the values of the members.
        try {
// First, get a Class object that represents
// this class.
            Class<?> c = ob.getClass();
// Now, get a Method object that represents
// this method.
            Method m = c.getMethod("myMeth");
// Next, get the annotation for this class.
            MyAnno2 anno = m.getAnnotation(MyAnno2.class);
// Finally, display the values.
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}