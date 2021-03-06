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
@Table(name = "admin_style")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdminStyle.findAll", query = "SELECT a FROM AdminStyle a"),
    @NamedQuery(name = "AdminStyle.findById", query = "SELECT a FROM AdminStyle a WHERE a.id = :id"),
    @NamedQuery(name = "AdminStyle.findByEnterpriseStyle", query = "SELECT a FROM AdminStyle a WHERE a.enterpriseStyle = :enterpriseStyle"),
    @NamedQuery(name = "AdminStyle.findByMallStyle", query = "SELECT a FROM AdminStyle a WHERE a.mallStyle = :mallStyle"),
    @NamedQuery(name = "AdminStyle.findByDescription", query = "SELECT a FROM AdminStyle a WHERE a.description = :description")})
public class AdminStyle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Size(max = 100)
    @Column(name = "enterprise_style")
    private String enterpriseStyle;
    @Size(max = 100)
    @Column(name = "mall_style")
    private String mallStyle;
    @Size(max = 2147483647)
    @Column(name = "description")
    private String description;

    public AdminStyle() {
    }

    public AdminStyle(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnterpriseStyle() {
        return enterpriseStyle;
    }

    public void setEnterpriseStyle(String enterpriseStyle) {
        this.enterpriseStyle = enterpriseStyle;
    }

    public String getMallStyle() {
        return mallStyle;
    }

    public void setMallStyle(String mallStyle) {
        this.mallStyle = mallStyle;
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
        if (!(object instanceof AdminStyle)) {
            return false;
        }
        AdminStyle other = (AdminStyle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.zople.domain.AdminStyle[ id=" + id + " ]";
    }
    
}
