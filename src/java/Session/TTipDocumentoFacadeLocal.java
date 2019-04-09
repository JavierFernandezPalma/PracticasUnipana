/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TTipDocumento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TTipDocumentoFacadeLocal {

    void create(TTipDocumento tTipDocumento);

    void edit(TTipDocumento tTipDocumento);

    void remove(TTipDocumento tTipDocumento);

    TTipDocumento find(Object id);

    List<TTipDocumento> findAll();

    List<TTipDocumento> findRange(int[] range);

    int count();
    
}
