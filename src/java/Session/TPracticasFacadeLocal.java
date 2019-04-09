/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TPracticas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TPracticasFacadeLocal {

    void create(TPracticas tPracticas);

    void edit(TPracticas tPracticas);

    void remove(TPracticas tPracticas);

    TPracticas find(Object id);

    List<TPracticas> findAll();

    List<TPracticas> findRange(int[] range);

    int count();
    
}
