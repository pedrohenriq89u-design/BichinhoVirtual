public class Bichinho {

   private String nome;
    private int fome;
    private int energia;
    private String humor;




    public Bichinho(String nome) {
        this.nome = nome;
        this.fome = 50;
        this.energia = 50;
        humor = "Normal";
    }

    public Bichinho(int energia, String nome, int fome, String humor) {
        this.energia = energia;
        this.nome = nome;
        this.fome = fome;
        this.humor = humor;

    }
    public  int getEnergia(){
        return energia;
    }

    public String getNome() {
        return nome;
    }

    public int getFome() {
       return fome;
    }

    public String getHumor() {
        int x = energia - fome;
        if (x > 75){
            return humor = "Muito Feliz";
        }else if (x >= 50 ) {
            return humor = "Feliz";
        }else if (x >= 0) {
            return humor = "Normal";
        } else if (x > -30) {
            return humor = "Cansado";
        }else {
            return humor = "Triste";

        }

    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEnergia(int energia) {
        if (energia >= 0 && energia <= 100){
            this.energia = energia;
        }else {
            IO.println("Digite um valor válido");
        }
    }

    public void setFome(int fome) {
        if (fome >= 0 && fome <= 100){
            this.fome = fome;
        }else {
            IO.println("Digite um valor válido");
        }
    }

    @Override
    public String toString() {
        return "Bichinho{" +
                "nome='" + nome + '\'' +
                ", fome=" + fome + getHumor()+
                ", energia=" + energia +
                ", humor='" + humor + '\'' +
                '}';
    }
    }


