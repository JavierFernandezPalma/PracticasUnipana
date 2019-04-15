package Entityes;

import Entityes.TEmpresas;
import Entityes.TPracticas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-14T20:04:53")
@StaticMetamodel(TCiudad.class)
public class TCiudad_ { 

    public static volatile ListAttribute<TCiudad, TEmpresas> tEmpresasList;
    public static volatile ListAttribute<TCiudad, TPracticas> tPracticasList;
    public static volatile SingularAttribute<TCiudad, String> descciudad;
    public static volatile SingularAttribute<TCiudad, Integer> idciudad;
    public static volatile SingularAttribute<TCiudad, Integer> iddepartamento;

}