package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ClawIntakeIn extends Command {
	
	private boolean done;
	
	public ClawIntakeIn() {
		this.done = false;
	}
	
	protected void initialize() {
		
	}
	
	protected void execute() {
		Robot.claw.driveIntake(0.5);
		
		done = true;
	}
	
	protected boolean isFinished() {
		Robot.claw.driveIntake(0.0);
		return done;
	}
	
	protected void interrupted() {
		Robot.claw.driveIntake(0.0);
	}
}
