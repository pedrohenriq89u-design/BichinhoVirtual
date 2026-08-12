public class Bichinho {

    private String nome;
    private int fome;
    private int energia;
    private String humor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getHumor() {
        return humor;
    }

    public void setHumor(String humor) {
        this.humor = humor;
    }

    public Bichinho(String nome) {
        this.nome = nome;
        this.fome = 50;
        this.energia = 50;
    }

}
