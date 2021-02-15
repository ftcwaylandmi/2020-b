package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.util.ElapsedTime;

public class RobotAction {
    private boolean complete = false;
    private Robot myrobot;
    private ElapsedTime timer = new ElapsedTime();
    private double waittime = 0.00;
    private String myaction = "";
    private int mydistance = 0;
    private boolean running = false;

    RobotAction(Robot r, String action, int distance) {
        this.myrobot = r;
        this.myaction = action;
        this.mydistance = distance;
    }

    public void Init(Robot r, String action, int distance) {
        myrobot = r;
        myaction = action;
        mydistance = distance;
    }

    public void Run() {
        if (!running) {
            running = true;
            if (myaction == "drive") {
                waittime = myrobot.DriveByInchesTimeSetPower(mydistance, 1);
               // myrobot.Drive(1);
            } else if (myaction == "slide") {
                waittime = myrobot.SlideByInchesTimeSetPower(mydistance, 1);
               // myrobot.Slide(1);
            } else if (myaction == "null") {
                waittime = 0;
            }
            timer.reset();
        }
        while (running) {

            if (timer.milliseconds() >= (waittime * 100)) {
                myrobot.StopDrive();
                complete = true;
                running = false;
            }
        }
    }

    public boolean IsComplete() {
        return complete;
    }

    public boolean IsNotComplete() {
        return !complete;
    }

    public boolean IsRunning() {
        return running;
    }

    public boolean IsNotRunning() {
        return !running;
    }

    public boolean Finished() {
        if (!running && complete) {
            return true;
        } else {
            return false;
        }
    }

    public double TimeSoFar() {
        return timer.milliseconds();
    }

    public double WaitTime() {
        return waittime;
    }
}
