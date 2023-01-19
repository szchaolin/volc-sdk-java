// Code generated by protoc-gen-volcengine-sdk
// source: updatePullToPushTask
// DO NOT EDIT!

package com.volcengine.service.live.pull_to_push_task;

import com.volcengine.service.live.LiveService;
import com.volcengine.service.live.impl.LiveServiceImpl;
import com.volcengine.service.live.model.request.UpdatePullToPushTaskRequest;

public class LiveUpdatePullToPushTaskDemo {

    public static void main(String[] args) throws Exception {
        LiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey("");
        liveService.setSecretKey("");

        try {
            UpdatePullToPushTaskRequest req = new UpdatePullToPushTaskRequest();
            req.setTitle("");
			req.setTaskId("");

            req.setStartTime(0l);
            req.setEndTime(0l);
            req.setType(0);
            req.setCycleMode(0);
            req.setDstAddr("");
            req.setSrcAddr("");
            req.setSrcAddrS(new String[]{""});

            com.volcengine.service.live.model.response.UpdatePullToPushTaskResponse resp = liveService.updatePullToPushTask(req);

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