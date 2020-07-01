package model;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: lzf
 * @date:   2020/7/1
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ReponseInfo",description = "返回Object信息")
public class ReponseInfo implements Serializable {

    private int code;

    private String msg;

    private Object data;

}
