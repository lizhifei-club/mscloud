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
@ApiModel(value = "PageResult",description = "返回data信息")
public class PageResult<T> implements Serializable {
    private Integer pageNum;

    private Integer pageSize;

    private Integer total;

    private List<T> list;
}
