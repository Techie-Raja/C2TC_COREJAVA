package com.tns.shoppingmallmanagementsystem.repository;

import com.tns.shoppingmallmanagementsystem.entity.ShopOwner;
import com.tns.shoppingmallmanagementsystem.repository.ShopOwnerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopOwnerServiceImpl implements ShopOwnerService {

    private final ShopOwnerRepository repository;

    public ShopOwnerServiceImpl(ShopOwnerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ShopOwner> getAllShopOwners() {
        return repository.findAll();
    }

    @Override
    public ShopOwner getShopOwnerById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public ShopOwner addShopOwner(ShopOwner shopOwner) {
        return repository.save(shopOwner);
    }

    @Override
    public ShopOwner updateShopOwner(Long id, ShopOwner shopOwner) {
        Optional<ShopOwner> existingShopOwner = repository.findById(id);
        if (existingShopOwner.isPresent()) {
            ShopOwner updatedShopOwner = existingShopOwner.get();
            updatedShopOwner.setName(shopOwner.getName());
            updatedShopOwner.setEmail(shopOwner.getEmail());
            updatedShopOwner.setShopName(shopOwner.getShopName());
            return repository.save(updatedShopOwner);
        }
        return null;
    }

    @Override
    public void deleteShopOwner(Long id) {
        repository.deleteById(id);
    }
}
