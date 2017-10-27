package com.mysqlcon.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    private Customer customer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    private List<Customer> list() {
        return customerRepository.findAll();
    }
}
