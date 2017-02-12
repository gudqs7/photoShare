package cn.photo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.photo.entity.Member;
import cn.photo.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService mService;
	
	@ResponseBody
	@RequestMapping("/login_pwd")
	public Map<String, Object> login_pwd(HttpSession session,String phone,String pwd){
		
		Map<String, Object> map=new HashMap<>();
		map.put("flag", "false");
		
		if(phone==null||"".equals(phone)||pwd==null||pwd.equals("")){
			map.put("errormsg", "请不要逗!!!");
			return map;
		}
		
		String flag=(String) session.getAttribute("loginVerify");
		if(flag.toString().equals("ok")){
			Member user= mService.getMemberByPhone(phone);
			if(user!=null){
				if(user.getPwd().equals(pwd)){
					map.put("flag", "true");
				}else{
					map.put("errormsg", "您输入的账号和密码不匹配!!");
				}
			}else{
				map.put("errormsg", "你输入的用户不存在!");
			}
		}else {
			map.put("errormsg", "您还没有通过验证码,请刷新验证码重试!");
		}
		
		return map;
	}
	
}
