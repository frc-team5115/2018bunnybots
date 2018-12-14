package frc.team5115.auto;

import frc.team5115.robot.Robot;
import frc.team5115.statemachines.StateMachineBase;

public class Auto extends StateMachineBase{

    int whatitdo;

    public static final int INIT = 0;



    public Auto(int Strategy) {

    }

    public void setState(int s) {
        switch (s) {
            case INIT:

                break;
        }
        super.setState(s);
    }

    //each time update is called in AutoDrive
    public void update () {
        //Run switch block and check for number
        switch (state) {
            case INIT:
                Robot.drivetrain.resetEncoders();
                Robot.drivetrain.resetGyro();
                setState(whatitdo);
                break;
        }
    }
}




