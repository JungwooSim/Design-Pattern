package me.study.template_callback;

public class Calculator {
    public int calculatorTemplateMethod(int num1, int num2, CalculatorInterface calculatorInterface) {
        System.out.println("num1 : "+num1+", num2 : "+num2);
        int result = calculatorInterface.calcualtor(num1, num2);
        return result;
    }
}
