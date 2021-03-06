package com.wenyanwen123.buy.dao.learningdb;

import com.wenyanwen123.buy.common.domain.learningdb.FlashSaleGoods;
import com.wenyanwen123.buy.common.domain.learningdb.FlashSaleGoodsExample;
import java.util.List;

import com.wenyanwen123.buy.common.model.vo.goods.GoodsVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FlashSaleGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flash_sale_goods
     *
     * @mbg.generated Thu Feb 20 21:17:49 CST 2020
     */
    long countByExample(FlashSaleGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flash_sale_goods
     *
     * @mbg.generated Thu Feb 20 21:17:49 CST 2020
     */
    int deleteByExample(FlashSaleGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flash_sale_goods
     *
     * @mbg.generated Thu Feb 20 21:17:49 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flash_sale_goods
     *
     * @mbg.generated Thu Feb 20 21:17:49 CST 2020
     */
    int insert(FlashSaleGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flash_sale_goods
     *
     * @mbg.generated Thu Feb 20 21:17:49 CST 2020
     */
    int insertSelective(FlashSaleGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flash_sale_goods
     *
     * @mbg.generated Thu Feb 20 21:17:49 CST 2020
     */
    List<FlashSaleGoods> selectByExample(FlashSaleGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flash_sale_goods
     *
     * @mbg.generated Thu Feb 20 21:17:49 CST 2020
     */
    FlashSaleGoods selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flash_sale_goods
     *
     * @mbg.generated Thu Feb 20 21:17:49 CST 2020
     */
    int updateByExampleSelective(@Param("record") FlashSaleGoods record, @Param("example") FlashSaleGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flash_sale_goods
     *
     * @mbg.generated Thu Feb 20 21:17:49 CST 2020
     */
    int updateByExample(@Param("record") FlashSaleGoods record, @Param("example") FlashSaleGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flash_sale_goods
     *
     * @mbg.generated Thu Feb 20 21:17:49 CST 2020
     */
    int updateByPrimaryKeySelective(FlashSaleGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flash_sale_goods
     *
     * @mbg.generated Thu Feb 20 21:17:49 CST 2020
     */
    int updateByPrimaryKey(FlashSaleGoods record);

    /**
     * @Desc 查询商品列表
     * @Author liww
     * @Date 2020/2/20
     * @Param []
     * @return java.util.List<com.wenyanwen123.buy.common.model.vo.goods.GoodsListRr>
     */
    List<GoodsVO> selectGoodsList();

    /**
     * @Desc 查询抢购商品详情
     * @Author liww
     * @Date 2020/2/22
     * @Param [goodsId]
     * @return com.wenyanwen123.buy.common.model.vo.goods.GoodsRr
     */
    GoodsVO selectGoodsDetail(long goodsId);

    /**
     * @Desc 减库存
     * @Author liww
     * @Date 2020/2/25
     * @Param [goodsId, num]
     * @return int
     */
    int reduceStock(@Param("goodsId") Long goodsId, @Param("num") Integer num);

}