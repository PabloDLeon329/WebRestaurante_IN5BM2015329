package com.pablodeleon;

import com.pablodeleon.Cocineros;
import com.pablodeleon.DetallefacturaPK;
import com.pablodeleon.Facturas;
import com.pablodeleon.Platos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-18T10:30:16")
@StaticMetamodel(Detallefactura.class)
public class Detallefactura_ { 

    public static volatile SingularAttribute<Detallefactura, DetallefacturaPK> detallefacturaPK;
    public static volatile SingularAttribute<Detallefactura, Facturas> facturas;
    public static volatile SingularAttribute<Detallefactura, Double> costoTotal;
    public static volatile SingularAttribute<Detallefactura, Integer> cantidad;
    public static volatile SingularAttribute<Detallefactura, Double> precioventa;
    public static volatile SingularAttribute<Detallefactura, Cocineros> idcocinero;
    public static volatile SingularAttribute<Detallefactura, Platos> platos;

}