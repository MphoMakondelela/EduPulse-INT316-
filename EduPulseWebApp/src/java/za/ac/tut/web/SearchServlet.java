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
public class SearchServlet extends HttpServlet {
    @EJB EduPulseFacadeLocal epl;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Long id = Long.parseLong(request.getParameter("id"));
        
        EduPulse edu = epl.find(id);
        request.setAttribute("edu", edu);
        
        RequestDispatcher disp = request.getRequestDispatcher("search_outcome.jsp");
        disp.forward(request, response);

    }


}
