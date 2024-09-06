/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Amanda
 */
import java.util.Scanner;

//Crie uma classe que implementa um método de soma, aceitando diferentes números e tipos de parâmetros (inteiros e decimais).
public class Soma {
    
    public double soma(double n1, double n2){
        return n1 + n2;
    }
    public double soma(double n1, int n2){
        return n1 + n2;
    }
    public double soma(int n1, double n2){
        return n1 + n2;
    }
    public double soma(int n1, int n2){
        return n1 + n2;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Soma soma = new Soma();
        
        System.out.println("Digite um numero decimal");
        double n1 = scanner.nextDouble();
        System.out.println("Digite um numero decimal");
        double n2 = scanner.nextDouble();
        System.out.println("Resultado da soma: " + soma.soma(n1, n2));
        
        System.out.println("Digite um numero decimal");
        double n3 = scanner.nextDouble();
        System.out.println("Digite um numero inteiro");
        int n4 = scanner.nextInt();
        System.out.println("Resultado da soma: " + soma.soma(n3, n4));
        
        System.out.println("Digite um numero inteiro");
        int n5 = scanner.nextInt();
        System.out.println("Digite um numero inteiro");
        int n6 = scanner.nextInt();
        System.out.println("Resultado da soma: " + soma.soma(n5, n6));
        
        scanner.close();
    }
}
