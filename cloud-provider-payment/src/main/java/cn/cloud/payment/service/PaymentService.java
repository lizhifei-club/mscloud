package cn.cloud.payment.service;


import cn.cloud.commons.model.ResponseEntity;
import cn.cloud.payment.entity.Payment;

/**
 * @author: lzf
 * @date: 2020/7/2
 * @Description:
 */
public interface PaymentService {

    ResponseEntity<Payment> queryPayments();
}
