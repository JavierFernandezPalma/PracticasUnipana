package Entityes;

import Entityes.TEntregar;
import Entityes.TUsuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-07T14:34:48")
@StaticMetamodel(TGrupo.class)
public class TGrupo_ { 

    public static volatile SingularAttribute<TGrupo, Date> fcierregrupo;
    public static volatile SingularAttribute<TGrupo, Date> fcreaciongrupo;
    public static volatile ListAttribute<TGrupo, TEntregar> tEntregarList;
    public static volatile SingularAttribute<TGrupo, TUsuarios> identificacion;
    public static volatile SingularAttribute<TGrupo, Integer> codigogrupo;

}