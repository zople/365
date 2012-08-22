/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zople.dao;

import com.zople.domain.Company;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author wangwy
 */
@Stateless
public class CompanyFacade extends AbstractFacade<Company> {
    @PersistenceContext(unitName = "365PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CompanyFacade() {
        super(Company.class);
    }
    
    public byte[] findImg(Long id){
        Blob blob=em.find(Company.class, id).getImage();
        try {
            return blob.getBytes(1l, Integer.valueOf(blob.length()+""));
        } catch (SQLException ex) {
            Logger.getLogger(CompanyFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
