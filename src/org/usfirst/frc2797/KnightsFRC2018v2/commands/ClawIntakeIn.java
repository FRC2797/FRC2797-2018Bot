package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import java.util.concurrent.TimeUnit;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ClawIntakeIn extends Command {

	private long timeToSpinMill;

	public ClawIntakeIn() {
		timeToSpinMill = 0;
	}

	public ClawIntakeIn(long spinTime) {
		timeToSpinMill = spinTime;
	}

	protected void initialize() {

	}

	protected void execute() {
		Robot.claw.driveIntake(1.0);
		try {
			TimeUnit.MILLISECONDS.sleep(timeToSpinMill);
		} catch (Exception e) {
			e.printStackTrace();
		}

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
