package com.myspringboot.accounts.service.impl;

import com.myspringboot.accounts.dto.CustomerDTO;
import com.myspringboot.accounts.repository.AccountsRepository;
import com.myspringboot.accounts.repository.CustomerRepository;
import com.myspringboot.accounts.service.IAccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Autowired
    public AccountsServiceImpl(AccountsRepository accountsRepository, CustomerRepository customerRepository) {
        this.accountsRepository = accountsRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void createAccount(CustomerDTO customerDTO) {

    }
}
