package com.shj.generic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;

//@Configuration
@Service
public class StoreConfig {
    @Autowired
    private Store<Integer> integerStore;
    @Autowired
    private Store<String> stringStore;

//    @Bean
//    public Store integerStore() {
//        return new IntegerStore();
//    }

    /**
     * 注释之后
     * string也默认走了Integer，名称找不到估计按类型匹配了
     */
//    @Bean
//    public Store stringStore() {
//        return new StringStore();
//    }

    public void testGeneric() {
        System.out.println("integerStore: " + integerStore.getClass().getName());
        System.out.println("stringStore: " + stringStore.getClass().getName());
    }
}
