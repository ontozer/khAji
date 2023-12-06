package Pratik;

import org.javaturk.oopj.ch02.car.Car;

public class CarTest2 {

	public static void main(String[] args) {
		
		Car car1 = new Car ();
		
		System.out.println("When the car stands still.");
		car1.make = "Ford";
		car1.model = "Mustang";
		car1.year = "2020";
		car1.distance = 3820;
	    car1.speed = 0;
	    String info = car1.getInfo();
	    System.out.println(info);
	    
	    System.out.println("\nWhen the car moves.");
	    car1.accelerate(200);
	    car1.go(120);
	    car1.go(155);
	    System.out.println(car1.getInfo());
	    car1.stop();
	    System.out.println(car1.getInfo());
	    
	    car1.accelerate(220);
	    double timeToGo = car1.go(1000);
	    System.out.println("Time to go 1000 km " + timeToGo + " hour.");
	    System.out.println(car1.getInfo());
	    
	    	
	    System.out.println("\n*******");
	    
	    Car car2 = new Car ();
	    car2.make = "Nissan";
	    car2.model = "Skyline";
	    car2.year = "2022";
	    car2.distance = 1600;
	    car2.speed = 230;
	    System.out.println(car2.getInfo());
	    
	    car2.accelerate(250);
	    double timeToGo2 = car2.go(1000);
	    System.out.println("Time to go 1000 km " + timeToGo2 + " hour.");
	    System.out.println(car2.getInfo());
	 }
}
