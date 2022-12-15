package com.volcengine.example.iam.policy;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.AttachUserPolicyRequest;
import com.volcengine.model.response.CommonResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class AttachUserPolicyDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config
        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            AttachUserPolicyRequest request = AttachUserPolicyRequest.builder().
                    policyName("policy_name").
                    userName("user1").
                    policyType("Custom").
                    build();

            CommonResponse response = iamService.attachUserPolicy(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
