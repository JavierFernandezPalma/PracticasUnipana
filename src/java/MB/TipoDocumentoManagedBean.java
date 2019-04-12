/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB;

import javax.inject.Named;
import javax.faces.view.ViewScoped;
import Entityes.TTipDocumento;
import Session.TTipDocumentoFacadeLocal;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author Javier_Toto
 */
@Named(value = "tipoDocumentoManagedBean")
@ViewScoped
public class TipoDocumentoManagedBean implements Serializable  {

    
    private DataSource ds;
    
    private List<TTipDocumento> listaTipoDocumento = null;
    
    private TTipDocumento tipoDocumento = null;
    
    
    
    public List<TTipDocumento> getListaTipoDocumento() {
        return listaTipoDocumento;
    }

    public void setListaTipoDocumento(List<TTipDocumento> listaTipoDocumento) {
        this.listaTipoDocumento = listaTipoDocumento;
    }
    
        public TTipDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TTipDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
   
    
    public TipoDocumentoManagedBean() throws SQLException {
        
       ListaTipoDocumento();
    }
    

    private List<TTipDocumento> ListaTipoDocumento() throws SQLException {
        
        try {
            Context ctx = new InitialContext();
            ds = (DataSource) ctx.lookup("jdbc/practicasPool");

        } catch (NamingException e) {
        }

        String sql = "SELECT * FROM practicas.t_tip_documento ORDER BY Desc_TipDocumento ASC";
        String sql2 = "ORDER BY Desc_especialidad ASC";

        Connection con = ds.getConnection();
        ResultSet r = con.prepareStatement(sql).executeQuery();
        ArrayList lista = new ArrayList();
        while (r.next()) {
            int Id_TipDocuemnto = r.getInt("Id_TipDocuemnto");
            String Desc_TipDocumento = r.getNString("Desc_TipDocumento");

             tipoDocumento = new TTipDocumento(Id_TipDocuemnto, Desc_TipDocumento);
            lista.add(tipoDocumento);

        }
        con.close();
        listaTipoDocumento = lista;

        return listaTipoDocumento;

    }
    
}
