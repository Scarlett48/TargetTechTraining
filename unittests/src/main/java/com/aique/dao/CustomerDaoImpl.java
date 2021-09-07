package com.aique.dao;

import com.aique.entity.Customer;

import java.util.Arrays;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao{

    private static List<Customer> DATA = Arrays.asList(
            new Customer(1L, "Alex", 30),
            new Customer(2L, "Maria", 28)
    );

    @Override
    public List<Customer> findAll() {
        return DATA;
    }

    @Override
    public Customer findOne(Long id) {
        return DATA.stream().filter(x -> x.getId() == id).findFirst().orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public boolean isDataFromMemory() {
        return true;
    }
}
