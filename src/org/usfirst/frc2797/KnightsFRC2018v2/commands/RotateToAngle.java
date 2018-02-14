package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RotateToAngle extends Command {
	private boolean done, atTarget;
	private double angle, speed;
	
	public RotateToAngle(double angle, double speed) {
		this.angle = angle;
		this.speed = speed;
		this.done = false;
	}
	
	protected void initialize() {
		Robot.drivetrain.turnToAngle(angle, speed);
	}
	
	protected void execute() {
		
		do {
			Robot.drivetrain.moveToAngle();
			atTarget = Robot.drivetrain.getGyroPID().onTarget();
		}while(!atTarget);
		done = true;
	}
	
	protected boolean isFinished() {
		return done;
	}

}
