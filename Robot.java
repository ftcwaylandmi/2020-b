package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.RobotHardware;

public class Robot {

    RobotHardware myself = new RobotHardware();

    public void initHW(HardwareMap ahwMap){
        myself.init(ahwMap);
    }

    public void Drive(double s) {
        myself.leftfrontDrive.setPower(s);
        myself.rightfrontDrive.setPower(s);
        myself.leftbackDrive.setPower(s);
        myself.rightbackDrive.setPower(s);
    }

    public void StopDrive(double s) {
        myself.leftfrontDrive.setPower(0);
        myself.rightfrontDrive.setPower(0);
        myself.leftbackDrive.setPower(0);
        myself.rightbackDrive.setPower(0);
    }

    public void SpinRight(double s) {
        myself.leftfrontDrive.setPower(s);
        myself.rightfrontDrive.setPower(-s);
        myself.leftbackDrive.setPower(s);
        myself.rightbackDrive.setPower(-s);
    }

    public void SpinLeft(double s) {
        myself.leftfrontDrive.setPower(-s);
        myself.rightfrontDrive.setPower(s);
        myself.leftbackDrive.setPower(-s);
        myself.rightbackDrive.setPower(s);
    }

    public void RightDrive(double s) {
        myself.leftfrontDrive.setPower(s);
        myself.rightfrontDrive.setPower(0);
        myself.leftbackDrive.setPower(s);
        myself.rightbackDrive.setPower(0);
    }

    public void LeftDrive(double s) {
        myself.leftfrontDrive.setPower(0);
        myself.rightfrontDrive.setPower(s);
        myself.leftbackDrive.setPower(0);
        myself.rightbackDrive.setPower(s);
    }

}