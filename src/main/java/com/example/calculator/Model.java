package com.example.calculator;

public class Model {
    public float calculate(long number1, long number2, String operator){

        switch (operator) {
            case "+" ->{
            return number1 + number2 ;
            }
            case "-" ->{
            return number1 - number2;
            }
            case "*" ->{
            return  number1 * number2;
            }
            case "/" ->{
                if (number2 > 0 )
                    return (float) number1 / number2;
                return 0;
            }
            default -> {
                return 0;
            }

        }
    }
}
