package com.wenyanwen123.buy.dao.learningdb;

import com.wenyanwen123.buy.commons.domain.learningdb.User;
import com.wenyanwen123.buy.commons.domain.learningdb.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Tue Feb 18 11:39:12 CST 2020
     */
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Tue Feb 18 11:39:12 CST 2020
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Tue Feb 18 11:39:12 CST 2020
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Tue Feb 18 11:39:12 CST 2020
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Tue Feb 18 11:39:12 CST 2020
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Tue Feb 18 11:39:12 CST 2020
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Tue Feb 18 11:39:12 CST 2020
     */
    User selectByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Tue Feb 18 11:39:12 CST 2020
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Tue Feb 18 11:39:12 CST 2020
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Tue Feb 18 11:39:12 CST 2020
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Tue Feb 18 11:39:12 CST 2020
     */
    int updateByPrimaryKey(User record);
}