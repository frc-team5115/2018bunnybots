package frc.team5115.systems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.team5115.Constants;

public class Intake {

    TalonSRX intake;

    public Intake(){
        intake = new TalonSRX(Constants.INTAKE_MOTOR_ID);
    }

    public void moveIntake(double speed){
        intake.set(ControlMode.PercentOutput, speed);
    }


}
