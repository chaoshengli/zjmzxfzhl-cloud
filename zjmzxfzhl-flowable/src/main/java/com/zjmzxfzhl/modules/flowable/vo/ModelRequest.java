package com.zjmzxfzhl.modules.flowable.vo;

import lombok.Data;

/**
 * @author 庄金明
 * @date 2020年8月30日
 */
@Data
public class ModelRequest {
    private String id;
    private String key;
    private String name;
    private String category;
    private String description;
    private String tenantId;
    private String editor;
    private boolean newVersion;
    private boolean cascade;
}
