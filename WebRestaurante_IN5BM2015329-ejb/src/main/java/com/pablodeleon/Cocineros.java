/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablodeleon;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "cocineros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cocineros.findAll", query = "SELECT c FROM Cocineros c")
    , @NamedQuery(name = "Cocineros.findByIdcocinero", query = "SELECT c FROM Cocineros c WHERE c.idcocinero = :idcocinero")
    , @NamedQuery(name = "Cocineros.findByNombreCocinero", query = "SELECT c FROM Cocineros c WHERE c.nombreCocinero = :nombreCocinero")})
public class Cocineros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcocinero")
    private Integer idcocinero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "nombreCocinero")
    private String nombreCocinero;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcocinero")
    private List<Detallefactura> detallefacturaList;

    public Cocineros() {
    }

    public Cocineros(Integer idcocinero) {
        this.idcocinero = idcocinero;
    }

    public Cocineros(Integer idcocinero, String nombreCocinero) {
        this.idcocinero = idcocinero;
        this.nombreCocinero = nombreCocinero;
    }

    public Integer getIdcocinero() {
        return idcocinero;
    }

    public void setIdcocinero(Integer idcocinero) {
        this.idcocinero = idcocinero;
    }

    public String getNombreCocinero() {
        return nombreCocinero;
    }

    public void setNombreCocinero(String nombreCocinero) {
        this.nombreCocinero = nombreCocinero;
    }

    @XmlTransient
    public List<Detallefactura> getDetallefacturaList() {
        return detallefacturaList;
    }

    public void setDetallefacturaList(List<Detallefactura> detallefacturaList) {
        this.detallefacturaList = detallefacturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcocinero != null ? idcocinero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cocineros)) {
            return false;
        }
        Cocineros other = (Cocineros) object;
        if ((this.idcocinero == null && other.idcocinero != null) || (this.idcocinero != null && !this.idcocinero.equals(other.idcocinero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pablodeleon.Cocineros[ idcocinero=" + idcocinero + " ]";
    }
    
}
