package exercicios.matematica;
import java.util.*; 

public class EX01 {
	
	public static Scanner sc = new Scanner(System.in); // Criação do Scanner

    public static void main(String[] args) {

        System.out.println("Digite um numero");
        int num1 = sc.nextInt(); // Lê o primeiro número
        System.out.println("digite outro numero");
        int num2 = sc.nextInt(); // Lê o segundo número

        int soma = num1 + num2;

        System.out.println(soma); 

    }

}
