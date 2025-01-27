// Code generated by protoc-gen-volcengine-sdk
// source: ListWorkflowTemplate
// DO NOT EDIT!

package com.volcengine.example.vod.workflow;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
public class VodListWorkflowTemplateDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.volcengine.service.vod.model.request.VodListWorkflowTemplateRequest.Builder reqBuilder = com.volcengine.service.vod.model.request.VodListWorkflowTemplateRequest.newBuilder();
			reqBuilder.setSpaceName("your SpaceName");
			reqBuilder.setTemplateId("your TemplateId");
			reqBuilder.setName("your Name");
			reqBuilder.setType("your Type");
			reqBuilder.setLimit(0);
			reqBuilder.setOffset(0);
			reqBuilder.setOrderByKey("your OrderByKey");
			reqBuilder.setOrder("your Order");
			
            com.volcengine.service.vod.model.response.VodListWorkflowTemplateResponse resp = vodService.ListWorkflowTemplate(reqBuilder.build());
            if (resp.getResponseMetadata().hasError()) {
                System.out.println(resp.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}