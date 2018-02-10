package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class FlipClaw extends Command {
	private boolean done;
	
	public FlipClaw() {
		done = false;
	}
	
	
	protected void initialize() {
		
	}
	
	protected void execute() {
		Robot.claw.toggleLiftArm();
		done = true;
	}
	
	public boolean isFinished() {
		System.out.println("Flipped Claw");
		return done;
	}
}
