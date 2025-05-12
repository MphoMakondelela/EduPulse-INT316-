<%-- 
    Document   : search_outcome
    Created on : 12 May 2025, 11:21:29 PM
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
        <h1>Search Outcome</h1>
        <%
            EduPulse edu = (EduPulse) request.getAttribute("edu");
        if (edu != null) {
        %>
        <p>
            STUDENT Number : <%=edu.getId()%><br>
            STUDENT NAME : <%=edu.getName()%><br>
            STUDENT SURNAME : <%=edu.getSurname()%><br>
            COURSE : <%=edu.getCourse()%>
        </p>
        <%
        } else {
        %>
        <h3>Student Application ID is not found</h3>
        <%
            }
        %>
          <ul>
            <li> <a href="index.html">Home page</a></li>
            <li> <a href="menu.html">menu page</a></li>
             
        </ul>
    </body>
</html>
