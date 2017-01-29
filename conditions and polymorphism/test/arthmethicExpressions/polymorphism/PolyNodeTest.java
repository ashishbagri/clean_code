package arthmethicExpressions.polymorphism;

import org.junit.Test;

public class PolyNodeTest {

	@Test
	public void test() {
		Node root = new OpNode('+', new ValueNode(1), new OpNode('*',
				new ValueNode(2), new ValueNode(3)));
		System.out.println(root.evaluate());
	}

	@Test
	public void retest() {
		Node root = new AdditionOpNode(new ValueNode(1), new MultOpNode(
				new ValueNode(2), new ValueNode(3)));
		System.out.println(root.evaluate());
	}
}
