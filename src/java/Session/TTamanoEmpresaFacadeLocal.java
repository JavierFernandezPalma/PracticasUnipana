/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TTamanoEmpresa;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TTamanoEmpresaFacadeLocal {

    void create(TTamanoEmpresa tTamanoEmpresa);

    void edit(TTamanoEmpresa tTamanoEmpresa);

    void remove(TTamanoEmpresa tTamanoEmpresa);

    TTamanoEmpresa find(Object id);

    List<TTamanoEmpresa> findAll();

    List<TTamanoEmpresa> findRange(int[] range);

    int count();
    
}
