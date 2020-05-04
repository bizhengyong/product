package com.imooc.product.exception;

import com.imooc.product.enums.ResultEnum;

/**
 * @author bizy
 * @date 2020/5/4 14:52
 */
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code,String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
