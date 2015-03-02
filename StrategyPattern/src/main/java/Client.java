
public class Client {

	public static void main(String[] args) {
		Context c = new Context(new DoOperationAdd());
		System.out.println("Add : "+c.executeStrategy(3, 2));
		c.changeStrategy(new DoOperationMultiply());
		System.out.println("Multiply : "+c.executeStrategy(3,2));
		Context c1 = new Context(new DoOperationSubtract());
		System.out.println("Subtract : "+c1.executeStrategy(10,5));

	}

}
