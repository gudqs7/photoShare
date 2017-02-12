package cn.photo.dao;

import cn.photo.entity.Photo;
import cn.photo.entity.PhotoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhotoMapper {
    int countByExample(@Param("example")PhotoExample example);

    int deleteByExample(@Param("example")PhotoExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Photo record);

    int insertSelective(Photo record);

    List<Photo> selectByExample(@Param("example")PhotoExample example, @Param("first")int first,@Param("max")int max);

    Photo selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Photo record, @Param("example") PhotoExample example);

    int updateByExample(@Param("record") Photo record, @Param("example") PhotoExample example);

    int updateByPrimaryKeySelective(Photo record);

    int updateByPrimaryKey(Photo record);
}