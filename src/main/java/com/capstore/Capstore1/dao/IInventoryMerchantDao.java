package com.capstore.Capstore1.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.capstore.Capstore1.model.Inventory;
@Repository("inventoryMerchantDao")
@Transactional
public interface IInventoryMerchantDao extends JpaRepository<Inventory,Integer> {
	
}
