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
@Table(name = "admin_image")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdminImage.findAll", query = "SELECT a FROM AdminImage a"),
    @NamedQuery(name = "AdminImage.findById", query = "SELECT a FROM AdminImage a WHERE a.id = :id"),
    @NamedQuery(name = "AdminImage.findByClassName", query = "SELECT a FROM AdminImage a WHERE a.className = :className"),
    @NamedQuery(name = "AdminImage.findByName", query = "SELECT a FROM AdminImage a WHERE a.name = :name"),
    @NamedQuery(name = "AdminImage.findByUrl", query = "SELECT a FROM AdminImage a WHERE a.url = :url"),
    @NamedQuery(name = "AdminImage.findByDescription", query = "SELECT a FROM AdminImage a WHERE a.description = :description")})
public class AdminImage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Size(max = 100)
    @Column(name = "class_name")
    private String className;
    @Size(max = 100)
    @Column(name = "name")
    private String name;
    @Size(max = 100)
    @Column(name = "url")
    private String url;
    @Lob
    @Column(name = "image")
    private byte[] image;
    @Size(max = 2147483647)
    @Column(name = "description")
    private String description;

    public AdminImage() {
    }

    public AdminImage(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
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
        if (!(object instanceof AdminImage)) {
            return false;
        }
        AdminImage other = (AdminImage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.zople.domain.AdminImage[ id=" + id + " ]";
    }
    
}
