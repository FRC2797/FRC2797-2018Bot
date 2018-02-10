package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ClawIntakeOut extends Command {
	
	private boolean done;
	
	public ClawIntakeOut() {
		done = false;
	}
	
	protected void execute() {
		Robot.claw.driveIntake(-1.0);
		done = !Robot.oi.lStickButton.get();
	}
	
	protected boolean isFinished() {
		Robot.claw.driveIntake(0.0);
		return done;
	}
}
