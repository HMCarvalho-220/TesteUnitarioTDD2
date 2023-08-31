package Main;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double numero1 = 2.0;
        double numero2 = 3.0;


        double resultadoAdicao = calculadora.adicionar(numero1, numero2);
        double resultadoSubtracao = calculadora.subtrair(numero1, numero2);
        double resultadoMultiplicacao = calculadora.multiplicar(numero1, numero2);
        double resultadoDivisao = calculadora.dividir(numero1, numero2);

        System.out.println("Resultados: ");
        System.out.println("Adição: " + resultadoAdicao);
        System.out.println("Subtração: " + resultadoSubtracao);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);
        System.out.println("Divisão: " + resultadoDivisao);
    }
}