/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import frc.robot.Robot;
import static frc.robot.Constants.*;

public class Lifter extends SubsystemBase {
public WPI_TalonSRX Lifter = new WPI_TalonSRX(07);

  @Override
public void periodic() {
if (RobotContainer.stick.getRawButton(GREEN)) {
  Lifter.set(-0.5);
}
else if  (RobotContainer.stick.getRawButton(BLUE)) {
  Lifter.set(0.5);
}
else {Lifter.set(0);}
  }
}
