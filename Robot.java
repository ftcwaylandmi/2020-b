package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

//import org.firstinspires.ftc.teamcode.RobotHardware;

public class Robot {

    RobotHardware myself = new RobotHardware();
    double InchesPerSecond = .11;
    double BeltSpeed = 1;
    double FeederSpeed = 1;

    public void initHW(HardwareMap ahwMap){
        myself.init(ahwMap);
    }

    public void Drive(double s) {
        myself.leftfrontDrive.setPower(s);
        myself.rightfrontDrive.setPower(s);
        myself.leftbackDrive.setPower(s);
        myself.rightbackDrive.setPower(s);
    }

    public void StopDrive() {
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

    public void Slide(double s) {
        myself.leftfrontDrive.setPower(0.5 * s);
        myself.rightfrontDrive.setPower(0.5 * s);
        myself.leftbackDrive.setPower(s);
        myself.rightbackDrive.setPower(-s);
    }

    public void StartBelt(){
        myself.beltMotor.setPower(BeltSpeed);
    }

    public void StopBelt(){
        myself.beltMotor.setPower(0);
    }

    public void ReverseBelt(){
        myself.beltMotor.setPower(-BeltSpeed);
    }

    public void StartFeeder(){
        myself.feederMotor.setPower(FeederSpeed);
    }

    public void StopFeeder(){
        myself.feederMotor.setPower(0);
    }

    public void ReverseFeeder(){
        myself.feederMotor.setPower(-FeederSpeed);
    }

    public void StartShooter(double t){
        myself.shooterMotor.setPower(t);
    }

    public void StopShooter(){
        myself.shooterMotor.setPower(0);
    }

    public void IntakeAndFire(){
       double FeederStop = 500.00;
       double BeltStop = 1000.00;
       double ShooterStop = 100.00;
       StartFeeder();
       StartBelt();
       StartShooter(1);

       ElapsedTime timer = new ElapsedTime();
       timer.reset();
       if (timer.milliseconds() > (FeederStop)){
           StopFeeder();
        }if(timer.milliseconds() > (FeederStop + BeltStop)){
           StopBelt();
        }if(timer.milliseconds() > (FeederStop + BeltStop + ShooterStop)){
           StopShooter();
        }
    }

    public double DriveByInchesTimeSetPower (int inches, double power) {
        double waitTime = 0.00;
        if (inches > 0) {
            //power = power * -1;
            waitTime = inches * InchesPerSecond;
            Drive(power);
        }else{
            inches = -inches;
            waitTime = inches * InchesPerSecond;
            Drive(-power);
        }
/*
        ElapsedTime timer = new ElapsedTime();
        timer.reset();
        while (timer.milliseconds() < (waitTime * 100)) {

        }*/
        return waitTime;
    }

    public double SlideByInchesTimeSetPower(int inches, double power) {
        double waitTime = 0.00;
        if (inches > 0) {
            power = power * -1;
            waitTime = inches * InchesPerSecond;
            Slide(power);
        }else{
            inches = -inches;
            waitTime = inches * InchesPerSecond;
            Slide(power);
        }
/*
        ElapsedTime timer = new ElapsedTime();
        timer.reset();
        while (timer.milliseconds() < (waitTime * 100)) {
        }
        //StopDrive();*/
        return waitTime;
    }
/*
    public void SlideByInchesTimeSetPower (int inches, double power) {
        double waitTime = 0.00;
        if (inches > 0) {
            power = power * -1;
            waitTime = inches * InchesPerSecond;
            Slide(power);
        }else{
            inches = -inches;
            waitTime = inches * InchesPerSecond;
            Slide(power);
        }

        ElapsedTime timer = new ElapsedTime();
        timer.reset();
        while (timer.milliseconds() < (waitTime * 100)) {
        }
        //StopDrive();
    }*/

}