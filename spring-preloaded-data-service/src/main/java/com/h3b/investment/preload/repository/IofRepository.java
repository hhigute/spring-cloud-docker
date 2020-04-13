package com.h3b.investment.preload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.h3b.investment.preload.model.Iof;

@Repository
public interface IofRepository extends JpaRepository<Iof,Integer>{

}
