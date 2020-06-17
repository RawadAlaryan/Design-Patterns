package behavioralDesignPatterns.interpreterDesignPattern.projectLogicExpressionInterpreterSystem.Main;

import behavioralDesignPatterns.interpreterDesignPattern.projectLogicExpressionInterpreterSystem.AbstractExpression.Expression;
import behavioralDesignPatterns.interpreterDesignPattern.projectLogicExpressionInterpreterSystem.Context.Context;
import behavioralDesignPatterns.interpreterDesignPattern.projectLogicExpressionInterpreterSystem.NonterminalExpression.AndExpression;
import behavioralDesignPatterns.interpreterDesignPattern.projectLogicExpressionInterpreterSystem.NonterminalExpression.OrExpression;
import behavioralDesignPatterns.interpreterDesignPattern.projectLogicExpressionInterpreterSystem.TerminalExpression.TerminalExpression;

//Interpreter Design Pattern Logic Expression Interpreter System.
public class Main {
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main (String[] args) {
    	System.out.println("Interpreter Design Pattern Logic Expression Interpreter System:\n");
    	
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        Context ic = new Context("John");
        System.out.println("John is male? " + isMale.interpret(ic));

        Context ic2 = new Context("Married Julie");
        System.out.println("Julie is a married woman? " + isMarriedWoman.interpret(ic2));

        Context ic3 = new Context("Lucy");
        System.out.println("Lucy is male? " + isMale.interpret(ic3));
    }
}
