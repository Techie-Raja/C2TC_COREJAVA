package com.tns.shoppingmallmanagementsystem.service;

import com.tns.shoppingmallmanagementsystem.entity.ShopOwner;
import java.util.List;

public interface ShopOwnerService {
    List<ShopOwner> getAllShopOwners();
    ShopOwner getShopOwnerById(Long id);
    ShopOwner addShopOwner(ShopOwner shopOwner);
    ShopOwner updateShopOwner(Long id, ShopOwner shopOwner);
    void deleteShopOwner(Long id);
}
