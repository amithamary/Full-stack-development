package ustbatchnumber3.Jdbc;
import java.sql.*;
public class CreateTableEmployee {
    public static void main(String[] args) {
      
        String url = "jdbc:mysql://localhost:3306/amitha";
        String username = "root"; 
        String password = "*******"; 

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            String createTableQuery = "CREATE TABLE EMPLOYEE (" +                              
                                     "name VARCHAR(50) NOT NULL," +
                                     "age INT NOT NULL," +
                                     "department VARCHAR(50) NOT NULL" +                                    
                                    " )";
            
        
            
            Statement statement = connection.createStatement();
            statement.executeUpdate(createTableQuery);

            System.out.println("Table created successfully");

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

