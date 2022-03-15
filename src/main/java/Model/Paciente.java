package Model;

import java.time.LocalDateTime;

public class Paciente extends Pessoa {

    private String numeroCartaoConvenio;
    private LocalDateTime dataVencimento;
    private TipoAgendamento tipoAgendamento;

    public Paciente(String numeroCartaoConvenio, LocalDateTime dataVencimento, TipoAgendamento tipoAgendamento) {
        this.numeroCartaoConvenio = numeroCartaoConvenio;
        this.dataVencimento = dataVencimento;
        this.tipoAgendamento = tipoAgendamento;
    }

    public TipoAgendamento getTipoAgendamento() {
        return tipoAgendamento;
    }

    public void setTipoAgendamento(TipoAgendamento tipoAgendamento) {
        this.tipoAgendamento = tipoAgendamento;
    }

    public String getNumeroCartaoConvenio() {
        return numeroCartaoConvenio;
    }

    public void setNumeroCartaoConvenio(String numeroCartaoConvenio) {
        this.numeroCartaoConvenio = numeroCartaoConvenio;
    }

    public LocalDateTime getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDateTime dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                ", numeroCartaoConvenio='" + numeroCartaoConvenio + '\'' +
                ", dataVencimento=" + dataVencimento +
                '}';
    }
}
