package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import java.util.concurrent.TimeUnit;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveDistance extends Command{

	boolean done, atTarget;
	private double dist, speed;
	
	public DriveDistance(double dist, double speed) {
		this.dist = dist;
		this.speed = speed;
		this.done = false;
		atTarget = false;
	}
	
	protected void initialize() {
		Robot.drivetrain.enablePID();
	}
	protected void execute() {
		Robot.drivetrain.driveDistance(dist, speed);
		do {
			atTarget = Robot.drivetrain.getPIDController(true).onTarget();
		} while (!atTarget);
		System.out.println("Arrived at target");
		done = true;
				
	}
	
	protected boolean isFinished() {
		return done;
	}
	
	protected void isInturrupted() {
		
	}
	
	protected void end() {
		waitInMilliseconds(100);
	}
	

    private void waitInMilliseconds(long milliseconds) {
    	try {
			TimeUnit.MILLISECONDS.sleep(milliseconds);
		} catch(Exception e) {
			e.printStackTrace();
		}
    }
}
