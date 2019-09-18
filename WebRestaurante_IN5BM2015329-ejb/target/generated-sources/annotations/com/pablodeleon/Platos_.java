package com.pablodeleon;

import com.pablodeleon.Detallefactura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-18T10:30:16")
@StaticMetamodel(Platos.class)
public class Platos_ { 

    public static volatile SingularAttribute<Platos, String> descripcion;
    public static volatile SingularAttribute<Platos, Double> costo;
    public static volatile ListAttribute<Platos, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Platos, Integer> idplato;

}