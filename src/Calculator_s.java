
public class Calculator_s {
	
	int firstNum;       // 인스턴스 멤버
	int secondNum;  // 인스턴스 멤버
	
	static int thirdNum;  // 정적 멤버
	
	static final double PI  = 3.141592;  // 한번 선언될때 초기화되면 그 값은 변경 불가
	
	static final double SALERATE = 0.7;  // 상수 선언
	
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
