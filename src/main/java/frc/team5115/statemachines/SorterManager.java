package frc.team5115.statemachines;

import frc.team5115.robot.Robot;

public class SorterManager extends StateMachineBase {

    public static final int SCANNING = 1;
    public static final int MOVETODESIRED = 2;
    public static final int DESIREDEMPTY = 3;
    public static final int DESIREDTONEUTRAL = 4;
    public static final int MOVETOUNDESIRED = 5;
    public static final int UNDESIREDEMPTY = 6;
    public static final int UNDESIREDTONEUTRAL = 7;


    public void update(){
        switch(state){
            case STOP:
                Robot.sorter.moveSorter(0);
                break;
            case SCANNING:
                if(Robot.sorter.ballDesired() == 1){
                    setState(MOVETODESIRED);
                } else if(Robot.sorter.ballDesired() == 2){
                    setState(MOVETOUNDESIRED);
                }
                break;
            case MOVETODESIRED:
                if(Robot.sorter.desired()){
                    Robot.sorter.moveSorter(0);
                    setState(DESIREDEMPTY);
                }
                Robot.sorter.moveSorter(0.5);
                break;
            case DESIREDEMPTY:
                if(Robot.sorter.ballDesired() == 0){
                    setState(DESIREDTONEUTRAL);
                }
                break;
            case DESIREDTONEUTRAL:
                if(Robot.sorter.neutral()){
                    Robot.sorter.moveSorter(0);
                    setState(SCANNING);
                }
                Robot.sorter.moveSorter(-0.5);
                break;
            case MOVETOUNDESIRED:
                if(Robot.sorter.undesired()){
                    Robot.sorter.moveSorter(0);
                    setState(DESIREDEMPTY);
                }
                Robot.sorter.moveSorter(-0.5);
                break;
            case UNDESIREDEMPTY:
                if(Robot.sorter.ballDesired() == 0){
                    setState(UNDESIREDTONEUTRAL);
                }
                break;
            case UNDESIREDTONEUTRAL:
                if(Robot.sorter.neutral()){
                    Robot.sorter.moveSorter(0);
                    setState(SCANNING);
                }
                Robot.sorter.moveSorter(0.5);
                break;

        }
    }

}
