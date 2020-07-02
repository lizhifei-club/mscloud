package cn.cloud.payment.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: lzf
 * @date: 2020/7/2
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Payment",description = "支付")
public class Payment implements Serializable {
    @ApiModelProperty(value = "主键id",dataType = "Long",required = true)
    private Long id;

    @ApiModelProperty(value = "流水号",dataType = "String",required = false)
    private String serial;
}
