/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import java.lang.ProcessBuilder.Redirect;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import frc.robot.Robot;
import static frc.robot.Constants.*;

public class Grabber extends SubsystemBase {
public WPI_TalonSRX Grabber = new WPI_TalonSRX(11);
public void Auto() {
  Timer.delay(15);
  Grabber.set(1);
  Timer.delay(4);
  Grabber.stopMotor();
}
  @Override
public void periodic() {
  
 
if (RobotContainer.stick.getRawButton(RED)) {
  Grabber.set(1);}
else if  (RobotContainer.stick.getRawButton(PINK)) {
   Grabber.set(-1);
 }
 else if (RobotContainer.stick.getRawButton(R2)) {
   Grabber.set(1);
   Timer.delay(4);
   Grabber.set(0);
 }
   
 else {Grabber.set(0);}
}
}