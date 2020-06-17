package behavioralDesignPatterns.interpreterDesignPattern.projectNumericalExpressionInterpreterSystem.Interpreter;

public class IntToBinaryExpressionInterpreter implements ExpressionInterpreter {
	private int i;
	
	public IntToBinaryExpressionInterpreter(int i) { this.i = i; }

    @Override
    public String interpret(InterpreterContext interpreterContext) {
        return interpreterContext.getBinaryFormat(i);
    }
}
