package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name = "AutoRingCheck", group = "11846")

public class AutoRingCheck extends LinearOpMode {
    private ElapsedTime myruntime = new ElapsedTime();

    private Robot myrobot = new Robot();

    @Override
    public void runOpMode() {
        telemetry.addData("Status", "I am booting up. Almost there");
        telemetry.update();

        myrobot.initHW(hardwareMap);

        waitForStart();
        myruntime.reset();

        myrobot.Drive(1);
        sleep( 100);
        myrobot.StopDrive();
        myrobot.SpinRight(1);
        sleep(100);
        myrobot.StopDrive();
    }

}