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
import javax.persistence.Lob;
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
@Table(name = "en_storefront")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EnStorefront.findAll", query = "SELECT e FROM EnStorefront e"),
    @NamedQuery(name = "EnStorefront.findById", query = "SELECT e FROM EnStorefront e WHERE e.id = :id"),
    @NamedQuery(name = "EnStorefront.findByName", query = "SELECT e FROM EnStorefront e WHERE e.name = :name"),
    @NamedQuery(name = "EnStorefront.findByDescription", query = "SELECT e FROM EnStorefront e WHERE e.description = :description"),
    @NamedQuery(name = "EnStorefront.findByAd", query = "SELECT e FROM EnStorefront e WHERE e.ad = :ad"),
    @NamedQuery(name = "EnStorefront.findByStyle", query = "SELECT e FROM EnStorefront e WHERE e.style = :style")})
public class EnStorefront implements Serializable {
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
    @Lob
    @Column(name = "phone")
    private byte[] phone;
    @Size(max = 2147483647)
    @Column(name = "ad")
    private String ad;
    @Lob
    @Column(name = "logo")
    private byte[] logo;
    @Size(max = 2147483647)
    @Column(name = "style")
    private String style;

    public EnStorefront() {
    }

    public EnStorefront(Long id) {
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

    public byte[] getPhone() {
        return phone;
    }

    public void setPhone(byte[] phone) {
        this.phone = phone;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
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
        if (!(object instanceof EnStorefront)) {
            return false;
        }
        EnStorefront other = (EnStorefront) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.zople.domain.EnStorefront[ id=" + id + " ]";
    }
    
}
