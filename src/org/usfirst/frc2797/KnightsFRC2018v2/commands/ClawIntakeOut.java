package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import java.util.concurrent.TimeUnit;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ClawIntakeOut extends Command {

	private long timeToSpinMill;

	public ClawIntakeOut() {
		timeToSpinMill = 0;
	}

	public ClawIntakeOut(long spinTime) {
		timeToSpinMill = spinTime;
	}

	protected void initialize() {
		// System.out.println("Init Claw Out");
	}

	protected void execute() {
		// System.out.println("Exec Claw Out");
		Robot.claw.driveIntake(-1.0);
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
		// System.out.println("End Claw Out");
		Robot.claw.driveIntake(0.0);
	}

	protected void interrupted() {
		// System.out.println("Interrupt Claw Out");
		end();
	}
}
