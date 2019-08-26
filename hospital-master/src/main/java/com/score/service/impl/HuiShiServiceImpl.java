package com.score.service.impl;

import com.score.bean.HuShi;
import com.score.dao.HuiShiDao;
import com.score.service.HuShiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("huishiserviceimpl")
public class HuiShiServiceImpl implements HuShiService {
    @Resource
    protected HuiShiDao huiShiDao;

    @Override
    public List<HuShi> selectAll(String huid) {
        return huiShiDao.selectAll(huid);
    }
}
