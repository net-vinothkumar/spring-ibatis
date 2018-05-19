package com.learnandshare.springboot.rest.example.springbootmybatis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringBootMyBatisApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    MobileMyBatisRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMyBatisApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        logger.info("Mobile id 10001 -> {}", repository.findById(10001));

        logger.info("Inserting -> {}", repository.insert(new Mobile(10010, "Apple iPhone", "X7", 100000)));

        logger.info("Update 10003 -> {}", repository.update(new Mobile(10001, "Apple iPhone X", "X8", 120000)));

        repository.deleteById(10002);

        List<Mobile> mobiles = repository.findAll();
        logger.info("All mobiles -> {}", mobiles);
    }
}
