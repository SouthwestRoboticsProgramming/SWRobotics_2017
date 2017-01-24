package org.usfirst.frc.team2129.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearSubsystem extends Subsystem{
	//Inputs
	DigitalInput GearTest;
	//Outputs
	DoubleSolenoid GearSolenoid;
	Talon GearTalon;
	
	float rotateSpeed;
	
	protected void initDefaultCommand() {
		// TODO command that calls checkForGear alot
		
	}
	
	public GearSubsystem() {
		GearTest = new DigitalInput(6);//get port #s for all of these
		GearSolenoid = new DoubleSolenoid(5,6);//make these actual ports
		GearTalon = new Talon(6);//need PWM port
	}
	
	public void checkForGear() {//Call often and maybe auto align gears
		if (GearTest.get()) {
			rotateRight();
		} else {
			rotateStop();
		}
	}
	
	public void rotateLeft() {
		GearTalon.set(rotateSpeed);
	}
	
	public void rotateRight() {
		GearTalon.set(rotateSpeed * -1);
	}
	
	public void rotateStop() {
		GearTalon.set(0);
	}
	
	public void open() {
		
	}

	public void close() {
		
	}
}
