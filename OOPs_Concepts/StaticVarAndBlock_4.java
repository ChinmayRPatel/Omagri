package OOPs_Concepts;

class OuterClass {
    static String outerStaticVariable = "Static Variable of Outer Class";
    static{
        outerStaticVariable="static variable assigned";
        System.out.println("This is static block which will executre at the time of load the file onm runtime ");
        System.out.println(outerStaticVariable);
    }
    static class StaticNestedClass {
        void display() {
            System.out.println("Inside static classes");
            System.out.println("Accessing outer class = " + outerStaticVariable);
        }
    }
}

class StaticVarAndBlock {
        public static void main(String[] args) {
            OuterClass.StaticNestedClass obj = new OuterClass.StaticNestedClass();
            obj.display();
        }
}


