package cn.photo.dao;

import cn.photo.entity.Album;
import cn.photo.entity.AlbumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlbumMapper {
    int countByExample(@Param("example")AlbumExample example);

    int deleteByExample(@Param("example")AlbumExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Album record);

    int insertSelective(Album record);

    List<Album> selectByExample(@Param("example")AlbumExample example, @Param("first")int first,@Param("max")int max);

    Album selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") Album record, @Param("example") AlbumExample example);

    int updateByExample(@Param("record") Album record, @Param("example") AlbumExample example);

    int updateByPrimaryKeySelective(Album record);

    int updateByPrimaryKey(Album record);
}