package com.bank.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;

import com.bank.onlinebanking.entity.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : online-banking
 
 

 * Date: 08/08/18
 * Time: 06.08
 * To change this template use File | Settings | File Templates.
 */
public interface UserDao extends CrudRepository<User, Long> {

    User findByUsername(String username);

    User findByEmail(String email);

    List<User> findAll();
}