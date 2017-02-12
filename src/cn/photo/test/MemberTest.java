package cn.photo.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.photo.entity.Member;
import cn.photo.entity.MemberExample;
import cn.photo.service.MemberService;

public class MemberTest {
	
	//@Test
	public void testAdd(){
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml","applicationContext-service.xml"});
		
		MemberService mservice=ctx.getBean(MemberService.class);
		
		for(int i=0;i<10;i++){
			Member record=new Member();
			record.setPhone("1767304721"+i);
			record.setPwd("pwd"+i);
			record.setNickname("Test_"+i);
			record.setRegisttime(new Date());
			record.setSex("男");
			mservice.addMember(record);
		}
		System.out.println("ok");
		
	}
	
	@Test
	public void testGet(){
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml","applicationContext-service.xml"});
		
		MemberService mservice=ctx.getBean(MemberService.class);
		
		List<Member> list=mservice.findMemberPageList(new MemberExample(), 0, 100);
		
		for (Member member : list) {
			System.out.println(member.getNickname());
			System.out.println("--------------------\n-------------------");
			System.out.println(member.getAlbums());
		}
		
		System.out.println("ok");
		
	}
	
}
