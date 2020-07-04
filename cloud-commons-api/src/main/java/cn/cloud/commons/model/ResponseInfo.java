package cn.cloud.commons.model;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: lzf
 * @date: 2020/7/4
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ResponseInfo",description = "返回Object信息")
public class ResponseInfo implements Serializable {

    private int code;
    private String msg;
    private Object data;
}
