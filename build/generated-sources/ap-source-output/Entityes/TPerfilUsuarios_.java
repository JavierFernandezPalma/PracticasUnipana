package Entityes;

import Entityes.TUsuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-14T20:04:53")
@StaticMetamodel(TPerfilUsuarios.class)
public class TPerfilUsuarios_ { 

    public static volatile SingularAttribute<TPerfilUsuarios, Integer> idperfil;
    public static volatile ListAttribute<TPerfilUsuarios, TUsuarios> tUsuariosList;
    public static volatile SingularAttribute<TPerfilUsuarios, String> permisos;
    public static volatile SingularAttribute<TPerfilUsuarios, String> rol;

}