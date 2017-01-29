package arthmethicExpressions.polymorphism;

public class ValueNode implements Node{

	int value;
	
	public ValueNode(int value) {
		this.value = value;
	}

	@Override
	public double evaluate() {
		// TODO Auto-generated method stub
		return value;
	}

}
