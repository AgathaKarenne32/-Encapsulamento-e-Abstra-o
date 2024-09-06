/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Amanda
 */
//Crie uma classe abstrata para representar um animal,
//onde métodos comuns a todos os animais são declarados, mas os detalhes de implementação são definidos nas subclasses, use o conceito de classes abstratas.
abstract class Animal {
    
    abstract String barulho();
    abstract String comendo();
    abstract String brincando();
    abstract int passos();
    
    static class Cachorro extends Animal {
        
        String barulho() {
           return "Au Au"; 
        }

        String comendo() {
            return "Comendo petiscos";
        }

        String brincando() {
            return "Correndo atrás da bola";
        }

        int passos() {
            return 6;
        }
                
    }

    static class Gato extends Animal {
    
        String barulho() {
            return "Miau Miau";
        }

        String comendo() {
            return "Comendo whiskas";
        }

        String brincando() {
            return "Brincando com o ratinho";
        }

        int passos() {
            return 4;
        }
    }
    
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        System.out.println("O cachorro faz: " + cachorro.barulho());
        System.out.println("O cachorro está: " + cachorro.comendo());
        System.out.println("O cachorro está: " + cachorro.brincando());
        System.out.println("O cachorro dá: " + cachorro.passos() + " passos");
        
        Animal gato = new Gato();
        System.out.println("O gato faz: " + gato.barulho());
        System.out.println("O gato está: " + gato.comendo());
        System.out.println("O gato está: " + gato.brincando());
        System.out.println("O gato dá: " + gato.passos() + " passos");
    }
}
