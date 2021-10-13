public class Cidade {
    private UF estado;
    private String descricao;

    public Cidade(UF estado, String descricao) {
        this.estado = estado;
        this.descricao = descricao;
    }

    public UF getEstado() {
        return estado;
    }

    public void setEstado(UF estado) {
        this.estado = estado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}
