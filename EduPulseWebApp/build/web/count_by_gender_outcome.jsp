<%-- 
    Document   : count_by_gender_outcome
    Created on : 12 May 2025, 3:32:18 PM
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
        <h1>Hello World!</h1>
        <%
            Long cnt = (Long) request.getAttribute("cnt");
            List<EduPulse> eduPulse = (List<EduPulse>) request.getAttribute("eduPulse");
            
        %>
        <p>The total count is <b><%=cnt%></b> </p><br>
        <p>Below are the list of students</p>
        <table border="1">
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
                for(EduPulse edu : eduPulse){
            %>
            <tbody>
                <tr>
                    <td><%=edu.getId()%></td>
                    <td><%=edu.getName()%></td>
                    <td><%=edu.getSurname()%></td>
                    <td><%=edu.getCourse()%></td>
                    <td><%=edu.getGender()%></td>
                </tr>
            </tbody>
            <%
                }
            %>
        </table>
          <ul>
            <li> <a href="index.html">Home page</a></li>
            <li> <a href="menu.html">menu page</a></li>
             
        </ul>

    </body>
</html>
