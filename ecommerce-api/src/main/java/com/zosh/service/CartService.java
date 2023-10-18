package com.zosh.service;

import com.zosh.exception.CartItemException;
import com.zosh.exception.ProductException;
import com.zosh.exception.UserException;
import com.zosh.model.Cart;
import com.zosh.model.CartItem;
import com.zosh.model.Product;
import com.zosh.model.User;
import com.zosh.request.AddItemRequest;

public interface CartService {

    public Cart createCart(User user);

    public String addCartItem(Long userId, AddItemRequest req) throws ProductException;

    public Cart findUserCart(Long userId);

}
