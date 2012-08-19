/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zople.controller.service;

import com.zople.controller.service.exception.ExistingEntityException;
import com.zople.dao.PersonFacade;
import com.zople.domain.Person;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author wangwy
 */
@Stateless
public class PersonService {
    
    @EJB
    PersonFacade facade;
    
    public void create(Person person) throws ExistingEntityException{
        Person _person=facade.find(person.getId());
        if(_person!=null){
            throw new ExistingEntityException("实体已经存在");
        }
       
    }
}
