package com.gabor.dao;

import com.gabor.domain.Product;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * Created by Gabor on 2017/6/19.
 */
public interface ProductMapper {
    @Select("select * from product")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "price",property = "price"),
            @Result(column = "stock",property = "stock"),
            @Result(column = "sid",property = "shop",one = @One(
                    select = "com.gabor.dao.ShopMapper.selectShopById",
                    fetchType = FetchType.LAZY)),
            @Result(column = "cid",property = "category",one = @One(
                    select = "com.gabor.dao.CategoryMapper.selectCategoryById"))
    })
    List<Product> getAllProducts();
}
