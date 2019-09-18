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
@Table(name = "areas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Areas.findAll", query = "SELECT a FROM Areas a")
    , @NamedQuery(name = "Areas.findByIdarea", query = "SELECT a FROM Areas a WHERE a.idarea = :idarea")
    , @NamedQuery(name = "Areas.findByNombreArea", query = "SELECT a FROM Areas a WHERE a.nombreArea = :nombreArea")
    , @NamedQuery(name = "Areas.findByNumEmpleados", query = "SELECT a FROM Areas a WHERE a.numEmpleados = :numEmpleados")})
public class Areas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idarea")
    private Integer idarea;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombreArea")
    private String nombreArea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numEmpleados")
    private int numEmpleados;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idarea")
    private List<Mesas> mesasList;

    public Areas() {
    }

    public Areas(Integer idarea) {
        this.idarea = idarea;
    }

    public Areas(Integer idarea, String nombreArea, int numEmpleados) {
        this.idarea = idarea;
        this.nombreArea = nombreArea;
        this.numEmpleados = numEmpleados;
    }

    public Integer getIdarea() {
        return idarea;
    }

    public void setIdarea(Integer idarea) {
        this.idarea = idarea;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }

    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

    @XmlTransient
    public List<Mesas> getMesasList() {
        return mesasList;
    }

    public void setMesasList(List<Mesas> mesasList) {
        this.mesasList = mesasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idarea != null ? idarea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Areas)) {
            return false;
        }
        Areas other = (Areas) object;
        if ((this.idarea == null && other.idarea != null) || (this.idarea != null && !this.idarea.equals(other.idarea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pablodeleon.Areas[ idarea=" + idarea + " ]";
    }
    
}
