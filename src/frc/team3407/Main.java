package frc.team3407;

import edu.wpi.first.wpilibj.RobotBase;

public class Main {
    private Main(){
        
    }
    public static void main(String... args) {
        RobotBase.startRobot(Robot::new);
    }
}
