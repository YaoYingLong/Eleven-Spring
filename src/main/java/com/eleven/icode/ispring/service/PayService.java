package com.eleven.icode.ispring.service;

/**
 * @author by YingLong on 2021/9/29
 */
public interface PayService {
    void pay(String accountId, double money);

    void updateProductStore(Integer productId);
}
