package com.linkwechat.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.linkwechat.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * 短链通用统计表(WeCommonLinkStat)
 *
 * @author danmo
 * @since 2023-07-18 13:34:19
 */
@ApiModel
@Data
@SuppressWarnings("serial")
@TableName("we_common_link_stat")
public class WeCommonLinkStat extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L; //1

    /**
     * 主键ID
     */
    @ApiModelProperty(value = "主键ID")
    @TableId(type = IdType.AUTO)
    @TableField("id")
    private Long id;


    /**
     * 短链ID
     */
    @ApiModelProperty(value = "短链ID")
    @TableField("short_id")
    private Long shortId;


    /**
     * 日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @ApiModelProperty(value = "日期")
    @TableField("date_time")
    private Date dateTime;


    /**
     * 链接渠道
     */
    @ApiModelProperty(value = "链接渠道")
    @TableField("type")
    private String type;


    /**
     * PV数量
     */
    @ApiModelProperty(value = "PV数量")
    @TableField("pv_num")
    private Integer pvNum;


    /**
     * UV数量
     */
    @ApiModelProperty(value = "UV数量")
    @TableField("uv_num")
    private Integer uvNum;


    /**
     * 打开小程序数量
     */
    @ApiModelProperty(value = "打开小程序数量")
    @TableField("open_num")
    private Integer openNum;


    /**
     * 备用
     */
    @ApiModelProperty(value = "备用")
    @TableField("remark")
    private String remark;

    /**
     * 删除标识 0正常 1 删除
     */
    @ApiModelProperty(value = "删除标识 0正常 1 删除")
    @TableField("del_flg")
    private Integer delFlg;
}
