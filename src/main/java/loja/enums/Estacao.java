package main.java.loja.enums;

public enum Estacao {
    PRIMAVERA("Primavera", 1),
    VERAO("Verão", 2),
    OUTONO("Outono", 3),
    INVERNO("Inverno", 4);

    private final String descricao;
    private final int codigo;

    //construtor package ou privado(Que já é por natureza implicito privado)
    Estacao(String descricao, int codigo){
        this.descricao = descricao;
        this.codigo = codigo;
    }

    @Override
    public String toString(){
        return this.descricao;
    }
    public String getDescricao() {
        return descricao;
    }

    public int getCodigo() {
        return codigo;
    }
}
