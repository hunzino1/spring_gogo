package com.shj.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

@Service
public class MainBean {
    private RequireBean requireBean;
    @Autowired
    private AutowiredBean autowiredBean;

    @Autowired
    public MainBean(final AutowiredBean autowiredBean) {
        this.autowiredBean = autowiredBean;
    }

    @Autowired(required = false)
    public void setAutowiredBean(final AutowiredBean autowiredBean) {
        this.autowiredBean = autowiredBean;
    }

    @Required
    public void setRequireBean(RequireBean requireBean) {
        this.requireBean = requireBean;
    }
}
