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

        myrobot.Slide(slide);

        if (gamepad1.right_bumper) {
            myrobot.LeftDrive(left);
            myrobot.RightDrive(right);
        }else{
            myrobot.LeftDrive(left/2);
            myrobot.RightDrive(right/2);
        }
    }
}