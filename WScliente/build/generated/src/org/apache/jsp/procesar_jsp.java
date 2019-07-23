package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class procesar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <script  type=\"text/javascript\">\n");
      out.write("            \n");
      out.write("        \n");
      out.write("        </script>\n");
      out.write("        <title>Consumo de web service</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <h1 class=\"container\" mt-4>Consumo Webservice Soap</h1>\n");
      out.write("             <br><br>\n");
      out.write("             <form role=\"form\" METHOD=\"POST\"  id=\"fmBuscar\" action=\"procesar.jsp\">\n");
      out.write("     \n");
      out.write("  <div class=\"form-group\" >\n");
      out.write("      <center><label for=\"email\"><h2>Ingrese cotilazión a realizar</h2></label></center>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"cantidad\" name=\"cantidad\" placeholder=\"Digite el monto a cotizar\">\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("                 <center><button type=\"submit\"  class=\"btn btn-primary\" id=\"btn\" onclick=\"obtener();\">consultar</button></center>\n");
      out.write("</form>\n");
      out.write("   \n");
      out.write("        <br><br>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                \n");
      out.write("                <div class=\"card-header\">\n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        \n");
      out.write("                        <table class=\"table talbe-hover\" id=\"table\">\n");
      out.write("                            \n");
      out.write("                            <thead>\n");
      out.write("                                \n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Monto</th>\n");
      out.write("                                    <th>Socio que realiza el préstamo</th>\n");
      out.write("                                    <th>Cuota mensual</th>\n");
      out.write("                                    <th>Pago total del crédito</th>\n");
      out.write("                                    <th>Tasa de interés mensual</th>\n");
      out.write("                                    \n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            \n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                   \n");
      out.write("                                    <td>  \n");
      out.write("    ");

    try {
        double cantidad = Double.parseDouble("cantidad");
	WS.WSfinanciacion_Service service = new WS.WSfinanciacion_Service();
	WS.WSfinanciacion port = service.getWSfinanciacionPort();
	 // TODO initialize WS operation arguments here
	double arg0 = cantidad;
	// TODO process result here
	java.util.List<WS.Socio> result = port.obtener(arg0);
	out.println("Result = " + result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("</td>\n");
      out.write("                                     <td></td>\n");
      out.write("                                      <td></td>\n");
      out.write("                                       <td></td>  \n");
      out.write("                                       <td></td>  \n");
      out.write("                                    \n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        </table>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                <div id=\"resultado\"></div>\n");
      out.write("            </div>\n");
      out.write("                                \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" \n");
      out.write("  \n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
