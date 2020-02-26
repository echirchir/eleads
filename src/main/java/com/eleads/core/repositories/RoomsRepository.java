package com.eleads.core.repositories;

import com.eleads.core.models.Room;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "rooms", collectionResourceRel = "rooms")
public interface RoomsRepository extends PagingAndSortingRepository<Room, Integer>{
    
}