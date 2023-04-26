package padroesestruturais.composite;

public class Ingrediente extends Conteudo {

    private String nome;

    public Ingrediente(String descricao, String nome) {
        super(descricao);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConteudo() {
        return "Ingrediente: " + this.getDescricao() + " - " + this.nome + "\n";
    }
}
