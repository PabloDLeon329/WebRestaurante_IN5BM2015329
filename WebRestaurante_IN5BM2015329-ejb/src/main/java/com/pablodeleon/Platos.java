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
@Table(name = "platos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Platos.findAll", query = "SELECT p FROM Platos p")
    , @NamedQuery(name = "Platos.findByIdplato", query = "SELECT p FROM Platos p WHERE p.idplato = :idplato")
    , @NamedQuery(name = "Platos.findByDescripcion", query = "SELECT p FROM Platos p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Platos.findByCosto", query = "SELECT p FROM Platos p WHERE p.costo = :costo")})
public class Platos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idplato")
    private Integer idplato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "costo")
    private double costo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "platos")
    private List<Detallefactura> detallefacturaList;

    public Platos() {
    }

    public Platos(Integer idplato) {
        this.idplato = idplato;
    }

    public Platos(Integer idplato, String descripcion, double costo) {
        this.idplato = idplato;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public Integer getIdplato() {
        return idplato;
    }

    public void setIdplato(Integer idplato) {
        this.idplato = idplato;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
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
        hash += (idplato != null ? idplato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Platos)) {
            return false;
        }
        Platos other = (Platos) object;
        if ((this.idplato == null && other.idplato != null) || (this.idplato != null && !this.idplato.equals(other.idplato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pablodeleon.Platos[ idplato=" + idplato + " ]";
    }
    
}
