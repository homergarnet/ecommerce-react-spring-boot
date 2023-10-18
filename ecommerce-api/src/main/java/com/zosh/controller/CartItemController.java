package com.zosh.controller;

import com.zosh.exception.CartItemException;
import com.zosh.exception.UserException;
import com.zosh.model.CartItem;
import com.zosh.model.User;
import com.zosh.response.ApiResponse;
import com.zosh.service.CartItemService;
import com.zosh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart_items")
public class CartItemController {

    @Autowired
    private CartItemService cartItemService;
    @Autowired
    private UserService userService;

    @DeleteMapping("/{cartItemId}")
//    @Operation(description = "Remove Cart Item From Cart")
//    @io.swagger.v3.oas.annotations.responses.ApiResponse(description = "Delete Item")
    public ResponseEntity<ApiResponse> deleteCartItem(@PathVariable Long cartItemId, @RequestHeader("Authorization") String jwt) throws UserException, CartItemException {
        User user = userService.findUserProfileByJwt(jwt);
        cartItemService.removeCartItem(user.getId(), cartItemId);
        ApiResponse res = new ApiResponse();
        res.setMessage("delete item from cart");
        res.setStatus(true);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @PutMapping("/{cartItemId}")
//    @Operation(description = "Update Item To Cart")
    public ResponseEntity<CartItem> updateCartItem(@RequestBody CartItem cartItem, @PathVariable Long cartItemId, @RequestHeader("Authorization") String jwt) throws UserException, CartItemException {

        User user = userService.findUserProfileByJwt(jwt);
        CartItem updatedCartItem = cartItemService.updateCartItem(user.getId(), cartItemId, cartItem);

        return new ResponseEntity<>(updatedCartItem, HttpStatus.OK);
    }
}
