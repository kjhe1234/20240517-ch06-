
public class Calculator_s {
	
	int firstNum;       // 인스턴스 멤버
	int secondNum;  // 인스턴스 멤버
	
	static int thirdNum;  // 정적 멤버
	
	
	public Calculator_s() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Calculator_s(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}
	
	public int add() {
		return this.firstNum + this.secondNum;
		
	}
	
	public static int minus(int firstNum, int secondNum) {
		return firstNum - secondNum;
	}
	

}
