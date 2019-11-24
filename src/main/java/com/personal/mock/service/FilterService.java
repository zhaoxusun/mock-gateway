package com.personal.mock.service;

import com.personal.mock.po.MockApp;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * author: zhaoxu
 * date: 2019/4/26 下午6:15
 */
public interface FilterService {

    Map<MockApp, Integer> getFilterInfo(HttpServletRequest httpServletRequest);
}
