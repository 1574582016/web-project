package com.sky.learn.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.sky.learn.mapper.LearnPaperMapper;
import com.sky.learn.model.LearnPaper;
import com.sky.learn.service.LearnPaperService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ThinkPad on 2018/10/18.
 */
@Service
@Transactional
public class LearnPaperServiceImpl extends ServiceImpl<LearnPaperMapper, LearnPaper> implements LearnPaperService {
}
