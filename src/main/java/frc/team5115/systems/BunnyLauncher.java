package frc.team5115.systems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.team5115.Constants;

public class BunnyLauncher {

    DoubleSolenoid launcher;

    public BunnyLauncher(){
        launcher = new DoubleSolenoid(Constants.PNEUMATIC_BUNNY_LAUNCHER,
                                            Constants.PNEUMATIC_FORWARD_CHANNEL,
                                            Constants.PNEUMATIC_REVERSE_CHANNEL);
    }

    public void extend(){
        launcher.set(DoubleSolenoid.Value.kForward);
    }

    public void retract(){
        launcher.set(DoubleSolenoid.Value.kReverse);
    }

    public void loose(){
        launcher.set(DoubleSolenoid.Value.kOff);
    }

}
