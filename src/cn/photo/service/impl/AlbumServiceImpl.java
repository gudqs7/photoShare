package cn.photo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.photo.dao.AlbumMapper;
import cn.photo.entity.Album;
import cn.photo.entity.AlbumExample;
import cn.photo.service.AlbumService;

@Service
public class AlbumServiceImpl implements AlbumService{

	@Autowired
	private AlbumMapper mapper;
	
	@Override
	public int count(AlbumExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByAid(Integer aid) {
		return mapper.deleteByPrimaryKey(aid);
	}

	@Override
	public int addAlbum(Album record) {
		return mapper.insertSelective(record);
	}

	@Override
	public List<Album> findAlbumPageList(AlbumExample example, int first, int max) {
		return mapper.selectByExample(example, first, max);
	}

	@Override
	public Album getAlbumByAid(Integer aid) {
		return mapper.selectByPrimaryKey(aid);
	}

	@Override
	public int updateAlbumByAid(Album record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

}
