// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2797.KnightsFRC2018v2.subsystems;

import org.usfirst.frc2797.KnightsFRC2018v2.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Claw extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final Compressor compressor = RobotMap.clawcompressor;
    private final Encoder intakeEnc = RobotMap.clawintakeEnc;
    private final SpeedController intake = RobotMap.clawintake;
    private final PIDController intakePID = RobotMap.clawintakePID;
    private final Solenoid armOpen = RobotMap.clawArmOpen;
    private final Solenoid armLift = RobotMap.clawArmLift;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    //Need to confirm is Solenoid if false means up or means down
    public void liftArm() {
    	armLift.set(false);
    }
    
    public void lowerArm() {
    	armLift.set(true);
    }
    
    public void openClaw() {
    	armOpen.set(true);
    }
    
    public void closeClaw() {
    	armOpen.set(false);
    }
    
    public void toggleLiftArm() {
    	if(armLift.get()) {
    		liftArm();
    		System.out.println("Lift Arm");
    	}
    	else {
    		lowerArm();
    		System.out.println("Lower Arm");
    	}
    		
    }
    
    public void driveIntake(double speed) {
    	intake.set(speed);
    }
    
}

