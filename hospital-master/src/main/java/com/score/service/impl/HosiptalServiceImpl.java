package com.score.service.impl;

import com.score.bean.Hosiptal;
import com.score.dao.HosiptalDao;
import com.score.service.HosiptalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("hosiptalServiceImpl")
public class HosiptalServiceImpl implements HosiptalService {
    @Resource
    protected HosiptalDao hosiptalDao;

    @Override
    public List<Hosiptal> selectHos() {
        return hosiptalDao.selectHos();
    }
}
