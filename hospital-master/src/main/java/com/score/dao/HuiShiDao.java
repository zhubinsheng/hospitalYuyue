package com.score.dao;

import com.score.bean.HuShi;

import java.util.List;

public interface HuiShiDao {
    List<HuShi> selectAll(String huid);
}
