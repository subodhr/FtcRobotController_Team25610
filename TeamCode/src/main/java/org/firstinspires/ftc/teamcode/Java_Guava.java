package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp

public class Java_Guava extends LinearOpMode{

    @Override
    public void runOpMode(){
        telemetry.addData("Status","Initialized");
        telemetry.update();
        waitForStart();
        while(opModeIsActive()){

            telemetry.addData("Status","Running");
            telemetry.addLine("What is nothing? if we humans found a word to describe nothing is it truly nothing?We humans can not feel what nothing is, so how do we know that nothing is a thing, saying that nothing is therefore something");

        }
    }
}


