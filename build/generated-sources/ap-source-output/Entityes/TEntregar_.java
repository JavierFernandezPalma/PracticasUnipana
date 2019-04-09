package Entityes;

import Entityes.TEntregarPK;
import Entityes.TEntregas;
import Entityes.TGrupo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-07T14:34:48")
@StaticMetamodel(TEntregar.class)
public class TEntregar_ { 

    public static volatile SingularAttribute<TEntregar, Date> fentregar;
    public static volatile SingularAttribute<TEntregar, String> observacionentregar;
    public static volatile SingularAttribute<TEntregar, TGrupo> tGrupo;
    public static volatile SingularAttribute<TEntregar, TEntregas> tEntregas;
    public static volatile SingularAttribute<TEntregar, String> archivoentregar;
    public static volatile SingularAttribute<TEntregar, TEntregarPK> tEntregarPK;

}