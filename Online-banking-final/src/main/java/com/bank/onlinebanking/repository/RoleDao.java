package com.bank.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;

import com.bank.onlinebanking.security.Role;

/**
 * Created by IntelliJ IDEA.
 * Project : online-banking
 
 

 * Date: 08/08/18
 * Time: 06.06
 * To change this template use File | Settings | File Templates.
 */
public interface RoleDao extends CrudRepository<Role, Integer> {

    Role findByName(String name);
}