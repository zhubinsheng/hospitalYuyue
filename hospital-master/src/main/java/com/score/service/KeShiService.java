package com.score.service;

import com.score.bean.KeShi;
import com.score.bean.RecordVo;
import com.score.bean.TStudent;

import java.util.List;

public interface KeShiService {
    List<KeShi> selectKe(String keid);
    Integer addRecord(RecordVo recordVo);
    List<RecordVo> selectrecord(String user);
}
