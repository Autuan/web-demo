package com.autuan.webdemo.project.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author : Autuan.Yu
 * @description :  描述
 * @remark : 备注
 * @date : 2020/9/26 16:42
 * @company : 上海奥若拉信息科技集团有限公司
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReqVO {
    private String reqId;
    private List<String> reqList;
}
