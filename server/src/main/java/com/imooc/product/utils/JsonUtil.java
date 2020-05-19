package com.imooc.product.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @author: bizy
 * @date: 2020/05/14 22:47
 */
public class JsonUtil {

    private static ObjectMapper objectMapper = new ObjectMapper();

    /**
    *@description: 转换为json字符串
    *@param: object
    *@return: 
    *@author: bizy
    *@date: 2020/5/14 22:49
    */
    public static String toJson(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
    *@description: js转对象
    *@param: 
    *@return: 
    *@author: bizy
    *@date: 2020/5/19 19:09
    */
    public static Object fromJson(String string,Class classType) {
        try {
            return objectMapper.readValue(string,classType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
