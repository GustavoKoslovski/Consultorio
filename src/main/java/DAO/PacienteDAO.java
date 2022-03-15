package DAO;

import Factory.ConnectionFactory;
import Model.Paciente;

import java.sql.*;

public class PacienteDAO {

    private Connection connection;

    public PacienteDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void criarTabelaMedico() {
        String sql = "CREATE TABLE IF NOT EXISTS pacientes (" +
                "idPaciente BIGSERIAL PRIMARY KEY," +
                "tipoAtendimento VARCHAR(30)" +
                "dataContratacao TIMESTAMP" +
                "nome VARCHAR (50)," +
                "rg VARCHAR (50)," +
                "nacionalidade VARCHAR (30)" +
                "celular VARCHAR (30)" +
                "cpf VARCHAR (30)" +
                "email VARCHAR (30)" +
                "login VARCHAR (50)" +
                "senha VARCHAR (50)" +
                "tipoSanguineo VARCHAR (4)" +
                "numeroCartaoConvenio VARCHAR (30)" +
                ");";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

   /* public void cadastrarPaciente(Paciente paciente) {
        String sql = "INSERT INTO pacientes (tipoAtendimento) VALUES (?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, categoria.getNomeCategoria());
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();

            while (resultSet.next()) {
                categoria.setIdCategoria(resultSet.getInt(1));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
*/

}
