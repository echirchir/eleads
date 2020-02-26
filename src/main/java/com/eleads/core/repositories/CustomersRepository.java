package com.eleads.core.repositories;

import com.eleads.core.models.Customer;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "customers", collectionResourceRel = "customers")
public interface CustomersRepository extends PagingAndSortingRepository<Customer, Integer>{
    
}