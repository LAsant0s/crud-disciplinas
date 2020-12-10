package com.assis.crud.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexao {
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/sistemacrud?serverTimezone=UTC",
					"root", "");
		} catch (SQLException e) {
			System.out.println("|||--------------------->> "+e.getMessage());
			return null;
		}
	}
}
