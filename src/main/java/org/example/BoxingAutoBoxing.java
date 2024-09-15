package org.example;

public class BoxingAutoBoxing {

    public void Demo() {
        int PrimitiveInt = 123;

        //Boxing
        Integer WrapperInt1 = Integer.valueOf(PrimitiveInt);

        //Auto Boxing
        Integer WrapperInt2 = PrimitiveInt;

        System.out.println("Boxing: " + WrapperInt1);
        System.out.println("Auto Boxing: " + WrapperInt2);
    }
}
