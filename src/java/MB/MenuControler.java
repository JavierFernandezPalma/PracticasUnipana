/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB;

import Entityes.TUsuarios;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

/**
 *
 * @author javi
 */
@ManagedBean
@SessionScoped
public class MenuControler implements Serializable {

    private MenuModel model;

    @EJB
    //private MenusFacadeLocal EJBMenus;

    @PostConstruct
    public void init() {

        model = new DefaultMenuModel();
        this.establecerPermisos();

    }

    public MenuModel getModel() {
        return model;
    }

    public void setModel(MenuModel model) {
        this.model = model;
    }

    /*
     public void establecerPermisos1() {

     Login us = (Login) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("login");

     /* for (Menus m : listaMenus) {
     if (m.getTipo().equals("Sub") && m.getTipoUsuario().equals(1)) {
     DefaultSubMenu firstSubmenu = new DefaultSubMenu(m.getNombre());
     for (Menus i : listaMenus) {
     Menus subMenu = i.getSubmenu();
     if (subMenu != null) {
     if (subMenu.getId() == m.getId()) {
     DefaultMenuItem item = new DefaultMenuItem(i.getNombre());
     item.setUrl("http://www.primefaces.org");
     item.setIcon("ui-icon-home");
     firstSubmenu.addElement(item);
     }
     }
     }
     model.addElement(firstSubmenu);
     } else {
     if (m.getSubmenu() == null && m.getTipoUsuario().equals(1)) {
     DefaultMenuItem item = new DefaultMenuItem(m.getNombre());
     item.setUrl("http://www.primefaces.org");
     item.setIcon("ui-icon-home");
     model.addElement(item);
     }
     }
     }
     }*/
    public void establecerPermisos() {

        TUsuarios lg = (TUsuarios) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("login");

        if (lg.getTPerfilUsuarios().getIdperfil() == 1 || lg.getTPerfilUsuarios().getIdperfil() == 3) {

            DefaultSubMenu firstSubmenu = new DefaultSubMenu("Canalizaciones");

            DefaultMenuItem item = new DefaultMenuItem("Registrar");
            item.setUrl("canalizaciones.xhtml");
            item.setIcon("ui-icon-home");

            DefaultMenuItem item2 = new DefaultMenuItem("Buscar por fecha");
            item2.setUrl("canaBuscarFecha.xhtml");
            item2.setIcon("ui-icon-home");

            firstSubmenu.addElement(item);
            firstSubmenu.addElement(item2);

            model.addElement(firstSubmenu);

            DefaultMenuItem item3 = new DefaultMenuItem("Ciclo vital");
            item3.setUrl("cicloVital.xhtml");
            item3.setIcon("ui-icon-home");
            model.addElement(item3);

            if (lg.getTPerfilUsuarios().getIdperfil() == 1) {

                DefaultSubMenu firstSubmenu2 = new DefaultSubMenu("Actualizar");

                DefaultMenuItem item5 = new DefaultMenuItem("Ignorar Doc repetidos");
                item5.setIcon("ui-icon-home");
                item5.setCommand("#{discapacidadMB.cargarDatosBD(1)}");

                DefaultMenuItem item6 = new DefaultMenuItem("Reemplazar Doc repetidos");
                item6.setIcon("ui-icon-home");
                item6.setCommand("#{discapacidadMB.cargarDatosBD(0)}");

                firstSubmenu2.addElement(item5);
                firstSubmenu2.addElement(item6);

                model.addElement(firstSubmenu2);

            }

        }

        if (lg.getTPerfilUsuarios().getIdperfil() == 1 || lg.getTPerfilUsuarios().getIdperfil() == 2 || lg.getTPerfilUsuarios().getIdperfil() == 3) {

            DefaultSubMenu firstSubmenu2 = new DefaultSubMenu("Busqueda");

            DefaultMenuItem item5 = new DefaultMenuItem("Documento");
            item5.setUrl("busquedaDocumento.xhtml");
            item5.setIcon("ui-icon-info");

            DefaultMenuItem item6 = new DefaultMenuItem("Consolidado");
            item6.setUrl("consolidado.xhtml");
            item6.setIcon("ui-icon-home");

            if (lg.getTPerfilUsuarios().getIdperfil() != 2) {

                DefaultMenuItem item7 = new DefaultMenuItem("Nombre o Fecha");
                item7.setUrl("busqueda.xhtml");
                item7.setIcon("ui-icon-home");
                firstSubmenu2.addElement(item7);

            }

            firstSubmenu2.addElement(item5);
            firstSubmenu2.addElement(item6);

            model.addElement(firstSubmenu2);

        }

        DefaultMenuItem item4 = new DefaultMenuItem("Cerrar Sesión");
        item4.setIcon("ui-icon-home");
        item4.setCommand("#{plantillaController.cerrarSession()}");

        model.addElement(item4);
    }

}
