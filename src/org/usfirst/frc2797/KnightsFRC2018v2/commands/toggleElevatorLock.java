package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ToggleElevatorLock extends Command {
	
	
	public ToggleElevatorLock() {
		
	}
	
	protected void initialize() {
		Robot.elevator.toggleElevatorLock();
	}
	
	protected void execute() {
		
	}
	
	protected boolean isFinished() {
		return true;
	}
}
