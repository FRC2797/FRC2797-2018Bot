// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc2797.KnightsFRC2018v2.subsystems;

import org.usfirst.frc2797.KnightsFRC2018v2.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/**
 *
 */
public class Elevator extends PIDSubsystem {

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

	// This number is in inches
	private static final double SpoolCircumference = Math.PI;

	// This number is in inches
	private static final double ElevatorHeight = 69.0;

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	private final DigitalInput topLimit = RobotMap.elevatortopLimit;
	private final DigitalInput bottomLimit = RobotMap.elevatorbottomLimit;
	private final Encoder elevatorEnc = RobotMap.elevatorelevatorEnc;
	private final SpeedController pto1 = RobotMap.elevatorpto1;
	private final SpeedController pto2 = RobotMap.elevatorpto2;
	private final SpeedControllerGroup pto = RobotMap.elevatorpto;
	private final Solenoid ptoLock = RobotMap.elevatorPtoLock;
	private final Solenoid ptoShifter = RobotMap.elevatorPtoShifter;

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	// private final Solenoid shifter = RobotMap.ptoShifter;
	// private final Solenoid ptoLock = RobotMap.ptoLock;

	// Initialize your subsystem here
	public Elevator() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PID
		super("Elevator", 1.0, 0.0, 0.0);
		setAbsoluteTolerance(0.2);
		getPIDController().setContinuous(false);
		LiveWindow.addActuator("Elevator", "PIDSubsystem Controller", getPIDController());

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PID

		setInputRange(Double.MIN_VALUE, Double.MAX_VALUE);
		// Use these to get going:
		// setSetpoint() - Sets where the PID controller should move the system
		// to
		// enable() - Enables the PID controller.
	}

	@Override
	public void initDefaultCommand() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());

	}

	@Override
	protected double returnPIDInput() {
		// Return your input value for the PID loop
		// e.g. a sensor, like a potentiometer:
		// yourPot.getAverageVoltage() / kYourMaxVoltage;

		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SOURCE
		return elevatorEnc.pidGet();

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SOURCE
	}

	@Override
	protected void usePIDOutput(double output) {
		// Use output to drive your system, like a motor
		// e.g. yourMotor.set(output);

		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=OUTPUT
		pto.pidWrite(output);

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=OUTPUT
	}

	public void moveElevator(double speed) {

		// if(speed > 0.0 && topLimit.get())
		// pto.set(0.0);
		// if(speed < 0.0 && bottomLimit.get())
		// pto.set(0.0);
		// else
		pto.set(-speed);

		// pto.set((speed < 0.0 && bottomLimit.get()) ? 0.0 : -speed);
	}

	public void moveElevator(double speed, double distance) {
		// change the setpoint
		setSetpoint((int) (distance * (360 / SpoolCircumference)/2.0));
		System.out.println(getSetpoint());

		// change the output range
		setOutputRange(-speed, speed);
	}

	public boolean atTop() {
		return topLimit.get();
	}

	public boolean atBottom() {
		return bottomLimit.get();
	}

	public void resetEncoders() {
		elevatorEnc.reset();
	}

	public void shiftPTO() {
		ptoShifter.set(!getPtoState());
	}

	public boolean getPtoState() {
		return ptoShifter.get();
	}

	public void lockElevator() {
		ptoLock.set(true);
	}

	public void unlockElevator() {
		ptoLock.set(false);
	}

	public void toggleElevatorLock() {
		ptoLock.set(!ptoLock.get());
	}

	public void goToTop() {
		while (!atTop())
			pto.set(0.5);
	}

	public void goToBottom() {
		while (!atBottom())
			pto.set(-0.5);
	}
}
