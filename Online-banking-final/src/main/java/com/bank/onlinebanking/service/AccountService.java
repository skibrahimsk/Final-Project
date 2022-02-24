package com.bank.onlinebanking.service;

import java.security.Principal;

import com.bank.onlinebanking.entity.PrimaryAccount;
import com.bank.onlinebanking.entity.SavingsAccount;

/**
 * Created by IntelliJ IDEA.
 * Project : online-banking
 
 

 * Date: 09/08/18
 * Time: 04.32
 * To change this template use File | Settings | File Templates.
 */
public interface AccountService {

    PrimaryAccount createPrimaryAccount();

    SavingsAccount createSavingsAccount();

    void deposit(String accountType, double amount, Principal principal);

    void withdraw(String accountType, double amount, Principal principal);

}