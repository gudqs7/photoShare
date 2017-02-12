package cn.photo.dao;

import cn.photo.entity.Member;
import cn.photo.entity.MemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
	
    int countByExample(@Param("example")MemberExample example);

    int deleteByExample(@Param("example")MemberExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(Member record);

    int insertSelective(Member record);

    List<Member> selectByExample(@Param("example")MemberExample example, @Param("first")int first,@Param("max")int max);

    Member selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
}