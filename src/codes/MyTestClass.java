package codes;

public class MyTestClass {
	
	void testMethod() {
		System.out.println("기본 테스트 메쏘드입니다.");
	}
	
	void testMethod(int num) {
		System.out.println("정수 하나를 입력받는 테스트 메쏘드입니다.");
	}
	
//	잘못된 예시(오버로딩이 아닌 경우)
//	앞에 int로 메쏘드를 생성해서 void와 다르지만 컴퓨터는 헷갈려함
//	int testMethod() {
//		System.out.println("정수를 리턴해야하는 테스트 메쏘드");
//		return 0;
//	}
	
	void testMethod(int num, String str) {
		System.out.println("정수 하나와, 문장 하나를 받습니다.");
	}

	void testMethod(String str) {
		System.out.println("문장 하나만 받습니다.");
	}
	
	void testMethod(String str, int num) {
		System.out.println("문장 하나, 정수 하나를 받습니다.");
	}
	
//	잘못된 예시(오버로딩이 아닌 경우)
//	자료형도 다르고, 파라미터도 i를 대입했지만 컴퓨터는
//	아니 그래서 재료가 int인데 어디로 가라는거야~ 하고 헷갈려함
//	int testMethod(int i) {
//		
//	}
}
