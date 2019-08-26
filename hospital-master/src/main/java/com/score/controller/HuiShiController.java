package com.score.controller;

import com.github.pagehelper.PageInfo;
import com.score.bean.*;
import com.score.service.HosiptalService;
import com.score.service.HuShiService;
import com.score.service.KeShiService;
import com.score.util.Constant;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("HuiShi")
public class HuiShiController {
    @Resource
    protected HuShiService huShiService;
    @Resource
    protected HosiptalService hosiptalService;
    @Resource
    protected KeShiService keShiService;

    @RequestMapping("selectAll")
    public ResultObject<List<HuShi>> selectAll(String huid){
        List<HuShi> pageInfo=huShiService.selectAll(huid);
        ResultObject<List<HuShi>> rs=new ResultObject<List<HuShi>>();
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("查询成功");
        rs.setData(pageInfo);
        /*rs.setCount(pageInfo.get());*/
        return rs;

    }

    @RequestMapping("selectHos")
    public ResultObject<List<Hosiptal>> selectHos(){
        List<Hosiptal> pageInfo=hosiptalService.selectHos();
        ResultObject<List<Hosiptal>> rs=new ResultObject<List<Hosiptal>>();
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("查询成功");
        rs.setData(pageInfo);
        /*rs.setCount(pageInfo.get());*/
        return rs;

    }

    @RequestMapping("selectKe")
    public ResultObject<List<KeShi>> selectKe(String keid){
        List<KeShi> pageInfo=keShiService.selectKe(keid);
        ResultObject<List<KeShi>> rs=new ResultObject<List<KeShi>>();
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("查询成功");
        rs.setData(pageInfo);
        /*rs.setCount(pageInfo.get());*/
        return rs;

    }

    @RequestMapping("record")
    public ResultObject<List<KeShi>> record(RecordVo recordVo){
        keShiService.addRecord(recordVo);
        ResultObject rs=new ResultObject();
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("成功");
        /*rs.setCount(pageInfo.get());*/
        return rs;

    }

    @RequestMapping("selectrecord")
    public ResultObject<List<RecordVo>> selectrecord(String user){
        List<RecordVo> recordVos=keShiService.selectrecord(user);
        ResultObject<List<RecordVo>> rs=new ResultObject<List<RecordVo>>();
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("成功");
        rs.setData(recordVos);
        return rs;

    }

}
