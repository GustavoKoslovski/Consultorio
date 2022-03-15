package Model;

public class Medico extends Pessoa {

    private String crm, porcenParticipacao, consultorio;

    public Medico(String crm, String porcenParticipacao, String consultorio) {
        this.crm = crm;
        this.porcenParticipacao = porcenParticipacao;
        this.consultorio = consultorio;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getPorcenParticipacao() {
        return porcenParticipacao;
    }

    public void setPorcenParticipacao(String porcenParticipacao) {
        this.porcenParticipacao = porcenParticipacao;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "crm='" + crm + '\'' +
                ", porcenParticipacao='" + porcenParticipacao + '\'' +
                ", consultorio='" + consultorio + '\'' +
                '}';
    }
}
