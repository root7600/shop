package com.yan.shop;

import com.yan.shop.dao.AppraisalItem;
import com.yan.shop.dao.AppraisalItemMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ShopApplicationTests {

    @Resource
    private AppraisalItemMapper appraisalItemMapper;

    @Test
    void contextLoads() {
        AppraisalItem appraisalItem = appraisalItemMapper.selectByPrimaryKey(1L);
        System.out.println(appraisalItem.getCategoryId());
    }

}
