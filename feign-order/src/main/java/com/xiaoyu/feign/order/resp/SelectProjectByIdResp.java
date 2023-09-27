package com.xiaoyu.feign.order.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectProjectByIdResp", description = "根据主键查询团购项目请求接口返回实体类")
public class SelectProjectByIdResp extends BaseRespBean {
    private static final long serialVersionUID = 9111706892590639148L;

    @ApiModelProperty(value = "主键", name = "zj")
    private Long zj;

    @ApiModelProperty(value = "项目名称", name = "name")
    private String name;

    @ApiModelProperty(value = "摘要", name = "summary")
    private String summary;

    @ApiModelProperty(value = "描述", name = "describe" )
    private String describe;

    @ApiModelProperty(value = "是否限购（1 限购 2 不限购）", name = "quota")
    private String quota;

    @ApiModelProperty(value = "最大购买数量", name = "max")
    private String max;

    @ApiModelProperty(value = "商品单价", name = "number")
    private String number;

    @ApiModelProperty(value = "当前状态（1 启用 2 停用）", name = "status")
    private String status;

    @ApiModelProperty(value = "发布时间", name = "releaseDate")
    private String releaseDate;

    @ApiModelProperty(value = "团购项目附件", name = "body")
    private List<ProjectEnclosureData> body;

}