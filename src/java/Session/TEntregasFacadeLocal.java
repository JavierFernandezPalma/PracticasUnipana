/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TEntregas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TEntregasFacadeLocal {

    void create(TEntregas tEntregas);

    void edit(TEntregas tEntregas);

    void remove(TEntregas tEntregas);

    TEntregas find(Object id);

    List<TEntregas> findAll();

    List<TEntregas> findRange(int[] range);

    int count();
    
}
