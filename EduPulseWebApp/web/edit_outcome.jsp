<%-- 
    Document   : edit_outcome
    Created on : 12 May 2025, 11:08:18 AM
    Author     : karab
--%>

<%@page import="za.ac.tut.entity.EduPulse"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            EduPulse eduPulse = (EduPulse)request.getAttribute("eduPulse");
            
                if(eduPulse != null){
        %>
        <p>
            <b><%=eduPulse.getName()%></b> you have successfully modified your values.
        </p>
        <%
         } else {
        %>
        <h3>Student ID is not found</h3>
        <%
            }
        %>
        <a href="index.html">index page</a>
    </body>
</html>
