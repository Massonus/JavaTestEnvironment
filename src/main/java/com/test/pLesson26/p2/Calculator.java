package com.test.pLesson26.p2;

interface Operation{
    int execute(int x, int y);
}

public class Calculator {

    public static void main(String[] args) {
        Operation func = action("+");
        double addition = func.execute(6, 2);
        System.out.println("addition = " + addition);

        func = action("-");
        double subtraction = func.execute(6, 2);
        System.out.println("subtraction = " + subtraction);

        func = action("*");
        double multiplication = func.execute(6, 2);
        System.out.println("multiplication = " + multiplication);

        func = action("/");
        double division = func.execute(6, 2);
        System.out.println("division = " + division);
    }

    private static Operation action(String operation){
        switch(operation){
            case "+": return (x, y) -> x + y;
            case "-": return (x, y) -> x - y;
            case "*": return (x, y) -> x * y;
            case "/": return (x, y) -> x / y;
            default: return (x,y) -> 0;
        }
    }

}


