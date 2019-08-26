package com.score.dao;

import com.score.bean.KeShi;
import com.score.bean.RecordVo;

import java.util.List;

public interface KeShiDao {
    List<KeShi> selectKe(String keid);

    int insert(RecordVo recordVo);

    List<RecordVo> selectrecord(String user);
}
