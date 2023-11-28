package Pratik;

public class HelloTest {

	public static void main(String[] args) {
		Hello object = new Hello();
		
		String answer = object.sayHello("Rick");
		System.out.println(answer);
		
		answer = object.sayHello("");
		System.out.println(answer);
	}
}
