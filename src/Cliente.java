import java.util.ArrayList;

public class Cliente {
    private Cidade cid;
    private String nome;

    public Cliente(Cidade cid, String nome) {
        this.cid = cid;
        this.nome = nome;
    }

    public Cidade getCid() {
        return cid;
    }

    public void setCid(Cidade cid) {
        this.cid = cid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome;
    }
}
