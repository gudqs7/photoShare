package cn.photo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.photo.dao.GoodListMapper;
import cn.photo.entity.GoodList;
import cn.photo.service.GoodListService;

@Service
public class GoodListServiceImpl implements GoodListService{

	@Autowired
	private GoodListMapper mapper;
	
	@Override
	public int deleteByGid(Integer gid) {
		return mapper.deleteByPrimaryKey(gid);
	}

	@Override
	public int addGoodList(GoodList record) {
		return mapper.insertSelective(record);
	}

}
