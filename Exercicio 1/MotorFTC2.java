public class MotorFTC2 {
    String nome;
    double potencia;

    public MotorFTC2(String nome){
        this.nome = nome;
        this.potencia = 0.0;
    }
    public void ligar(double potencia){
        this.potencia = potencia;
    }
    public void desligar(){
        this.potencia = 0.0;
    }
    public void mostrarStatus(){
        if(this.potencia == 0){
            System.out.println(this.nome + " está desligado.");
        } else {
            System.out.println(this.nome + " está ligado com potência: " + this.potencia);
        }
    }
    
}
