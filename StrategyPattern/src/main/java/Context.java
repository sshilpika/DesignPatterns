
public class Context {
	private Strategy strategy;
	
	public Context(Strategy newStrategy){
		strategy = newStrategy;
	}
	
	public void changeStrategy(Strategy changeStrategy){
		strategy = changeStrategy;
	}
	
	public int executeStrategy(int num1,int num2){
		return strategy.doOperation(num1, num2);
	}

}
