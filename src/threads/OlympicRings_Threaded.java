package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	public static void main(String[] args) {
		// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
		Robot blue = new Robot(300, 300);
		Robot yellow = new Robot(425, 450);
		Robot black = new Robot(555, 300);
		Robot green = new Robot(680, 450);
		Robot red = new Robot(810, 300);
		
		blue.setSpeed(10);
		blue.penDown();
		blue.setPenColor(Color.BLUE);
		blue.setPenWidth(10);
		
		yellow.setSpeed(10);
		yellow.penDown();
		yellow.setPenColor(Color.YELLOW);
		yellow.setPenWidth(10);
		
		black.setSpeed(10);
		black.penDown();
		black.setPenColor(Color.BLACK);
		black.setPenWidth(10);
		
		green.setSpeed(10);
		green.penDown();
		green.setPenColor(Color.GREEN);
		green.setPenWidth(10);
		
		red.setSpeed(10);
		red.penDown();
		red.setPenColor(Color.RED);
		red.setPenWidth(10);
		
		new Thread(()->ring(blue)).start();
		new Thread(()->ring(yellow)).start();
		new Thread(()->ring(black)).start();
		new Thread(()->ring(green)).start();
		new Thread(()->ring(red)).start();
		
		
		
		
	}

	private static Object ring(Robot r) {
		for (int i = 0; i < 360; i++) {
			r.move(2);
			r.turn(1);
		}
		return null;
	}
}