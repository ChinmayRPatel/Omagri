package NestedClasses;
// Java program to demonstrate an interface cannot
// have non-public member interface.
import java.util.*;
interface Test1 {
    interface Yes {
// /        inner interface cant be protected / private
        void show();
    }
}

class Testing1 implements Test.Yes {
    @Override
    public void show()
    {
        System.out.println("show method of interface");
    }
}

class NestedInterface {
    public static void main(String[] args)
    {
        Testing1 t = new Testing1();

//        obj = t;
        t.show();
    }
}

