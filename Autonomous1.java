package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name="Autonomous1", group = "11846")
public class Autonomous1 extends LinearOpMode {
    private ElapsedTime myruntime = new ElapsedTime();

    private Robot myrobot = new Robot();

    @Override
    public void runOpMode() {
        telemetry.addData("Status", "I am booting up. Almost there");
        telemetry.update();

        myrobot.initHW(hardwareMap);
        RobotAction step1 = new RobotAction();
        RobotAction step2 = new RobotAction();
        step1.Init(myrobot, "drive", -14);
        step2.Init(myrobot, "slide", 14);

        waitForStart();
        //myruntime.reset();

        if (opModeIsActive()) {
            while (opModeIsActive()) {
                if (!step1.Finished()) {
                    step1.Run();
                    telemetry.addData("timeleft", step1.TimeSoFar());
                    telemetry.addData("waittime", step1.WaitTime());
                    telemetry.update();
                } else if (!step2.Finished()) {
                    step2.Run();
                }
            }
            myrobot.StopDrive();
            telemetry.addData(">", "Complete");
            telemetry.update();
        }

    }

}