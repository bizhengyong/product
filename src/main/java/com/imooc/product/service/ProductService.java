package com.imooc.product.service;

import com.imooc.product.dto.CartDTO;
import com.imooc.product.dataobject.ProductInfo;

import java.util.List;

/**
 * @author bizy
 * @date 2020/5/2 19:11
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfo> findList(List<String> productIdList);

    /*
     * @description:扣库存
     * @param:
     * @author: bizy
     * @date: 2020/5/4 14:41
     */
    void decreaseStock(List<CartDTO> cartDTOList);
}
