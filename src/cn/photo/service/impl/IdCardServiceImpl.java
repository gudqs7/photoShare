package cn.photo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.photo.dao.IdCardMapper;
import cn.photo.entity.IdCard;
import cn.photo.service.IdCardService;

@Service
public class IdCardServiceImpl implements IdCardService{

	@Autowired
	private IdCardMapper mapper;
	
	@Override
	public int deleteByAid(Integer cid) {
		return mapper.deleteByPrimaryKey(cid);
	}

	@Override
	public int addIdCard(IdCard record) {
		return mapper.insertSelective(record);
	}

	@Override
	public IdCard getIdCardByAid(Integer cid) {
		return mapper.selectByPrimaryKey(cid);
	}

}
