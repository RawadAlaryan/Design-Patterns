package BehavioralDesignPatterns;
/**
Interpreter Design Pattern:
	It is a Behavioral Design Pattern.
	It is a way to include language elements in a program.
	It provides a way to evaluate a language grammar or language expression.
		A Grammar is a way to represent valid sentences in a Language. It defines a language using special symbols and syntax.
		A Grammar consists of:
				A set of variables or non-terminal symbols.
				A set of terminal symbols.
				S is a special variable called the Start Symbol.
				P represents Production Rules for Terminals and Non-terminals.
	Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.
	Interpreter Design Pattern implementation requires knowledge of formal grammars.
	Map a domain to a language, the language to a grammar, and the grammar to a hierarchical object-oriented design.
	The Interpreter Design Pattern can be represented as an Abstract Syntax Tree.
	Interpreter Design Pattern can work together with the State Design Pattern to define parsing contexts.
	In Java JDK; the java.util.Pattern and java.text.Format use the Interpreter Design Pattern.
	
	In Interpreter Design Pattern, we have the following elements:
		1. Interpreter.
		2. AbstractExpression: Declares an abstract interpret operation.
		3. TerminalExpression: Implements an interpret operation associated with terminal symbols in the grammar.
		4. NonterminalExpression: A class is required for every rule in the grammar. Implements an interpret operation for non-terminal symbols in the grammar.
		5. Context: Contains information that is global to the interpreter.
		6. Client. Builds an abstract syntax tree representing a particular sentence. Client invokes the interpret operation.

Advantages of Interpreter Design Pattern:
	Easy to implement if each grammar rule is represented by a class.
	Evaluates an expression in a new way by supporting pretty-printing or type-checking.
	
Disadvantages of Interpreter Design Pattern:
	When number of grammar rules is large; harder to maintain the code.
	The Interpreter defines a class for every rule in the grammar.
	In this case, a Parser or Compiler generator is better to use than Interpreter Pattern.
	
Project:	Interpreter Design Pattern Numerical Expression Interpreter System.
Project:	Interpreter Design Pattern Logic Expression Interpreter System.
*/
public class InterpreterDesignPattern {		}
