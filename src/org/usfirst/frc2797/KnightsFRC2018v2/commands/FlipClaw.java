package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class FlipClaw extends Command {
	private boolean done;

	public FlipClaw() {
//		
//		System.out.println("Flipped Claw Started");

	}

	protected void initialize() {
		System.out.println("Flipped Claw Init");
		Robot.claw.toggleLiftArm();
	}

	protected void execute() {
		
	}

	public boolean isFinished() {
		System.out.println("Flipped Claw");
		return true;
	}
	
	protected void end() {
		
	}
}
