package com.dimitringatcha.shoppingcart.dao;

import com.dimitringatcha.shoppingcart.entity.Product;
import com.dimitringatcha.shoppingcart.model.PaginationResult;
import com.dimitringatcha.shoppingcart.model.ProductInfo;

public interface ProductDAO 
{    
    public Product findProduct(String code);
    
    public ProductInfo findProductInfo(String code) ;
    
    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult, int maxNavigationPage );
    
    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,int maxNavigationPage, String likeName);
 
    public void save(ProductInfo productInfo); 
}
