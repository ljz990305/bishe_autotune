package com.xidian.edu.service.impl;

import com.xidian.edu.dao.FeatureDao;
import com.xidian.edu.entity.DynFeatureEntity;
import com.xidian.edu.entity.StaticFeatureEntity;
import com.xidian.edu.service.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ljz990305
 * @create 2023-07-24 20:39
 */
@Service
public class FeatureServiceImpl implements FeatureService {

    @Autowired
    private FeatureDao featureDao;
    @Override
    public DynFeatureEntity get() {
        return featureDao.test();
    }

    @Override
    public StaticFeatureEntity getStaticFeature() {
        return featureDao.test2();
    }
}
