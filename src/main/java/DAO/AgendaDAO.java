package DAO;

import Factory.ConnectionFactory;
import Model.Agenda;

import java.sql.*;

public class AgendaDAO {

    private Connection connection;

    public AgendaDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void criarTabelaAgenda() {
        String sql = "CREATE TABLE IF NOT EXISTS consultorio.consultorio.agenda (" +
                "idAgenda BIGSERIAL PRIMARY KEY," +
                "dataAgendamento TIMESTAMP NOT NULL," +
                "encaixe BOOLEAN," +
                "statusAgendamento VARCHAR (10)," +
                "cadastro TIMESTAMP not null," +
                "atualizado TIMESTAMP," +
                "excluido TIMESTAMP," +
                "idPaciente BIGINT NOT NULL," +
                    "CONSTRAINT fk_idPaciente FOREIGN KEY (idPaciente)" +
                    "REFERENCES consultorio.paciente(id)" +
                "idMedico BIGINT NOT NULL," +
                    "CONSTRAINT  fk_idMedico FOREIGN KEY (idMedico)" +
                    "REFERENCES consultorio.medico(id)" +
                ");";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void cadastrarAgenda(Agenda agenda){
        String sql = "INSERT INTO consultorio.consultorio.agenda " +
                "(cadastro, statusAgendamento, dataAgendamento, encaixe, idPaciente, idMedico)" +
                "VALUES (now(),?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, agenda.getStatusAgenda().toString());
            preparedStatement.setTimestamp(2, Timestamp.valueOf(agenda.getDataAgendamento()));
            preparedStatement.setBoolean(3, agenda.getEncaixe());
            preparedStatement.setLong(4, agenda.getPaciente().getId());
            preparedStatement.setLong(5, agenda.getMedico().getId());
            preparedStatement.execute();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}




