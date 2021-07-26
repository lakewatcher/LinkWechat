package com.linkwechat.wecom.client;

import com.dtflys.forest.annotation.*;
import com.linkwechat.wecom.domain.dto.WeAppDetailDto;
import com.linkwechat.wecom.domain.dto.WeAppDto;
import com.linkwechat.wecom.domain.dto.WeResultDto;
import com.linkwechat.wecom.interceptor.WeAccessTokenInterceptor;

/**
 * 应用管理相关接口
 */
@BaseRequest(baseURL = "${weComServerUrl}${weComePrefix}", interceptor = WeAccessTokenInterceptor.class)
public interface WeAppClient {

    /**
     * 获取企业应用列表
     * @return
     */
    @Request(url = "/agent/list")
    WeAppDto  findAgentList();

    /**
     * 根据应用id获取应用详情
     * @param agentid
     * @return
     */
    @Request(url = "/agent/get")
    WeAppDetailDto  findAgentById(@Query("agentid") String agentid);

    /**
     * 设置应用
     * @param weAppDetailDto
     * @return
     */
    @Request(url = "/agent/set",type = "POST")
    WeResultDto updateAgentById(@DataObject WeAppDetailDto weAppDetailDto,@Header("agentid")String agentid);
}