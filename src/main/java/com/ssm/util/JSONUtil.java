package com.ssm.util;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.JoinPoint;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JSON工具类
 */
public class JSONUtil {
    /**
     * json转String
     * @param json
     * @return
     */
    public static String toJsonString(Object json){
        return json.toString();
    }
    /**
     *  json转map
     * @param json
     * @return
     * @throws Exception
     */
    public static Map<String,Object> jsonToMap(String json) throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String,Object> map;
        try {
            map = (Map<String,Object>)objectMapper.readValue(json, Map.class);
        } catch (JsonParseException e) {
            e.printStackTrace();
            throw e;
        } catch (JsonMappingException e) {
            e.printStackTrace();
            throw e;
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
        return map;
    }

    /**
     * json转List<Map<String,?>>
     * @param json
     * @return
     * @throws Exception
     */
    public static List<Map<String,?>> jsonToMapList(String json) throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, Map.class);
        List<Map<String, ?>> mapList;
        try {
            mapList = (List<Map<String,?>>)objectMapper.readValue(json, javaType);
        } catch (JsonParseException e) {
            e.printStackTrace();
            throw e;
        } catch (JsonMappingException e) {
            e.printStackTrace();
            throw e;
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
        return mapList;
    }

    /**
     * map转json
     * @param map
     * @return
     * @throws Exception
     */
    public static String mapToJson(Map<String,Object> map) throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(map);
        return jsonString;
    }

    /**
     * 对象转json
     * @param object
     * @return
     * @throws Exception
     */
    public static String objectToJson(Object object) throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonList;
        try {
            jsonList = objectMapper.writeValueAsString(object);
        } catch (JsonParseException e) {
            e.printStackTrace();
            throw e;
        } catch (JsonMappingException e) {
            e.printStackTrace();
            throw e;
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
        return jsonList;
    }

    /**
     * List<Map<String,?>>转json
     * @param cardInfoList
     * @return
     * @throws Exception
     */
    public static String mapListToJson(List<Map<String, Object>> cardInfoList) throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonList;
        try {
            jsonList = objectMapper.writeValueAsString(cardInfoList);
        } catch (JsonParseException e) {
            e.printStackTrace();
            throw e;
        } catch (JsonMappingException e) {
            e.printStackTrace();
            throw e;
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
        return jsonList;
    }

    /**
     * 数组转json
     * @param args
     * @return
     * @throws Exception
     */
    public static String arrayToJson(String[] args) throws Exception{
        // 先讲数组转化为map，然后map转json
        Map<String,String> map = new HashMap<String,String>();
        for(int i=0; i<args.length; i++){
            map.put(i+"", args[i]);
        }
        String json = JSONUtil.objectToJson(map);
        return json;
    }
}
