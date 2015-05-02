<%-- 
    Document   : action1
    Created on : 19 Apr, 2015, 4:28:33 PM
    Author     : tanveer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    <%-- start web service invocation --%><hr/>
    <%
        int a1=Integer.parseInt(request.getParameter("text1"));
        int b1=Integer.parseInt(request.getParameter("text2"));
    try {
	server.Methods_Service service = new server.Methods_Service();
	server.Methods port = service.getMethodsPort();
	 // TODO initialize WS operation arguments here
	int a = a1;
	int b = b1;
	// TODO process result here
	int result = port.addd(a, b);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
