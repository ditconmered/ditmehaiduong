/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import frc.robot.Robot;
import static frc.robot.Constants.*;

public class Drivebase extends SubsystemBase {
public WPI_TalonSRX rightEncoded = new WPI_TalonSRX(02);
public WPI_TalonSRX leftEncoded = new WPI_TalonSRX(01);
public WPI_TalonSRX rightFollow = new WPI_TalonSRX(03);
public WPI_TalonSRX leftFollow = new WPI_TalonSRX(04);
  public Drivebase() {
    leftFollow.follow(leftEncoded);
    rightFollow.follow(rightEncoded);
    leftEncoded.setInverted(true);

    
  }
  public void drive(double x,double y) {
    leftEncoded.set(x);
    rightEncoded.set(y);
    
  }
  public  void auto(){
   drive(-0.5, -0.4);
   Timer.delay(6);
   //drive(0,0);
   //Timer.delay(0.5);
   //drive(-0.4,0.4);
   //Timer.delay(0.46);
   //drive(0,0);
   //Timer.delay(0.5);
   //drive(-0.6, -0.5);
   //Timer.delay(3.5);
   //drive(0,0);
   //Timer.delay(0.7);
   //drive(0.4,-0.4);
   //Timer.delay(0.45);
//   drive(0,0);
  // Timer.delay(1);
   //drive(-0.65,-0.6);
   //Timer.delay(6);
   //drive(0,0);
   //Timer.delay(0.75);
   //drive(0.4,-0.4);
   //Timer.delay(0.6);
   //drive(0,0);
   //Timer.delay(0.75);
   //drive(-0.5,-0.4);
   //Timer.delay(1.5);
   //drive(0,0);
   
}
  @Override
  public void periodic() {
    if (RobotContainer.stick.getRawButton(R1)) {
    drive(RobotContainer.stick.getRawAxis(1) * 0.75, RobotContainer.stick.getRawAxis(3) * 0.6 );
    }
    else drive(RobotContainer.stick.getRawAxis(1) * 0.5, RobotContainer.stick.getRawAxis(3) * 0.4 );
  }
}


