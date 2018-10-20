package com.sky.economy.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.sky.economy.mapper.FinanceMarketMapper;
import com.sky.economy.model.FinanceMarket;
import com.sky.economy.service.FinanceMarketService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ThinkPad on 2018/10/16.
 */
@Service
@Transactional
public class FinanceMarketServiceImpl extends ServiceImpl<FinanceMarketMapper,FinanceMarket> implements FinanceMarketService {
}
