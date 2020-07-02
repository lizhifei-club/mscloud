package cn.cloud.payment.service.impl;

import cn.cloud.commons.model.ResponseEntity;
import cn.cloud.commons.util.RespCodeDesc;
import cn.cloud.payment.dao.PaymentDao;
import cn.cloud.payment.entity.Payment;
import cn.cloud.payment.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: lzf
 * @date: 2020/7/2
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;


    public ResponseEntity<Payment> queryPayments() {
        ResponseEntity<Payment> res=new ResponseEntity<Payment>();
        List<Payment> list=paymentDao.queryPayments();
        res.setCode(RespCodeDesc.querySuccess.getCode());
        res.setMsg(RespCodeDesc.querySuccess.getDesc());
        res.setData(list);
        return res;
    }
}
