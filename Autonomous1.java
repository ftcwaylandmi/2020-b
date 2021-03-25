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

        //Right Blue to C
        RobotAction step1 = new RobotAction(myrobot, "drive", 220);
        RobotAction step2 = new RobotAction(myrobot, "stop", 10);
        RobotAction step3 = new RobotAction(myrobot, "slide", 60);

        /*Right Blue to B
        RobotAction step1 = new RobotAction(myrobot, "drive", 160);
        RobotAction step2 = new RobotAction(myrobot, "stop", 10);
        RobotAction step3 = new RobotAction(myrobot, "slide", 30);*/

        /*Right Blue to A
        RobotAction step1 = new RobotAction(myrobot, "drive", 120);
        RobotAction step2 = new RobotAction(myrobot, "stop", 10);
        RobotAction step3 = new RobotAction(myrobot, "slide", 60);*/

        /* Left Blue to C
        RobotAction step1 = new RobotAction(myrobot, "drive", 220);
        RobotAction step2 = new RobotAction(myrobot, "stop", 10);
        RobotAction step3 = new RobotAction(myrobot, "slide", 30);*/

        /* Left Blue to B
        RobotAction step1 = new RobotAction(myrobot, "drive", 160);
        RobotAction step2 = new RobotAction(myrobot, "stop", 10);
        RobotAction step3 = new RobotAction(myrobot, "slide", -30);*/

        /* Left Blue to A
        RobotAction step1 = new RobotAction(myrobot, "drive", 120);
        RobotAction step2 = new RobotAction(myrobot, "stop", 10);
        RobotAction step3 = new RobotAction(myrobot, "slide", 30);*/

        /* Right Red to C
        RobotAction step1 = new RobotAction(myrobot, "drive", 220);
        RobotAction step2 = new RobotAction(myrobot, "stop", 10);
        RobotAction step3 = new RobotAction(myrobot, "slide", -30);*/

        /* Right Red to B
        RobotAction step1 = new RobotAction(myrobot, "drive", 180);
        RobotAction step2 = new RobotAction(myrobot, "stop", 10);
        RobotAction step3 = new RobotAction(myrobot, "slide", 30);*/

        /* Right Red to A
        RobotAction step1 = new RobotAction(myrobot, "drive", 120);
        RobotAction step2 = new RobotAction(myrobot, "stop", 10);
        RobotAction step3 = new RobotAction(myrobot, "slide", -30);*/

        /* Left Red to C
        RobotAction step1 = new RobotAction(myrobot, "drive", 220);
        RobotAction step2 = new RobotAction(myrobot, "stop", 10);
        RobotAction step3 = new RobotAction(myrobot, "slide", -120);*/

        /* Left Red to B
        RobotAction step1 = new RobotAction(myrobot, "drive", 180);
        RobotAction step2 = new RobotAction(myrobot, "stop", 10);
        RobotAction step3 = new RobotAction(myrobot, "slide", -10);*/


        /*   Left Red to A
        RobotAction step1 = new RobotAction(myrobot, "drive", 120);
        RobotAction step2 = new RobotAction(myrobot, "stop", 10);
        RobotAction step3 = new RobotAction(myrobot, "slide", -60);
*/
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
                }else if (!step3.Finished()){
                    step3.Run();
                }
            }
            myrobot.StopDrive();
            telemetry.addData(">", "Complete");
            telemetry.update();
        }

    }

}