
package conecaobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class  package-info{

	
	public static void main(String[] args) {
	
		final String DATABASE_URL = "jdbc:mssql://localhost:1433/books";
	
		final String SELECT_QUERY = "SELECT autorID, firstName, lastName FROM authors";
		final String username = "sa";
		final String password = "etec";
		
		try {
			DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
			Connection conet = DriverManager.getConnection(DATABASE_URL, username, password);
			Statement stat = connection.createStatement();
			ResultSet result = statement.executeQuery(SELECT_QUERY);
			ResultSetMetaData metaData = resultset.getMetaData();
			int numberOfColumns = metaData.getColumnCount();
			System.out.printf("Tabela de Autores do Banco de Dados Books:%n%n");
			for (int i =1; i <= numberOfColumns; i++) {
				System.out.printf("%-8s/t", metaData.getColumnName(i));
			}
			System.out.println();
			while (resultset.next()) {
				for (int i =1; i <= numberOfColumns; i++) {
					System.out.printf("%-8s/t", resultset.getObject(i));
				}
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println("Erro de conexão: " + e.getMessage());
		} catch (Exception ex) {
			System.out.println("Erro geral: " + ex.getMessage());
		}
	}
}
