package com.gabor.dao;

import com.gabor.domain.Shop;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

/**
 * Created by Gabor on 2017/6/19.
 */
public interface ShopMapper {
    @Select("select * from Shop where id = #{id}")
    @Results({
            @Result(id=true,column="id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "uid",property = "userName",one=@One(
                    select = "com.gabor.dao.UserMapper.selectUserById",
                    fetchType = FetchType.LAZY))
    })
    Shop selectShopById(Integer id);
}
