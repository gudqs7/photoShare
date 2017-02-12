package cn.photo.dao;

import cn.photo.entity.Comment;
import cn.photo.entity.CommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
    int countByExample(@Param("example")CommentExample example);

    int deleteByExample(@Param("example")CommentExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExample(@Param("example")CommentExample example, @Param("first")int first,@Param("max")int max);

    Comment selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}