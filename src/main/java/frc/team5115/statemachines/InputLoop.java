package frc.team5115.statemachines;

import frc.team5115.robot.InputManager;
import frc.team5115.robot.Robot;

public class InputLoop extends StateMachineBase{

    public static final int INPUT = 1;
    public static final int INTAKE = 2;
    public static final int OUTPUT = 3;
    public static final int LAUNCH = 4;
    public static final int RETRACT = 5;


    protected void updateChildren(){
        Robot.IM.update();
        Robot.OM.update();
    }

    public void update(){
        switch (state) {
            case STOP:
                Robot.IM.setState(IntakeManager.STOP);
                Robot.OM.setState(OutputManager.STOP);
                Robot.launcher.loose();
                updateChildren();
                break;
            case INPUT:
                updateChildren();
                if(InputManager.moveIntake()){
                    setState(INTAKE);
                }
                if(InputManager.outputBalls()){
                    setState(OUTPUT);
                }
                break;
            case INTAKE:
                updateChildren();
                if(InputManager.moveIntake()){
                    Robot.IM.setState(IntakeManager.INTAKING);
                } else {
                    Robot.IM.setState(IntakeManager.IDLE);
                    setState(INPUT);
                }
                break;
            case OUTPUT:
                updateChildren();
                if(InputManager.outputBalls()){
                    Robot.OM.setState(OutputManager.OUTPUTTING);
                } else {
                    Robot.OM.setState(OutputManager.STOP);
                    setState(INPUT);
                }
                break;
            case LAUNCH:
                Robot.launcher.extend();
                setState(INPUT);
                break;
            case RETRACT:
                Robot.launcher.retract();
                setState(INPUT);
                break;
        }
    }
}
