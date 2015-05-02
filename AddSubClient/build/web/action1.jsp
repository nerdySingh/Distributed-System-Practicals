<%-- 
    Document   : action1
    Created on : 19 Apr, 2015, 9:59:09 PM
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
	addsub.Calc_Service service = new addsub.Calc_Service();
	addsub.Calc port = service.getCalcPort();
	 // TODO initialize WS operation arguments here
	int a = a1;
	int b = b1;
        
	// TODO process result here
	int res= port.add(a, b,0);
	out.println("Result = "+res);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    
    <%-- start web service invocation --%><hr/>
    <%
        int a2=Integer.parseInt(request.getParameter("text1"));
        int b2=Integer.parseInt(request.getParameter("text2"));
    try {
	addsub.Calc_Service service = new addsub.Calc_Service();
	addsub.Calc port = service.getCalcPort();
	 // TODO initialize WS operation arguments here
	int a = a2;
	int b = b2;
	// TODO process result here
	java.lang.Integer result = port.sub(a, b);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
