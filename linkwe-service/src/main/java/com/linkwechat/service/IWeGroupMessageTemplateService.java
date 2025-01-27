package com.linkwechat.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.linkwechat.domain.WeGroupMessageAttachments;
import com.linkwechat.domain.WeGroupMessageSendResult;
import com.linkwechat.domain.WeGroupMessageTask;
import com.linkwechat.domain.WeGroupMessageTemplate;
import com.linkwechat.domain.groupmsg.query.WeAddGroupMessageQuery;
import com.linkwechat.domain.groupmsg.vo.WeGroupMessageDetailVo;

import java.util.List;
import java.util.Map;

/**
 * 群发消息模板(WeGroupMessageTemplate)
 *
 * @author danmo
 * @since 2022-04-06 22:29:06
 */
public interface IWeGroupMessageTemplateService extends IService<WeGroupMessageTemplate> {

    /**
     * 查询列表
     */
    List<WeGroupMessageTemplate> queryList(WeGroupMessageTemplate weGroupMessageTemplate);

    /**
     * 获取群发消息详情
     * @param id 模板id
     * @return
     */
    WeGroupMessageDetailVo getGroupMsgTemplateDetail(Long id);

    /**
     * 创建群发消息
     * @param query
     */
    void addGroupMsgTemplate(WeAddGroupMessageQuery query);

    /**
     * 取消定时发送
     * @param asList
     */
    void cancelByIds(List<Long> asList);

    /**
     * 同步消息发送结果
     * @param asList
     */
    void syncGroupMsgSendResultByIds(List<Long> asList);



    /**
     * 群发成员发送任务列表
     * @param task
     */
    List<WeGroupMessageTask> groupMsgTaskList(WeGroupMessageTask task);

    /**
     * 企业群发成员执行结果
     * @param sendResult
     */
    List<WeGroupMessageSendResult> groupMsgSendResultList(WeGroupMessageSendResult sendResult);

    /**
     * 群发消息处理
     * @param query
     */
    void groupMessageTaskHandler(WeAddGroupMessageQuery query);


    /**
     * 通过业务ID查询模板信息
     * @param businessIds 业务ID
     * @param source 来源
     */
    List<WeGroupMessageTemplate> getGroupMsgTemplateByBid(List<Long> businessIds, int source);

    /**
     * 通过业务ID查询发送结果
     * @param businessIds 业务ID
     * @param source 来源
     */
    Map<Long,List<WeGroupMessageSendResult>> getGroupMsgSendResultByBid(List<Long> businessIds, Integer source);

    /**
     * 通过业务ID查询发送附件
     * @param businessIds
     * @param source
     */
    List<WeGroupMessageAttachments>  getGroupMsgAttachmentsByBid(Long businessIds, Integer source);

    void syncGroupMsgSendResultByBids(List<Long> businessIds, Integer source);
}
