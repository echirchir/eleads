package com.eleads.core.repositories;

import com.eleads.core.models.Hotel;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "hotels", collectionResourceRel = "hotels")
public interface HotelsRepository extends PagingAndSortingRepository<Hotel, Integer>{
    
}