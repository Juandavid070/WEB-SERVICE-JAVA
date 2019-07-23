/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Webservice;

import Model.Socio;
import Model.SocioDao;
import java.sql.SQLException;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author PC HOGAR
 */
@WebService(serviceName = "WSfinanciacion")
public class WSfinanciacion {
  SocioDao dao = new SocioDao();
    /**
     * Web service operation
     * @param cantidad
     * @return 
     */
    @WebMethod(operationName = "obtener")
    public List<Socio> obtener(double cantidad)  {
      
        List datos=dao.obtenerCotizacion(cantidad);
       
        
        if(datos == null || datos.isEmpty()){
            
            datos.clear();
            datos.add("No hay socio disponible");
        }
       
        
        return datos;
    }

    /**
     * Web service operation
     */
   
}
