/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablodeleon;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author programacion
 */
@Embeddable
public class DetallefacturaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idplato")
    private int idplato;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idfactura")
    private int idfactura;

    public DetallefacturaPK() {
    }

    public DetallefacturaPK(int idplato, int idfactura) {
        this.idplato = idplato;
        this.idfactura = idfactura;
    }

    public int getIdplato() {
        return idplato;
    }

    public void setIdplato(int idplato) {
        this.idplato = idplato;
    }

    public int getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idplato;
        hash += (int) idfactura;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallefacturaPK)) {
            return false;
        }
        DetallefacturaPK other = (DetallefacturaPK) object;
        if (this.idplato != other.idplato) {
            return false;
        }
        if (this.idfactura != other.idfactura) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pablodeleon.DetallefacturaPK[ idplato=" + idplato + ", idfactura=" + idfactura + " ]";
    }
    
}
