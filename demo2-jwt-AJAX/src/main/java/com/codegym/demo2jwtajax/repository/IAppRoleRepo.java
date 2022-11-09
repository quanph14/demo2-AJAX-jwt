package com.codegym.demo2jwtajax.repository;


import com.codegym.demo2jwtajax.model.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppRoleRepo extends JpaRepository<AppRole, Long> {
    AppRole findByName(String name);
}