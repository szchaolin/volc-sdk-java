
// Code generated by protoc-gen-volcengine-sdk
// source: vod/service/service_vod.proto
// DO NOT EDIT!

package com.volcengine.service.vod;

/**
 * The interface Vod service.
 */
public interface IVodService extends com.volcengine.service.IBaseService {
     
    /**
	 * Gets private drm auth token.
	 *
	 * @param input the params
	 * @param expireSeconds the params
	 * @return the private drm auth token
	 * @throws Exception the exception
	 */
	String getPrivateDrmAuthToken(com.volcengine.service.vod.model.request.VodGetPrivateDrmPlayAuthRequest input, Long expireSeconds) throws Exception;
    
    /**
     * Gets hls auth token.
     *
     * @param expireSeconds the params
     * @return the hls auth token
     * @throws Exception the exception
     */
    String createSha1HlsDrmAuthToken(Long expireSeconds) throws Exception;

    /**
     * Gets subtitle auth token.
     *
     * @param input the params
     * @return the play auth token
     * @throws Exception the exception
     */
    String getSubtitleAuthToken(com.volcengine.service.vod.model.request.VodGetSubtitleInfoListRequest input, Long expireSeconds) throws Exception;
	
    /**
     * Gets play auth token.
     *
     * @param input the params
     * @return the play auth token
     * @throws Exception the exception
     */
    String getPlayAuthToken(com.volcengine.service.vod.model.request.VodGetPlayInfoRequest input, Long expireSeconds) throws Exception;

    /**
     * Get Upload Sts2 token.
     *
     * @return com.volcengine.model.sts2.SecurityToken2
     * @throws Exception the exception
     */
    com.volcengine.model.sts2.SecurityToken2 getUploadSts2() throws Exception;

    /**
     * Get Upload Sts2 token with expired time.
     *
     * @param expire long
     * @return com.volcengine.model.sts2.SecurityToken2
     * @throws Exception the exception
     */
    com.volcengine.model.sts2.SecurityToken2 getUploadSts2WithExpire(long expire) throws Exception;

    /**
     * uploadMedia
     *
     * @param vodUploadMediaRequest com.volcengine.service.vod.model.request.VodUploadMediaRequest
     * @return com.volcengine.service.vod.model.response.VodCommitUploadInfoResponse
     * @throws Exception the exception
     */
    com.volcengine.service.vod.model.response.VodCommitUploadInfoResponse uploadMedia(com.volcengine.service.vod.model.request.VodUploadMediaRequest vodUploadMediaRequest) throws Exception;

    /**
	 * uploadMaterial
	 *
	 * @param vodUploadMaterialRequest
	 * @return
	 * @throws Exception
	 */
	com.volcengine.service.vod.model.response.VodCommitUploadInfoResponse uploadMaterial(com.volcengine.service.vod.model.request.VodUploadMaterialRequest vodUploadMaterialRequest) throws Exception;

	/**
    * submitDirectEditTaskAsync.
    *
    * @param input com.volcengine.service.vod.model.request.VodSubmitDirectEditTaskAsyncRequest
    * @return com.volcengine.service.vod.model.response.VodSubmitDirectEditTaskAsyncResponse
    * @throws Exception the exception
    */
    com.volcengine.service.vod.model.response.VodSubmitDirectEditTaskAsyncResponse submitDirectEditTaskAsync(com.volcengine.service.vod.model.request.VodSubmitDirectEditTaskAsyncRequest input) throws Exception;

    /**
    * getDirectEditResult.
    *
    * @param input com.volcengine.service.vod.model.request.VodGetDirectEditResultRequest
    * @return com.volcengine.service.vod.model.response.VodGetDirectEditResultResponse
    * @throws Exception the exception
    */
    com.volcengine.service.vod.model.response.VodGetDirectEditResultResponse getDirectEditResult(com.volcengine.service.vod.model.request.VodGetDirectEditResultRequest input) throws Exception;
    
