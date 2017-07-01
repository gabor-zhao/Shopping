package com.gabor.dao;

import org.apache.ibatis.annotations.Select;

/**
 * Created by Gabor on 2017/6/19.
 */
public interface CategoryMapper {
    @Select("select type from category where id = #{id}")
    String selectCategoryById(Integer id);
}
