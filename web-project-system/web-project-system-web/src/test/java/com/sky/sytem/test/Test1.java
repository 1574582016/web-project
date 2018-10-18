package com.sky.sytem.test;

import com.baomidou.mybatisplus.toolkit.IdWorker;
import org.junit.Test;

/**
 * Created by ThinkPad on 2018/10/6.
 */
public class Test1 {

    @Test
    public void test01(){
        for(int i=0;i<4;i++){
            System.out.println(IdWorker.getId());
        }

    }
}
