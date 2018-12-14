package frc.team5115.statemachines;

import frc.team5115.robot.Robot;

public class SorterManager extends StateMachineBase {

    public static final int SCANNING = 1;
    public static final int NEUTRAL = 2;
    public static final int DESIRED = 3;
    public static final int UNDESIRED = 4;

    public void update(){
        switch(state){
            case STOP:
                Robot.sorter.moveSorter(0);
                break;
            case SCANNING:
                break;
            case DESIRED:
                if(Robot.sorter.desired()){
                    setState(SCANNING);
                }
                Robot.sorter.moveSorter(0.5);
                break;
            case UNDESIRED:
                if(Robot.sorter.undesired()){
                    setState(SCANNING);
                }
                Robot.sorter.moveSorter(-0.5);
                break;

        }
    }

}
