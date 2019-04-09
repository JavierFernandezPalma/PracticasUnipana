/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TModalidadEstudio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TModalidadEstudioFacadeLocal {

    void create(TModalidadEstudio tModalidadEstudio);

    void edit(TModalidadEstudio tModalidadEstudio);

    void remove(TModalidadEstudio tModalidadEstudio);

    TModalidadEstudio find(Object id);

    List<TModalidadEstudio> findAll();

    List<TModalidadEstudio> findRange(int[] range);

    int count();
    
}
