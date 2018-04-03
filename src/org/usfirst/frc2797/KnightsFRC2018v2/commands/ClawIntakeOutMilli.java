package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import java.util.concurrent.TimeUnit;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ClawIntakeOutMilli extends Command {

	private long timeToSpinMill;

	public ClawIntakeOutMilli() {
		timeToSpinMill = 0;
	}

	public ClawIntakeOutMilli(long spinTime) {
		timeToSpinMill = spinTime;
	}

	protected void initialize() {
		// System.out.println("Init Claw Out");
	}

	protected void execute() {
		// System.out.println("Exec Claw Out");
		Robot.claw.driveIntake(1.0);
		try {
			TimeUnit.MILLISECONDS.sleep(timeToSpinMill);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Robot.claw.driveIntake(0.0);

	}

	protected boolean isFinished() {

		return true;
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
