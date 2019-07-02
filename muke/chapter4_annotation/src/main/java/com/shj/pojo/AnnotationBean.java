package com.shj.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("annotationBean")
public class AnnotationBean {
    @Autowired
    private MemberBean memberBean;
}
