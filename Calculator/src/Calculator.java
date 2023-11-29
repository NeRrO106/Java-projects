/*
This is a basic calculator
It was created by Andrei in 2023.
*/

public class Calculator{

    public Calculator(){

    }
    public double add(double a, double b){
        return a+b;
    }
    public double substract(double a, double b){
        return a-b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public double divide(double a, double b){
        return a/b;
    }
    public double modulo(double a, double b){
        return a%b;
    }
    public static void main(String[] args){
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5,7));
        System.out.println(myCalculator.substract(45,11));

    }
}