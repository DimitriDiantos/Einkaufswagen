package com.dimitringatcha.shoppingcart.dao;

import java.util.List;

import com.dimitringatcha.shoppingcart.model.CartInfo;
import com.dimitringatcha.shoppingcart.model.OrderDetailInfo;
import com.dimitringatcha.shoppingcart.model.OrderInfo;
import com.dimitringatcha.shoppingcart.model.PaginationResult;

public interface OrderDAO 
{ 
    public void saveOrder(CartInfo cartInfo);
 
    public PaginationResult<OrderInfo> listOrderInfo(int page, int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
 
}
