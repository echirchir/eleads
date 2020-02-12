package com.eleads.core.repositories;

import com.eleads.core.models.Room;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/api/v1/rooms/{hotel_id}", collectionResourceRel = "rooms")
public interface RoomsRepository extends PagingAndSortingRepository<Room, Integer>{
    
}