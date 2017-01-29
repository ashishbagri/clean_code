package arthmethicExpressions.polymorphism;

import arthmethicExpressions.polymorphism.OpNode;

public class AdditionOpNode extends OpNode{

	public AdditionOpNode(Node leftNode, Node rightNode) {
		super.left = leftNode;
		super.right = rightNode;
	}

	@Override
	public double evaluate() {
		// TODO Auto-generated method stub
		return left.evaluate()+right.evaluate();
	}
}