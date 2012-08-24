/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zople.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
 * @author Administrator
 */
@Entity
@Table(name = "admin_register")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdminRegister.findAll", query = "SELECT a FROM AdminRegister a"),
    @NamedQuery(name = "AdminRegister.findById", query = "SELECT a FROM AdminRegister a WHERE a.id = :id"),
    @NamedQuery(name = "AdminRegister.findByName", query = "SELECT a FROM AdminRegister a WHERE a.name = :name"),
    @NamedQuery(name = "AdminRegister.findByEmail", query = "SELECT a FROM AdminRegister a WHERE a.email = :email"),
    @NamedQuery(name = "AdminRegister.findByArea", query = "SELECT a FROM AdminRegister a WHERE a.area = :area"),
    @NamedQuery(name = "AdminRegister.findByIp", query = "SELECT a FROM AdminRegister a WHERE a.ip = :ip"),
    @NamedQuery(name = "AdminRegister.findByPhone", query = "SELECT a FROM AdminRegister a WHERE a.phone = :phone"),
    @NamedQuery(name = "AdminRegister.findByOnlineTime", query = "SELECT a FROM AdminRegister a WHERE a.onlineTime = :onlineTime"),
    @NamedQuery(name = "AdminRegister.findByCreateTime", query = "SELECT a FROM AdminRegister a WHERE a.createTime = :createTime"),
    @NamedQuery(name = "AdminRegister.findByDescription", query = "SELECT a FROM AdminRegister a WHERE a.description = :description")})
public class AdminRegister implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Size(max = 100)
    @Column(name = "name")
    private String name;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "email")
    private String email;
    @Size(max = 100)
    @Column(name = "area")
    private String area;
    @Size(max = 100)
    @Column(name = "ip")
    private String ip;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "phone")
    private String phone;
    @Column(name = "online_time")
    @Temporal(TemporalType.DATE)
    private Date onlineTime;
    @Column(name = "create_time")
    @Temporal(TemporalType.DATE)
    private Date createTime;
    @Size(max = 2147483647)
    @Column(name = "description")
    private String description;

    public AdminRegister() {
    }

    public AdminRegister(Long id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Date onlineTime) {
        this.onlineTime = onlineTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        if (!(object instanceof AdminRegister)) {
            return false;
        }
        AdminRegister other = (AdminRegister) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.zople.domain.AdminRegister[ id=" + id + " ]";
    }
    
}
