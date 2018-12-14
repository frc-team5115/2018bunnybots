package frc.team5115;

public class Constants {
    // Define deadzones and axis
    public static final int LSTICK = 1;
    public static final int RSTICK = 2;

    //Button Binds
    public static final int INTAKE = 1;
    public static final int OUTPUT = 2;
    public static final int INCREASE_THROTTLE = 6;
    public static final int DECREASE_THROTTLE = 5;

    //CAN
    public static final int FRONT_LEFT_MOTOR_ID = 1;
    public static final int FRONT_RIGHT_MOTOR_ID = 2;
    public static final int BACK_LEFT_MOTOR_ID = 3;
    public static final int BACK_RIGHT_MOTOR_ID = 4;
    public static final int INTAKE_MOTOR_ID = 5;

    //PWM
    public static final int SORTER_MOTOR_ID = 0;
    public static final int SIFTER_MOTOR_ID = 1;
    public static final int FLYWHEEL_MOTOR_ID = 2;

    //DIO
    public static final int DESIRED_LIMIT_SWITCH = 0;
    public static final int NEUTRAL_LIMIT_SWITCH = 1;
    public static final int UNDESIRED_LIMIT_SWITCH = 2;

    //PCM
    public static final int PNEUMATIC_BUNNY_LAUNCHER = 0;
    public static final int PNEUMATIC_FORWARD_CHANNEL = 1;
    public static final int PNEUMATIC_REVERSE_CHANNEL = 2;



    //PID
    public static final double AUTO_FORWARD_KP = 0.4;
    public static final double AUTO_FORWARD_KI = 0;
    public static final double AUTO_FORWARD_KD = 0.1;
    public static final double AUTO_TURN_KP = 0.06;
    public static final double AUTO_TURN_KI = 0;
    public static final double AUTO_TURN_KD = 0.05;
    public static final double TURN_KP = 0.3;
    public static final double TURN_KI = 0.15;
    public static final double DELAY = 0.005;

    // Tolerances for PID
    public static final double FORWARD_TOLERANCE = 0.15;
    public static final double FORWARD_DTOLERANCE = 0.05;
    public static final double TURN_TOLERANCE = 5;
    public static final double TURN_DTOLERANCE = 15;
}
