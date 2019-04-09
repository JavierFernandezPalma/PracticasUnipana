package Entityes;

import Entityes.TUsuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-07T14:34:48")
@StaticMetamodel(TAuditoria.class)
public class TAuditoria_ { 

    public static volatile SingularAttribute<TAuditoria, String> accion;
    public static volatile SingularAttribute<TAuditoria, String> cadena;
    public static volatile SingularAttribute<TAuditoria, TUsuarios> identificacion;
    public static volatile SingularAttribute<TAuditoria, Integer> idauditoria;
    public static volatile SingularAttribute<TAuditoria, Date> faccion;

}