/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Amanda
 */

import java.util.Scanner;
//Crie uma classe que calcula a área de diferentes formas geométricas (quadrado, retângulo, e círculo) usando a sobrecarga de métodos.
public class CalcularArea {
    
    public double quadrado(double lado){
        return lado * lado;
    }
    public double retangulo(double base, double altura){
        return base * altura;
    }
    public double circulo(double raio){
        return Math.PI * raio * raio;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        CalcularArea calcularArea = new CalcularArea();
        System.out.println("Digite o lado do quadrado");
        double lado = scanner.nextDouble();
        System.out.println("Digite a base do retangulo");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura do retangulo");
        double altura = scanner.nextDouble();
        System.out.println("Digite o raio do circulo");
        double raio = scanner.nextDouble();
        
        double areaQuadrado = calcularArea.quadrado(lado);
        double areaRetangulo = calcularArea.retangulo(base, altura);
        double areaCirculo = calcularArea.circulo(raio);
        
        System.out.println("Área do quadrado: " + areaQuadrado);
        System.out.println("Área do retângulo: " + areaRetangulo);
        System.out.println("Área do círculo: " + areaCirculo);

        scanner.close();
    }
}
