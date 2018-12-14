package frc.team5115.robot;

import frc.team5115.Constants;

import edu.wpi.first.wpilibj.Joystick;

public class InputManager {

    /**
     * InputManager is the place where inputs from the joystick go to die
     * Here, they are converted into methods for the rest of the code
     * In order to reference a joystick input, you must reference the InputManager class
     * If you don't really understand Getters and Setters you should go to Stack overflow or try (through trial and error) making them in a new project to see how they work
     */
    //define and instantiate our joystick object
    static Joystick joy = new Joystick(0);

    //The following methods deal with the basic driving functionalities
    public static double getForward() {
        return joy.getRawAxis(Constants.LSTICK);
    }

    public static double getTurn() {
        return joy.getRawAxis(Constants.RSTICK);
    }

    public static boolean increaseThrottle(){return joy.getRawButton(Constants.INCREASE_THROTTLE);}
    public static boolean decreaseThrottle(){return joy.getRawButton(Constants.DECREASE_THROTTLE);}

    public static boolean moveIntake(){return joy.getRawButton(Constants.INTAKE);}
    public static boolean outputBalls(){return joy.getRawButton(Constants.OUTPUT);}




    //for debug purposes
    public static boolean getButton(int b) {
        return joy.getRawButton(b);
    }
}