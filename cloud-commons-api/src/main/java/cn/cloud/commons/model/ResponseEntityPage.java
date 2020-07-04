package cn.cloud.commons.model;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: lzf
 * @date: 2020/7/3
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ResponseEntityPage",description = "返回分页信息")
public class ResponseEntityPage<T> implements Serializable {

    private int code;
    private String msg;
    private PageResult<T> data;
}
