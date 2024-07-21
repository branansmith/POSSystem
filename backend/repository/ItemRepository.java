package com.pos.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pos.backend.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
