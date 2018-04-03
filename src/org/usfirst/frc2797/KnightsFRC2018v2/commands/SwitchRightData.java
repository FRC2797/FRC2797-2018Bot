package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Command;

public class SwitchRightData extends Command{

	private String data;
	protected void execute() {
		while(data == null)
			data = DriverStation.getInstance().getGameSpecificMessage();
		
		Command swtch = new SwitchRightOnly(data);
		swtch.start();
	}
	
	protected boolean isFinished() {
		return true;
	}
}
