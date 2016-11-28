package br.com.cwi.crescer.aula02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonagemFactory {
    public void executarComandosViaArquivoSql(String caminhoArquivo) {
        WriterReaderArquivos leitor = new WriterReaderArquivos();
        List<String> comandos = leitor.lerArquivo(caminhoArquivo);
        List<String> comandosMontados = montarComandos(comandos);
        comandosMontados.forEach(comand -> {
            if (comand.toLowerCase().contains("create")) {
                System.out.println("criando...");
                executarCriarTabelaLidoDeArquivos(comand);
            } else if (comand.toLowerCase().contains("delete")) {
                System.out.println("deletando...");
                executarDeleteLidoDeArquivo(comand);
            } else if (comand.toLowerCase().contains("insert")) {
                System.out.println("inserindo...");
                executarInsertLidoDeArquivo(comand);
            }
        });
    }
    
    public void insertDoArquivoCsv(String arquivo){
        WriterReaderArquivos leitor = new WriterReaderArquivos();
        List<Personagem> persona = leitor.lerArquivoCsv(arquivo);
        for(Personagem personagem : persona ){
            insert(personagem);
        }
    }
    
    private List<String> montarComandos(List<String> comandos) {
        List<String[]> comandosPreMontados = new ArrayList<>();
        List<String> comandosMontados = new ArrayList<>();
        comandos.forEach(line -> {
            comandosPreMontados.add(line.split(";"));
        });
        for (int x = 0; x < comandosPreMontados.size(); x++) {
            comandosMontados.addAll(Arrays.asList(comandosPreMontados.get(x)));
        }
        return comandosMontados;
    }

    private void executarInsertLidoDeArquivo(String insert) {
        try (final Connection connection = ConnectionUtils.getConnection();
             final PreparedStatement preparedStatement = connection.prepareStatement(insert)) {
            preparedStatement.executeUpdate();
        } catch (final SQLException e) {
            System.err.format("SQLException: %s", e);
        }
    }
    
    private void insert(Personagem p) {
         final String insert = "INSERT INTO PERSONAGEM("
                 + "ID_PERSONAGEM, NM_PERSONAGEM ) "
                 + "VALUES (?, ?)";
         try (final Connection connection = ConnectionUtils.getConnection();
              final PreparedStatement preparedStatement = connection.prepareStatement(insert)) {
             preparedStatement.setInt(1, p.getIdPersonagem());
             preparedStatement.setString(2, p.getNmPersonagem());
             preparedStatement.executeUpdate();
         } catch (final SQLException e) {
             System.err.format("SQLException: %s", e);
         }
     }

    private void executarCriarTabelaLidoDeArquivos(String create) {
        try (final Connection connection = ConnectionUtils.getConnection();
             final Statement statement = connection.createStatement();) {
            statement.executeUpdate(create);
        } catch (final SQLException e) {
            System.err.format("SQLException: %s", e);
        }
    }

    private void executarDeleteLidoDeArquivo(String delete) {
        try (final Connection connection = ConnectionUtils.getConnection();
                final PreparedStatement preparedStatement = connection.prepareStatement(delete)) {

            preparedStatement.executeUpdate();

        } catch (final SQLException e) {
            System.err.format("SQLException: %s", e);
        }
    }

    public List<Personagem> buscarTodos() {
        final String query = "SELECT * FROM PERSONAGEM";
        try (final Connection connection = ConnectionUtils.getConnection();
             final Statement statement = connection.createStatement();
             final ResultSet resultSet = statement.executeQuery(query);) {
            List<Personagem> lista = new ArrayList<>();
            while (resultSet.next()) {
                final Personagem persona = new Personagem();
                persona.setIdPersonagem(resultSet.getInt("id_personagem"));
                persona.setNmPersonagem(resultSet.getString("nm_personagem"));
                lista.add(persona);
            }
            return lista;
        } catch (final SQLException e) {
            System.err.format("SQLException: %s", e);
        }
        return null;
    }
    
    public void buscarQuery(String query){
        try (final Connection connection = ConnectionUtils.getConnection();
             final Statement statement = connection.createStatement();
             final ResultSet resultSet = statement.executeQuery(query);) {
            List<Personagem> lista = new ArrayList<>();
             while(resultSet.next()){
                 final Personagem persona = new Personagem();
                persona.setIdPersonagem(resultSet.getInt("id_personagem"));
                persona.setNmPersonagem(resultSet.getString("nm_personagem"));
                lista.add(persona);
             }
             lista.forEach( p -> {
                 System.out.println("|"+p.getIdPersonagem()+"|"+p.getNmPersonagem()+"|");
                 System.out.println("-------------------------");
             });
        } catch (final SQLException e) {
            System.err.format("SQLException: %s", e);
        }
    }
}
