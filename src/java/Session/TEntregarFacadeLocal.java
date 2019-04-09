/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TEntregar;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TEntregarFacadeLocal {

    void create(TEntregar tEntregar);

    void edit(TEntregar tEntregar);

    void remove(TEntregar tEntregar);

    TEntregar find(Object id);

    List<TEntregar> findAll();

    List<TEntregar> findRange(int[] range);

    int count();
    
}
