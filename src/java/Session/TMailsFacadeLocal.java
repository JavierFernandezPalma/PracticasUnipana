/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TMails;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TMailsFacadeLocal {

    void create(TMails tMails);

    void edit(TMails tMails);

    void remove(TMails tMails);

    TMails find(Object id);

    List<TMails> findAll();

    List<TMails> findRange(int[] range);

    int count();
    
    //public void crearEmail(TMails tMails);
    
}
