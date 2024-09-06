/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Amanda
 */
//Crie uma classe que calcule o imposto de renda com base no salário de uma pessoa, use o conceito de encapsulamento.
import java.util.Scanner;

public class ImpostodeRenda {
    private String nome;
    private double salariobruto;
    private double imposto;
    
    public ImpostodeRenda(String nome, double salariobruto){
        this.nome = nome;
        this.salariobruto = salariobruto;
        CalcularImposto(salariobruto);
    }
    public void CalcularImposto(double salariobruto){
        if (salariobruto <= 1903.98) {

            imposto = 0.0; // Isento

        }else if (salariobruto <= 2826.65){

            imposto = salariobruto * 0.075 - 142.80;

        }else if (salariobruto <= 3751.05){

            imposto = salariobruto * 0.15 - 354.80;

        }else if (salariobruto <= 4664.68) {

            imposto = salariobruto * 0.225 - 636.13;

        }else {

            imposto = salariobruto * 0.275 - 869.36;
        } 
    }
    
    public String getNome(){
        return nome;
    }
    public double getSalarioBruto(){
        return salariobruto;
    }
    public double getImposto(){
        return imposto;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome");
        String nome = scanner.nextLine();
        System.out.println("Digite o salario bruto");
        double salariobruto = scanner.nextDouble();
        
        ImpostodeRenda calculaimposto = new ImpostodeRenda(nome, salariobruto);
        System.out.println("Nome" + calculaimposto.getNome());
        System.out.println("Salario" + calculaimposto.getSalarioBruto());
        System.out.println("Imposto para declarar: " + calculaimposto.getImposto());
        
        scanner.close();
    }
}
