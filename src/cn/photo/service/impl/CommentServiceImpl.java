package cn.photo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.photo.dao.CommentMapper;
import cn.photo.entity.Comment;
import cn.photo.entity.CommentExample;
import cn.photo.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	private CommentMapper mapper;
	
	@Override
	public int count(CommentExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByMid(Integer mid) {
		return mapper.deleteByPrimaryKey(mid);
	}

	@Override
	public int addComment(Comment record) {
		return mapper.insertSelective(record);
	}

	@Override
	public List<Comment> findCommentPageList(CommentExample example, int first, int max) {
		return mapper.selectByExample(example, first, max);
	}

	@Override
	public Comment getCommentByMid(Integer mid) {
		return mapper.selectByPrimaryKey(mid);
	}

	@Override
	public int updateCommentByMid(Comment record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

}
