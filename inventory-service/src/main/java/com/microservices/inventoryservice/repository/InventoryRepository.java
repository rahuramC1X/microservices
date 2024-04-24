package com.microservices.inventoryservice.repository;

import com.microservices.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long>{

    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}