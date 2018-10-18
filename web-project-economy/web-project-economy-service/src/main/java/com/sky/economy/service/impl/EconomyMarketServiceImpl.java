package com.sky.economy.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.sky.economy.mapper.EconomyMarketMapper;
import com.sky.economy.model.EconomyMarket;
import com.sky.economy.service.EconomyMarketService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ThinkPad on 2018/10/16.
 */
@Service
@Transactional
public class EconomyMarketServiceImpl extends ServiceImpl<EconomyMarketMapper ,EconomyMarket> implements EconomyMarketService{
}
