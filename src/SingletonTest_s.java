
public class SingletonTest_s {
	
//	Calculator_s cal1 = new Calculator_s();
//	Calculator_s cal2 = new Calculator_s();
//	Calculator_s cal3 = new Calculator_s();
	
	private static SingletonTest_s single1 = new SingletonTest_s();
	
	private SingletonTest_s() {
		
	}
	
	public static SingletonTest_s getInstance() {
		return single1;
	}
	

}
