package com.xidian.edu.service;

import com.xidian.edu.entity.DynFeatureEntity;
import com.xidian.edu.entity.StaticFeatureEntity;

/**
 * @author ljz990305
 * @create 2023-07-24 20:39
 */
public interface FeatureService {

    DynFeatureEntity get();
    StaticFeatureEntity getStaticFeature();

}
