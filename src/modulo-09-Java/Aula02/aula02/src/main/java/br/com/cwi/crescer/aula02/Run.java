/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author santos.jonathan
 */
public class Run {
    public static void main(String[] args) {
        Pessoa jonathan = new Pessoa();
        long id = 11;
        jonathan.setIdPessoa(id);
        jonathan.setNmPessoa("Jonathan");
        insert(jonathan);
    }
    public void criar() {
        final String query = "SELECT * FROM JONATHAN";
        try (final Connection connection = ConnectionUtils.getConnection();
                final Statement statement = connection.createStatement()) {
            try (final ResultSet resultSet = statement.executeQuery(query)) {
                while (resultSet.next()) {
                    final long Id = resultSet.getLong("ID_PESSOA");
                    System.out.println(Id);
                }
            } catch (final SQLException e) {
                System.err.format("SQLException: %s", e);
            }
        } catch (final SQLException e) {
            System.err.format("SQLException: %s", e);
        }
    }

    public static void insert() {
        final String insert = "INSERT INTO JONATHAN("
                + "ID_PESSOA, NM_PESSOA ) "
                + "VALUES (?, ?)";
        try (final Connection connection = ConnectionUtils.getConnection();
                final PreparedStatement preparedStatement = connection.prepareStatement(insert)) {
            for (int i = 1; i <= 10; i++) {
                preparedStatement.setInt(1, i);
                preparedStatement.setString(2, String.format("%s pessoa de 10", i));
                preparedStatement.executeUpdate();
            }
        } catch (final SQLException e) {
            System.err.format("SQLException: %s", e);
        }
    }
    
    public static void insert(Pessoa p) {
        final String insert = "INSERT INTO JONATHAN("
                + "ID_PESSOA, NM_PESSOA ) "
                + "VALUES (?, ?)";
        try (final Connection connection = ConnectionUtils.getConnection();
            final PreparedStatement preparedStatement = connection.prepareStatement(insert)) {

            preparedStatement.setLong(1, p.getIdPessoa());
            preparedStatement.setString(2, p.getNmPessoa());
            preparedStatement.executeUpdate();
        } catch (final SQLException e) {
            System.err.format("SQLException: %s", e);
        }
    }
}
