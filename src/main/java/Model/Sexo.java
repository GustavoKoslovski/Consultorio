package Model;

public enum Sexo {
    masculino("Masculino"), feminino("Feminino");
    public final String valor;

    private Sexo(String valor){
        this.valor = valor;
    }
}