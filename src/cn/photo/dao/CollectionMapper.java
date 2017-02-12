package cn.photo.dao;

import cn.photo.entity.Collection;
import cn.photo.entity.CollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectionMapper {
    int countByExample(@Param("example")CollectionExample example);

    int deleteByExample(@Param("example")CollectionExample example);

    int deleteByPrimaryKey(Integer coid);

    int insert(Collection record);

    int insertSelective(Collection record);

    List<Collection> selectByExample(@Param("example")CollectionExample example, @Param("first")int first,@Param("max")int max);

    Collection selectByPrimaryKey(Integer coid);

    int updateByExampleSelective(@Param("record") Collection record, @Param("example") CollectionExample example);

    int updateByExample(@Param("record") Collection record, @Param("example") CollectionExample example);

    int updateByPrimaryKeySelective(Collection record);

    int updateByPrimaryKey(Collection record);
}