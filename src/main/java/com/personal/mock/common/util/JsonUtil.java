package com.personal.mock.common.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONCompare;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.skyscreamer.jsonassert.JSONCompareResult;

import java.util.List;

/**
 * author: zhaoxu
 * date: 2019/4/16 上午10:04
 */
public class JsonUtil {

    public static void main(String[] args) {
        JSONObject jsonObject1 = JSON.parseObject("{\"id\":1,\"friends\":[{\"id\":3,\"name\":\"name1\"},{\"name\":\"name2\",\"id\":2}]}");
        JSONObject jsonObject2 = JSON.parseObject("{\"friends\":[{\"id\":3,\"name\":\"name1\"},{\"name\":\"name2\",\"id\":2}],\"id\":1}");
        try {
            System.out.println(assertJsonEquals(jsonObject1,jsonObject2,JSONCompareMode.LENIENT,null));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /**
     * 比较两个json对象是否相等
     *
     * @param actual       请求返回
     * @param expect       期望
     * @param mode         json比较的模式，JSONCompareMode.STRICT:严格模式完全匹配；JSONCompareMode.LENIENT:宽松模式不关心数组的顺序，第二个参数包含第一个参数的所有值
     * @param excludePaths 需要排除不比较的jsonPaths,如果没有排除项传null
     */
    public static boolean assertJsonEquals(JSONObject actual, JSONObject expect, JSONCompareMode mode, List<String> excludePaths) throws JSONException {
        if (actual == null && expect == null){
            return true;
        }
        if (actual != null && expect == null){
            return false;
        }
        if (expect != null && actual == null){
            return false;
        }
        if (excludePaths != null) {
            for (int i = 0; i < excludePaths.size(); ++i) {
                try {
                    boolean a = JSONPath.remove(actual, excludePaths.get(i));
                    boolean b = JSONPath.remove(expect, excludePaths.get(i));
                } catch (Exception e) {
                    System.out.println("remove json path error,json path: {}"+ excludePaths.get(i)+e);
                    return false;
                }

            }
        }
        JSONObject assertMsg = new JSONObject();
        assertMsg.put("actual", actual);
        assertMsg.put("expect", expect);
        JSONCompareResult result = JSONCompare.compareJSON(actual.toJSONString(), expect.toJSONString(), mode);
        if (result.failed()) {
//            System.out.println(("两次请求结果：" + assertMsg));
//            System.out.println("diff结果\n" + result);
            return false;
            //throw new AssertionError(result.toString());
        }
        return true;
    }
}
