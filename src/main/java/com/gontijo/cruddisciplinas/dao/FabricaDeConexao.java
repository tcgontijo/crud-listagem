package com.gontijo.cruddisciplinas.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexao {
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/sistema3?serverTimezone=UTC", "root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
