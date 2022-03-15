package Model;
import java.math.BigDecimal;
public class Secretaria extends Pessoa {

    private BigDecimal salario;
    private String dataContratacao, pis;

    public Secretaria(BigDecimal salario, String dataContratacao, String pis) {
        this.salario = salario;
        this.dataContratacao = dataContratacao;
        this.pis = pis;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    @Override
    public String toString() {
        return "Secretaria{" +
                "salario=" + salario +
                ", dataContratacao='" + dataContratacao + '\'' +
                ", pis='" + pis + '\'' +
                '}';
    }
}
