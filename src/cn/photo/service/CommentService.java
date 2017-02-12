package cn.photo.service;

import java.util.List;

import cn.photo.entity.Comment;
import cn.photo.entity.CommentExample;

/** 
 * 项目名称：PhotoShare 
 * 类名称：CommentService 
 * 类描述：
 * 创建人：Guddqs 
 * 创建时间：2017年2月12日 上午9:18:18 
 * @version  
 */
public interface CommentService {
	
    /** 
     * 方法名称：count 
     * 方法描述：用于统计评论记录总条数,分页
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:38:30 
     * @param example 条件对象
     * @return int 总条数
     */
    int count(CommentExample example);

    /** 
     * 方法名称：deleteByMid 
     * 方法描述：根据主键删除一个评论
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:38:11 
     * @param mid 主键
     * @return int 影响条数
     */
    int deleteByMid(Integer mid);

    /** 
     * 方法名称：addComment 
     * 方法描述：添加一个评论
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:39:17 
     * @param record 评论对象
     * @return int 影响条数
     */
    int addComment(Comment record);

    /** 
     * 方法名称：findCommentPageList 
     * 方法描述：用于查找评论列表
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:42:49 
     * @param example 条件对象
     * @param first 分页参数:起始条数
     * @param max 分页参数:最大条数
     * @return List<Comment> 评论结果集
     */
    List<Comment> findCommentPageList(CommentExample example,int first,int max);

    /** 
     * 方法名称：getCommentByMid 
     * 方法描述：根据mid获取一个评论实例
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:44:52 
     * @param mid 主键
     * @return Comment 评论实例
     */
    Comment getCommentByMid(Integer mid);

    /** 
     * 方法名称：updateCommentByMid 
     * 方法描述：根据主键修改评论信息
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:55:27 
     * @param record 评论实例
     * @return int 影响条数
     */
    int updateCommentByMid(Comment record);
}
