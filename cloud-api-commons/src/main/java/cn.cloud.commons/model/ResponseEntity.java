package cn.cloud.commons.model;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author: lzf
 * @date:   2020/7/1
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ResponseEntity",description = "返实体信息")
public class ResponseEntity<T> implements Serializable {

    private int code;

    private String msg;

    private List<T> data;
}
