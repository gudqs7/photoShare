package cn.photo.service;

import cn.photo.entity.Reply;

/** 
 * 项目名称：PhotoShare 
 * 类名称：ReplyService 
 * 类描述：
 * 创建人：Guddqs 
 * 创建时间：2017年2月12日 上午9:18:18 
 * @version  
 */
public interface ReplyService {
	
    /** 
     * 方法名称：deleteByTid 
     * 方法描述：根据主键删除一个回复
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:38:11 
     * @param rid 主键
     * @return int 影响条数
     */
    int deleteByTid(Integer rid);

    /** 
     * 方法名称：addReply 
     * 方法描述：添加一个回复
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:39:17 
     * @param record 回复对象
     * @return int 影响条数
     */
    int addReply(Reply record);

    /** 
     * 方法名称：getReplyByTid 
     * 方法描述：根据rid获取一个回复实例
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:44:52 
     * @param rid 主键
     * @return Reply 回复实例
     */
    Reply getReplyByTid(Integer rid);
}
