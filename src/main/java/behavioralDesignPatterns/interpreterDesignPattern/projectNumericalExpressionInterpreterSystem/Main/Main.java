package behavioralDesignPatterns.interpreterDesignPattern.projectNumericalExpressionInterpreterSystem.Main;

import behavioralDesignPatterns.interpreterDesignPattern.projectNumericalExpressionInterpreterSystem.Interpreter.ExpressionInterpreter;
import behavioralDesignPatterns.interpreterDesignPattern.projectNumericalExpressionInterpreterSystem.Interpreter.IntToBinaryExpressionInterpreter;
import behavioralDesignPatterns.interpreterDesignPattern.projectNumericalExpressionInterpreterSystem.Interpreter.IntToHexExpressionInterpreter;
import behavioralDesignPatterns.interpreterDesignPattern.projectNumericalExpressionInterpreterSystem.Interpreter.InterpreterContext;


//Interpreter Design Pattern Numerical Expression Interpreter System
//Expression Interpreter System using an Expression Interpreter to convert Decimal to other Numerical Representations. 
public class Main {
    public static InterpreterContext interpreterContext;

    public static void main(String[] args) {
        System.out.println("Interpreter Design Pattern Numerical Expression Interpreter System.");
        System.out.println("Expression Interpreter System using an Expression Interpreter to convert Decimal to other Numerical Representations:\n");
        
        interpreterContext = new InterpreterContext();
        
        int number = 28;
        System.out.println("Converting 28 from Decimal to Binary:");
        ExpressionInterpreter expressionInterpreter = new IntToBinaryExpressionInterpreter(number);
        System.out.println("\t" + number + " = " + expressionInterpreter.interpret(interpreterContext));
        
        System.out.println("Converting 28 from Decimal to Hexadecimal:");
        expressionInterpreter = new IntToHexExpressionInterpreter(number);
        System.out.println("\t" + number + " = " + expressionInterpreter.interpret(interpreterContext));
    }
}
