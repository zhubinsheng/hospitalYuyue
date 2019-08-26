package com.score.service.impl;

import com.score.bean.KeShi;
import com.score.bean.RecordVo;
import com.score.dao.KeShiDao;
import com.score.service.KeShiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("KeShiServiceImpl")
public class KeShiServiceImpl implements KeShiService {
    @Resource
    protected KeShiDao keShiDao;
    @Override
    public List<KeShi> selectKe(String keid) {
        return keShiDao.selectKe(keid);
    }

    @Override
    public Integer addRecord(RecordVo recordVo) {
        keShiDao.insert(recordVo);
        return null;
    }

    @Override
    public List<RecordVo> selectrecord(String user) {
        return keShiDao.selectrecord(user);
    }

}
