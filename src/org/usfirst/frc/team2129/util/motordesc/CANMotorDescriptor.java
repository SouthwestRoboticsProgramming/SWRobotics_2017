package org.usfirst.frc.team2129.util.motordesc;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.SpeedController;

public class CANMotorDescriptor extends MotorDescriptor {
	/* Describes a motor connected to a motor controller connected over the CAN Bus. The CAN Address for a motor is determined (and can be changed by) the RoboRIO web dashboard.
	 * You can use them as:
	 * ... = new CANMotorDescriptor(1);	//Motor connected over the CAN bus with address #1
	 * 
	 * The second argument is inversion, so to connect a backwards motor, simple add `, true`, for example:
	 * ... = new CANMotorDescriptor(1, false);	//Motor connected backwards over the CAN bus with address #1
	 */

	private int id;
	private boolean rev = false;

	public CANMotorDescriptor(int canID) {
		id = canID;
	}

	public CANMotorDescriptor(int i, boolean b) {
		this(i);
		rev = b;
	}

	public SpeedController _get() {
		CANTalon t = new CANTalon(id);
		t.setInverted(rev);
		return t;
	}

}
