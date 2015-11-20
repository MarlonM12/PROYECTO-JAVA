/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author M4rloN
 */
@Entity
@Table(name = "AGENCIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agencia.findAll", query = "SELECT a FROM Agencia a"),
    @NamedQuery(name = "Agencia.findById", query = "SELECT a FROM Agencia a WHERE a.id = :id"),
    @NamedQuery(name = "Agencia.findByNombrea", query = "SELECT a FROM Agencia a WHERE a.nombrea = :nombrea"),
    @NamedQuery(name = "Agencia.findByDireccion", query = "SELECT a FROM Agencia a WHERE a.direccion = :direccion"),
    @NamedQuery(name = "Agencia.findByDepartamento", query = "SELECT a FROM Agencia a WHERE a.departamento = :departamento"),
    @NamedQuery(name = "Agencia.findByTelefono", query = "SELECT a FROM Agencia a WHERE a.telefono = :telefono")})
public class Agencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBREA")
    private String nombrea;
    @Size(max = 50)
    @Column(name = "DIRECCION")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DEPARTAMENTO")
    private String departamento;
    @Column(name = "TELEFONO")
    private Integer telefono;

    public Agencia() {
    }

    public Agencia(Long id) {
        this.id = id;
    }

    public Agencia(Long id, String nombrea, String departamento) {
        this.id = id;
        this.nombrea = nombrea;
        this.departamento = departamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombrea() {
        return nombrea;
    }

    public void setNombrea(String nombrea) {
        this.nombrea = nombrea;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agencia)) {
            return false;
        }
        Agencia other = (Agencia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Agencia[ id=" + id + " ]";
    }
    
}
