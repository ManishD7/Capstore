package com.capstore.Capstore1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstore.Capstore1.dao.IInventoryMerchantDao;
import com.capstore.Capstore1.model.Inventory;
@Service("inventoryMerchantService")
public class InventoryMerchantService implements IInventoryMerchantService{
	@Autowired
	private IInventoryMerchantDao inventoryMerchantDao;
	@Override
	public List<Inventory> getAllInventories() {
		return inventoryMerchantDao.findAll();
	}
        //New Inventory is added to the list
	@Override
	public Inventory addNewInventory(Inventory inventory) {
		System.out.println("service"+inventory);
		inventoryMerchantDao.save(inventory);
		System.out.println("service after "+inventory);
		return inventory;
	}
        //Delete a particular inventory from the list
	@Override
	public void deleteInventory(int inventoryId) {
		
		inventoryMerchantDao.deleteById(inventoryId);
	}
	//To get the list with all elements
	@Override

	public  List<Inventory> getInventoriesList() {
		
		return inventoryMerchantDao.findAll();
	}
	@Override
	public Inventory upDateInventory(Inventory inventory) {
		Optional<Inventory> inventory1=inventoryMerchantDao.findById(inventory.getInventoryId());
		if(inventory1!=null) {
			inventoryMerchantDao.deleteById(inventory.getInventoryId());
			inventoryMerchantDao.save(inventory);
		}
		return inventory;
	}
}
