package DAO;
import Factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SecretariaDAO {

    private Connection connection;

    public SecretariaDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void criarTabelaMedico() {
        String sql = "CREATE TABLE IF NOT EXISTS secretarias (" +
                "idSecretaria BIGSERIAL PRIMARY KEY," +
                "nome VARCHAR (50)," +
                "rg VARCHAR (50)," +
                "nacionalidade VARCHAR (30)" +
                "celular VARCHAR (30)" +
                "cpf VARCHAR (30)" +
                "email VARCHAR (30)" +
                "login VARCHAR (50)" +
                "senha VARCHAR (50)" +
                "tipoSanguineo VARCHAR (4)" +
                "salario DECIMAL," +
                "dataContratacao TIMESTAMP," +
                "pis VARCHAR (30)" +
                ");";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}
