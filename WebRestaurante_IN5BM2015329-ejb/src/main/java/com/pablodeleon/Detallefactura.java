/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablodeleon;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "detallefactura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallefactura.findAll", query = "SELECT d FROM Detallefactura d")
    , @NamedQuery(name = "Detallefactura.findByIdplato", query = "SELECT d FROM Detallefactura d WHERE d.detallefacturaPK.idplato = :idplato")
    , @NamedQuery(name = "Detallefactura.findByIdfactura", query = "SELECT d FROM Detallefactura d WHERE d.detallefacturaPK.idfactura = :idfactura")
    , @NamedQuery(name = "Detallefactura.findByCantidad", query = "SELECT d FROM Detallefactura d WHERE d.cantidad = :cantidad")
    , @NamedQuery(name = "Detallefactura.findByPrecioventa", query = "SELECT d FROM Detallefactura d WHERE d.precioventa = :precioventa")
    , @NamedQuery(name = "Detallefactura.findByCostoTotal", query = "SELECT d FROM Detallefactura d WHERE d.costoTotal = :costoTotal")})
public class Detallefactura implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallefacturaPK detallefacturaPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precioventa")
    private double precioventa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "costoTotal")
    private Double costoTotal;
    @JoinColumn(name = "idplato", referencedColumnName = "idplato", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Platos platos;
    @JoinColumn(name = "idfactura", referencedColumnName = "idfactura", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Facturas facturas;
    @JoinColumn(name = "idcocinero", referencedColumnName = "idcocinero")
    @ManyToOne(optional = false)
    private Cocineros idcocinero;

    public Detallefactura() {
    }

    public Detallefactura(DetallefacturaPK detallefacturaPK) {
        this.detallefacturaPK = detallefacturaPK;
    }

    public Detallefactura(DetallefacturaPK detallefacturaPK, int cantidad, double precioventa) {
        this.detallefacturaPK = detallefacturaPK;
        this.cantidad = cantidad;
        this.precioventa = precioventa;
    }

    public Detallefactura(int idplato, int idfactura) {
        this.detallefacturaPK = new DetallefacturaPK(idplato, idfactura);
    }

    public DetallefacturaPK getDetallefacturaPK() {
        return detallefacturaPK;
    }

    public void setDetallefacturaPK(DetallefacturaPK detallefacturaPK) {
        this.detallefacturaPK = detallefacturaPK;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Platos getPlatos() {
        return platos;
    }

    public void setPlatos(Platos platos) {
        this.platos = platos;
    }

    public Facturas getFacturas() {
        return facturas;
    }

    public void setFacturas(Facturas facturas) {
        this.facturas = facturas;
    }

    public Cocineros getIdcocinero() {
        return idcocinero;
    }

    public void setIdcocinero(Cocineros idcocinero) {
        this.idcocinero = idcocinero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallefacturaPK != null ? detallefacturaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallefactura)) {
            return false;
        }
        Detallefactura other = (Detallefactura) object;
        if ((this.detallefacturaPK == null && other.detallefacturaPK != null) || (this.detallefacturaPK != null && !this.detallefacturaPK.equals(other.detallefacturaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pablodeleon.Detallefactura[ detallefacturaPK=" + detallefacturaPK + " ]";
    }
    
}
