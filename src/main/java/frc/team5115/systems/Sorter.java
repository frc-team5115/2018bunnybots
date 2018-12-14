package frc.team5115.systems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import frc.team5115.Constants;
import frc.team5115.robot.Robot;

public class Sorter {

    Spark sorter;
    DigitalInput desired;
    DigitalInput neutral;
    DigitalInput undesired;



    public Sorter(){
        sorter = new Spark(Constants.SORTER_MOTOR_ID);
        desired = new DigitalInput(Constants.DESIRED_LIMIT_SWITCH);
        neutral = new DigitalInput(Constants.NEUTRAL_LIMIT_SWITCH);
        undesired = new DigitalInput(Constants.UNDESIRED_LIMIT_SWITCH);
    }

    public void moveSorter(double speed){
        sorter.set(speed);
    }

    public boolean desired(){
        return desired.get();
    }
    public boolean neutral(){
        return neutral.get();
    }
    public boolean undesired(){
        return undesired.get();
    }


}
