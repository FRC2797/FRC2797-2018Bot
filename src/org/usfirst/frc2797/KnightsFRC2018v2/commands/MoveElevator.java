package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import java.util.concurrent.TimeUnit;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class MoveElevator extends Command {

	private double dist, speed;
	boolean atTarget;

	public MoveElevator(double dist, double speed) {
		this.dist = dist;
		this.speed = speed;
		atTarget = false;
	}

	protected void initialize() {
		//Robot.elevator.enable();
		
		
	}

	protected void execute() {
		//Robot.claw.lowerArm();
//		Robot.elevator.moveElevator(speed, dist);
//		do {
//			atTarget = Robot.elevator.onTarget();
//		} while (!atTarget);
		Robot.elevator.moveElevator(-speed);
		try {
			TimeUnit.MILLISECONDS.sleep((long)dist);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Robot.elevator.moveElevator(0);
				
	}

	protected boolean isFinished() {
		System.out.println("Elevator moved");
		return true;
	}

	protected void end() {
		//Robot.elevator.disable();
	}

	protected void isInturrupted() {
		//Robot.elevator.disable();
	}
}
