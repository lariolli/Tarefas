import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "TarefaMotor")
public class TarefaMotor extends LinearOpMode{

    DcMotor motor;
    static final int TICKS_POR_VOLTA = 560;

    @Override
    public void runOpMode() {

        motor = hardwareMap.get(DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        waitForStart();

        if (opModeIsActive()) {
            moverVoltas(10, 0.5);
            sleep(500);
            moverVoltas(-10, 0.5);
            sleep(500);
            moverVoltas(10, 0.5);
        }
    }

    private void moverVoltas(int voltas, double potencia){

        int alvo = motor.getCurrentPosition() + (voltas * TICKS_POR_VOLTA);

        motor.setTargetPosition(alvo);
        motor.setMode(DcMotor.RunMode.RUN_TO_POSITION)
        motor.setPower(Math.abs(1.0));

        while(opModeIsActive() && motor.isBusy()) {
           idle(); 
        }
        motor.setPower(0);
    }
}