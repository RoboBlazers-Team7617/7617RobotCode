/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.ArcadeDrive_Command;

public class DriveTrain_SubSystem extends Subsystem {
  private RobotDrive MainDrive = new RobotDrive(RobotMap.Drive_Left, RobotMap.Drive_Right);

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new ArcadeDrive_Command());
  }
  public void TeleopDrive(Joystick Driver){
    MainDrive.arcadeDrive(Driver);
  }

  public void Stop(){
    MainDrive.drive(0,0);
  }
}
