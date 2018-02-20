package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ClawIntakeOut extends Command {
	
	
	
	public ClawIntakeOut() {
		
	}
	
	protected void initialize() {
		//System.out.println("Init Claw Out");
	}
	
	protected void execute() {
		//System.out.println("Exec Claw Out");
		Robot.claw.driveIntake(-0.5);
		
	}
	
	protected boolean isFinished() {
		
		return false;
	}
	
	protected void end() {
		//System.out.println("End Claw Out");
		Robot.claw.driveIntake(0.0);
	}
	

	protected void interrupted() {
		//System.out.println("Interrupt Claw Out");
		end();
	}
}
