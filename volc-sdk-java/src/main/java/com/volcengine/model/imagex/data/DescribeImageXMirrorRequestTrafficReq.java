package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DescribeImageXMirrorRequestTrafficReq {
    @JSONField(name = "ServiceIds")
    private List<String> serviceIds;  // 服务id过滤
    @JSONField(name = "DomainNames")
    private List<String> domainNames; // 域名过滤
    @JSONField(name = "StartTime")
    private String startTime;   // YYYY-MM-DDThh:mm:ss±hh:mm
    @JSONField(name = "EndTime")
    private String endTime;     // YYYY-MM-DDThh:mm:ss±hh:mm
    @JSONField(name = "Interval")
    private String interval;    // 时间粒度。支持5m,1h,1d。不传默认查询时间段全部数据
    @JSONField(name = "Granularity")
    private String granularity; // 时间粒度。支持5m,1h,1d。不传默认查询时间段全部数据
}
