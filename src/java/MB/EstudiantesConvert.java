/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entityes.TEstudiantes;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Javier_Toto
 */

@Named(value = "newJSFManagedBean")
public class EstudiantesConvert implements Converter {

    @Inject
    private TEstudiantes userDAO;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        return userDAO.getIdentificacion(Long.valueOf(value));
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return ((TEstudiantes) value).getIdentificacion().toString();
    }
}
