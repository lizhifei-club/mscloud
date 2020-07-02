package cn.cloud.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author: lzf
 * @date: 2020/7/3
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<T> implements Serializable {

    private Integer pageNum;
    private Integer pageSize;
    private List<T> data;
}
