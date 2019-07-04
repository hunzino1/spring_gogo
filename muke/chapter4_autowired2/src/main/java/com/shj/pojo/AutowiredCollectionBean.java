package com.shj.pojo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class AutowiredCollectionBean {
    private List<CollectionBean> collectionBeanList;
    private Map<String, CollectionBean> collectionBeanMap;

    @Autowired
    public void setCollectionBeanMap(final Map<String, CollectionBean> collectionBeanMap) {
        this.collectionBeanMap = collectionBeanMap;
    }

    @Autowired
    public void setCollectionBeanList(final List<CollectionBean> collectionBeanList) {
        this.collectionBeanList = collectionBeanList;
    }

    public AutowiredCollectionBean() {
    }

    public Map<String, CollectionBean> getCollectionBeanMap() {
        return this.collectionBeanMap;
    }

    public List<CollectionBean> getCollectionBeanList() {
        return this.collectionBeanList;
    }

}
