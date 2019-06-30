package com.shj.pojo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;

/**
 * 因为所有ApplicationContext都实现了ResourceLoader接口
 * 所以可以使用ApplicationContextAware获取当前context容器
 * 进而获取Resource文件信息类实例
 * @create 2019/6/30
 */
public class ResourceBean implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void getResource(String path) throws IOException {
        Resource resource = this.applicationContext.getResource(path);
        System.out.println(resource.getFilename() + "++++++++++" + resource.contentLength());
    }
}
