package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name="TeleOpB", group="11846")
public class TeleOpB extends OpMode{
    Robot myrobot = new Robot();
    double left = 0.00;
    double right = 0.00;
    double slide = 0.00;

    @Override
    public void init() {
        myrobot.initHW(hardwareMap);

    }

    @Override
    public void loop() {
        left = -gamepad1.left_stick_y;
        right = -gamepad1.right_stick_y;
        slide = gamepad1.left_stick_x;
        telemetry.addData("left", left);
        telemetry.addData("right", right);
        telemetry.addData("slide", slide);
        telemetry.update();

        myrobot.Slide(slide);
        myrobot.LeftDrive(left);
        myrobot.RightDrive(right);

        }
    }