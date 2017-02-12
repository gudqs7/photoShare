package cn.photo.dao;

import cn.photo.entity.GoodList;
import cn.photo.entity.GoodListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodListMapper {
	int countByExample(@Param("example") GoodListExample example);

	int deleteByExample(@Param("example") GoodListExample example);

	int deleteByPrimaryKey(Integer gid);

	int insert(GoodList record);

	int insertSelective(GoodList record);

	List<GoodList> selectByExample(@Param("example") GoodListExample example, @Param("first") int first,
			@Param("max") int max);

	GoodList selectByPrimaryKey(Integer gid);

	int updateByExampleSelective(@Param("record") GoodList record, @Param("example") GoodListExample example);

	int updateByExample(@Param("record") GoodList record, @Param("example") GoodListExample example);

	int updateByPrimaryKeySelective(GoodList record);

	int updateByPrimaryKey(GoodList record);
}