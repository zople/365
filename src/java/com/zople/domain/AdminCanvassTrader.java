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
@Table(name = "admin_canvass_trader")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdminCanvassTrader.findAll", query = "SELECT a FROM AdminCanvassTrader a"),
    @NamedQuery(name = "AdminCanvassTrader.findById", query = "SELECT a FROM AdminCanvassTrader a WHERE a.id = :id"),
    @NamedQuery(name = "AdminCanvassTrader.findByTraderName", query = "SELECT a FROM AdminCanvassTrader a WHERE a.traderName = :traderName"),
    @NamedQuery(name = "AdminCanvassTrader.findByFactoryName", query = "SELECT a FROM AdminCanvassTrader a WHERE a.factoryName = :factoryName"),
    @NamedQuery(name = "AdminCanvassTrader.findByDescription", query = "SELECT a FROM AdminCanvassTrader a WHERE a.description = :description")})
public class AdminCanvassTrader implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Size(max = 100)
    @Column(name = "trader_name")
    private String traderName;
    @Size(max = 100)
    @Column(name = "factory_name")
    private String factoryName;
    @Size(max = 2147483647)
    @Column(name = "description")
    private String description;

    public AdminCanvassTrader() {
    }

    public AdminCanvassTrader(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTraderName() {
        return traderName;
    }

    public void setTraderName(String traderName) {
        this.traderName = traderName;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
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
        if (!(object instanceof AdminCanvassTrader)) {
            return false;
        }
        AdminCanvassTrader other = (AdminCanvassTrader) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.zople.domain.AdminCanvassTrader[ id=" + id + " ]";
    }
    
}
