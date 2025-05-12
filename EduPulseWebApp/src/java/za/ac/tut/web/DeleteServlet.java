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
public class DeleteServlet extends HttpServlet {
    @EJB private EduPulseFacadeLocal epl;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        
        EduPulse eduPulse = epl.find(id);
        epl.remove(eduPulse);
        
        request.setAttribute("eduPulse", eduPulse);
        
        RequestDispatcher disp = request.getRequestDispatcher("delete_outcome.jsp");
        disp.forward(request, response);
    }


}
