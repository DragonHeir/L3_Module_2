package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	public static void main(String[] args) {
		// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
		Robot blue = new Robot(300, 300);
		new Thread(()->blue.ring()).start();
//	Robot yellow = new Robot(000, 000);
//	Robot black = new Robot(1200, 700);
//	Robot green = new Robot(800, 700);
//	Robot red = new Robot(1200, 700);
		blue.setSpeed(10);
		blue.penDown();
		blue.setPenColor(Color.BLUE);
		blue.setPenWidth(10);		
		
		for (int i = 0; i < 360; i++) {
			blue.move(2);
			blue.turn(1);
		}
		
	}
}