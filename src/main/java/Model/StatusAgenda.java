package Model;

public enum StatusAgenda {
    paciente("Paciente"),
    aprovado("Aprovado"), rejeitado("Rejeitado"), cancelado("C"), compareceu("Com"), nao_compareceu("Nao");

    public final String valor;

    private StatusAgenda(String valor){
        this.valor = valor;
    }
}