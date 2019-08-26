package com.score.service.impl;

import java.util.List;

import com.score.bean.youhui;
import com.score.dao.youhuixinxi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.score.bean.ResultObject;
import com.score.bean.TScore;
import com.score.bean.TStudent;
import com.score.dao.TScoreMapper;
import com.score.dao.TStudentMapper;
import com.score.service.IScoreService;
import com.score.util.Constant;

@Service
public class SoreServiceImpl implements IScoreService {

	@Autowired
	private TScoreMapper scoreMapper;
	
	@Autowired
	private TStudentMapper studentMapper;
@Autowired
private youhuixinxi youhuixinxi;
	@Override
	public PageInfo<TScore> getAllScore(TScore score, int limit, int page) {
		// 首先开启PageHelper的分页
		PageHelper.startPage(page, limit);
		// 查询分页信息 调用方式与普通方式一致
		List<TScore> list = scoreMapper.selectAll(score);
		// 生成PageInfo对象
		PageInfo<TScore> pageInfo = new PageInfo<TScore>(list);
		return pageInfo;
	}

	@Override
	public ResultObject<Object> insertScore(TScore score) {

		/*int count = scoreMapper.countByType(score);
		String type = score.getScoreType();
		boolean flag = true;
		String str="";
		if ("1".equals(type)) {
			if (count >= 16) {
				flag = false;
				str = "该学生的习题成绩已经达到16条";
			}

		} else if ("2".equals(type)) {
			if (count >= 3) {
				flag = false;
				str = "该学生的测验成绩已经达到3条";
			}

		} else if ("3".equals(type)) {
			if (count >= 1) {
				flag = false;
				str = "该学生的考试成绩已经达到1条";
			}

		} else {
			flag = true;

		}*/
		// 统一返回
		ResultObject<Object> rs = new ResultObject<Object>();
		if(score!=null) {
			Integer total = scoreMapper.insert(score);
			if (null == total || 0 == total) {
				rs.setCode(Constant.HASE_RETUEN_CODE);
				rs.setMsg("添加失败");
			} else {
				rs.setCode(Constant.SUCCESS_RETUEN_CODE);
				rs.setMsg("添加成功");
			}
		}else {
			rs.setCode(Constant.HASE_RETUEN_CODE);
			rs.setMsg("添加失败");
		}
		return rs;
	}

	@Override
	public Integer updateScore(TScore score) {
		// TODO Auto-generated method stub
		return scoreMapper.updateByPrimaryKey(score);
	}

	@Override
	public Integer deleteScore(int scoreId) {
		// TODO Auto-generated method stub
		return scoreMapper.deleteByPrimaryKey(scoreId);
	}

	@Override
	public TScore selectScoreById(int scoreId) {
		// TODO Auto-generated method stub
		return scoreMapper.selectByPrimaryKey(scoreId);
	}
	@Override
	public PageInfo<youhui> getAllFinalScore(TStudent student, int limit, int page) {
		// 首先开启PageHelper的分页
		PageHelper.startPage(page, limit);
		// 查询分页信息 调用方式与普通方式一致
		List<youhui> list = youhuixinxi.selectAllyouhui(student);
		list.size();
		
		/*for(TStudent temp:list) {
			double sum=0;
			Map<String,Object> map=studentMapper.selectFinalScore(temp);
			DecimalFormat df = new DecimalFormat("#.00");
			double score1=Double.parseDouble(map.get("score1").toString());
			temp.setScore1(Double.parseDouble(df.format(score1)));
			double score2=Double.parseDouble(map.get("score2").toString());
			temp.setScore2(Double.parseDouble(df.format(score2)));
			double score3=Double.parseDouble(map.get("score3").toString());
			temp.setScore3(Double.parseDouble(df.format(score3)));
			sum=(score1*0.1)+(score2*0.2)+(score3*0.7);
			temp.setSumScore(Double.parseDouble(df.format(sum)));
		}*/
		// 生成PageInfo对象
/*
		PageInfo<TStudent> pageInfo = new PageInfo<TStudent>(list);
*/
// 生成PageInfo对象
		PageInfo<youhui> pageInfo = new PageInfo<youhui>(list);
		return pageInfo;
	}

}
