package cn.photo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.photo.dao.MemberMapper;
import cn.photo.entity.Member;
import cn.photo.entity.MemberExample;
import cn.photo.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper mapper;

	@Override
	public int count(MemberExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByUid(Integer uid) {
		return mapper.deleteByPrimaryKey(uid);
	}

	@Override
	public int addMember(Member record) {
		return mapper.insertSelective(record);
	}

	@Override
	public List<Member> findMemberPageList(MemberExample example, int first, int max) {
		return mapper.selectByExample(example, first, max);
	}

	@Override
	public Member getMemberByUid(Integer uid) {
		return mapper.selectByPrimaryKey(uid);
	}

	@Override
	public Member getMemberByPhone(String phone) {
		MemberExample example = new MemberExample();
		example.createCriteria().andPhoneEqualTo(phone);
		Member member = null;
		List<Member> list = mapper.selectByExample(example, 0, 1);
		if (list != null && list.size() >= 1) {
			member = list.get(0);
		}
		return member;
	}

	@Override
	public int updateMemberByUid(Member record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

}
