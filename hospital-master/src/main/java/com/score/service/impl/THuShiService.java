package com.score.service.impl;

import com.github.pagehelper.PageInfo;
import com.score.bean.HuShi;

public interface THuShiService {
    PageInfo<HuShi> getAll();
}
