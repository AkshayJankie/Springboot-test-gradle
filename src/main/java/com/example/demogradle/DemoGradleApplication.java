package com.example.demogradle;

import io.github.akshayjankie.PointUtil;
import io.github.akshayjankie.Util;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoGradleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoGradleApplication.class, args);
        int div = PointUtil.divide(2, 2);
        int utilDiv = Util.add(2, 3);
        System.out.println("Util add: " + utilDiv);
        System.out.println("PointUtil divide: " + div);
    }

}
