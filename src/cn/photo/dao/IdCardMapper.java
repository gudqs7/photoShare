package cn.photo.dao;

import cn.photo.entity.IdCard;
import cn.photo.entity.IdCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IdCardMapper {
    int countByExample(@Param("example")IdCardExample example);

    int deleteByExample(@Param("example")IdCardExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(IdCard record);

    int insertSelective(IdCard record);

    List<IdCard> selectByExample(@Param("example")IdCardExample example, @Param("first")int first,@Param("max")int max);

    IdCard selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") IdCard record, @Param("example") IdCardExample example);

    int updateByExample(@Param("record") IdCard record, @Param("example") IdCardExample example);

    int updateByPrimaryKeySelective(IdCard record);

    int updateByPrimaryKey(IdCard record);
}