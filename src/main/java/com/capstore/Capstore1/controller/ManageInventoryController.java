package com.capstore.Capstore1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstore.Capstore1.model.Inventory;
import com.capstore.Capstore1.service.IInventoryMerchantService;

@RestController
public class ManageInventoryController {
	@Autowired
	IInventoryMerchantService inventoryMerchantService;
	@PutMapping(value="/updateInventories")
    public Inventory updateInventory(@RequestBody Inventory inventory){
	     return inventoryMerchantService.upDateInventory(inventory);
}
	@GetMapping(value="/display")
	public List<Inventory> displayInventory(){
	      return  inventoryMerchantService.getAllInventories();
}
	//To create an inventory for a particular merchant
	@PostMapping("/addInventories")
	public Inventory addNewInventory(@RequestBody Inventory inventory){
		System.out.println(inventory);
		return inventoryMerchantService.addNewInventory(inventory);
	}
	//To delete a particular inventory of a particular merchant
	@DeleteMapping(value="/inventories/{inventoryId}")
    public void deleteInventory(@PathVariable("inventoryId")int inventoryId){
	   inventoryMerchantService.deleteInventory(inventoryId);
	}
}
