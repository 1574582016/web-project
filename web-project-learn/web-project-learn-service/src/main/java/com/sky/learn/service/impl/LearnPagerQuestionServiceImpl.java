package com.sky.learn.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.sky.learn.mapper.LearnPagerQuestionMapper;
import com.sky.learn.model.LearnPagerQuestion;
import com.sky.learn.service.LearnPagerQuestionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ThinkPad on 2018/10/18.
 */
@Service
@Transactional
public class LearnPagerQuestionServiceImpl extends ServiceImpl<LearnPagerQuestionMapper ,LearnPagerQuestion> implements LearnPagerQuestionService {
}
