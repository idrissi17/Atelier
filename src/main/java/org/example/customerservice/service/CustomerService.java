package org.example.customerservice.service;

import org.example.customerservice.dao.entity.Customer;

import java.util.List;

public interface CustomerService {

    public Customer addCustomer(Customer customer);
    public List<Customer>getAllCustomers();
    public Customer getCustomerById(int customerId);
    public Boolean deleteCustomerById(int customerId);

}
