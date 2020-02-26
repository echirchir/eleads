package com.eleads.core.repositories;

import com.eleads.core.models.RoomType;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "room_types", collectionResourceRel = "room_types")
public interface RoomTypeRepository extends PagingAndSortingRepository<RoomType, Integer>{
    
}