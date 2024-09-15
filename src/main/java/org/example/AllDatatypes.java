package org.example;

public class AllDatatypes {

    //Primitive data types
    int primitiveInt = 123435;
    boolean primitiveBool = true;
    char primitiveChar = '=';
    short primitiveShort = 1;
    long primitiveLong = 517235172;
    float primitiveFloat = 12;
    double primitiveDouble = 20;

    //Wrapper or Object data types
    Integer WrapperInt =  Integer.valueOf(123435);
    Boolean WrapperBool = Boolean.valueOf(true);
    Character WrapperChar = Character.valueOf('=');
    Short WrapperShort = Short.valueOf((short)1);
    Long WrapperLong = Long.valueOf(517235172L);
    Float WrapperFloat = Float.valueOf(12);
    Double WrapperDouble = Double.valueOf(20);
    String WrapperString = String.valueOf("This is an exercise!");

    public void DisplayValues(){
        System.out.println("Primitive Data Types:");
        System.out.println("int: " + primitiveInt);
        System.out.println("bool: " + primitiveBool);
        System.out.println("char: " + primitiveChar);
        System.out.println("short: " + primitiveShort);
        System.out.println("long: " + primitiveLong);
        System.out.println("float: " + primitiveFloat);
        System.out.println("double: " + primitiveDouble);

        System.out.println("Wrapper Data Types:");
        System.out.println("Integer: " + WrapperInt);
        System.out.println("Boolean: " + WrapperBool);
        System.out.println("Character: " + WrapperChar);
        System.out.println("Short: " + WrapperShort);
        System.out.println("Long: " + WrapperLong);
        System.out.println("Float: " + WrapperFloat);
        System.out.println("Double: " + WrapperDouble);
        System.out.println("String: " + WrapperString);
    }
}
