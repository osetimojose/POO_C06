package org.example;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantidade de ingressos de inteira comprados: ");
        int ing_inteiro = teclado.nextInt();
        System.out.println("Quantidade de ingressos de meia comprados: ");
        int ing_meio = teclado.nextInt();
        System.out.println("Valor do ingresso inteiro:");
        double val_inteiro = Double.parseDouble(teclado.next().replace(",", "."));
        System.out.println("Valor do meio-ingresso:");
        double val_meia = Double.parseDouble(teclado.next().replace(",", "."));



        double total_inteira = ing_inteiro*val_inteiro;
        double total_meia = ing_meio*val_meia;
        double total_arrecadado = total_inteira+total_meia;
        double media_ingresso = total_arrecadado/(ing_inteiro + ing_meio);



        System.out.println("Total inteiro: " + total_inteira);
        System.out.println("Total meio: " + total_meia);
        System.out.println("Total de tudo: " + total_arrecadado);
        System.out.println("Média arrecadada por ingresso: " + media_ingresso);

    }
}


