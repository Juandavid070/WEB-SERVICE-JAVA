/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC HOGAR
 */
public class SocioDao {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex=new Conexion();
    double res = Double.MAX_VALUE;
    double  vf=0;
    double va = 0;
    double i = 0;
    double n = 0;
    double cuota = 0;
    
    
  public List obtenerCotizacion(double cantidad) {
      List <Socio> datos = new ArrayList<>();
      String sql = "select * from socios";
      
       try   {
         
         
           con=conex.getConnection();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           
           while(rs.next()){
               
           
               
               Socio so = new Socio();
               
               double mod = rs.getDouble("monto_maximo") - cantidad; 
               
                 if(rs.getDouble("monto_maximo")>= cantidad && mod >= 0 && mod <= res ){
                   datos.clear();
                   
                   
                   double  vf, va, i, n,cuota;
                   va = cantidad;
                   i = Float.parseFloat(rs.getString("tasa"))/100;
                   n = 36;
                   //DecimalFormat formato = new DecimalFormat("#.00");
                   vf = va * (1+n*i);
                   cuota = vf/n;
                   cuota = Math.round(cuota * 100) / 100d;
                   vf = Math.round(vf * 100) / 100d;
                   
               so.setCantidad(cantidad);
               so.setSocio(rs.getString("socio"));
               so.setCmensual(cuota);
               so.setPtotal(vf);
               so.setTasa(rs.getString("tasa"));
               so.setMonto(rs.getDouble("monto_maximo"));
               datos.add(so);
               
               
               }
               
           }
             
         }
         catch(Exception e)
         {
             
	        
         }
        return datos;
      
      
  }

    
}
