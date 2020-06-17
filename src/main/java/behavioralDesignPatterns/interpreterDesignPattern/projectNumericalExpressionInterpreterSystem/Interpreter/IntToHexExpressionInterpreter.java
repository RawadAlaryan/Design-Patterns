package behavioralDesignPatterns.interpreterDesignPattern.projectNumericalExpressionInterpreterSystem.Interpreter;

public class IntToHexExpressionInterpreter implements ExpressionInterpreter {
    private int i;

    public IntToHexExpressionInterpreter(int i) { this.i = i; }

    @Override
    public String interpret(InterpreterContext interpreterContext) {
        return interpreterContext.getHexFormat(i);
    }
}
