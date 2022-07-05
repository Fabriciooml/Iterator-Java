public class Eleitor {

    private String nome;
    private int voto;

    public Eleitor(String nome, int idade) {
        this.nome = nome;
        this.voto = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVoto() {return voto;}

    public void setVoto(int voto) {
        this.voto = voto;
    }
}
