/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.ejb.bl.EduPulseFacadeLocal;
import za.ac.tut.entity.EduPulse;

/**
 *
 * @author karab
 */
public class AddServlet extends HttpServlet {
    @EJB private EduPulseFacadeLocal epl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String course = request.getParameter("course");
        Character gender = request.getParameter("gender").charAt(0);
        Date creationDate = new Date();
        
        EduPulse eduPulse = createEduPulse(id,name,surname,course,gender,creationDate);
        epl.create(eduPulse);
        
        RequestDispatcher rd = request.getRequestDispatcher("add_outcome.jsp");
        rd.forward(request, response);
    }
    private EduPulse createEduPulse(Long id, String name, String surname, String course, char gender, Date creationDate){
        EduPulse edu = new EduPulse();
        edu.setId(id);
        edu.setName(name);
        edu.setSurname(surname);
        edu.setCourse(course);
        edu.setGender(gender);
        edu.setCreationDate(creationDate);
        return edu;
    }


}
