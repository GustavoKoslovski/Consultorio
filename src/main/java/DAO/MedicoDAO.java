package DAO;
import Factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MedicoDAO {

    private Connection connection;

    public MedicoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void criarTabelaMedico() {
        String sql = "CREATE TABLE IF NOT EXISTS consultorio.consultorio.medicos (" +
                "idMedico BIGSERIAL PRIMARY KEY," +
                "nome VARCHAR (50)," +
                "rg VARCHAR (50)," +
                "nacionalidade VARCHAR (30)," +
                "celular VARCHAR (30)," +
                "cpf VARCHAR (30)," +
                "email VARCHAR (30)," +
                "login VARCHAR (50)," +
                "senha VARCHAR (50)," +
                "tipoSanguineo VARCHAR (4)," +
                "porcenParticipacao DECIMAL," +
                "consultorio VARCHAR (30)" +
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
