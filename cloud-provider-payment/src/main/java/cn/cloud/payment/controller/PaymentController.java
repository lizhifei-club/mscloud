package cn.cloud.payment.controller;

import cn.cloud.commons.model.ResponseEntity;
import cn.cloud.payment.entity.Payment;
import cn.cloud.payment.service.PaymentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: lzf
 * @date:   2020/7/1
 * @Description:
 */
@RestController
@RequestMapping("/pay")
@Api(value = "支付rest",tags = "支付rest")
public class PaymentController{

    @Resource
    private PaymentService paymentService;

    @GetMapping("/queryPayments")
    @ApiOperation(value = "查询支付列表")
    public ResponseEntity<Payment> queryPayments(){
        return paymentService.queryPayments();
    }
}
