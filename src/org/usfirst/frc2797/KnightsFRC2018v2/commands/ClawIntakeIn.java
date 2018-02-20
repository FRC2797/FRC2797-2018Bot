package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ClawIntakeIn extends Command {
	
	
	public ClawIntakeIn() {
		
	}
	
	protected void initialize() {
		
	}
	
	protected void execute() {
		Robot.claw.driveIntake(0.5);
		
	}
	
	protected boolean isFinished() {
		
		return false;
	}
	protected void end() {
		Robot.claw.driveIntake(0.0);
	}
	
	protected void interrupted() {
		end();
	}
}
