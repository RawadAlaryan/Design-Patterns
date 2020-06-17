package behavioralDesignPatterns.interpreterDesignPattern.projectLogicExpressionInterpreterSystem.NonterminalExpression;

import behavioralDesignPatterns.interpreterDesignPattern.projectLogicExpressionInterpreterSystem.AbstractExpression.Expression;
import behavioralDesignPatterns.interpreterDesignPattern.projectLogicExpressionInterpreterSystem.Context.Context;

public class AndExpression implements Expression {
    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(Context context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
