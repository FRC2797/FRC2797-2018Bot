package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class MoveElevator extends Command{
	
	private double dist, speed;
	private boolean done;
	boolean atTarget;
	
	public MoveElevator(double dist, double speed) {
		this.dist = dist;
		this.speed = speed;
		this.done = false;
		atTarget = false;
	}
	
	protected void initialize() {
		Robot.elevator.moveElevator(speed, dist);
	}
	
	protected void execute() {
		do {
			atTarget = Robot.elevator.onTarget();
			/*
			if(Robot.elevator.atTop()) {
				Robot.elevator.setOutputRange(0.0, 0.0);
				atTarget = true;
			}
			*/
		}while(!atTarget);
		done = true;
	}
	
	protected boolean isFinished() {
		System.out.println("Elevator moved");
		return done;
	}
	
	protected void end() {
		
	}
	
	protected void isInturrupted() {
		
	}
}
