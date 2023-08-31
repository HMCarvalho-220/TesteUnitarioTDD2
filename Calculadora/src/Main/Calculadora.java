package Main;

public class Calculadora {


    public double adicionar(double numero1, double numero2) {
        return numero1 + numero2;
    }


    public double subtrair(double numero1, double numero2) {
        return numero1 - numero2;
    }


    public double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }


    public double dividir(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return numero1 / numero2;
    }
}