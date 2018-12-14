package frc.team5115.statemachines;

import frc.team5115.Constants;
import frc.team5115.robot.InputManager;
import frc.team5115.robot.Robot;

public class Drive extends StateMachineBase {

    public static final int DRIVING = 1;

    double forwardSpeed;
    double turnSpeed;

    public double throttle;

    public Drive(){
        throttle = 0.5;
    }

    public void update() {
        switch (state) {
            case STOP:
                Robot.drivetrain.drive(0, 0);
                break;

            case DRIVING:
                if(InputManager.increaseThrottle()){
                    throttle += 0.015;
                } else if (InputManager.decreaseThrottle()){
                    throttle -= 0.015;
                } else {
                    throttle = throttle;
                }

                if(throttle > 1){
                    throttle = 1;
                }
                if(throttle < 1){
                    throttle = 0;
                }

                forwardSpeed = InputManager.getForward() * throttle;
                turnSpeed = InputManager.getTurn() * throttle;
                Robot.drivetrain.drive(forwardSpeed, turnSpeed);
                break;

        }
    }

}
