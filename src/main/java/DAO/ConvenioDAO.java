package DAO;

import Factory.ConnectionFactory;
import Model.Convenio;

import java.sql.*;

public class ConvenioDAO {

    private Connection connection;

    public ConvenioDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void criarTabelaConvenio() {
        String sql = "CREATE TABLE IF NOT EXISTS consultorio.consultorio.convenio (" +
                "idConvenio BIGSERIAL PRIMARY KEY," +
                "nome VARCHAR (20)," +
                "valor BIGINT," +
                ");";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void cadastrarCategoria(Convenio convenio) {
        String sql = "INSERT INTO consultorio.consultorio.convenio " +
                "(nome, valor)" +
                "VALUES (now(),?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, convenio.getNome());
            preparedStatement.setBigDecimal(2, convenio.getValor());
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}