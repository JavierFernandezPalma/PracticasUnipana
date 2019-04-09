/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TDepartamento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TDepartamentoFacadeLocal {

    void create(TDepartamento tDepartamento);

    void edit(TDepartamento tDepartamento);

    void remove(TDepartamento tDepartamento);

    TDepartamento find(Object id);

    List<TDepartamento> findAll();

    List<TDepartamento> findRange(int[] range);

    int count();
    
}
