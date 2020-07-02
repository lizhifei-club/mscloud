package cn.cloud.payment.dao;

import cn.cloud.payment.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: lzf
 * @date: 2020/7/2
 * @Description:
 */
@Mapper
public interface PaymentDao {

    @Select("select * from payment")
    List<Payment> queryPayments();
}
