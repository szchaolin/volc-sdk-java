// Code generated by protoc-gen-volcengine-sdk
// source: stopPullToPushTask
// DO NOT EDIT!

package com.volcengine.service.live.pull_to_push_task;

import com.volcengine.service.live.LiveService;
import com.volcengine.service.live.impl.LiveServiceImpl;

public class LiveStopPullToPushTaskDemo {

    public static void main(String[] args) throws Exception {
        ILiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey("your ak");
        liveService.setSecretKey("your sk");

        try {
            com.volcengine.service.live.model.request.StopPullToPushTaskRequest.Builder reqBuilder = com.volcengine.service.live.model.request.StopPullToPushTaskRequest.newBuilder();
			reqBuilder.setTaskId("your TaskId");
			
            com.volcengine.service.live.model.response.StopPullToPushTaskResponse resp = liveService.stopPullToPushTask(reqBuilder.build());
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