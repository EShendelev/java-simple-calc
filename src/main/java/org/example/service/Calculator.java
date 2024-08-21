package org.example.service;

public class Calculator {
    public long calc(String firstOperand, String operator, String secondOperand) {
        return switch (operator) {
            case "add" -> add(Long.parseLong(firstOperand), Long.parseLong(secondOperand));
            case "sub" -> substract(Long.parseLong(firstOperand), Long.parseLong(secondOperand));
            case "div" -> divide(Long.parseLong(firstOperand), Long.parseLong(secondOperand));
            case "mul" -> multiplication(Long.parseLong(firstOperand), Long.parseLong(secondOperand));
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }

    private long add(long firstOperand, long secondOperand) {
        return firstOperand + secondOperand;
    }

    private long substract(long firstOperand, long secondOperand) {
        return firstOperand - secondOperand;
    }

    private long divide(long firstOperand, long secondOperand) {
        return firstOperand / secondOperand;
    }

    private long multiplication(long firstOperand, long secondOperand) {
        return firstOperand + secondOperand;
    }
}
