package com.personal.mock.service;

import com.alibaba.fastjson.JSONObject;

/**
 * author: zhaoxu
 * date: 2019/4/13 下午10:19
 */
public interface RequestService {
    JSONObject getRequestBody();
    JSONObject getRequestHeader();
    String getRequestURI();
    String getQueryString();
    String getMethod();
}
