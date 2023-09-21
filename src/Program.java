import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Program {
    public static void main(String [] args) {
        //1.Crie um programa que  receba uma nota e partir desta nota ele apresente aprovado se nota maior que 5 e reprovado se nota menor que 5.

        Scanner sc = new Scanner(System.in);

        System.out.println("Programa 1");
        System.out.println("Digite sua nota: ");
        float nota = sc.nextFloat();

        if (nota > 5) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        //2.Crie um programa que mostre se o número é par ou impar.  (numero%2 == 0) //par
        System.out.println("Programa 2");
        System.out.println("Digite o número: ");
        float numero = sc.nextFloat();

        if (numero % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }

        //3.Crie um programa que receba 2 números e um operador (+, -. *, /) e faça a respectiva operação.
        System.out.println("Programa 3");

        System.out.println("Digite um número: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        System.out.println("Digite o operador +, -, * ou /");
        char operator = sc.next().charAt(0);

        int result = 0;

        switch(operator) {
            case '+':
                result = numero1 + numero2;
                break;
            case '-':
                result = numero1 - numero2;
                break;
            case '*':
                result = numero1 * numero2;
                break;
            case '/':
                result = numero1 / numero2;
        }
        System.out.println("Result: " + result);
    }
}