package com.volcengine.example.vms.resource;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.vms.NotifyService;
import com.volcengine.service.vms.impl.NotifyServiceImpl;
import com.volcengine.service.vms.response.BasicResourceResult;
import com.volcengine.service.vms.response.CommonResponse;

/**
 * @author huangxing
 * @Date 2023/1/9
 */
public class OpenUpdateResourceDemo {
    public static void main(String[] args) {

        NotifyService notifyService = NotifyServiceImpl.getInstance();

        notifyService.setAccessKey("your ak");
        notifyService.setSecretKey("your sk");


        try {
            CommonResponse<BasicResourceResult> commonResponse = notifyService.openUpdateResource("1ca08a45a937411ebd78e572cef87086", "12345.mp3");
            System.out.println(JSON.toJSONString(commonResponse));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}