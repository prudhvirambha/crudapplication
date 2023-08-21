package com.crudapplication.springbootcrudapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crudapplication.springbootcrudapp.model.Games;

@Repository
public interface GamesRepository extends CrudRepository<Games,Integer>{

}
