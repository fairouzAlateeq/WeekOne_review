package com.ps;

public class Calculator {
    public static void main(String[] args) {
        // invoking or calling methods;
        Calculator cal = new Calculator();
        cal.addInstance(1,2);
        addStatic(3,4);

    }
    public void addInstance(int num1, int num2){
        System.out.println(num1+num2);
    }
    public static void addStatic(int num1, int num2){
        System.out.println(num1+num2);

    }
    public static int add(int num1, int num2, int num3) {
        int sum;
        sum = num1 + num2 + num3;
        return sum;
    }
    public static int subtract(int num1, int num2, int num3) {
        int result = 0;

        if (num1 > num2)
            if (num2>num3)
                result = num1 - num2 - num3;
        else if (num3>num2)
                result = num3 - num2 - num1;
        return result;
    }
    public static int multiply(int num1, int num2, int num3) {
        int result;
        result = num1 * num2 * num3;
        return result;
    }
    public static float mod(int num1, int num2, int num3){
        int result;
        result = num1 % num2 % num3;
        return result;
    }
    public static float division(int num1, int num2, int num3){
        int result;
        result = num1 / num2 / num3;
        return result;
    }
}
