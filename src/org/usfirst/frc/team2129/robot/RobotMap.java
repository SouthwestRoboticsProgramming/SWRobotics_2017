package org.usfirst.frc.team2129.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//Compressor
	public static int Compressor = 0;
	
	//Motors
	public static int LeftMotor1 = 10;
	public static int LeftMotor2 = 11;
	public static int LeftMotor3 = 1;
	public static int RightMotor1 = 20;
	public static int RightMotor2 = 21;
	public static int RightMotor3 = 2;
	public static int GearTalon = 6;//These need ports
	public static int LiftMotor = 7;
	
	//Light Sensors
	public static int GearLight = 0;
	public static int DriveLightLeft = 4;
	public static int DriveLightRight = 5;
	
	//Solenoids
	public static int ShifterRight = 0;
	public static int ShiftLeft1 = 1;
	public static int ShifterLeft2 = 2;
	public static int GearSolenoid1 = 3;
	public static int GearSolenoid2 = 4;
	
	//Ultrasonic
	public static int Ultrasonic = 0;
}
