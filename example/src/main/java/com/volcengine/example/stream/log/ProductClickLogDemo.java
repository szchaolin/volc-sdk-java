package com.volcengine.example.stream.log;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.stream.log.LogResponse;
import com.volcengine.model.stream.log.ProductClickLogRequest;
import com.volcengine.service.stream.LogService;
import com.volcengine.service.stream.impl.LogServiceImpl;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class ProductClickLogDemo {
    public static void main(String[] args) {
        //初始化一个service
        LogService logService = LogServiceImpl.getInstance();

        //设置ak，sk 此为请求的凭证
        logService.setAccessKey("ak");
        logService.setSecretKey("sk");

        //初始化一个request
        ProductClickLogRequest req = new ProductClickLogRequest();
        req.setTimestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
        req.setAccessToken("accessToken");
        req.setPartner("server_sdk_demo_default_content");
        req.setGroupId("6938426748178530823");
        req.setCategory("server_sdk_demo_default_content_feed_1_3");
        req.setEventTime(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
        req.setEntranceForm("related_product");
        req.setProductId("2021102615430865626");
        req.setDt("iphone6s");
        req.setOs("iOS");
        req.setOsVersion("12");
        req.setClientVersion("7.3.25");
        req.setDeviceBrand("Apple");
        try {
            LogResponse response = logService.productClickLog(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
