/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
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
public class EditServlet extends HttpServlet {
    @EJB private EduPulseFacadeLocal epl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String course = request.getParameter("course");
        Character gender = request.getParameter("gender").charAt(0);
        
        EduPulse eduPulse = epl.find(id);
        if(eduPulse != null){
        eduPulse.setName(name);
        eduPulse.setSurname(surname);
        eduPulse.setCourse(course);
        eduPulse.setGender(gender);
        
        epl.edit(eduPulse);
        }
        
        request.setAttribute("eduPulse", eduPulse);
        
        RequestDispatcher disp = request.getRequestDispatcher("edit_outcome.jsp");
        disp.forward(request, response);
    }

}
