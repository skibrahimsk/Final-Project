package com.bank.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;

import com.bank.onlinebanking.entity.Recipient;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : online-banking
 
 

 * Date: 08/08/18
 * Time: 06.06
 * To change this template use File | Settings | File Templates.
 */
public interface RecipientDao extends CrudRepository<Recipient, Long> {

    List<Recipient> findAll();

    Recipient findByName(String recipientName);

    void deleteByName(String recipientName);
}