package arthmethicExpressions.polymorphism;

public class OpNode implements Node{

	char operator;
	protected Node left;
	protected Node right;
	
	public OpNode() {
		// TODO Auto-generated constructor stub
	}
	
	OpNode(char operator, Node left, Node right){
		this.operator = operator;
		this.left = left;
		this.right = right;
		
	}
	
	@Override
	public double evaluate() {
		switch(operator){
		case '+' : return left.evaluate()+right.evaluate();
		case '*' : return left.evaluate()*right.evaluate();
		default : return 0.00;
		}
	}

}
