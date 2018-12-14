package frc.team5115.statemachines;

import frc.team5115.robot.Robot;

public class IntakeManager extends StateMachineBase{

    public static final int INTAKING = 1;
    public static final int IDLE = 2;


    public void update(){
        switch(state){
            case STOP:
                Robot.intake.moveIntake(0);
                break;
            case INTAKING:
                Robot.intake.moveIntake(1);
            case IDLE:
                Robot.intake.moveIntake(0.6);
        }
    }
}
