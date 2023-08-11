package com.example.calculator;

public class Model {
    public double calculate(double number1, double number2, String operator){

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
                    return (double) number1 / number2;
                return 0;
            }
            case "AC"->{
                return 0;
            }
            case "%"->{
                if(number2 > 0)
                    return number1 % number2;
                return 0;
            }
            default -> {
                return 0;
            }

        }
    }
}
