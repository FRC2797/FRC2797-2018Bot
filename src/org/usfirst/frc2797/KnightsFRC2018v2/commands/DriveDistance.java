package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import java.util.concurrent.TimeUnit;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;
import org.usfirst.frc2797.KnightsFRC2018v2.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class DriveDistance extends Command {

	boolean atTarget;
	private double dist, speed;

	public DriveDistance(double dist, double speed) {
		this.dist = dist;
		this.speed = speed;
		atTarget = false;
	}

	protected void initialize() {
		//System.out.println("Running Drive Distance Autonomous");
		// Robot.drivetrain.enablePID();
		Robot.drivetrain.driveDistance(dist, speed);
	}

	protected void execute() {
		atTarget = Robot.drivetrain.getPIDController(true).onTarget();

	}

	protected boolean isFinished() {
		return atTarget;
		// return true;
	}

	protected void isInterrupted() {
		Robot.drivetrain.disablePID();
		RobotMap.drivetrainDrive.stopMotor();
	}

	protected void end() {
		waitInMilliseconds(100);

	}

	private void waitInMilliseconds(long milliseconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(milliseconds);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
