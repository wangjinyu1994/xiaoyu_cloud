package com.xiaoyu.feign.user.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddNoticEnclosure", description = "添加消息通知附件请求接口请求实体类")
public class AddNoticEnclosure implements Serializable {
    private static final long serialVersionUID = -1881618013388382366L;

    @ApiModelProperty(value = "标题", name = "title")
    private String title;

    @ApiModelProperty(value = "大小", name = "ram")
    private String ram;

    @ApiModelProperty(value = "地址", name = "address")
    private String address;

}
