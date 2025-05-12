/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.entity.EduPulse;

/**
 *
 * @author karab
 */
@Stateless
public class EduPulseFacade extends AbstractFacade<EduPulse> implements EduPulseFacadeLocal {

    @PersistenceContext(unitName = "EduPulseEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EduPulseFacade() {
        super(EduPulse.class);
    }

    /*@Override
    public List<EduPulse> countByGender() {
        String queryMsg = "SELECT e.gender COUNT(e) FROM EduPulse e GROUP BY e.gender";
        Query query = em.createQuery(queryMsg);
        List<EduPulse> cnt = query.getResultList();
        return cnt;
    }*/
    @Override
    public List<EduPulse> getAllByGender(Character gender) {
        String queryStr = "SELECT e FROM EduPulse e WHERE e.gender = ?1";
        Query query = em.createQuery(queryStr);
        query.setParameter(1, gender);
        List<EduPulse> cnt = (List<EduPulse>) query.getResultList();
        return cnt;
    }      
}
