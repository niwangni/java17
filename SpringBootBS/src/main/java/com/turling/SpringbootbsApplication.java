package com.turling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 此类用于启动（配置方法尽量不在其类编写 做法：如（另做配置类）：WebConfig类）
 */
@SpringBootApplication
public class SpringbootbsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootbsApplication.class, args);
    }

}
