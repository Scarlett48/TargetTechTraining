package com.aique.dao;

import com.aique.entity.Customer;

import java.util.List;

public interface CustomerDao {

    List<Customer> findAll();

    Customer findOne(Long id);

    boolean isDataFromMemory();
}
