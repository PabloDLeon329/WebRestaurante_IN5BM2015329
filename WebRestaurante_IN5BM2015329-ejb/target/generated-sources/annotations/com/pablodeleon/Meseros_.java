package com.pablodeleon;

import com.pablodeleon.Facturas;
import com.pablodeleon.Mesas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-18T10:30:16")
@StaticMetamodel(Meseros.class)
public class Meseros_ { 

    public static volatile SingularAttribute<Meseros, String> nombreMesero;
    public static volatile SingularAttribute<Meseros, Integer> idmesero;
    public static volatile ListAttribute<Meseros, Mesas> mesasList;
    public static volatile ListAttribute<Meseros, Facturas> facturasList;

}