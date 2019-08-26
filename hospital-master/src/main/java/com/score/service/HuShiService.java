package com.score.service;

import com.score.bean.HuShi;

import java.util.List;
public interface HuShiService {
    List<HuShi> selectAll(String huid);
}
