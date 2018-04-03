package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import java.util.concurrent.TimeUnit;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RotateToAngle extends Command {

	private boolean atTarget;
	private double angle, speed;

	public RotateToAngle(double angle, double speed) {
		this.angle = angle;
		this.speed = speed;
	}

	protected void initialize() {
		System.out.println("Init auto turn");
		//Robot.drivetrain.enablePID();
		Robot.drivetrain.turnToAngle(angle, speed);

	}

	protected void execute() {
		// System.out.println(Robot.drivetrain.getGyroPID().onTarget());
//		try {
//			TimeUnit.MILLISECONDS.sleep(100);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		atTarget = Robot.drivetrain.getGyroPID().onTarget();
	}

	protected boolean isFinished() {
		return atTarget;
	}

}
