package arthmethicExpressions.modeling;

public class Node {
	char operator;
	int value;
	Node left;
	Node right;
	
	public Node(char operator,int value, Node left, Node right) {
		// TODO Auto-generated constructor stub
		this.operator = operator;
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public Node() {
		// TODO Auto-generated constructor stub
	}

	public double evaluate() {
		switch (operator) {
		case '#':
			return value;
		case '+':
			return left.evaluate() + right.evaluate();
		case '*':
			return left.evaluate() * right.evaluate();

		default:
			return 0.00;
		}
	}
}
