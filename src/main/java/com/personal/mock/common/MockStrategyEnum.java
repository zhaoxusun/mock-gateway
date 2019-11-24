package com.personal.mock.common;

/**
 * author: zhaoxu
 * date: 2019/4/18 下午3:44
 */
public enum MockStrategyEnum {
    /**
     * 直接将mock的返回值返回
     */
    MOCK_RESPONSE_DIRECT(1),
    /**
     * 直接将请求的返回
     */
    MOCK_REQUEST_RETURN(2),
    /**
     * 将请求转发到某个地址，返回结果
     */
    REQUEST_REDIRECT(3),
    /**
     * 走代理，但是不mock数据，返回真实结果
     */
    PROXY(4);
    //支持扩展更多策略

    private Integer type;

    MockStrategyEnum(Integer type){
        this.type = type;
    }

    public static MockStrategyEnum getMockStrategyByStrategyId(Integer type) {
        for (MockStrategyEnum mockStrategyEnum: MockStrategyEnum.values()){
            if (mockStrategyEnum.type.equals(type)){
                return mockStrategyEnum;
            }
        }
        return null;
    }


}
