package cn.photo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.photo.dao.CollectionMapper;
import cn.photo.entity.Collection;
import cn.photo.service.CollectionService;

@Service
public class CollectionServiceImpl implements CollectionService{

	@Autowired
	private CollectionMapper mapper;
	
	@Override
	public int deleteByCid(Integer coid) {
		return mapper.deleteByPrimaryKey(coid);
	}

	@Override
	public int addCollection(Collection record) {
		return mapper.insertSelective(record);
	}

}
