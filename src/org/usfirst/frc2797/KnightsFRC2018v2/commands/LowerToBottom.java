package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class LowerToBottom extends Command {
	private boolean done;
	
	public LowerToBottom() {
		this.done = false;
	}
	
	protected void initialize() {
		Robot.elevator.goToBottom();
	}
	
	protected void execute() {
		done = true;
	}
	
	protected boolean isFinished() {
		return done;
	}

}
