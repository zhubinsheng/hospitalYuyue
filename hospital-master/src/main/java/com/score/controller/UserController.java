package com.score.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.score.bean.Bingren;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.score.bean.ResultObject;
import com.score.bean.TStudent;
import com.score.bean.User;
import com.score.service.IUserService;
import com.score.service.TStudentService;
import com.score.util.Constant;

/**
 * @author hmg
 *
 */
@RequestMapping("/user")
@RestController //标识为返回类型为Json的控制器
public class UserController {
	
	//自动注入服务类
	@Autowired
	private IUserService userService;
	
	@Autowired
	private TStudentService studentService;
	
    //标识请求地址
    @RequestMapping("/login")
    public ResultObject<List<User>> getUsers(User user,HttpServletRequest request) {
    	//查询用户列表
    	List<User> list= userService.getUser(user);
    	//查询列表 有信息不就成功 登陆了  登陆用的的是User实体类中的名字和密码去查询
    	ResultObject<List<User>> rs=new ResultObject<List<User>>();
    	if(list.isEmpty()) {
    		//状态码
        	rs.setCode(Constant.FAILURE_RETUEN_CODE);
        	//提示
        	rs.setMsg("登录失败");
    	}else {
    		//状态码
        	rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        	request.getSession().setAttribute("user", list.get(0));
        	//提示
        	rs.setMsg("登录成功");
    	}    	
    	//数据
    	rs.setData(list);
        return rs;
    }
    @RequestMapping("/loginOut")
    public ResultObject<Object> loginOut(HttpServletRequest request) {
    	//查询用户列表
    	ResultObject<Object> rs=new ResultObject<Object>();
    	request.getSession().removeAttribute("user");	
    	//数据
    	rs.setCode(Constant.SUCCESS_RETUEN_CODE);
    	rs.setMsg("退出成功");
        return rs;
    }
    
    //标识请求地址
    @RequestMapping("/studentLogin")
    public ResultObject<List<TStudent>> studentLogin(User user,HttpServletRequest request) {
    	//查询用户列表
    	TStudent student=new TStudent();
     	student.setStudentNo(user.getUserId());
     	student.setScore1(user.getStudentNo());   //身份证号  下面是 密码
    	student.setStuPass(user.getPassword());
    	List<TStudent> list= studentService.selectloginStudent(student);
    	ResultObject<List<TStudent>> rs=new ResultObject<List<TStudent>>();
    	if(list.isEmpty()) {
    		//状态码
        	rs.setCode(Constant.FAILURE_RETUEN_CODE);
        	//提示
        	rs.setMsg("登录失败");
    	}else {
    		//状态码
        	rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        	request.getSession().setAttribute("student", list.get(0));
        	//提示
        	rs.setMsg("登录成功");
    	}    	
    	//数据
    	rs.setData(list);
        return rs;
    }

	//标识请求地址
	@RequestMapping("/studentLogon") //身份证号注册接口
	public ResultObject<Object> studentLogon(Bingren bingren ,HttpServletRequest request) {
		//查询用户列表
		TStudent student=new TStudent();
		student.setScore1(bingren.getShenfenzhenhao());//账号 身份证号
		student.setScore2(bingren.getYibaokahao());//密码  医保卡号
		student.setStudentName(bingren.getXingming());
		student.setStudentSex(bingren.getXingbie());
		student.setAdress(bingren.getNiangling());  //姓名 性别 年龄
		student.setStuPass(bingren.getMima());//密码
		/*TStudent result=studentService.selectByNo(student.getStudentNo());*/
		TStudent result1=studentService.selectBySFZ(student.getScore1());
		//统一返回
		ResultObject<Object> rs=new ResultObject<Object>();
		if(null==result1) {
			studentService.addStudent(student);
			rs.setCode(Constant.SUCCESS_RETUEN_CODE);
			rs.setMsg("注册成功");
		}else {
			rs.setCode(Constant.HASE_RETUEN_CODE);
			rs.setMsg("身份证已存在");
		}
		return rs;
	}

    @RequestMapping("/studentloginOut")
    public ResultObject<Object> studentloginOut(HttpServletRequest request) {
    	//查询用户列表
    	ResultObject<Object> rs=new ResultObject<Object>();
    	request.getSession().removeAttribute("student");	
    	//数据
    	rs.setCode(Constant.SUCCESS_RETUEN_CODE);
    	rs.setMsg("退出成功");
        return rs;
    }
    
    
 
}
