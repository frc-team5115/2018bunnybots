package frc.team5115.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.team5115.UDPClient;
import frc.team5115.auto.*;
import frc.team5115.statemachines.*;
import frc.team5115.systems.*;


public class Robot extends TimedRobot {

    //define
    public static Auto auto;
    public static DriveTrain drivetrain;
    public static Drive drive;
    public static Intake intake;
    public static BallOutput output;
    public static Sorter sorter;
    public static BunnyLauncher launcher;
    public static InputLoop input;
    public static IntakeManager IM;
    public static OutputManager OM;
    public static SorterManager SM;
    public static DriverStation DS;
    public static UDPClient udpclient;

    public static String response;


    public void robotInit() {
        //instantiate
        drivetrain = new DriveTrain();
        intake = new Intake();
        sorter = new Sorter();
        output = new BallOutput();
        drive = new Drive();
        launcher = new BunnyLauncher();
        input = new InputLoop();
        IM = new IntakeManager();
        OM = new OutputManager();
        SM = new SorterManager();
        DS = DriverStation.getInstance();
        udpclient = new UDPClient("10.51.15.32:", 8005);
        SmartDashboard.putNumber("Throttle", drive.throttle);
    }


    public void autonomousInit(){

    }
    public void teleopInit() {
        drive.setState(Drive.DRIVING);
        IM.setState(IntakeManager.IDLE);
        OM.setState(IntakeManager.STOP);
        SM.setState(SorterManager.SCANNING);
        input.setState(InputLoop.INPUT);
    }
    public void disabledInit() {
        drive.setState(Drive.STOP);
        input.setState(InputLoop.STOP);
    }
    public void testInit(){

    }


    public void robotPeriodic(){
        response = udpclient.getLastResponse();
    }
    public void autonomousPeriodic(){

    }
    public void teleopPeriodic() {
        drive.update();
        input.update();
    }
    public void disabledPeriodic() {
        drive.update();
        input.update();
    }
    public void testPeriodic(){

    }

}