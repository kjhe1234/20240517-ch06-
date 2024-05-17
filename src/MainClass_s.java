
public class MainClass_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator_s cal1 = new Calculator_s(10, 20);
		
		int result1 = cal1.add(); // 10+20=30 이 반환

		Calculator_s.thirdNum = 10;
		cal1.thirdNum = 10;
		
		Calculator_s.minus(20, 10);
		
		//SingletonTest_s test1 = new SingletonTest_s(); // 생성자가 private 이므로 new 연산자로 객체 선언 불가
		SingletonTest_s testSingle1 = SingletonTest_s.getInstance();
		
		SingletonTest_s testSingle2 = SingletonTest_s.getInstance();
		
		//Calculator_s.PI ;
		
	}

}
