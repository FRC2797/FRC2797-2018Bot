package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ScaleFirstFromRight extends CommandGroup {

	public ScaleFirstFromRight(String data) {

		

		// Scale Code
//		if (data.charAt(1) == 'R') {
//			// Right Scale
//
//			addSequential(new DriveDistance(19.0, 0.50));
//			addSequential(new RotateToAngle(-90, 0.50));
//			addSequential(new DriveDistance(2.5, 0.50));
//			addSequential(new RotateToAngle(90, 0.50));
//			addSequential(new MoveElevator(60.0, 1.0));
//			addSequential(new DriveDistance(2.0, 0.50));
//			addSequential(new OpenClaw());
//
//		} else {
//			// Left Scale
//			addSequential(new DriveDistance(19.5, 0.50));
//			addSequential(new RotateToAngle(-90, 0.50));
//			addSequential(new DriveDistance(19.0, 0.50));
//			addSequential(new RotateToAngle(90, 0.50));
//			addSequential(new MoveElevator(60.0, 1.0));
//			addSequential(new DriveDistance(2.0, 0.50));
//			addSequential(new OpenClaw());
//
//		}
		
		if(data.charAt(1) == 'R') {
			addSequential(new DriveDistance(21.5, 0.7)); //12' 3"
			addSequential(new FlipClaw());
			addSequential(new MoveElevator(3000, 0.75));
			addSequential(new RotateToAngle(-40.0, 0.65));
			addSequential(new DriveDistance(1.0, 0.65));
			addSequential(new ClawIntakeOutMilli(1000));
			//addSequential(new DriveDistance(-3.0, 0.65));
			addSequential(new RotateToAngle(40.0, 0.65));
			addSequential(new FlipClaw());
			addSequential(new WaitMilli(1500));
			addSequential(new MoveElevator(1000, 0.5));
		}
		else if(data.charAt(0) == 'R') {
			
			
			addSequential(new DriveDistance(14.0, 0.7)); //12' 3"
			addSequential(new RotateToAngle(-70.0, 0.65));
			addSequential(new FlipClaw());
			addSequential(new MoveElevator(1500, 0.75));
			addSequential(new DriveDistance(0.5, 0.65));
			addSequential(new ClawIntakeOutMilli(1000));
			//addSequential(new OpenClaw());
			addSequential(new WaitMilli(1500));
			addSequential(new DriveDistance(-3.0, 0.7));
			addSequential(new RotateToAngle(70.0, 0.65));
			addSequential(new DriveDistance(4.0, 0.7));
			
			//addSequential(new RotateToAngle(-70.0, 0.65));
		}
		else
			addSequential(new DriveDistance(15.0, 0.7));

	}
}
