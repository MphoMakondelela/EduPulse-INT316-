<%-- 
    Document   : get_per_gender_outcome
    Created on : 12 May 2025, 10:39:41 PM
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
        <h1>Get All Per Gender JSP</h1>
        <%
  
            List<EduPulse> edu = (List<EduPulse>) request.getAttribute("edu");
            Integer num = edu.size();
        %>
        <p>in the list Below we have <%=num%> students and here is their list</p>
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
                for(EduPulse eduPulse : edu){
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
        
    </body>
</html>
