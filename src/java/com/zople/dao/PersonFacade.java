/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zople.dao;

import com.zople.domain.Person;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author wangwy
 */
@Stateless
public class PersonFacade extends AbstractFacade<Person> {
    @PersistenceContext(unitName = "365PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonFacade() {
        super(Person.class);
    }
}
