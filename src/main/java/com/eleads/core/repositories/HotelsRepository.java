package com.eleads.core.repositories;

import java.util.List;

import com.eleads.core.models.Hotel;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "hotels", collectionResourceRel = "hotels")
public interface HotelsRepository extends PagingAndSortingRepository<Hotel, Integer>{

    List<Hotel> findByPrice(double price);

    List<Hotel> findByRoomtype(String roomType);
    
}