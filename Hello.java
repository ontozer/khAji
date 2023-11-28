package Pratik;

public class Hello {

	String world = " guys";
	
	public String sayHello(String whom) {
		String sentence;
		if (whom!="")
			sentence = "Hello " + whom + " :)";
		else 
			sentence = "Hello"  + world + " :)";
		return sentence;
	}
}
