package services;

import entities.Carro;
import entities.Pista;

import java.util.Random;

public class Corrida {
    public static Random VALOR_ALEATORIO = new Random();

    public Corrida() {}

    public void limparTerminal() {
        System.out.println("\n".repeat(3));
    }

    public void gerarVelocidadeAleatoria(Carro car1, Carro car2) {
        car1.setVelocidade(VALOR_ALEATORIO.nextInt(3) + 1);
        car2.setVelocidade(VALOR_ALEATORIO.nextInt(3) + 1);
    }

    public void atualizarCorrida(Carro c1, Carro c2, Pista pista) {
        limparTerminal();

        c1.atualizarDistancia();
        c2.atualizarDistancia();

        pista.bordaDaPista();
        System.out.println(" ".repeat(c1.getDistancia()) + "🏎");
        System.out.println(" ".repeat(c2.getDistancia()) + "🏎");
        pista.bordaDaPista();
    }

    public void relatorioCorrida(Carro c1, Carro c2, Pista pista) {

        if (c1.getDistancia() > c2.getDistancia() && c1.getDistancia() >= pista.getTamanho()) {
            System.out.println();
        	System.out.print("🏆 GANHADOR: " + c1.getNome());
            System.out.print("\nPERDEDOR: " + c2.getNome());
            System.out.println();

        } else if (c2.getDistancia() > c1.getDistancia() && c2.getDistancia() >= pista.getTamanho()) {
        	System.out.println();
        	System.out.print("🏆 GANHADOR: " + c2.getNome());
            System.out.print("\nPERDEDOR: " + c1.getNome());
            System.out.println();

        } else {
        	System.out.println();
        	System.out.println("EMPATE!");
        	System.out.println();
        }

        System.out.println(c1.toString());
        System.out.println(c2.toString());

    }
}