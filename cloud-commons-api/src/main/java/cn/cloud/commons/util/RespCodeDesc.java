package cn.cloud.commons.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author: lzf
 * @date: 2020/7/3
 * @Description:
 */
@Getter
@AllArgsConstructor
public enum RespCodeDesc {

    querySuccess(200,"查询成功"),
    queryError(-1,"查询失败"),
    operationSuccess(200,"操作成功"),
    operationError(-1,"操作失败");

    private int code;
    private String desc;
}
