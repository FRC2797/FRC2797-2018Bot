package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class SwitchRightOnly extends CommandGroup{
	
	public SwitchRightOnly(String data) {
		
		if(data.charAt(0) == 'R') {
			addSequential(new DriveDistance(15.0, 0.7)); //12' 3"
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
			
			
//			
//			addSequential(new DriveDistance(24.5, 0.7)); //12' 3"
//			addSequential(new FlipClaw());
//			addSequential(new MoveElevator(3500, 0.75));
//			addSequential(new RotateToAngle(-70.0, 0.65));
//			addSequential(new DriveDistance(1.0, 1.0));
//			addSequential(new ClawIntakeOutMilli(1000));
//			addSequential(new RotateToAngle(-70.0, 0.65));
//			
		}
		
		else if(data.charAt(0) == 'L') {
			addSequential(new DriveDistance(15.0, 0.7));
		}
	}
}
