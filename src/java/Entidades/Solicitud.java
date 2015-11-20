/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author M4rloN
 */
@Entity
@Table(name = "SOLICITUD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Solicitud.findAll", query = "SELECT s FROM Solicitud s"),
    @NamedQuery(name = "Solicitud.findByIds", query = "SELECT s FROM Solicitud s WHERE s.ids = :ids"),
    @NamedQuery(name = "Solicitud.findByFechas", query = "SELECT s FROM Solicitud s WHERE s.fechas = :fechas"),
    @NamedQuery(name = "Solicitud.findByPrecio", query = "SELECT s FROM Solicitud s WHERE s.precio = :precio")})
public class Solicitud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "IDS")
    private String ids;
    @Column(name = "FECHAS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechas;
    @Column(name = "PRECIO")
    private BigInteger precio;
    @JoinColumn(name = "VENDEDOR", referencedColumnName = "CODIGO")
    @ManyToOne
    private Empleado vendedor;
    @JoinColumn(name = "PAQUETE", referencedColumnName = "IDP")
    @ManyToOne
    private Paquete paquete;

    public Solicitud() {
    }

    public Solicitud(String ids) {
        this.ids = ids;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public Date getFechas() {
        return fechas;
    }

    public void setFechas(Date fechas) {
        this.fechas = fechas;
    }

    public BigInteger getPrecio() {
        return precio;
    }

    public void setPrecio(BigInteger precio) {
        this.precio = precio;
    }

    public Empleado getVendedor() {
        return vendedor;
    }

    public void setVendedor(Empleado vendedor) {
        this.vendedor = vendedor;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ids != null ? ids.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Solicitud)) {
            return false;
        }
        Solicitud other = (Solicitud) object;
        if ((this.ids == null && other.ids != null) || (this.ids != null && !this.ids.equals(other.ids))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Solicitud[ ids=" + ids + " ]";
    }
    
}
