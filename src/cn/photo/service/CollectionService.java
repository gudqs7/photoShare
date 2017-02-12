package cn.photo.service;

import cn.photo.entity.Collection;

/** 
 * 项目名称：PhotoShare 
 * 类名称：CollectionService 
 * 类描述：
 * 创建人：Guddqs 
 * 创建时间：2017年2月12日 上午9:18:18 
 * @version  
 */
public interface CollectionService {
	
    /** 
     * 方法名称：deleteByCid 
     * 方法描述：根据主键删除一个收藏
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:38:11 
     * @param cid 主键
     * @return int 影响条数
     */
    int deleteByCid(Integer cid);

    /** 
     * 方法名称：addCollection 
     * 方法描述：添加一个收藏
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:39:17 
     * @param record 收藏对象
     * @return int 影响条数
     */
    int addCollection(Collection record);

}
