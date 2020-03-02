package com.wenyanwen123.buy.dao.learningdb;

import com.wenyanwen123.buy.common.domain.learningdb.SeckillOrderSnapshot;
import com.wenyanwen123.buy.common.domain.learningdb.SeckillOrderSnapshotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SeckillOrderSnapshotMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_seckill_order_snapshot
     *
     * @mbg.generated Sun Mar 01 11:43:37 CST 2020
     */
    long countByExample(SeckillOrderSnapshotExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_seckill_order_snapshot
     *
     * @mbg.generated Sun Mar 01 11:43:37 CST 2020
     */
    int deleteByExample(SeckillOrderSnapshotExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_seckill_order_snapshot
     *
     * @mbg.generated Sun Mar 01 11:43:37 CST 2020
     */
    int deleteByPrimaryKey(Long snapshotId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_seckill_order_snapshot
     *
     * @mbg.generated Sun Mar 01 11:43:37 CST 2020
     */
    int insert(SeckillOrderSnapshot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_seckill_order_snapshot
     *
     * @mbg.generated Sun Mar 01 11:43:37 CST 2020
     */
    int insertSelective(SeckillOrderSnapshot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_seckill_order_snapshot
     *
     * @mbg.generated Sun Mar 01 11:43:37 CST 2020
     */
    List<SeckillOrderSnapshot> selectByExample(SeckillOrderSnapshotExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_seckill_order_snapshot
     *
     * @mbg.generated Sun Mar 01 11:43:37 CST 2020
     */
    SeckillOrderSnapshot selectByPrimaryKey(Long snapshotId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_seckill_order_snapshot
     *
     * @mbg.generated Sun Mar 01 11:43:37 CST 2020
     */
    int updateByExampleSelective(@Param("record") SeckillOrderSnapshot record, @Param("example") SeckillOrderSnapshotExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_seckill_order_snapshot
     *
     * @mbg.generated Sun Mar 01 11:43:37 CST 2020
     */
    int updateByExample(@Param("record") SeckillOrderSnapshot record, @Param("example") SeckillOrderSnapshotExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_seckill_order_snapshot
     *
     * @mbg.generated Sun Mar 01 11:43:37 CST 2020
     */
    int updateByPrimaryKeySelective(SeckillOrderSnapshot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_seckill_order_snapshot
     *
     * @mbg.generated Sun Mar 01 11:43:37 CST 2020
     */
    int updateByPrimaryKey(SeckillOrderSnapshot record);

    /**
     * @Desc 根据订单编号查询秒杀订单快照
     * @Author liww
     * @Date 2020/3/1
     * @Param [orderNum]
     * @return com.wenyanwen123.buy.common.domain.learningdb.SeckillOrderSnapshot
     */
    SeckillOrderSnapshot selectByOrderNum(String orderNum);

}