/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entityes.TSectorEconomico;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javier_Toto
 */
@Local
public interface TSectorEconomicoFacadeLocal {

    void create(TSectorEconomico tSectorEconomico);

    void edit(TSectorEconomico tSectorEconomico);

    void remove(TSectorEconomico tSectorEconomico);

    TSectorEconomico find(Object id);

    List<TSectorEconomico> findAll();

    List<TSectorEconomico> findRange(int[] range);

    int count();
    
}
