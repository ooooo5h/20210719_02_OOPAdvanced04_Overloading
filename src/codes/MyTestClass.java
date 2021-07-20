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
	int testMethod() {
		System.out.println("정수를 리턴해야하는 테스트 메쏘드");
		return 0;
	}

}
