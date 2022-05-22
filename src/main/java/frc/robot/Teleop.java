package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.Spark;

public class Teleop {
	public static Spark rightOne = new Spark(0);
	public static Spark rightTwo = new Spark(1);
	public static Spark leftOne = new Spark(2);
	public static Spark leftTwo = new Spark(3);

	public static XboxController xbox = new XboxController(0);
	public static void runTeleop() {
		setRight(xbox.getRawAxis(1) * 0.5);
		setLeft(xbox.getRawAxis(3) * 0.5);
	}

	public static void setRight(double speed) {
		rightOne.set(-speed);
		rightTwo.set(-speed);
	}

	public static void setLeft(double speed) {
		leftOne.set(speed);
		leftTwo.set(speed);
	}
}
