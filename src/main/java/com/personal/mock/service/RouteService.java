package com.personal.mock.service;

import com.personal.mock.po.MockApp;

import java.util.Map;

/**
 * author: zhaoxu
 * date: 2019/5/8 下午3:00
 */
public interface RouteService {
    Map<MockApp,Integer> getAllRoutesInfoByDB();
}
