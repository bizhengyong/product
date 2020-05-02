package com.imooc.product.utils;

import com.imooc.product.vo.ResultVO;

/**
 * @author bizy
 * @date 2020/5/2 20:41
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
