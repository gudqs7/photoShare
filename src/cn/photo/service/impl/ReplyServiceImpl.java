package cn.photo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.photo.dao.ReplyMapper;
import cn.photo.entity.Reply;
import cn.photo.service.ReplyService;

@Service
public class ReplyServiceImpl implements ReplyService{

	@Autowired
	private ReplyMapper mapper;
	
	@Override
	public int deleteByTid(Integer rid) {
		return mapper.deleteByPrimaryKey(rid);
	}

	@Override
	public int addReply(Reply record) {
		return mapper.insertSelective(record);
	}

	@Override
	public Reply getReplyByTid(Integer rid) {
		return mapper.selectByPrimaryKey(rid);
	}

}
