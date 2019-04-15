package Entityes;

import Entityes.TEmpresas;
import Entityes.TPracticas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-14T20:04:53")
@StaticMetamodel(TDepartamento.class)
public class TDepartamento_ { 

    public static volatile SingularAttribute<TDepartamento, String> descdepartamento;
    public static volatile ListAttribute<TDepartamento, TEmpresas> tEmpresasList;
    public static volatile ListAttribute<TDepartamento, TPracticas> tPracticasList;
    public static volatile SingularAttribute<TDepartamento, Integer> iddepartamento;

}