package com.score.dao;

import com.score.bean.TStudent;
import com.score.bean.youhui;

import java.util.List;
import java.util.Map;

public interface TStudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer studentNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated
     */
    int insert(TStudent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated
     */
    TStudent selectByPrimaryKey(Integer studentNo);

    TStudent selectBySFZ(String score1);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated
     */
    List<TStudent> selectAll(TStudent record);




    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TStudent record);
    
    /**
     * 查询学生总成绩
     * @param student
     * @return
     */
    Map<String,Object> selectFinalScore(TStudent student);
    
    /**
     * 查询学生账号信息
     * @param record
     * @return
     */
    List<TStudent> selectloginStudent(TStudent student);
    
}