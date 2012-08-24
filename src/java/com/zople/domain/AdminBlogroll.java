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
@Table(name = "admin_blogroll")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdminBlogroll.findAll", query = "SELECT a FROM AdminBlogroll a"),
    @NamedQuery(name = "AdminBlogroll.findById", query = "SELECT a FROM AdminBlogroll a WHERE a.id = :id"),
    @NamedQuery(name = "AdminBlogroll.findByName", query = "SELECT a FROM AdminBlogroll a WHERE a.name = :name"),
    @NamedQuery(name = "AdminBlogroll.findByContent", query = "SELECT a FROM AdminBlogroll a WHERE a.content = :content"),
    @NamedQuery(name = "AdminBlogroll.findByDescription", query = "SELECT a FROM AdminBlogroll a WHERE a.description = :description"),
    @NamedQuery(name = "AdminBlogroll.findByCreateTime", query = "SELECT a FROM AdminBlogroll a WHERE a.createTime = :createTime")})
public class AdminBlogroll implements Serializable {
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
    @Column(name = "content")
    private String content;
    @Size(max = 2147483647)
    @Column(name = "description")
    private String description;
    @Column(name = "create_time")
    @Temporal(TemporalType.DATE)
    private Date createTime;

    public AdminBlogroll() {
    }

    public AdminBlogroll(Long id) {
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        if (!(object instanceof AdminBlogroll)) {
            return false;
        }
        AdminBlogroll other = (AdminBlogroll) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.zople.domain.AdminBlogroll[ id=" + id + " ]";
    }
    
}
