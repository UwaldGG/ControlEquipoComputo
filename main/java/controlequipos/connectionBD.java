
package controlequipos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author uwual
 */

public class connectionBD {
    public Connection conectarBaseDatos () throws SQLException {
        String url ="127.0.0.1";
        String user = "root@localhost";
        String password = "";
        
        return DriverManager.getConnection(url, user, password);
    }

    public void Operar(){
        try {
            Connection connection = conectarBaseDatos();
            System.out.println("Conectado");
            connection.close();
            System.out.println("Conexion terminada");
        }catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
        