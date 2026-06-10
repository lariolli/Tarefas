public class Main {
    public static void main(String[] args) {
        MotorFTC2 motor = new MotorFTC2("Motor esquerdo");
        motor.ligar(0.5);
        motor.mostrarStatus();
        motor.desligar();
        motor.mostrarStatus();

    }
}