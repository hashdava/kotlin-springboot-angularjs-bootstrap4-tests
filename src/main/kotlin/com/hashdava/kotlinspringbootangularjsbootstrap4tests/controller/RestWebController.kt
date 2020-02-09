package com.hashdava.kotlinspringbootangularjsbootstrap4tests.controller

import com.hashdava.kotlinspringbootangularjsbootstrap4tests.model.Customer
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class RestWebController {

    val customers = mutableListOf<Customer>()

    @GetMapping(value = ["/get-all-customers"])
    fun getAllCustomers() : List<Customer> {
        return customers;
    }

    @PostMapping(value= ["/create-customer"])
    fun createCustomer(@RequestBody customer: Customer) : String {
        customers.add(customer);
        return "Customer created successfully!" + " - " + customer.firstName + " " + customer.lastName;
    }

}