/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zople.domain;

import java.io.Serializable;
import java.math.BigInteger;
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
 * @author Administrator
 */
@Entity
@Table(name = "en_businessmen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EnBusinessmen.findAll", query = "SELECT e FROM EnBusinessmen e"),
    @NamedQuery(name = "EnBusinessmen.findById", query = "SELECT e FROM EnBusinessmen e WHERE e.id = :id"),
    @NamedQuery(name = "EnBusinessmen.findByName", query = "SELECT e FROM EnBusinessmen e WHERE e.name = :name"),
    @NamedQuery(name = "EnBusinessmen.findByDescription", query = "SELECT e FROM EnBusinessmen e WHERE e.description = :description"),
    @NamedQuery(name = "EnBusinessmen.findByFlg", query = "SELECT e FROM EnBusinessmen e WHERE e.flg = :flg")})
public class EnBusinessmen implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Size(max = 100)
    @Column(name = "name")
    private String name;
    @Size(max = 2147483647)
    @Column(name = "description")
    private String description;
    @Column(name = "flg")
    private BigInteger flg;

    public EnBusinessmen() {
    }

    public EnBusinessmen(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigInteger getFlg() {
        return flg;
    }

    public void setFlg(BigInteger flg) {
        this.flg = flg;
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
        if (!(object instanceof EnBusinessmen)) {
            return false;
        }
        EnBusinessmen other = (EnBusinessmen) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.zople.domain.EnBusinessmen[ id=" + id + " ]";
    }
    
}
