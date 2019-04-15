package Entityes;

import Entityes.TUsuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-14T20:04:53")
@StaticMetamodel(TClaves.class)
public class TClaves_ { 

    public static volatile SingularAttribute<TClaves, String> password;
    public static volatile SingularAttribute<TClaves, Integer> idclave;
    public static volatile SingularAttribute<TClaves, Date> hora;
    public static volatile SingularAttribute<TClaves, TUsuarios> identificacion;
    public static volatile SingularAttribute<TClaves, Date> finicio;

}