package com.volcengine.service.videoaiot.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.helper.Const;
import com.volcengine.model.video_aiot.request.*;
import com.volcengine.model.video_aiot.response.*;
import com.volcengine.service.videoaiot.VideoAIoTConfig;
import com.volcengine.service.videoaiot.VideoAIoTService;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class VideoAIoTImplTest extends TestCase {

    private static final String rtmpSpaceID = "34e82b73-c853-4347-89c0-8a8395df14aa";
    private static final String gbSpaceID = "a0c97103-f019-42b4-b60a-f0976744d546";
    private static final String deviceID = "8f551529-0a60-431f-81f9-e87bac0e3428";
    private static final String streamID = "021c4154-2e1a-4c2b-acd9-388f79d7ff30";
    private static final String screenTemplateID = "7e15a883-881a-49bd-a2e1-83b15243fe43";
    private final VideoAIoTService videoAIoTService = VideoAIoTServiceImpl.getInstance();
    int presetID = 15;

    public void testListSpace() {
        ListSpaceRequest listSpaceRequest = new ListSpaceRequest();
        listSpaceRequest.setPageSize(10);
        listSpaceRequest.setPageNumber(1);
        try {
            ListSpaceResponse listSpaceResponse = videoAIoTService.listSpace(listSpaceRequest);
            ListSpaceResponse.ListSpace spaces = listSpaceResponse.getSpaces();
            System.out.printf(JSON.toJSONString(spaces));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

//    public void testCreateSpace() {
//        CreateSpaceRequest createSpaceRequest = new CreateSpaceRequest();
//        createSpaceRequest.setSpaceName("java-space");
//        createSpaceRequest.setRegion("cn-beijing-a");
//        createSpaceRequest.setCallback("");
//        createSpaceRequest.setDescription("java-sdk-create");
//        createSpaceRequest.setAccessType("rtmp");
//        createSpaceRequest.setHLSLowLatency(false);
//        try {
//            IDResponse space = videoAIoTService.createSpace(createSpaceRequest);
//            System.out.printf(JSON.toJSONString(space));
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }

    public void testCreateSpace() {
        CreateSpaceRequest createSpaceRequest = new CreateSpaceRequest();
        createSpaceRequest.setSpaceName("java-space");
        createSpaceRequest.setRegion("cn-beijing-a");
        createSpaceRequest.setCallback("");
        createSpaceRequest.setDescription("java-sdk-create");
        createSpaceRequest.setAccessType("gb28181");
        createSpaceRequest.setHLSLowLatency(false);
        CreateSpaceRequest.GBOptions gbOptions = new CreateSpaceRequest.GBOptions();
        gbOptions.setPullOnDemand(true);
        createSpaceRequest.setGbOptions(gbOptions);
        try {
            IDResponse space = videoAIoTService.createSpace(createSpaceRequest);
            System.out.printf(JSON.toJSONString(space));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testUpdateSpace() {
        UpdateSpaceRequest updateSpaceRequest = new UpdateSpaceRequest();
        updateSpaceRequest.setSpaceID(rtmpSpaceID);
        updateSpaceRequest.setSpaceName("java-sdk-update");
        updateSpaceRequest.setCallback("test-callback");
        updateSpaceRequest.setDescription("java-sdk-create");
        try {
            IDResponse idResponse = videoAIoTService.updateSpace(updateSpaceRequest);
            System.out.printf(JSON.toJSONString(idResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testGetSpace() {

        try {
            SpaceResponse space = videoAIoTService.getSpace(gbSpaceID);
            System.out.println(JSON.toJSONString(space));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testStopSpace() {
        try {
            IDResponse rawResponse = videoAIoTService.stopSpace(rtmpSpaceID);
            System.out.printf(JSON.toJSONString(rawResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testStartSpace() {
        try {
            IDResponse rawResponse = videoAIoTService.startSpace(rtmpSpaceID);
            System.out.printf(JSON.toJSONString(rawResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testDelSpace() {
        try {
            IDResponse rawResp = videoAIoTService.deleteSpace("f979653a-d656-4ded-bb87-35191e08604f");
            System.out.printf(JSON.toJSONString(rawResp));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

//    public void testCreateRecordTemplate() throws Exception {
//        CreateTemplateRequest createTemplateRequest = new CreateTemplateRequest();
//        createTemplateRequest.setTemplateName("30sec");
//        CreateTemplateRequest.Record record = new CreateTemplateRequest.Record();
//        record.setRecordDuration(30000);
//        record.setFormat("hls");
//        CreateTemplateRequest.TemplateTTLConfig templateTTLConfig = new CreateTemplateRequest.TemplateTTLConfig();
//        templateTTLConfig.setDays(1);
//        record.setTemplateTTLConfig(templateTTLConfig);
//        createTemplateRequest.setRecord(record);
//
//        IDResponse rawResponse = videoAIoTService.createRecordTemplate(createTemplateRequest);
//        System.out.printf(JSON.toJSONString(rawResponse));
//    }

    public void testSetSpaceTmpl() {
        SetSpaceTemplateRequest setSpaceTemplateRequest = new SetSpaceTemplateRequest();
        setSpaceTemplateRequest.setSpaceID(rtmpSpaceID);
        setSpaceTemplateRequest.setTemplateID(screenTemplateID);
        setSpaceTemplateRequest.setTemplateType("screenshot");
        try {
            RawResponse rawResponse = videoAIoTService.setSpaceTemplate(setSpaceTemplateRequest);
            System.out.printf(JSON.toJSONString(rawResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testUnsetSpaceTmpl() {
        try {
            RawResponse rawResponse = videoAIoTService.unsetSpaceTemplate(rtmpSpaceID, "screenshot");
            System.out.printf(JSON.toJSONString(rawResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testGetSpaceTmpl() {
        try {
            SpaceTemplateResponse spaceTemplate = videoAIoTService.getSpaceTemplate(rtmpSpaceID);
            System.out.printf(JSON.toJSONString(spaceTemplate));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * device test
     */
    public void testCreateDevice() {
        String deviceNSID = "";
        try {
            IDResponse ipc = videoAIoTService.genSipID("34020000002000000003", "IPC");
            deviceNSID = ipc.getId().getId();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if ("".equalsIgnoreCase(deviceNSID)) {
            throw new RuntimeException("deviceNSID is empty");
        }
        CreateDeviceRequest createDeviceRequest = new CreateDeviceRequest();
        createDeviceRequest.setDeviceName("java-sdk-create0");
        createDeviceRequest.setDeviceNSID(deviceNSID);
        createDeviceRequest.setSpaceID(gbSpaceID);
        createDeviceRequest.setDescription("java-sdk-create");
        createDeviceRequest.setPassword("0p@la123T10psa+=");
        createDeviceRequest.setType("IPC");
        createDeviceRequest.setUserName(deviceNSID);
        try {
            CreateDeviceResponse device = videoAIoTService.createDevice(createDeviceRequest);
            System.out.printf(JSON.toJSONString(device));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testUpdateDevice() {
        do_testUpdateDevice("3c207531-6c25-43bf-a192-0011e742e4e1", "43932980-f513-4aae-bc4c-c14eaec040b5");
    }

    public void do_testUpdateDevice(String spaceID, String deviceID) {
        UpdateDeviceRequest updateDeviceRequest = new UpdateDeviceRequest();
        updateDeviceRequest.setDeviceID(deviceID);
        updateDeviceRequest.setUserName("user-name");
        updateDeviceRequest.setDeviceName("java-sdk-update" + System.currentTimeMillis());
        updateDeviceRequest.setDescription("desc" + System.currentTimeMillis());
        updateDeviceRequest.setSpaceID(spaceID);
        updateDeviceRequest.setAutoPullAfterRegister(false);
        Device.Coordinates co = new Device.Coordinates();
        co.setLatitude(10.1);
        co.setLongitude(10.2);
        updateDeviceRequest.setLocation("test-location");
        updateDeviceRequest.setCoordinates(co);
        try {
            IDResponse idResponse = videoAIoTService.updateDevice(updateDeviceRequest);
            System.out.printf(JSON.toJSONString(idResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testGetDevice() {
        do_TestGetDevice("34020000002000000003", "23b54cf3-077d-450c-ad02-1aadbc15b910",
                "3c207531-6c25-43bf-a192-0011e742e4e1");
    }

    public void do_TestGetDevice(String sipServerID, String deviceID, String gbSpaceID) {
        GetDeviceRequest getDeviceRequest = new GetDeviceRequest();
        getDeviceRequest.setDeviceID(deviceID);
        getDeviceRequest.setSipServerID(sipServerID);
        getDeviceRequest.setSpaceID(gbSpaceID);
        try {
            GetDeviceResponse device = videoAIoTService.getDevice(getDeviceRequest);
            System.out.printf(JSON.toJSONString(device));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testListDevice() {
        ListDeviceRequest listDeviceRequest = new ListDeviceRequest();
        listDeviceRequest.setPageSize(10);
        listDeviceRequest.setPageNumber(1);
        listDeviceRequest.setSpaceID(gbSpaceID);
        try {
            ListDeviceResponse listDeviceResponse = videoAIoTService.listDevice(listDeviceRequest);
            System.out.println(JSON.toJSONString(listDeviceResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testStartDevice() {
        do_TestStartDevice("a0c97103-f019-42b4-b60a-f0976744d546", "925ca8e1-11cc-4473-aace-d9d91301b002");
    }

    public void do_TestStartDevice(String spaceID, String deviceID) {
        DeviceRequest deviceRequest = new DeviceRequest();
        deviceRequest.setSpaceID(spaceID);
        deviceRequest.setDeviceID(deviceID);
        try {
            IDResponse idResponse = videoAIoTService.startDevice(deviceRequest);
            System.out.println(JSON.toJSONString(idResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testGetDeviceChannels() {
        setTest();
        GetDeviceChannelRequest request = new GetDeviceChannelRequest();
        request.setDeviceID("34571879-8fc2-433d-9ad0-ee1d71bf16b6");
        try {
            GetDeviceChannelResponse resp = videoAIoTService.getDeviceChannels(request);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        request.setQueryMode(GetDeviceChannelRequest.QueryMode.BRIEF);
        try {
            GetDeviceChannelResponse resp = videoAIoTService.getDeviceChannels(request);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testPlayback() throws Exception {
        setTest();
        PlaybackStartRequest start = new PlaybackStartRequest();
        start.setDeviceNSID("34020027991180820747");
        start.setChannelID("98880000001320000000");
        start.setStartTime(1689177600);
        start.setEndTime(1689263999);
        PlaybackStartResponse playbackStartResponse = videoAIoTService.playbackStart(start);
        System.out.println(JSON.toJSONString(playbackStartResponse));
        String sid = playbackStartResponse.getResult().getStreamID();
        for (int i = 0; ; i++) {
            PlaybackStatResponse playbackStatResponse = videoAIoTService.playbackStat(sid);
            System.out.println(JSON.toJSONString(playbackStatResponse));
            if (playbackStatResponse.getResult().getStatus().equals("deleted")) {
                break;
            }
            Thread.sleep(5000);
        }
        IDResponse idResponse = videoAIoTService.playbackStop(sid);
        System.out.println(JSON.toJSONString(idResponse));
    }


    public void testPlaybackV2() throws Exception {
        setTest();
        PlaybackStartRequestV2 start = new PlaybackStartRequestV2();
        start.setDeviceNSID("34020034991180160268");
        start.setChannelID("98880000001320000000");
        start.setStartTime(1691510400);
        start.setEndTime(1691596799);
        PlaybackStartResponse playbackStartResponse = videoAIoTService.playbackStartV2(start);
        System.out.println(JSON.toJSONString(playbackStartResponse));
        String sid = playbackStartResponse.getResult().getStreamID();
        for (int i = 0; ; i++) {
            PlaybackStatResponse playbackStatResponse = videoAIoTService.playbackStat(sid);
            System.out.println(JSON.toJSONString(playbackStatResponse));
            if (playbackStatResponse.getResult().getStatus().equals("deleted")) {
                break;
            }
            Thread.sleep(5000);
        }
        IDResponse idResponse = videoAIoTService.playbackStop(sid);
        System.out.println(JSON.toJSONString(idResponse));
    }

    public void testPlaybackStat() throws Exception {
        setTest();
        String sid = "3ad6c029-5153-40ca-904f-7810641d7b0f";
        for (int i = 0; ; i++) {
            PlaybackStatResponse playbackStatResponse = videoAIoTService.playbackStat(sid);
            System.out.println(JSON.toJSONString(playbackStatResponse));
            if (playbackStatResponse.getResult().getStatus().equals("deleted")) {
                break;
            }
            Thread.sleep(1000);
        }
    }

    public void testDelDevice() {
        do_TestDeleteDevice("2db38a3a-2a9d-4bf7-afd9-7cdc1347e9ad", "fb58fc32-1dd7-4ed4-a26c-1b6f5112fb11");
    }

    public void do_TestDeleteDevice(String spaceID, String deviceID) {
        DeviceRequest request = new DeviceRequest();
        request.setSpaceID(spaceID);
        request.setDeviceID(deviceID);
        try {
            IDResponse resp = videoAIoTService.deleteDevice(request);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testListDeviceScreenshot() {
        setTest();
        ListDeviceRecordsRequest listDeviceRecords = new ListDeviceRecordsRequest();
        listDeviceRecords.setSpaceID("505bd8ca-8d05-4703-a225-9043d9ec92c2");
        listDeviceRecords.setStreamID("475b0e61-7b5f-4c8f-9216-34e838528537");
        listDeviceRecords.setStartTs("2023-07-18T11:55:10+08:00");
        listDeviceRecords.setEndTs("2023-07-19T11:55:10+08:00");
        listDeviceRecords.setPageSize(10);
        listDeviceRecords.setPageNumber(1);
        try {
            ListDeviceRecordsResponse resp = videoAIoTService.listDeviceScreenshots(listDeviceRecords);
            System.out.println(resp.getDeviceRecords());
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testListDeviceRecords() {
        setTest();
        long startTime = System.currentTimeMillis();
        ListDeviceRecordsRequest listDeviceRecords = new ListDeviceRecordsRequest();
        listDeviceRecords.setSpaceID("0c8dbdd5-b9b4-4807-82d4-5f923a3a8173");
        listDeviceRecords.setDeviceNSID("34020034991180160268");
        listDeviceRecords.setChannelID("98880000001320000000");
        listDeviceRecords.setStartTs("2023-08-09T10:47:20+08:00");
        listDeviceRecords.setEndTs("2023-08-10T10:47:20+08:00");
        listDeviceRecords.setPageSize(100);
        listDeviceRecords.setPageNumber(1);
        listDeviceRecords.setReqType("record_metadata1");
        try {
            ListDeviceRecordsResponse resp = videoAIoTService.listDeviceRecords(listDeviceRecords);
            System.out.println(JSON.toJSONString(resp));
            System.out.println(resp.getDeviceRecords().size());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("COST:" + (System.currentTimeMillis() - startTime));
    }

    public void testCloudRecordPlay() {
        setTest();
        CloudRecordPlayRequest cloudRecordPlayRequest = new CloudRecordPlayRequest();
        cloudRecordPlayRequest.setStreamID("441a5430-75ad-487d-bcca-0210196598d5");
        cloudRecordPlayRequest.setStartTs("2023-07-04T16:29:39+08:00");
        cloudRecordPlayRequest.setEndTs("2023-07-04T16:39:39+08:00");
        cloudRecordPlayRequest.setTokenValid(3600);
        try {
            CloudPlayResponse resp = videoAIoTService.cloudRecordPlay(cloudRecordPlayRequest);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testStopDevice() {
        do_TestStopDevice("a0c97103-f019-42b4-b60a-f0976744d546", "925ca8e1-11cc-4473-aace-d9d91301b002");
    }

    public void do_TestStopDevice(String spaceID, String deviceID) {
        DeviceRequest deviceRequest = new DeviceRequest();
        deviceRequest.setSpaceID(spaceID);
        deviceRequest.setDeviceID(deviceID);
        try {
            IDResponse idResponse = videoAIoTService.stopDevice(deviceRequest);
            System.out.println(JSON.toJSONString(idResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testFreshDevice() {
        do_TestFreshDevice("925ca8e1-11cc-4473-aace-d9d91301b002", "a0c97103-f019-42b4-b60a-f0976744d546");
    }

    public void do_TestFreshDevice(String deviceID, String spaceID) {
        DeviceRequest deviceRequest = new DeviceRequest();
        deviceRequest.setDeviceID(deviceID);
        deviceRequest.setSpaceID(spaceID);
        try {
            IDResponse rawResponse = videoAIoTService.freshDevice(deviceRequest);
            System.out.println(JSON.toJSONString(rawResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testGetStream() {
        GetStreamRequest getStreamRequest = new GetStreamRequest();
        getStreamRequest.setStreamID("3d87ab7c-88b5-4e5c-9aa0-7af5d7e347e3");
        try {
            GetStreamResponse stream = videoAIoTService.getStream(getStreamRequest);
            System.out.printf(JSON.toJSONString(stream));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testListStream() {
        ListStreamsRequest listStreamsRequest = new ListStreamsRequest();
        listStreamsRequest.setPageSize(10);
        listStreamsRequest.setPageNumber(1);
        listStreamsRequest.setSpaceID(rtmpSpaceID);
        try {
            ListStreamsResponse listStreamsResponse = videoAIoTService.listStreams(listStreamsRequest);
            System.out.println(JSON.toJSONString(listStreamsResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testSetSpaceTemplate() {
        SetSpaceTemplateRequest setSpaceTemplateRequest = new SetSpaceTemplateRequest();
        setSpaceTemplateRequest.setSpaceID("");
        setSpaceTemplateRequest.setTemplateID("");
        setSpaceTemplateRequest.setTemplateType("screenshot");
        try {
            videoAIoTService.setSpaceTemplate(setSpaceTemplateRequest);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testunSetSpaceTemplate() {
        try {
            videoAIoTService.unsetSpaceTemplate("spaceid", "screenshot");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testUpdateStream() {
        UpdateStreamRequest updateStreamRequest = new UpdateStreamRequest();
        updateStreamRequest.setStreamID(streamID);
        updateStreamRequest.setStreamName("java-sdk-update11111");
        updateStreamRequest.setDescription("123123123");
        updateStreamRequest.setSpaceID(rtmpSpaceID);
        try {
            IDResponse idResponse = videoAIoTService.updateStream(updateStreamRequest);
            System.out.printf(JSON.toJSONString(idResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testStopStream() {
        StreamRequest streamRequest = new StreamRequest();
        streamRequest.setStreamID(streamID);
        try {
            IDResponse idResponse = videoAIoTService.stopStream(streamRequest);
            System.out.println(JSON.toJSONString(idResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testLocalMediaDownload() {
        LocalMediaDownloadRequest localMediaDownloadRequest = new LocalMediaDownloadRequest();
        localMediaDownloadRequest.setSpaceID("7c09b921-a07c-4fd2-b59f-e0fce9a072a0\n");
        localMediaDownloadRequest.setChannelID("34020035991320467670");
        localMediaDownloadRequest.setDeviceID("34020095991320293742");
        localMediaDownloadRequest.setStartTime(1660719434);
        localMediaDownloadRequest.setEndTime(1660719534);
        localMediaDownloadRequest.setVersion("2");
        LocalMediaDownloadRequest.Mps mps = new LocalMediaDownloadRequest.Mps();
        LocalMediaDownloadRequest.M3U8Option m3u8 = new LocalMediaDownloadRequest.M3U8Option();
        m3u8.setToMp4(true);
        mps.setM3U8Option(m3u8);

        LocalMediaDownloadRequest.Subtitle subt = new LocalMediaDownloadRequest.Subtitle();
        subt.setSubtitleSrc("");

        LocalMediaDownloadRequest.Font font = new LocalMediaDownloadRequest.Font();
        font.setFontSize(2);
        font.setAlignment("");
        font.setPrimaryColor("");

        subt.setFont(font);

        LocalMediaDownloadRequest.SubtitleItem item = new LocalMediaDownloadRequest.SubtitleItem();
        item.setContent("哈哈哈");
        item.setEnd(9000);
        item.setStart(5000);

        LocalMediaDownloadRequest.SubtitleItem item1 = new LocalMediaDownloadRequest.SubtitleItem();
        item.setContent("哈哈哈");
        item.setEnd(9000);
        item.setStart(5000);

        List<LocalMediaDownloadRequest.SubtitleItem> list1 = new ArrayList<LocalMediaDownloadRequest.SubtitleItem>();
        list1.add(item);
        //list1.add(item1);

        subt.setSubtitleList(list1);

        mps.setSubtitle(subt);

        localMediaDownloadRequest.setMediaProcess(mps);
        try {
            LocalMediaDownloadResponse download = videoAIoTService.localMediaDownload(localMediaDownloadRequest);
            System.out.printf(JSON.toJSONString(download));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testGetLocalDownload() {
        setTest();
        try {
            GetLocalMediaDownloadResponse localDownload = videoAIoTService.getLocalDownload("");
            System.out.println(JSON.toJSONString(localDownload));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testCreateStream() {
        CreateStreamRequest streamRequest = new CreateStreamRequest();
        streamRequest.setSpaceID(rtmpSpaceID);
        streamRequest.setStreamName("just-do-it11");
        try {
            IDResponse idResponse = videoAIoTService.createStream(streamRequest);
            System.out.println(JSON.toJSONString(idResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testDeleteStream() {
        StreamRequest streamRequest = new StreamRequest();
        streamRequest.setStreamID("d4e6611c-ed2b-492a-b86b-5a19f6e23554");
        try {
            IDResponse idResponse = videoAIoTService.deleteStream(streamRequest);
            System.out.println(JSON.toJSONString(idResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testCreateTmpl() {
    }

//    public void testCreateForward() {
//        CreateForwardRequest request = new CreateForwardRequest();
//        request.setStart(Boolean.TRUE);
//        request.setDescription("sdk create");
//        request.setStreamName("forward_" + System.currentTimeMillis());
//        request.setExpire(7);
//        request.setSpaceID("4386048e-d9ab-4961-ba90-03bca3d13cc2");
//        request.setSource("rtmp://73kxrwxhdq83ks1e.pull.bfcdnbf.com/yzy42ufvr6aykp07/wedc?volcTime=1662091448&volcSecret=59b58224bb887ab26671bc4342a5b153");
//        try {
//            RawResponse forward = videoAIoTService.createForward(request);
//            System.out.println(JSON.toJSONString(forward));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void testStopForward() {
//
//        try {
//            RawResponse rawResponse = videoAIoTService.stopForward("ae382ce9-6c8d-4e74-a6a5-dd37938f980c");
//            System.out.println(JSON.toJSONString(rawResponse));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public void testStreamLogs() {
        //推流记录
        StreamLogsRequest streamRequest = new StreamLogsRequest();
        streamRequest.setStreamID("dbc2000c-56e0-4ccc-ba9e-df43f8199073");
        streamRequest.setStartTs("1662035160");
        streamRequest.setEndTs("1662639960");
        try {
            StreamLogsResponse recordResponse = videoAIoTService.streamLogs(streamRequest);
            System.out.println(JSON.toJSONString(recordResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testGetStreamData() {
        // 流维度的数据查询
        GetStreamDataRequest streamRequest = new GetStreamDataRequest();
        streamRequest.setStreamID("dbc2000c-56e0-4ccc-ba9e-df43f8199073");
        streamRequest.setStartTime("1662555386");
        streamRequest.setEndTime("1662641786");
        try {
            GetStreamDataResponse dataResponse = videoAIoTService.getStreamData(streamRequest);
            System.out.println(JSON.toJSONString(dataResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testGetDataProjectWithBindWidthAndFlow() {
        GetDataProjectWithBindWidthAndFlowRequest dataRequest = new GetDataProjectWithBindWidthAndFlowRequest();
        dataRequest.setSpaceID("517ff7ec-7700-4862-b1e7-7967a492df79");
        dataRequest.setStartTime("1663984753");
        dataRequest.setEndTime("1664157570");
        dataRequest.setData("BindWidth"); //或者填 Flow
        dataRequest.setStreamName(""); //不填的话，就是空间级别的流量带宽查询、填了就是流维度的
        try {
            GetDataProjectWithBindWidthAndFlowResponse dataResponse = videoAIoTService.getDataProjectWithBindWidthAndFlow(dataRequest);
            System.out.println(JSON.toJSONString(dataResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        GetDataProjectWithBindWidthAndFlowRequest dataRequest1 = new GetDataProjectWithBindWidthAndFlowRequest();
        dataRequest1.setSpaceID("517ff7ec-7700-4862-b1e7-7967a492df79");
        dataRequest1.setStartTime("1663984753");
        dataRequest1.setEndTime("1664157570");
        dataRequest1.setData("Flow"); //或者填 Flow
        dataRequest1.setStreamName("34020083991320916727_34020083991320916727"); //不填的话，就是空间级别的流量带宽查询、填了就是流维度的
        try {
            GetDataProjectWithBindWidthAndFlowResponse dataResponse1 = videoAIoTService.getDataProjectWithBindWidthAndFlow(dataRequest1);
            System.out.println(JSON.toJSONString(dataResponse1));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testGetTotalData() {
        //请求参数给个当前时刻即可
        try {
            GetTotalDataResponse dataResponse = videoAIoTService.getTotalData("1662643490");
            System.out.println(JSON.toJSONString(dataResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //报警相关测试
    public void testSetAlarmGuard() {
        SetAlarmGuardRequest dataRequest = new SetAlarmGuardRequest();
        dataRequest.setDeviceNSID("34020046991320828916");
        dataRequest.setEnable("true");
        dataRequest.setChannelID(""); //可为空
        dataRequest.setSipID(""); //可为空
        try {
            RawResponse dataResponse = videoAIoTService.setAlarmGuard(dataRequest);
            System.out.println(JSON.toJSONString(dataResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testResetAlarm() {
        ResetAlarmRequest dataRequest = new ResetAlarmRequest();
        dataRequest.setDeviceNSID("34020046991320828916");
        dataRequest.setChannelID("");//可为空
        dataRequest.setSipID(""); //可为空
        try {
            RawResponse dataResponse = videoAIoTService.resetAlarm(dataRequest);
            System.out.println(JSON.toJSONString(dataResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testListAlarmNotify() {
        ListAlarmNotifyRequest dataRequest = new ListAlarmNotifyRequest();
        dataRequest.setDeviceNSID("34020046991320828916");
        dataRequest.setChannelID("");
        int[] tt = new int[]{0};
        dataRequest.setAlarmMethod(tt);
        dataRequest.setAlarmPriority(tt);
        dataRequest.setAlarmType2(tt);
        dataRequest.setAlarmType5(tt);
        dataRequest.setAlarmType6(tt);
        dataRequest.setEndTime(1663054993);
        dataRequest.setStartTime(1662968593);
        try {
            ListAlarmNotifyResponse dataResponse = videoAIoTService.listAlarmNotify(dataRequest);
            System.out.println(JSON.toJSONString(dataResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testDeleteAlarmNotify() {
        String alarmNotifyID = "caf16d94-e63d-4378-9a25-59031090a2fd";
        try {
            RawResponse dataResponse = videoAIoTService.deleteAlarmNotify(alarmNotifyID);
            System.out.println(JSON.toJSONString(dataResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testDeleteAlarmNotifyAll() {
        String spaceID = "87d27f4e-5d8d-4c58-9543-e49bdba6a448";
        String deviceNSID = "34020046991320828916";
        try {
            RawResponse dataResponse = videoAIoTService.deleteAlarmNotifyAll(spaceID, deviceNSID);
            System.out.println(JSON.toJSONString(dataResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testForbidStream() {
        String streamID = "c518f8f3-84ed-4515-8be4-8a2351ed2a76";
        try {
            IDResponse idResponse = videoAIoTService.forbidStream(streamID);
            System.out.println(JSON.toJSONString(idResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testUnForbidStream() {
        String streamID = "c518f8f3-84ed-4515-8be4-8a2351ed2a76";
        try {
            IDResponse idResponse = videoAIoTService.unForbidStream(streamID);
            System.out.println(JSON.toJSONString(idResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testUpdateAuthInSpace() {
        UpdateAuthInSpaceRequest data = new UpdateAuthInSpaceRequest();
        data.setDomain("ps9oy3e9k25cyjvp.push.aiotvideo.volces.com");
        data.setSpaceID("3ae81832-dd2a-4f1a-9e67-790095c566e8");
        data.setMainKey("23123123123123");
        data.setSpareKey("13123123123123");
        data.setValidDuration(1000000);
        try {
            RawResponse res = videoAIoTService.updateAuthInSpace(data);
            System.out.println(JSON.toJSONString(res));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testDisableAuthInSpace() {
        String domain = "ps9oy3e9k25cyjvp.push.aiotvideo.volces.com";
        String spaceID = "3ae81832-dd2a-4f1a-9e67-790095c566e8";
        try {
            RawResponse res = videoAIoTService.disableAuthInSpace(spaceID, domain);
            System.out.println(JSON.toJSONString(res));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testVoiceTalk() {
        StartVoiceTalkRequest startRequest = new StartVoiceTalkRequest();
        startRequest.setSpaceID("415cd0c1-c308-4264-9ef9-5d81d8518b30");
        startRequest.setDeviceNSID("34020050991320119620");
        try {
            StartVoiceTalkResponse resp = videoAIoTService.startVoiceTalk(startRequest);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        StopVoiceTalkRequest stopRequest = new StopVoiceTalkRequest();
        stopRequest.setSpaceID("415cd0c1-c308-4264-9ef9-5d81d8518b30");
        stopRequest.setDeviceNSID("34020050991320119620");
        try {
            RawResponse resp = videoAIoTService.stopVoiceTalk(stopRequest);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testPTZ() throws InterruptedException {
        DeviceCloudControlRequest deviceCloudControlRequest = new DeviceCloudControlRequest();
        deviceCloudControlRequest.setDeviceNSID("34020008991180978871");
        deviceCloudControlRequest.setAction(DeviceCloudControlRequest.ACTION_PTZ);
        deviceCloudControlRequest.setChannelID("34020000001320000005");
        deviceCloudControlRequest.setParam(51);
        deviceCloudControlRequest.setCmd(DeviceCloudControlRequest.PtzCmdUp);
        deviceCloudControlRequest.setSipID("34020000002000000001");
        try {
            RawResponse rawResponse = videoAIoTService.cloudControl(deviceCloudControlRequest);
            System.out.println(JSON.toJSONString(rawResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(2000);
        deviceCloudControlRequest = new DeviceCloudControlRequest();
        deviceCloudControlRequest.setDeviceNSID("34020008991180978871");
        deviceCloudControlRequest.setAction(DeviceCloudControlRequest.ACTION_PTZ);
        deviceCloudControlRequest.setChannelID("34020000001320000005");
        deviceCloudControlRequest.setParam(51);
        deviceCloudControlRequest.setCmd(DeviceCloudControlRequest.PtzCmdStop);
        deviceCloudControlRequest.setSipID("34020000002000000001");
        try {
            RawResponse rawResponse = videoAIoTService.cloudControl(deviceCloudControlRequest);
            System.out.println(JSON.toJSONString(rawResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testFi() throws InterruptedException {
        DeviceCloudControlRequest deviceCloudControlRequest = new DeviceCloudControlRequest();
        deviceCloudControlRequest.setDeviceNSID("34020008991180978871");
        deviceCloudControlRequest.setAction(DeviceCloudControlRequest.ACTION_FI);
        deviceCloudControlRequest.setChannelID("34020000001320000005");
        deviceCloudControlRequest.setParam(51);
        deviceCloudControlRequest.setCmd(DeviceCloudControlRequest.FiCmdFocusFar);
        deviceCloudControlRequest.setSipID("34020000002000000001");
        try {
            videoAIoTService.cloudControl(deviceCloudControlRequest);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(2000);
        deviceCloudControlRequest = new DeviceCloudControlRequest();
        deviceCloudControlRequest.setDeviceNSID("34020008991180978871");
        deviceCloudControlRequest.setAction(DeviceCloudControlRequest.ACTION_FI);
        deviceCloudControlRequest.setChannelID("34020000001320000005");
        deviceCloudControlRequest.setParam(51);
        deviceCloudControlRequest.setCmd(DeviceCloudControlRequest.FiCmdStop);
        deviceCloudControlRequest.setSipID("34020000002000000001");
        try {
            RawResponse rawResponse = videoAIoTService.cloudControl(deviceCloudControlRequest);
            System.out.println(JSON.toJSONString(rawResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testAddPreset() {
        DeviceCloudControlRequest deviceCloudControlRequest = new DeviceCloudControlRequest();
        deviceCloudControlRequest.setCmd(DeviceCloudControlRequest.PresetCmdSet);
        deviceCloudControlRequest.setDeviceNSID("34020008991180978871");
        deviceCloudControlRequest.setAction(DeviceCloudControlRequest.ACTION_PRESET);
        deviceCloudControlRequest.setChannelID("34020000001320000005");
        deviceCloudControlRequest.setParam(presetID);
        deviceCloudControlRequest.setSipID("34020000002000000001");

        try {
            videoAIoTService.cloudControl(deviceCloudControlRequest);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testRemovePreset() {
        DeviceCloudControlRequest deviceCloudControlRequest = new DeviceCloudControlRequest();
        deviceCloudControlRequest.setCmd(DeviceCloudControlRequest.PresetCmdRemove);
        deviceCloudControlRequest.setDeviceNSID("34020008991180978871");
        deviceCloudControlRequest.setAction(DeviceCloudControlRequest.ACTION_PRESET);
        deviceCloudControlRequest.setChannelID("34020000001320000005");
        deviceCloudControlRequest.setParam(presetID);
        deviceCloudControlRequest.setSipID("34020000002000000001");

        try {
            videoAIoTService.cloudControl(deviceCloudControlRequest);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testQueryPreset() {
        setTest();
        DeviceQueryPresetRequest request = new DeviceQueryPresetRequest();
        request.setDeviceID("34020029991180914107");
        request.setChannelID("98880000001320000000");
        request.setSipID("34020000002000000003");
        request.setTimeout(5);
        try {
            DeviceQueryPresetResponse deviceQueryPresetResponse = videoAIoTService.queryPresetInfo(request);
            System.out.println(JSON.toJSONString(deviceQueryPresetResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testCruiseControl() {
        setTest();
        DeviceCruiseControlRequest request = new DeviceCruiseControlRequest();
        request.setDeviceNSID("34020029991180914107");
        request.setChannelID("98880000001320000000");

        // add
        request.setAction(DeviceCruiseControlRequest.Action_Add);
        request.setTrackID(1);
        request.setPresetID(2);
        try {
            RawResponse cruiseControlResponse = videoAIoTService.cruiseControl(request);
            System.out.println(JSON.toJSONString(cruiseControlResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // set stay time and speed
        request.setAction(DeviceCruiseControlRequest.Action_SetSpeed);
        request.setSpeed(500);
        request.setStaySeconds(5);
        try {
            RawResponse cruiseControlResponse = videoAIoTService.cruiseControl(request);
            System.out.println(JSON.toJSONString(cruiseControlResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // start cruise track
        request.setAction(DeviceCruiseControlRequest.Action_Start);
        request.setTrackID(1);
        try {
            RawResponse cruiseControlResponse = videoAIoTService.cruiseControl(request);
            System.out.println(JSON.toJSONString(cruiseControlResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testCruiseTrack() {
        setTest();

        // add cruise track
        SetCruiseTrackRequest setRequest = new SetCruiseTrackRequest();
        setRequest.setDeviceNSID("34020029991180914107");
        setRequest.setChannelID("98880000001320000000");
        setRequest.setTrackID(1);
        setRequest.setSpeed(400);
        setRequest.setStaySeconds(20);

        List<SetCruiseTrackRequest.CruisePoint> trackList = new ArrayList<>();
        SetCruiseTrackRequest.CruisePoint cruisePoint = new SetCruiseTrackRequest.CruisePoint();
        cruisePoint.setPresetID(1);
        cruisePoint.setPresetName("preset-1");
        trackList.add(cruisePoint);
        setRequest.setTrackList(trackList);

        try {
            RawResponse setCruiseTrackResponse = videoAIoTService.setCruiseTrack(setRequest);
            System.out.println(JSON.toJSONString(setCruiseTrackResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // get cruise track
        GetCruiseTrackRequest getRequest = new GetCruiseTrackRequest();
        getRequest.setDeviceNSID("34020029991180914107");
        getRequest.setChannelID("98880000001320000000");
        getRequest.setTrackID(1);
        try {
            GetCruiseTrackResponse getCruiseTrackResponse = videoAIoTService.getCruiseTrack(getRequest);
            System.out.println(JSON.toJSONString(getCruiseTrackResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // list cruise track
        ListCruiseTracksRequest listRequest = new ListCruiseTracksRequest();
        listRequest.setDeviceNSID("34020029991180914107");
        listRequest.setChannelID("98880000001320000000");
        try {
            ListCruiseTracksResponse listCruiseTracksResponse = videoAIoTService.listCruiseTracks(listRequest);
            System.out.println(JSON.toJSONString(listCruiseTracksResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // start cruise track
        StartCruiseTrackRequest startRequest = new StartCruiseTrackRequest();
        startRequest.setDeviceNSID("34020029991180914107");
        startRequest.setChannelID("98880000001320000000");
        startRequest.setTrackID(1);
        try {
            RawResponse startCruiseTrackResponse = videoAIoTService.startCruiseTrack(startRequest);
            System.out.println(JSON.toJSONString(startCruiseTrackResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // stop cruise track
        StopCruiseTrackRequest stopRequest = new StopCruiseTrackRequest();
        stopRequest.setDeviceNSID("34020029991180914107");
        stopRequest.setChannelID("98880000001320000000");
        try {
            RawResponse stopCruiseTrackResponse = videoAIoTService.stopCruiseTrack(stopRequest);
            System.out.println(JSON.toJSONString(stopCruiseTrackResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // delete cruise track
        DeleteCruiseTrackRequest deleteRequest = new DeleteCruiseTrackRequest();
        deleteRequest.setDeviceNSID("34020029991180914107");
        deleteRequest.setChannelID("98880000001320000000");
        deleteRequest.setTrackID(1);
        try {
            RawResponse deleteCruiseTrackResponse = videoAIoTService.deleteCruiseTrack(deleteRequest);
            System.out.println(JSON.toJSONString(deleteCruiseTrackResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testStartStreamRecord() {
        StreamStartRecordRequest streamStartRecordRequest = new StreamStartRecordRequest();
        streamStartRecordRequest.setStreamID("ee9a49ea-916c-4c2f-aced-333e409414df");
        streamStartRecordRequest.setRecordTime(100);
        streamStartRecordRequest.setTimeout(10);
        streamStartRecordRequest.setExpire(0);
        streamStartRecordRequest.setAutoPull(true);

        try {
            IDResponse idResponse = videoAIoTService.streamStartRecord(streamStartRecordRequest);
            System.out.println(JSON.toJSONString(idResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testStop() {
        try {
            RawResponse idResponse = videoAIoTService.streamStopRecord("record0x7df8ud0");
            System.out.println(JSON.toJSONString(idResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testGet() {
        try {
            GetStreamRecordResponse idResponse = videoAIoTService.getStreamRecord("record0kvldcqr1");
            System.out.println(JSON.toJSONString(idResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDelete() {
        try {
            DeleteStreamRecordResponse idResponse = videoAIoTService.deleteStreamRecord("record0p30r99xf");
            System.out.println(JSON.toJSONString(idResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void testGetRecordList() {
        try {
            GetRecordListRequest request = new GetRecordListRequest();
            request.setRecordType("all");
            request.setDeviceNSID("34020081991180247837");
            request.setStartTime(1680451200);
            request.setEndTime(1680537599);
            request.setOrder(true);
            request.setTimeoutSec(20);
            request.setChannelID("98880000001320000000");
            GetRecordResponse resp = videoAIoTService.getRecordList(request);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testGetDeviceRecordListV2() {
        setTest();
        try {
            GetRecordListV2Request request = new GetRecordListV2Request();
            request.setRecordType("all");
            request.setDeviceNSID("34020027991180820747");
            request.setStartTime(1688572800);
            request.setEndTime(1688659199);
            request.setOrder(true);
            request.setTimeoutInSec(20);
            request.setChannelID("98880000001320000000");
            GetRecordV2Response resp = videoAIoTService.getRecordListV2(request);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testGetDeviceChannelV2() {
        setTest();
        GetDeviceChannelV2Request request = new GetDeviceChannelV2Request();
        request.setDeviceID("34571879-8fc2-433d-9ad0-ee1d71bf16b6");
        try {
            GetDeviceChannelV2Response resp = videoAIoTService.getDeviceChannelsV2(request);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }

        request.setQueryMode(GetDeviceChannelV2Request.QueryMode.BRIEF);
        try {
            GetDeviceChannelV2Response resp = videoAIoTService.getDeviceChannelsV2(request);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testCreateRecordPlan() {
        setTest();
        CreateRecordPlanRequest createRecordPlanRequest = new CreateRecordPlanRequest();
        createRecordPlanRequest.setPlanName("test-plan");
        createRecordPlanRequest.setBindTemplate("0609aef4-eb80-41c7-9858-48347d8d4904");
        createRecordPlanRequest.setBindStreams(new ArrayList<String>() {
            {
                add("7f2f1b54-2714-4f66-ae78-cd477ab0b68b");
            }
        });
        createRecordPlanRequest.setDescription("javasdktest");
        createRecordPlanRequest.setStatus("enabled");
        try {
            IDResponse recordPlan = videoAIoTService.createRecordPlan(createRecordPlanRequest);
            System.out.println(recordPlan);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testGetRecordPlan() {
        String planID = "";
        try {
            RecordPlanResponse recordPlan = videoAIoTService.getRecordPlan(planID);
            System.out.println(JSON.toJSONString(recordPlan));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public void testUpdateRecordPlan() {
        setTest();
        UpdateRecordPlanRequest updateRecordPlanRequest = new UpdateRecordPlanRequest();
        updateRecordPlanRequest.setPlanName("sdk-update");
        updateRecordPlanRequest.setPlanID("2f11a13a-038f-445a-800e-03572ec542e3");
        updateRecordPlanRequest.setBindTemplate("a87c5902-453a-4cb1-a4e2-87171b2c25bd");
        updateRecordPlanRequest.setStatus("enabled");
        UpdateRecordPlanRequest.ModifyList delList = new UpdateRecordPlanRequest.ModifyList();
        delList.setStreams(new ArrayList<String>() {
            {
                add("7f2f1b54-2714-4f66-ae78-cd477ab0b68b");
            }
        });
        updateRecordPlanRequest.setDelList(delList);
        UpdateRecordPlanRequest.ModifyList addList = new UpdateRecordPlanRequest.ModifyList();
        addList.setStreams(new ArrayList<String>() {
            {
                add("3e088b33-4e28-4af3-a6f1-daff5a8a7bab");
            }
        });
        updateRecordPlanRequest.setAddList(addList);
        try {
            IDResponse recordPlan = videoAIoTService.updateRecordPlan(updateRecordPlanRequest);
            System.out.println(JSON.toJSONString(recordPlan));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testListRecordPlan() {
        setTest();
        ListRecordPlansRequest listRecordPlansRequest = new ListRecordPlansRequest();
        listRecordPlansRequest.setFilterName("test");
        try {
            ListRecordPlansResponse recordPlan = videoAIoTService.listRecordPlans(listRecordPlansRequest);
            System.out.println(JSON.toJSONString(recordPlan));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testListRecordPlanChannel() {
        setTest();
        String planID = "f4aaa8ec-cab4-4120-95cd-5be2cfb9bf1a";
        try {
            ListRecordPlanChannelsResponse recordPlan = videoAIoTService.listRecordPlanChannels(planID);
            System.out.println(JSON.toJSONString(recordPlan));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testDeleteRecordPlan() {
        setTest();
        try {
            IDResponse recordPlan = videoAIoTService.deleteRecordPlan("2f11a13a-038f-445a-800e-03572ec542e3");
            System.out.println(JSON.toJSONString(recordPlan));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testStartStream() {
        setTest();
        StreamRequest streamRequest = new StreamRequest();
        streamRequest.setStreamID("c0856536-3ac6-4191-9dec-96d0b08cd954");
        try {
            StartStreamResponse startStreamResponse = videoAIoTService.startStream(streamRequest);
            System.out.println(JSON.toJSONString(startStreamResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void setTest(){
        final String accessKey = "ak";
        final String secretKey = "sk";
        videoAIoTService.setAccessKey(accessKey);
        videoAIoTService.setSecretKey(secretKey);
    }
}
