/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zople.dao;

import com.zople.domain.AdminOrderItem;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Administrator
 */
@Stateless
public class AdminOrderItemFacade extends AbstractFacade<AdminOrderItem> {
    @PersistenceContext(unitName = "365PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AdminOrderItemFacade() {
        super(AdminOrderItem.class);
    }
    
}
