package codes;

public class MainDrive {
	
	public static void main(String[] args) {
		
		MyTestClass mtc = new MyTestClass();
		
//		오버로딩이 중복이 아닌걸로 인정되는(괜찮은) 이유를 체험해보자
		mtc.testMethod();
		
		mtc.testMethod(10);
		
	}

}
