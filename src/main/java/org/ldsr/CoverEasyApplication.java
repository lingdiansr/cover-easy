package org.ldsr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 20773
 */
@SpringBootApplication()
@MapperScan("org.ldsr.mapper")
public class CoverEasyApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoverEasyApplication.class, args);
    }

}
