/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.ejb.bl.EduPulseFacadeLocal;
import za.ac.tut.entity.EduPulse;

public class GetAllByGenderServlet extends HttpServlet {
    @EJB EduPulseFacadeLocal epl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Character gender = request.getParameter("gender").charAt(0);
        
        List<EduPulse> edu = epl.getAllByGender(gender);
        request.setAttribute("edu", edu);
        
        RequestDispatcher rd = request.getRequestDispatcher("get_per_gender_outcome.jsp");
        rd.forward(request, response);
    }
}
