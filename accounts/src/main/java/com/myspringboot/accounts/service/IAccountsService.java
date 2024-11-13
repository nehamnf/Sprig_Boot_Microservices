package com.myspringboot.accounts.service;

import com.myspringboot.accounts.dto.CustomerDTO;

public interface IAccountsService {

    void createAccount(CustomerDTO customerDTO);

//    void updateAccount(CustomerDTO customerDTO);
//
//    void deleteAccount(Long accountNumber);
}
