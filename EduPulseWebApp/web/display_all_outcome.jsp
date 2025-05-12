<%-- 
    Document   : view_all_outcome
    Created on : 12 May 2025, 11:45:31 AM
    Author     : karab
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entity.EduPulse"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Everyone in the list</h1>
        <%
            List<EduPulse> listEdu =(List<EduPulse>)request.getAttribute("listEdu");
        %>
        <table border="1" style="border-collapse: collapse">
            <thead>
                <tr>
                    <th>Student Number</th>
                    <th>Student Name</th>
                    <th>Student Surname</th>
                    <th>Course</th>
                    <th>Gender</th>
                </tr>
            </thead>
            <%
                for(EduPulse eduPulse : listEdu){
            %>
            <tbody>
                <tr>
                    <td><%=eduPulse.getId()%></td>
                    <td><%=eduPulse.getName()%></td>
                    <td><%=eduPulse.getSurname()%></td>
                    <td><%=eduPulse.getCourse()%></td>
                    <td><%=eduPulse.getGender()%></td>
                </tr>
            </tbody>
            <%
                }
            %>
        </table>
        <p><a href="index.html">index page</a></p>

    </body>
</html>
