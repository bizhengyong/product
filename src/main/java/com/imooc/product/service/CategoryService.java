package com.imooc.product.service;

import com.imooc.product.dataobject.ProductCategory;

import java.util.List;

/**
 * @author bizy
 * @date 2020/5/2 19:21
 */
public interface CategoryService {

    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryList);
}
