package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot Nolan = new Robot();
	Nolan.setSpeed(20);
	Nolan.setRandomPenColor();
	Nolan.penDown();
	Nolan.turn(90);
	Nolan.move(50);
	Nolan.setRandomPenColor();
	Nolan.turn(90);
	Nolan.move(50);
	
	
	
	
	}
}
