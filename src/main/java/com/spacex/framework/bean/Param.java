package com.spacex.framework.bean;


import com.spacex.framework.util.CastUtil;

import java.util.Map;

public class Param {

    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    public long getLong(String name) {
        return CastUtil.getLong(paramMap.get(name));
    }
}
