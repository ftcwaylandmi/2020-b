package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class RobotHardware {

    public DcMotor leftfrontDrive = null;
    public DcMotor rightfrontDrive = null;
    public DcMotor leftbackDrive = null;
    public DcMotor rightbackDrive = null;
    public DcMotor beltMotor = null;
    public DcMotor feederMotor = null;
    public DcMotor shooterMotor = null;
    public DcMotor armMotor = null;
    public Servo handServo = null;

    HardwareMap hwMap = null;

    public RobotHardware () {

    }

    public void init (HardwareMap ahwMap) {
        hwMap = ahwMap;

        leftfrontDrive = hwMap.get(DcMotor.class, "lfd");
        rightfrontDrive = hwMap.get(DcMotor.class, "rfd");
        leftbackDrive = hwMap.get(DcMotor.class, "lbd");
        rightbackDrive = hwMap.get(DcMotor.class, "rbd");
        beltMotor = hwMap.get(DcMotor.class, "bm");
        feederMotor = hwMap.get(DcMotor.class, "fm");
        shooterMotor = hwMap.get(DcMotor.class, "sm");
        armMotor = hwMap.get(DcMotor.class, "am");
        handServo = hwMap.get(Servo.class, "hs");
        leftfrontDrive.setDirection(DcMotor.Direction.FORWARD);
        rightfrontDrive.setDirection(DcMotor.Direction.REVERSE);
        leftbackDrive.setDirection(DcMotor.Direction.FORWARD);
        rightbackDrive.setDirection(DcMotor.Direction.REVERSE);
        beltMotor.setDirection(DcMotor.Direction.FORWARD);
        feederMotor.setDirection(DcMotor.Direction.FORWARD);
        shooterMotor.setDirection(DcMotor.Direction.REVERSE);
        armMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        handServo.setDirection(Servo.Direction.FORWARD);
        leftfrontDrive.setPower(0);
        rightfrontDrive.setPower(0);
        leftbackDrive.setPower(0);
        rightbackDrive.setPower(0);
        beltMotor.setPower(0);
        feederMotor.setPower(0);
        shooterMotor.setPower(0);
        armMotor.setPower(0);
        handServo.setPosition(0.00);
        leftfrontDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightfrontDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        leftbackDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightbackDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        beltMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        feederMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        shooterMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        armMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

    }

}
