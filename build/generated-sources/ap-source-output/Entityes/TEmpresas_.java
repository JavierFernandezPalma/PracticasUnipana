package Entityes;

import Entityes.TActividadEconomica;
import Entityes.TCiudad;
import Entityes.TDepartamento;
import Entityes.TPracticas;
import Entityes.TSectorEconomico;
import Entityes.TTamanoEmpresa;
import Entityes.TUsuarios;
import Entityes.TVacante;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-07T14:34:48")
@StaticMetamodel(TEmpresas.class)
public class TEmpresas_ { 

    public static volatile SingularAttribute<TEmpresas, Integer> numempleados;
    public static volatile SingularAttribute<TEmpresas, String> cajacompensacion;
    public static volatile SingularAttribute<TEmpresas, String> barrio;
    public static volatile ListAttribute<TEmpresas, TVacante> tVacanteList;
    public static volatile ListAttribute<TEmpresas, TPracticas> tPracticasList;
    public static volatile SingularAttribute<TEmpresas, TUsuarios> identificacion;
    public static volatile SingularAttribute<TEmpresas, TCiudad> idciudad;
    public static volatile SingularAttribute<TEmpresas, String> direccionempresa;
    public static volatile SingularAttribute<TEmpresas, Integer> idempresa;
    public static volatile SingularAttribute<TEmpresas, TSectorEconomico> idsectoreconomico;
    public static volatile SingularAttribute<TEmpresas, TActividadEconomica> idactividadeconomica;
    public static volatile SingularAttribute<TEmpresas, String> nombreempresa;
    public static volatile SingularAttribute<TEmpresas, String> nit;
    public static volatile SingularAttribute<TEmpresas, String> nomdireccion;
    public static volatile SingularAttribute<TEmpresas, TTamanoEmpresa> idtamano;
    public static volatile SingularAttribute<TEmpresas, TDepartamento> iddepartamento;

}