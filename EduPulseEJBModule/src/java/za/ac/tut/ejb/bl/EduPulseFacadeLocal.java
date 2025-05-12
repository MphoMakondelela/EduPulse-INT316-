/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entity.EduPulse;

/**
 *
 * @author karab
 */
@Local
public interface EduPulseFacadeLocal {

    void create(EduPulse eduPulse);

    void edit(EduPulse eduPulse);

    void remove(EduPulse eduPulse);

    EduPulse find(Object id);

    List<EduPulse> findAll();

    List<EduPulse> findRange(int[] range);

    int count();
    
    List<EduPulse> getAllByGender(Character gender);
    
}
