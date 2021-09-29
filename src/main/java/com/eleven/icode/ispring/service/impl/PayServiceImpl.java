package com.eleven.icode.ispring.service.impl;

import com.eleven.icode.ispring.dao.AccountInfoDao;
import com.eleven.icode.ispring.dao.ProductInfoDao;
import com.eleven.icode.ispring.service.PayService;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @author by YingLong on 2021/9/29
 */
@Service
public class PayServiceImpl implements PayService {

    @Autowired
    private AccountInfoDao accountInfoDao;

    @Autowired
    private ProductInfoDao productInfoDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void pay(String accountId, double money) {
        //查询余额
        double blance = accountInfoDao.qryBlanceByUserId(accountId);
        //余额不足正常逻辑
        if (new BigDecimal(blance).compareTo(new BigDecimal(money)) < 0) {
            throw new RuntimeException("余额不足");
        }
        //更新余额
        int retVal = accountInfoDao.updateAccountBlance(accountId, money);
        //库存-1
        //updateProductStore(1);
        ((PayService) AopContext.currentProxy()).updateProductStore(1);
        System.out.println(1 / 0);
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public void updateProductStore(Integer productId) {
        try {
            productInfoDao.updateProductInfo(productId);
        } catch (Exception e) {
            throw new RuntimeException("内部异常");
        }
    }
}
