package com.dimitringatcha.shoppingcart.dao;

import com.dimitringatcha.shoppingcart.entity.Account;

public interface AccountDAO 
{    
    public Account findAccount(String userName);
}
