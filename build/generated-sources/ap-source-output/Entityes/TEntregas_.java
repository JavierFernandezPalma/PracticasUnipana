package Entityes;

import Entityes.TEntregar;
import Entityes.TUsuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-14T20:04:53")
@StaticMetamodel(TEntregas.class)
public class TEntregas_ { 

    public static volatile ListAttribute<TEntregas, TEntregar> tEntregarList;
    public static volatile SingularAttribute<TEntregas, String> archivoentregas;
    public static volatile SingularAttribute<TEntregas, TUsuarios> identificacion;
    public static volatile SingularAttribute<TEntregas, String> descentregas;
    public static volatile SingularAttribute<TEntregas, Integer> codigoentregas;
    public static volatile SingularAttribute<TEntregas, Integer> corteentregas;

}