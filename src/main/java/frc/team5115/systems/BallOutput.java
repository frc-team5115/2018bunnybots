package frc.team5115.systems;

import edu.wpi.first.wpilibj.Spark;
import frc.team5115.Constants;

public class BallOutput {

    Spark sifter;
    Spark flywheel;

    public BallOutput(){
        sifter = new Spark(Constants.SIFTER_MOTOR_ID);
        flywheel = new Spark(Constants.FLYWHEEL_MOTOR_ID);
    }

    public void outputBall(double speed){
        flywheel.set(speed);
        sifter.set(speed * 0.7);
    }

}
