package com.capstore.Capstore1.service;

import java.util.List;
import com.capstore.Capstore1.model.Inventory;
//Interface Name: IInventoryMerchantService
//Interface Function: to perform CRUD operations in the inventory
public interface IInventoryMerchantService {
	
	public List<Inventory> getAllInventories();
        public Inventory addNewInventory(Inventory inventory);
        public void deleteInventory(int inventoryId);
        public Inventory upDateInventory(Inventory inventory);
	    public List<Inventory> getInventoriesList();
}
