package entities;

public class Carro {
    private String nome;
    private int distancia;
    private int velocidade;

    public Carro(){}

    public Carro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getDistancia() {
        return distancia;
    }

    public void atualizarDistancia() {
        distancia += velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "\n---------------- STATUS ----------------"
                + String.format(
                "\nCarro %s - Distancia percorrida: %d",
                nome,
                distancia
        );
    }
}