/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TJornada;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TJornadaFacadeLocal {

    void create(TJornada tJornada);

    void edit(TJornada tJornada);

    void remove(TJornada tJornada);

    TJornada find(Object id);

    List<TJornada> findAll();

    List<TJornada> findRange(int[] range);

    int count();
    
}
