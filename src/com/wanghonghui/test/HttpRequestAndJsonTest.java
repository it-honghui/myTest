package com.wanghonghui.test;

import com.alibaba.fastjson.JSONObject;
import com.wanghonghui.model.LeiNuoModel;
import com.wanghonghui.utils.HttpRequestUtils;
import com.wanghonghui.utils.JsonUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class HttpRequestAndJsonTest {
    private static final Logger logger = LoggerFactory.getLogger(HttpRequestAndJsonTest.class);

    public static void main(String[] args) throws Exception {
        String jsonData = HttpRequestUtils.sendPost("http://localhost:8080/tesla_console/leinuo/getLowScoreWarning.do", "");
        logger.info("jsonData:" + jsonData);
        if (!"".equals(jsonData) && null != jsonData) {
            JSONObject jsonObject = JSONObject.parseObject(jsonData);
            Map<String, Object> map = jsonObject;
            List<LeiNuoModel> list = JSONObject.parseArray(map.get("leiNuoModelXSList").toString(), LeiNuoModel.class);
            // ObjectToJson
            String objectToJson = JsonUtils.objectToJson(list);
            logger.info("objectToJson:" + objectToJson);
            // JsonToList
            List<LeiNuoModel> leiNuoModelList = JsonUtils.jsonToList(objectToJson, LeiNuoModel.class);
            logger.info("leiNuoModelList:" + leiNuoModelList);

            for (LeiNuoModel leiNuoModel : list) {
                String jsonLeiNuoModel = JsonUtils.objectToJson(leiNuoModel);
                // jsonToPojo
                LeiNuoModel model = JsonUtils.jsonToPojo(jsonLeiNuoModel, LeiNuoModel.class);
                logger.info("model:" + model);

            }
        }
    }

    /**
     * JsonUtils.parseJSON2Map 使用json-lib包
     * map里面是list 可以直接强转
     * =====================================
     * 使用fastjson包  --> JSONObject jsonObject = JSONObject.parseObject(jsonData);
     * map里面不是list --> Map<String, Object> map = jsonObject;
     * 是JSONArray    --> List<LeiNuoModel> list = JSONObject.parseArray(map.get("leiNuoModelXSList").toString(), LeiNuoModel.class);
     *
     * @throws Exception
     */
    @Test
    public void parseJSON2Map() throws Exception {
        String jsonData = HttpRequestUtils.sendPost("http://localhost:8080/tesla_console/leinuo/getLowScoreWarning.do", "");
        Map<String, Object> map = JsonUtils.parseJSON2Map(jsonData);
        List<LeiNuoModel> leiNuoModelXSList = (List<LeiNuoModel>) map.get("leiNuoModelXSList");
        logger.info(leiNuoModelXSList.toString());
    }
}
