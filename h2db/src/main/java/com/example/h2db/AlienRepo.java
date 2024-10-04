package com.example.h2db;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends CrudRepository<Alien,Integer>{
    List<Alien> findByTech(String tech);
    List<Alien> findByAidGreaterThan(int aid);

    @Query("from Alien where tech=?1 order by name")
    List<Alien>findByTechSorted(String tech);

}
