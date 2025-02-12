package com.tns.shoppingmallmanagementsystem.controller;

import com.tns.shoppingmallmanagementsystem.entity.ShopOwner;
import com.tns.shoppingmallmanagementsystem.service.ShopOwnerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shopowners")
public class ShopOwnerController {

    private final ShopOwnerService service;

    public ShopOwnerController(ShopOwnerService service) {
        this.service = service;
    }

    @GetMapping
    public List<ShopOwner> getAllShopOwners() {
        return service.getAllShopOwners();
    }

    @GetMapping("/{id}")
    public ShopOwner getShopOwnerById(@PathVariable Long id) {
        return service.getShopOwnerById(id);
    }

    @PostMapping
    public ShopOwner addShopOwner(@RequestBody ShopOwner shopOwner) {
        return service.addShopOwner(shopOwner);
    }

    @PutMapping("/{id}")
    public ShopOwner updateShopOwner(@PathVariable Long id, @RequestBody ShopOwner shopOwner) {
        return service.updateShopOwner(id, shopOwner);
    }

    @DeleteMapping("/{id}")
    public void deleteShopOwner(@PathVariable Long id) {
        service.deleteShopOwner(id);
    }
}
