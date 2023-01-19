// Code generated by protoc-gen-volcengine-sdk
// source: generatePlayURL
// DO NOT EDIT!

package com.volcengine.service.live.addr;

import com.volcengine.service.live.LiveService;
import com.volcengine.service.live.impl.LiveServiceImpl;
import com.volcengine.service.live.model.request.GeneratePlayURLRequest;

public class LiveGeneratePlayURLDemo {

    public static void main(String[] args) throws Exception {
        LiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey("");
        liveService.setSecretKey("");

        try {
            GeneratePlayURLRequest req = new GeneratePlayURLRequest();

            req.setVhost("");
            req.setDomain("");
            req.setApp("");
            req.setStream("");
            req.setSuffix("");
            req.setType("");
            req.setExpiredTime("");

            com.volcengine.service.live.model.response.GeneratePlayURLResponse resp = liveService.generatePlayURL(req);

            if (resp.getResponseMetadata().hasError()) {

                System.out.println(resp);
                System.out.println(resp.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}