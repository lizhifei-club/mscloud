package cn.cloud.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: lzf
 * @date: 2020/7/1
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestInfo implements Serializable {

    private String userId;

    private Integer pageNum;

    private Integer pageSize;
}
