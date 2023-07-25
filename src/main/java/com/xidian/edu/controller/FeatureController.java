package com.xidian.edu.controller;

import com.xidian.edu.entity.DynFeatureEntity;
import com.xidian.edu.entity.StaticFeatureEntity;
import com.xidian.edu.service.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ljz990305
 * @create 2023-07-24 20:30
 */
@RestController
public class FeatureController {
    @Autowired
    private FeatureService featureService;

    @GetMapping("hello")
    public DynFeatureEntity helloTest(){
        return featureService.get();
    }

    @GetMapping("hello2")
    public StaticFeatureEntity helloTest2(){
        return featureService.getStaticFeature();
    }


}
