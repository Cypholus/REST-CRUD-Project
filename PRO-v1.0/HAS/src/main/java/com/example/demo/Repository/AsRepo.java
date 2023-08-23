package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.AsMod;

public interface AsRepo extends JpaRepository<AsMod, Integer>{

}