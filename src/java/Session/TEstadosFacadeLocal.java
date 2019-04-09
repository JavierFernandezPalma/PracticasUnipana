/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TEstados;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TEstadosFacadeLocal {

    void create(TEstados tEstados);

    void edit(TEstados tEstados);

    void remove(TEstados tEstados);

    TEstados find(Object id);

    List<TEstados> findAll();

    List<TEstados> findRange(int[] range);

    int count();
    
}
