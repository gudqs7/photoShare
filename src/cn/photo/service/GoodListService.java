package cn.photo.service;

import cn.photo.entity.GoodList;

/** 
 * 项目名称：PhotoShare 
 * 类名称：GoodListService 
 * 类描述：
 * 创建人：Guddqs 
 * 创建时间：2017年2月12日 上午9:18:18 
 * @version  
 */
public interface GoodListService {
	
    /** 
     * 方法名称：deleteByGid 
     * 方法描述：根据主键删除一个点赞
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:38:11 
     * @param gid 主键
     * @return int 影响条数
     */
    int deleteByGid(Integer gid);

    /** 
     * 方法名称：addGoodList 
     * 方法描述：添加一个点赞
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:39:17 
     * @param record 点赞对象
     * @return int 影响条数
     */
    int addGoodList(GoodList record);

}
