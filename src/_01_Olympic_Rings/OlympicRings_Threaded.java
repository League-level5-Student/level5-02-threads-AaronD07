package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.



public static void main(String[] args) {
	Robot timmy = new Robot(500, 700);
	Robot tammy = new Robot(700, 700);
	Robot sammy = new Robot(900, 700);
	Robot simmy = new Robot(600, 400);
	Robot tommy = new Robot(800, 400);
	
	timmy.setSpeed(10);
	tammy.setSpeed(10);
	sammy.setSpeed(10);
	simmy.setSpeed(10);
	tommy.setSpeed(10);
	Thread r1 = new Thread(()->timmy.move(1));
	Thread r2 = new Thread(()->tammy.move(1));
	Thread r3 = new Thread(()->sammy.move(1));
	Thread r4 = new Thread(()->simmy.move(1));
	Thread r5 = new Thread(()->tommy.move(1));
	Thread r6 = new Thread(()->timmy.turn(1));
	Thread r7 = new Thread(()->tammy.turn(1));
	Thread r8 = new Thread(()->sammy.turn(1));
	Thread r9 = new Thread(()->simmy.turn(1));
	Thread r10 = new Thread(()->tommy.turn(1));
	for(int i =0; i<100000; i++) {
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
		r6.start();
		r7.start();
		r8.start();
		r9.start();
		r10.start();
	
	
	
	}
}
}