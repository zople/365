/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zople.domain;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "products")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Products.findAll", query = "SELECT p FROM Products p"),
    @NamedQuery(name = "Products.findByProductNo", query = "SELECT p FROM Products p WHERE p.productNo = :productNo"),
    @NamedQuery(name = "Products.findByName", query = "SELECT p FROM Products p WHERE p.name = :name"),
    @NamedQuery(name = "Products.findByPrice", query = "SELECT p FROM Products p WHERE p.price = :price"),
    @NamedQuery(name = "Products.findByAddress", query = "SELECT p FROM Products p WHERE p.address = :address"),
    @NamedQuery(name = "Products.findByDescribe", query = "SELECT p FROM Products p WHERE p.describe = :describe"),
    @NamedQuery(name = "Products.findByCreateTime", query = "SELECT p FROM Products p WHERE p.createTime = :createTime")})
public class Products implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_no")
    private Integer productNo;
    @Size(max = 2147483647)
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private BigInteger price;
    @Size(max = 2147483647)
    @Column(name = "address")
    private String address;
    @Size(max = 2147483647)
    @Column(name = "describe")
    private String describe;
    @Column(name = "create_time")
    @Temporal(TemporalType.DATE)
    private Date createTime;

    public Products() {
    }

    public Products(Integer productNo) {
        this.productNo = productNo;
    }

    public Integer getProductNo() {
        return productNo;
    }

    public void setProductNo(Integer productNo) {
        this.productNo = productNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
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
        hash += (productNo != null ? productNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Products)) {
            return false;
        }
        Products other = (Products) object;
        if ((this.productNo == null && other.productNo != null) || (this.productNo != null && !this.productNo.equals(other.productNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.zople.domain.Products[ productNo=" + productNo + " ]";
    }
    
}
