<%-- 
    Document   : procesar
    Created on : 22/07/2019, 07:29:57 PM
    Author     : PC HOGAR
--%>


<%@page import="com.google.gson.Gson"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script  type="text/javascript">
            
            
        </script>
        <title>Consumo de web service</title>
    </head>
    <body>
        
        
        <h1 class="container" mt-4>Consumo Webservice Soap</h1>
             <br><br>
             <form role="form" METHOD="POST"  id="fmBuscar">
     
  <div class="form-group" >
      <center><label for="email"><h2>Ingrese cotilazión a realizar</h2></label></center>
      <input type="text" class="form-control" id="cantidad" name="cantidad" placeholder="Digite el monto a cotizar" required>
  </div>
  
                 <center><button type="submit"  class="btn btn-primary" id="btn" >consultar</button></center>
</form>
   
        <br><br>
            <div class="card">
                
                <div class="card-header">
                    
                   
                    
                    <div class="card-body">
                        
                        <table class="table talbe-hover" id="table">
                            
                            <thead>
                                
                                <tr>
                                    <th>Monto</th>
                                    <th>Socio que realiza el préstamo</th>
                                    <th>Cuota mensual</th>
                                    <th>Pago total del crédito</th>
                                    <th>Tasa de interés mensual</th>
                                    
                                </tr>
                            </thead>
                            
                            <tbody>
                                <tr>
                                   
                                    <td> <%
    try {
        double cantidad = Double.parseDouble(request.getParameter("cantidad"));
	WS.WSfinanciacion_Service service = new WS.WSfinanciacion_Service();
	WS.WSfinanciacion port = service.getWSfinanciacionPort();
	 // TODO initialize WS operation arguments here
	double arg0 = cantidad;
	// TODO process result here
	java.util.List<WS.Socio> result = port.obtener(arg0);
        result.toString();
        Gson gson = new Gson();
       String JSON = gson.toJson(result);
        
           out.println("Result = " + JSON);
       
	
        


    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %></td>
                                     <td></td>
                                      <td></td>
                                       <td></td>  
                                       <td></td>  
                                    
                                </tr>
                            </tbody>
                            
                            
                        </table>
                        
                        
                    </div>
                <div id="resultado"></div>
            </div>
                                
            </div>

    </body>
</html>

   
  
