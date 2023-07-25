package com.xidian.edu.dao;

import com.xidian.edu.entity.DynFeatureEntity;
import com.xidian.edu.entity.StaticFeatureEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author ljz990305
 * @create 2023-07-24 20:40
 */
@Mapper
public interface FeatureDao {
    @Select("select * from dyn_feature limit 1")
    public DynFeatureEntity test();
    @Select("select * from static_feature limit 1")
    public StaticFeatureEntity test2();
}
