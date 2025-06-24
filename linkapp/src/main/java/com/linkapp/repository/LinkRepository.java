package com.linkapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.linkapp.entity.Link;

@Repository
public interface LinkRepository extends JpaRepository<Link, Long> {

}
