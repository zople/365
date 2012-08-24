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
@Table(name = "en_enterprise")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EnEnterprise.findAll", query = "SELECT e FROM EnEnterprise e"),
    @NamedQuery(name = "EnEnterprise.findById", query = "SELECT e FROM EnEnterprise e WHERE e.id = :id"),
    @NamedQuery(name = "EnEnterprise.findByName", query = "SELECT e FROM EnEnterprise e WHERE e.name = :name"),
    @NamedQuery(name = "EnEnterprise.findByMainSort", query = "SELECT e FROM EnEnterprise e WHERE e.mainSort = :mainSort"),
    @NamedQuery(name = "EnEnterprise.findByMainProduct", query = "SELECT e FROM EnEnterprise e WHERE e.mainProduct = :mainProduct"),
    @NamedQuery(name = "EnEnterprise.findByBusinessPattern", query = "SELECT e FROM EnEnterprise e WHERE e.businessPattern = :businessPattern")})
public class EnEnterprise implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Size(max = 100)
    @Column(name = "name")
    private String name;
    @Size(max = 100)
    @Column(name = "main_sort")
    private String mainSort;
    @Size(max = 100)
    @Column(name = "main_product")
    private String mainProduct;
    @Size(max = 100)
    @Column(name = "business_pattern")
    private String businessPattern;
    @Lob
    @Column(name = "logo")
    private byte[] logo;

    public EnEnterprise() {
    }

    public EnEnterprise(Long id) {
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

    public String getMainSort() {
        return mainSort;
    }

    public void setMainSort(String mainSort) {
        this.mainSort = mainSort;
    }

    public String getMainProduct() {
        return mainProduct;
    }

    public void setMainProduct(String mainProduct) {
        this.mainProduct = mainProduct;
    }

    public String getBusinessPattern() {
        return businessPattern;
    }

    public void setBusinessPattern(String businessPattern) {
        this.businessPattern = businessPattern;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
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
        if (!(object instanceof EnEnterprise)) {
            return false;
        }
        EnEnterprise other = (EnEnterprise) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.zople.domain.EnEnterprise[ id=" + id + " ]";
    }
    
}
