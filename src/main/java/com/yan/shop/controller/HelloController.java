package com.yan.shop.controller;

import com.yan.shop.dao.AppraisalItem;
import com.yan.shop.dao.AppraisalItemMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author hairui
 * @date 2021/11/15
 * @des
 */
@Controller
public class HelloController {

    @Resource
    private AppraisalItemMapper appraisalItemMapper;

    @RequestMapping("/hello")
    public void sayHello(){
        AppraisalItem appraisalItem = appraisalItemMapper.selectByPrimaryKey(1L);
        System.out.println(appraisalItem);
    }
}
