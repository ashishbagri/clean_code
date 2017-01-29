package arthmethicExpressions.modeling;

import static org.junit.Assert.*;

import org.junit.Test;

public class NodeTest {

	@Test
	public void test() {
		//model 1+2*3
		Node node = new Node();
		node.operator = '+';
		node.value = 0;
		node.left = new Node('#',1,null,null);
		node.right = new Node('*',0,new Node('#',2,null,null),new Node('#',3,null,null));
		
		System.out.println(node.evaluate());
	}

}
