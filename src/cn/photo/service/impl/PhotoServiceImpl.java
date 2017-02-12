package cn.photo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.photo.dao.PhotoMapper;
import cn.photo.entity.Photo;
import cn.photo.entity.PhotoExample;
import cn.photo.service.PhotoService;

@Service
public class PhotoServiceImpl implements PhotoService{

	@Autowired
	private PhotoMapper mapper;
	
	@Override
	public int deleteByAid(Integer pid) {
		return mapper.deleteByPrimaryKey(pid);
	}

	@Override
	public int addPhoto(Photo record) {
		return mapper.insertSelective(record);
	}

	@Override
	public Photo getPhotoByAid(Integer pid) {
		return mapper.selectByPrimaryKey(pid);
	}

	@Override
	public List<Photo> findPhotoPageList(PhotoExample example, int first, int max) {
		return mapper.selectByExample(example, first, max);
	}

}