    /**
    * getDirectEditProgress.
    *
    * @param input com.volcengine.service.vod.model.request.VodGetDirectEditProgressRequest
    * @return com.volcengine.service.vod.model.response.VodGetDirectEditProgressResponse
    * @throws Exception the exception
    */
    com.volcengine.service.vod.model.response.VodGetDirectEditProgressResponse getDirectEditProgress(com.volcengine.service.vod.model.request.VodGetDirectEditProgressRequest input) throws Exception;



	/**
     * getAllPlayInfo.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetAllPlayInfoRequest
     * @return com.volcengine.service.vod.model.response.VodGetAllPlayInfoResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetAllPlayInfoResponse getAllPlayInfo(com.volcengine.service.vod.model.request.VodGetAllPlayInfoRequest input) throws Exception;
	
	/**
     * getPlayInfo.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetPlayInfoRequest
     * @return com.volcengine.service.vod.model.response.VodGetPlayInfoResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetPlayInfoResponse getPlayInfo(com.volcengine.service.vod.model.request.VodGetPlayInfoRequest input) throws Exception;
	
	/**
     * getPrivateDrmPlayAuth.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetPrivateDrmPlayAuthRequest
     * @return com.volcengine.service.vod.model.response.VodGetPrivateDrmPlayAuthResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetPrivateDrmPlayAuthResponse getPrivateDrmPlayAuth(com.volcengine.service.vod.model.request.VodGetPrivateDrmPlayAuthRequest input) throws Exception;
	
	/**
     * getHlsDecryptionKey.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetHlsDecryptionKeyRequest
     * @return com.volcengine.service.vod.model.response.VodGetHlsDecryptionKeyResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetHlsDecryptionKeyResponse getHlsDecryptionKey(com.volcengine.service.vod.model.request.VodGetHlsDecryptionKeyRequest input) throws Exception;
	
	/**
     * getPlayInfoWithLiveTimeShiftScene.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest
     * @return com.volcengine.service.vod.model.response.VodGetPlayInfoWithLiveTimeShiftSceneResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetPlayInfoWithLiveTimeShiftSceneResponse getPlayInfoWithLiveTimeShiftScene(com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest input) throws Exception;
	
	/**
     * uploadMediaByUrl.
     *
     * @param input com.volcengine.service.vod.model.request.VodUrlUploadRequest
     * @return com.volcengine.service.vod.model.response.VodUrlUploadResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodUrlUploadResponse uploadMediaByUrl(com.volcengine.service.vod.model.request.VodUrlUploadRequest input) throws Exception;
	
	/**
     * queryUploadTaskInfo.
     *
     * @param input com.volcengine.service.vod.model.request.VodQueryUploadTaskInfoRequest
     * @return com.volcengine.service.vod.model.response.VodQueryUploadTaskInfoResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodQueryUploadTaskInfoResponse queryUploadTaskInfo(com.volcengine.service.vod.model.request.VodQueryUploadTaskInfoRequest input) throws Exception;
	
	/**
     * applyUploadInfo.
     *
     * @param input com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest
     * @return com.volcengine.service.vod.model.response.VodApplyUploadInfoResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodApplyUploadInfoResponse applyUploadInfo(com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest input) throws Exception;
	
	/**
     * commitUploadInfo.
     *
     * @param input com.volcengine.service.vod.model.request.VodCommitUploadInfoRequest
     * @return com.volcengine.service.vod.model.response.VodCommitUploadInfoResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodCommitUploadInfoResponse commitUploadInfo(com.volcengine.service.vod.model.request.VodCommitUploadInfoRequest input) throws Exception;
	
	/**
     * updateMediaInfo.
     *
     * @param input com.volcengine.service.vod.model.request.VodUpdateMediaInfoRequest
     * @return com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse updateMediaInfo(com.volcengine.service.vod.model.request.VodUpdateMediaInfoRequest input) throws Exception;
	
	/**
     * updateMediaPublishStatus.
     *
     * @param input com.volcengine.service.vod.model.request.VodUpdateMediaPublishStatusRequest
     * @return com.volcengine.service.vod.model.response.VodUpdateMediaPublishStatusResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodUpdateMediaPublishStatusResponse updateMediaPublishStatus(com.volcengine.service.vod.model.request.VodUpdateMediaPublishStatusRequest input) throws Exception;
	
	/**
     * getMediaInfos.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetMediaInfosRequest
     * @return com.volcengine.service.vod.model.response.VodGetMediaInfosResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetMediaInfosResponse getMediaInfos(com.volcengine.service.vod.model.request.VodGetMediaInfosRequest input) throws Exception;
	
	/**
     * getRecommendedPoster.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetRecommendedPosterRequest
     * @return com.volcengine.service.vod.model.response.VodGetRecommendedPosterResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetRecommendedPosterResponse getRecommendedPoster(com.volcengine.service.vod.model.request.VodGetRecommendedPosterRequest input) throws Exception;
	
	/**
     * deleteMedia.
     *
     * @param input com.volcengine.service.vod.model.request.VodDeleteMediaRequest
     * @return com.volcengine.service.vod.model.response.VodDeleteMediaResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodDeleteMediaResponse deleteMedia(com.volcengine.service.vod.model.request.VodDeleteMediaRequest input) throws Exception;
	
	/**
     * deleteTranscodes.
     *
     * @param input com.volcengine.service.vod.model.request.VodDeleteTranscodesRequest
     * @return com.volcengine.service.vod.model.response.VodDeleteTranscodesResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodDeleteTranscodesResponse deleteTranscodes(com.volcengine.service.vod.model.request.VodDeleteTranscodesRequest input) throws Exception;
	
	/**
     * getMediaList.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetMediaListRequest
     * @return com.volcengine.service.vod.model.response.VodGetMediaListResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetMediaListResponse getMediaList(com.volcengine.service.vod.model.request.VodGetMediaListRequest input) throws Exception;
	
	/**
     * getSubtitleInfoList.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetSubtitleInfoListRequest
     * @return com.volcengine.service.vod.model.response.VodGetSubtitleInfoListResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetSubtitleInfoListResponse getSubtitleInfoList(com.volcengine.service.vod.model.request.VodGetSubtitleInfoListRequest input) throws Exception;
	
	/**
     * updateSubtitleStatus.
     *
     * @param input com.volcengine.service.vod.model.request.VodUpdateSubtitleStatusRequest
     * @return com.volcengine.service.vod.model.response.VodUpdateSubtitleStatusResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodUpdateSubtitleStatusResponse updateSubtitleStatus(com.volcengine.service.vod.model.request.VodUpdateSubtitleStatusRequest input) throws Exception;
	
	/**
     * updateSubtitleInfo.
     *
     * @param input com.volcengine.service.vod.model.request.VodUpdateSubtitleInfoRequest
     * @return com.volcengine.service.vod.model.response.VodUpdateSubtitleInfoResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodUpdateSubtitleInfoResponse updateSubtitleInfo(com.volcengine.service.vod.model.request.VodUpdateSubtitleInfoRequest input) throws Exception;
	
	/**
     * getAuditFramesForAudit.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetAuditFramesForAuditRequest
     * @return com.volcengine.service.vod.model.response.VodGetAuditFramesForAuditResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetAuditFramesForAuditResponse getAuditFramesForAudit(com.volcengine.service.vod.model.request.VodGetAuditFramesForAuditRequest input) throws Exception;
	
	/**
     * getMLFramesForAudit.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetMLFramesForAuditRequest
     * @return com.volcengine.service.vod.model.response.VodGetMLFramesForAuditResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetMLFramesForAuditResponse getMLFramesForAudit(com.volcengine.service.vod.model.request.VodGetMLFramesForAuditRequest input) throws Exception;
	
	/**
     * getBetterFramesForAudit.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetBetterFramesForAuditRequest
     * @return com.volcengine.service.vod.model.response.VodGetBetterFramesForAuditResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetBetterFramesForAuditResponse getBetterFramesForAudit(com.volcengine.service.vod.model.request.VodGetBetterFramesForAuditRequest input) throws Exception;
	
	/**
     * getAudioInfoForAudit.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetAudioInfoForAuditRequest
     * @return com.volcengine.service.vod.model.response.VodGetAudioInfoForAuditResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetAudioInfoForAuditResponse getAudioInfoForAudit(com.volcengine.service.vod.model.request.VodGetAudioInfoForAuditRequest input) throws Exception;
	
	/**
     * getAutomaticSpeechRecognitionForAudit.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest
     * @return com.volcengine.service.vod.model.response.VodGetAutomaticSpeechRecognitionForAuditResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetAutomaticSpeechRecognitionForAuditResponse getAutomaticSpeechRecognitionForAudit(com.volcengine.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest input) throws Exception;
	
	/**
     * getAudioEventDetectionForAudit.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetAudioEventDetectionForAuditRequest
     * @return com.volcengine.service.vod.model.response.VodGetAudioEventDetectionForAuditResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetAudioEventDetectionForAuditResponse getAudioEventDetectionForAudit(com.volcengine.service.vod.model.request.VodGetAudioEventDetectionForAuditRequest input) throws Exception;
	
	/**
     * createVideoClassification.
     *
     * @param input com.volcengine.service.vod.model.request.VodCreateVideoClassificationRequest
     * @return com.volcengine.service.vod.model.response.VodCreateVideoClassificationResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodCreateVideoClassificationResponse createVideoClassification(com.volcengine.service.vod.model.request.VodCreateVideoClassificationRequest input) throws Exception;
	
	/**
     * updateVideoClassification.
     *
     * @param input com.volcengine.service.vod.model.request.VodUpdateVideoClassificationRequest
     * @return com.volcengine.service.vod.model.response.VodUpdateVideoClassificationResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodUpdateVideoClassificationResponse updateVideoClassification(com.volcengine.service.vod.model.request.VodUpdateVideoClassificationRequest input) throws Exception;
	
	/**
     * deleteVideoClassification.
     *
     * @param input com.volcengine.service.vod.model.request.VodDeleteVideoClassificationRequest
     * @return com.volcengine.service.vod.model.response.VodDeleteVideoClassificationResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodDeleteVideoClassificationResponse deleteVideoClassification(com.volcengine.service.vod.model.request.VodDeleteVideoClassificationRequest input) throws Exception;
	
	/**
     * listVideoClassifications.
     *
     * @param input com.volcengine.service.vod.model.request.VodListVideoClassificationsRequest
     * @return com.volcengine.service.vod.model.response.VodListVideoClassificationsResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodListVideoClassificationsResponse listVideoClassifications(com.volcengine.service.vod.model.request.VodListVideoClassificationsRequest input) throws Exception;
	
	/**
     * listSnapshots.
     *
     * @param input com.volcengine.service.vod.model.request.VodListSnapshotsRequest
     * @return com.volcengine.service.vod.model.response.VodListSnapshotsResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodListSnapshotsResponse listSnapshots(com.volcengine.service.vod.model.request.VodListSnapshotsRequest input) throws Exception;
	
	/**
     * startWorkflow.
     *
     * @param input com.volcengine.service.vod.model.request.VodStartWorkflowRequest
     * @return com.volcengine.service.vod.model.response.VodStartWorkflowResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodStartWorkflowResponse startWorkflow(com.volcengine.service.vod.model.request.VodStartWorkflowRequest input) throws Exception;
	
	/**
     * retrieveTranscodeResult.
     *
     * @param input com.volcengine.service.vod.model.request.VodRetrieveTranscodeResultRequest
     * @return com.volcengine.service.vod.model.response.VodRetrieveTranscodeResultResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodRetrieveTranscodeResultResponse retrieveTranscodeResult(com.volcengine.service.vod.model.request.VodRetrieveTranscodeResultRequest input) throws Exception;
	
	/**
     * GetWorkflowExecution.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetWorkflowExecutionStatusRequest
     * @return com.volcengine.service.vod.model.response.VodGetWorkflowExecutionStatusResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetWorkflowExecutionStatusResponse GetWorkflowExecution(com.volcengine.service.vod.model.request.VodGetWorkflowExecutionStatusRequest input) throws Exception;
	
	/**
     * createSpace.
     *
     * @param input com.volcengine.service.vod.model.request.VodCreateSpaceRequest
     * @return com.volcengine.service.vod.model.response.VodCreateSpaceResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodCreateSpaceResponse createSpace(com.volcengine.service.vod.model.request.VodCreateSpaceRequest input) throws Exception;
	
	/**
     * listSpace.
     *
     * @param input com.volcengine.service.vod.model.request.VodListSpaceRequest
     * @return com.volcengine.service.vod.model.response.VodListSpaceResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodListSpaceResponse listSpace(com.volcengine.service.vod.model.request.VodListSpaceRequest input) throws Exception;
	
	/**
     * getSpaceDetail.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetSpaceDetailRequest
     * @return com.volcengine.service.vod.model.response.VodGetSpaceDetailResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetSpaceDetailResponse getSpaceDetail(com.volcengine.service.vod.model.request.VodGetSpaceDetailRequest input) throws Exception;
	
	/**
     * updateSpace.
     *
     * @param input com.volcengine.service.vod.model.request.VodUpdateSpaceRequest
     * @return com.volcengine.service.vod.model.response.VodUpdateSpaceResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodUpdateSpaceResponse updateSpace(com.volcengine.service.vod.model.request.VodUpdateSpaceRequest input) throws Exception;
	
	/**
     * updateSpaceUploadConfig.
     *
     * @param input com.volcengine.service.vod.model.request.VodUpdateSpaceUploadConfigRequest
     * @return com.volcengine.service.vod.model.response.VodUpdateSpaceUploadConfigResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodUpdateSpaceUploadConfigResponse updateSpaceUploadConfig(com.volcengine.service.vod.model.request.VodUpdateSpaceUploadConfigRequest input) throws Exception;
	
	/**
     * describeVodSpaceStorageData.
     *
     * @param input com.volcengine.service.vod.model.request.VodDescribeVodSpaceStorageDataRequest
     * @return com.volcengine.service.vod.model.response.VodDescribeVodSpaceStorageDataResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodDescribeVodSpaceStorageDataResponse describeVodSpaceStorageData(com.volcengine.service.vod.model.request.VodDescribeVodSpaceStorageDataRequest input) throws Exception;
	
	/**
     * listDomain.
     *
     * @param input com.volcengine.service.vod.model.request.VodListDomainRequest
     * @return com.volcengine.service.vod.model.response.VodListDomainResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodListDomainResponse listDomain(com.volcengine.service.vod.model.request.VodListDomainRequest input) throws Exception;
	
	/**
     * createCdnRefreshTask.
     *
     * @param input com.volcengine.service.vod.model.request.VodCreateCdnRefreshTaskRequest
     * @return com.volcengine.service.vod.model.response.VodCreateCdnRefreshTaskResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodCreateCdnRefreshTaskResponse createCdnRefreshTask(com.volcengine.service.vod.model.request.VodCreateCdnRefreshTaskRequest input) throws Exception;
	
	/**
     * createCdnPreloadTask.
     *
     * @param input com.volcengine.service.vod.model.request.VodCreateCdnPreloadTaskRequest
     * @return com.volcengine.service.vod.model.response.VodCreateCdnPreloadTaskResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodCreateCdnPreloadTaskResponse createCdnPreloadTask(com.volcengine.service.vod.model.request.VodCreateCdnPreloadTaskRequest input) throws Exception;
	
	/**
     * listCdnTasks.
     *
     * @param input com.volcengine.service.vod.model.request.VodListCdnTasksRequest
     * @return com.volcengine.service.vod.model.response.VodListCdnTasksResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodListCdnTasksResponse listCdnTasks(com.volcengine.service.vod.model.request.VodListCdnTasksRequest input) throws Exception;
	
	/**
     * listCdnAccessLog.
     *
     * @param input com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest
     * @return com.volcengine.service.vod.model.response.VodListCdnAccessLogResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodListCdnAccessLogResponse listCdnAccessLog(com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest input) throws Exception;
	
	/**
     * listCdnTopAccessUrl.
     *
     * @param input com.volcengine.service.vod.model.request.VodListCdnTopAccessUrlRequest
     * @return com.volcengine.service.vod.model.response.VodListCdnTopAccessUrlResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodListCdnTopAccessUrlResponse listCdnTopAccessUrl(com.volcengine.service.vod.model.request.VodListCdnTopAccessUrlRequest input) throws Exception;
	
	/**
     * describeVodDomainBandwidthData.
     *
     * @param input com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest
     * @return com.volcengine.service.vod.model.response.VodDescribeVodDomainBandwidthDataResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodDescribeVodDomainBandwidthDataResponse describeVodDomainBandwidthData(com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest input) throws Exception;
	
	/**
     * listCdnUsageData.
     *
     * @param input com.volcengine.service.vod.model.request.VodListCdnUsageDataRequest
     * @return com.volcengine.service.vod.model.response.VodCdnStatisticsCommonResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodCdnStatisticsCommonResponse listCdnUsageData(com.volcengine.service.vod.model.request.VodListCdnUsageDataRequest input) throws Exception;
	
	/**
     * listCdnStatusData.
     *
     * @param input com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest
     * @return com.volcengine.service.vod.model.response.VodCdnStatisticsCommonResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodCdnStatisticsCommonResponse listCdnStatusData(com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest input) throws Exception;
	
	/**
     * describeIpInfo.
     *
     * @param input com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest
     * @return com.volcengine.service.vod.model.response.VodDescribeIPInfoResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodDescribeIPInfoResponse describeIpInfo(com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest input) throws Exception;
	
	/**
     * describeVodDomainTrafficData.
     *
     * @param input com.volcengine.service.vod.model.request.VodDescribeVodDomainTrafficDataRequest
     * @return com.volcengine.service.vod.model.response.VodDescribeVodDomainTrafficDataResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodDescribeVodDomainTrafficDataResponse describeVodDomainTrafficData(com.volcengine.service.vod.model.request.VodDescribeVodDomainTrafficDataRequest input) throws Exception;
	
	/**
     * listCdnPvData.
     *
     * @param input com.volcengine.service.vod.model.request.VodListCdnPvDataRequest
     * @return com.volcengine.service.vod.model.response.VodCdnStatisticsCommonResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodCdnStatisticsCommonResponse listCdnPvData(com.volcengine.service.vod.model.request.VodListCdnPvDataRequest input) throws Exception;
	
	/**
     * addCallbackSubscription.
     *
     * @param input com.volcengine.service.vod.model.request.VodAddCallbackSubscriptionRequest
     * @return com.volcengine.service.vod.model.response.VodAddCallbackSubscriptionResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodAddCallbackSubscriptionResponse addCallbackSubscription(com.volcengine.service.vod.model.request.VodAddCallbackSubscriptionRequest input) throws Exception;
	
	/**
     * setCallbackEvent.
     *
     * @param input com.volcengine.service.vod.model.request.VodSetCallbackEventRequest
     * @return com.volcengine.service.vod.model.response.VodSetCallbackEventResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodSetCallbackEventResponse setCallbackEvent(com.volcengine.service.vod.model.request.VodSetCallbackEventRequest input) throws Exception;
	
	/**
     * getSmartStrategyLitePlayInfo.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetSmartStrategyLitePlayInfoRequest
     * @return com.volcengine.service.vod.model.response.VodGetSmartStrategyLitePlayInfoResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetSmartStrategyLitePlayInfoResponse getSmartStrategyLitePlayInfo(com.volcengine.service.vod.model.request.VodGetSmartStrategyLitePlayInfoRequest input) throws Exception;
	
	/**
     * getAppInfo.
     *
     * @param input com.volcengine.service.vod.model.request.VodGetAppInfoRequest
     * @return com.volcengine.service.vod.model.response.VodGetAppInfoResponse
     * @throws Exception the exception
     */
	com.volcengine.service.vod.model.response.VodGetAppInfoResponse getAppInfo(com.volcengine.service.vod.model.request.VodGetAppInfoRequest input) throws Exception;
	
}  // end of service interface
