/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TActividadEconomica;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TActividadEconomicaFacadeLocal {

    void create(TActividadEconomica tActividadEconomica);

    void edit(TActividadEconomica tActividadEconomica);

    void remove(TActividadEconomica tActividadEconomica);

    TActividadEconomica find(Object id);

    List<TActividadEconomica> findAll();

    List<TActividadEconomica> findRange(int[] range);

    int count();
    
}
