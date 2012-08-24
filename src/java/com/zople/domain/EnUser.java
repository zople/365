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
@Table(name = "en_user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EnUser.findAll", query = "SELECT e FROM EnUser e"),
    @NamedQuery(name = "EnUser.findById", query = "SELECT e FROM EnUser e WHERE e.id = :id"),
    @NamedQuery(name = "EnUser.findByName", query = "SELECT e FROM EnUser e WHERE e.name = :name"),
    @NamedQuery(name = "EnUser.findByPwd", query = "SELECT e FROM EnUser e WHERE e.pwd = :pwd"),
    @NamedQuery(name = "EnUser.findByEmail", query = "SELECT e FROM EnUser e WHERE e.email = :email"),
    @NamedQuery(name = "EnUser.findByIntegral", query = "SELECT e FROM EnUser e WHERE e.integral = :integral"),
    @NamedQuery(name = "EnUser.findByDescription", query = "SELECT e FROM EnUser e WHERE e.description = :description")})
public class EnUser implements Serializable {
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
    @Column(name = "pwd")
    private String pwd;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "email")
    private String email;
    @Size(max = 100)
    @Column(name = "integral")
    private String integral;
    @Size(max = 2147483647)
    @Column(name = "description")
    private String description;

    public EnUser() {
    }

    public EnUser(Long id) {
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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral;
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
        if (!(object instanceof EnUser)) {
            return false;
        }
        EnUser other = (EnUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.zople.domain.EnUser[ id=" + id + " ]";
    }
    
}
