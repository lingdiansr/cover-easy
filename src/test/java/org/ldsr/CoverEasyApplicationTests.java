package org.ldsr;

import org.junit.jupiter.api.Test;
import org.ldsr.bean.Cover;
import org.ldsr.mapper.CoverMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CoverEasyApplicationTests {

    @Autowired
    private CoverMapper coverMapper;

    @Test
    void contextLoads() {
        List<Cover> covers = coverMapper.selectList(null);
        System.out.println("covers = " + covers);
    }
}


