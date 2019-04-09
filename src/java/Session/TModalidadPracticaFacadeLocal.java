/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TModalidadPractica;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TModalidadPracticaFacadeLocal {

    void create(TModalidadPractica tModalidadPractica);

    void edit(TModalidadPractica tModalidadPractica);

    void remove(TModalidadPractica tModalidadPractica);

    TModalidadPractica find(Object id);

    List<TModalidadPractica> findAll();

    List<TModalidadPractica> findRange(int[] range);

    int count();
    
}
