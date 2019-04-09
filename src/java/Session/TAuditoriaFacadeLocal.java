/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TAuditoria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TAuditoriaFacadeLocal {

    void create(TAuditoria tAuditoria);

    void edit(TAuditoria tAuditoria);

    void remove(TAuditoria tAuditoria);

    TAuditoria find(Object id);

    List<TAuditoria> findAll();

    List<TAuditoria> findRange(int[] range);

    int count();
    
}
