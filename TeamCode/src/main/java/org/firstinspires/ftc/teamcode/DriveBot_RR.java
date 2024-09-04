package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gyroscope;

@TeleOp

public class DriveBot_RR extends LinearOpMode {
    //private Gyroscope imu;

    @Override
    public void runOpMode() {

        DcMotor frontLeft = hardwareMap.get(DcMotor.class, "front_left");
        DcMotor frontRight = hardwareMap.get(DcMotor.class, "front_right");
        DcMotor backLeft = hardwareMap.get(DcMotor.class, "back_left");
        DcMotor backRight = hardwareMap.get(DcMotor.class, "back_right");

        //imu = hardwareMap.get(Gyroscope.class, "imu");

        telemetry.addData("Status", "Initialized");
        telemetry.update();
        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {

            //double y = -gamepad1.left_stick_y; // Remember, Y stick is reversed!
            //double rx = gamepad1.right_stick_x;

            //frontLeft.setPower(y);
            //frontRight.setPower(-y);

            double y = -gamepad1.left_stick_y; // Remember, Y stick is reversed!
            double x = gamepad1.left_stick_x;
            double rx = gamepad1.right_stick_x;

            double divby = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rx), 1);

            frontLeft.setPower((y + x + rx)*0.5);
            backLeft.setPower((y - x + rx)*0.5);
            frontRight.setPower(-(y - x - rx)*0.5);
            backRight.setPower((y + x - rx)*0.5);

            telemetry.addData("Status", "Running.cool");
            telemetry.addLine("Apples can peel oranges");
            telemetry.update();
        }
    }

}
