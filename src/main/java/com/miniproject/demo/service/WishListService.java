package com.miniproject.demo.service;


import org.springframework.stereotype.Service;


import com.miniproject.demo.model.WishList;
import com.miniproject.demo.repository.WishListRepository;


import java.util.List;

import javax.transaction.Transactional;

@Service
@Transactional
public class WishListService {

    private final WishListRepository wishListRepository;

    public WishListService(WishListRepository wishListRepository) {
        this.wishListRepository = wishListRepository;
    }

    public void createWishlist(WishList wishList) {
        wishListRepository.save(wishList);
    }

    public List<WishList> readWishList(Integer userId) {
        return wishListRepository.findAllByUserIdOrderByCreatedDateDesc(userId);
    }
}
