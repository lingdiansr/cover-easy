package org.ldsr.controller;

import org.ldsr.bean.Cover;
import org.ldsr.mapper.CoverMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: coverController
 * Package: org.ldsr.covereasy.controller
 * Description:
 *
 * @Author: lingdianshiren
 * @Create: 2024/3/31 - 22:37
 * @Version: v1.0
 */
@RestController
@RequestMapping("/cover")
public class coverController {
    @Autowired
    private CoverMapper coverMapper;

    @GetMapping("show")
    public Cover show(){
        List<Cover> covers = coverMapper.selectList(null);
        return covers.get(0);
    }

}
