package frc.team5115.statemachines;

import frc.team5115.robot.Robot;

public class OutputManager extends StateMachineBase {

    public static final int OUTPUTTING = 1;

    public void update(){
        switch(state){
            case STOP:
                Robot.output.outputBall(0);
                break;
            case OUTPUTTING:
                Robot.output.outputBall(0.5);
                break;
        }
    }

}
