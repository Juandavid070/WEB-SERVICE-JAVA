/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PC HOGAR
 */
public class Conexion {
    private  Connection con;
    private static final String driver = "com.mysql.jdbc.Driver";    
    private static final String user = "root";
    private static final String password = "";
    private static final String  url = "jdbc:mysql://localhost:3306/financiamiento_db";
    
    
    public Conexion (){
        
   try   {
         Class.forName(driver);
         con =  (Connection) DriverManager.getConnection(url, user, password);
         }
         catch(Exception e)
         {
             System.out.println("Error al conectar" +  e);
	        
         }
   
     
    }
    
    //este metodo nos retorna la conexión
    public Connection getConnection(){
     
        return con;
        
     }
        
    
}
