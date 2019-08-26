package com.score.dao;

import com.score.bean.TStudent;
import com.score.bean.youhui;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper //标识为mybatis数据层接口
@Repository
public interface youhuixinxi {
    /**
     *全量查询用户
     * @param record
     * @return
     */
    List<youhui> selectAllyouhui(TStudent record);
}
