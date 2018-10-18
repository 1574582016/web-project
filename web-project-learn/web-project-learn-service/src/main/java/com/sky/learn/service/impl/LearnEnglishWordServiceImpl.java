package com.sky.learn.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.sky.learn.mapper.LearnEnglishWordMapper;
import com.sky.learn.model.LearnEnglishWord;
import com.sky.learn.service.LearnEnglishWordService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ThinkPad on 2018/10/11.
 */
@Service
@Transactional
public class LearnEnglishWordServiceImpl extends ServiceImpl<LearnEnglishWordMapper,LearnEnglishWord> implements LearnEnglishWordService {
}
