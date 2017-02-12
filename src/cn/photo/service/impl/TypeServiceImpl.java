package cn.photo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.photo.dao.TypeMapper;
import cn.photo.entity.Type;
import cn.photo.service.TypeService;

@Service
public class TypeServiceImpl implements TypeService{

	@Autowired
	private TypeMapper mapper;
	
	@Override
	public int deleteByTid(Integer tid) {
		return mapper.deleteByPrimaryKey(tid);
	}

	@Override
	public int addType(Type record) {
		return mapper.insertSelective(record);
	}

	@Override
	public Type getTypeByTid(Integer tid) {
		return mapper.selectByPrimaryKey(tid);
	}

}
