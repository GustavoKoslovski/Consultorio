package Model;

import java.time.LocalDateTime;

public abstract class Pessoa extends AbstractEntity{

    private String nome, rg, nacionalidade, celular, cpf, email, login, senha, tipoSanguineo;

    public Pessoa() {
    }

    public Pessoa(String nome, String rg, String nacionalidade, String celular, String cpf, String email, String login, String senha, String tipoSanguineo) {
        this.nome = nome;
        this.rg = rg;
        this.nacionalidade = nacionalidade;
        this.celular = celular;
        this.cpf = cpf;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", rg='" + rg + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", celular='" + celular + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", tipoSanguineo='" + tipoSanguineo + '\'' +
                '}';
    }
}
