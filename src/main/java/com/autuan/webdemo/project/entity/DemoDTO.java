package com.autuan.webdemo.project.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @description: DemoDTO
 * @author: Autuan.Yu
 * @create: 2020/10/09 19:46
 * @copyright: Toplist
 */
@Data
@Builder
public class DemoDTO {
    private String msg;
    private String name;
    private Boolean bool;
}
