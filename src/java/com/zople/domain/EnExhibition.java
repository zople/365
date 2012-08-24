/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zople.domain;

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
 * @author Administrator
 */
@Entity
@Table(name = "en_exhibition")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EnExhibition.findAll", query = "SELECT e FROM EnExhibition e"),
    @NamedQuery(name = "EnExhibition.findById", query = "SELECT e FROM EnExhibition e WHERE e.id = :id"),
    @NamedQuery(name = "EnExhibition.findByName", query = "SELECT e FROM EnExhibition e WHERE e.name = :name"),
    @NamedQuery(name = "EnExhibition.findByDescription", query = "SELECT e FROM EnExhibition e WHERE e.description = :description")})
public class EnExhibition implements Serializable {
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

    public EnExhibition() {
    }

    public EnExhibition(Long id) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EnExhibition)) {
            return false;
        }
        EnExhibition other = (EnExhibition) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.zople.domain.EnExhibition[ id=" + id + " ]";
    }
    
}
