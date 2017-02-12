package cn.photo.service;

import cn.photo.entity.Type;

/** 
 * 项目名称：PhotoShare 
 * 类名称：TypeService 
 * 类描述：
 * 创建人：Guddqs 
 * 创建时间：2017年2月12日 上午9:18:18 
 * @version  
 */
public interface TypeService {
	
    /** 
     * 方法名称：deleteByTid 
     * 方法描述：根据主键删除一个类型
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:38:11 
     * @param tid 主键
     * @return int 影响条数
     */
    int deleteByTid(Integer tid);

    /** 
     * 方法名称：addType 
     * 方法描述：添加一个类型
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:39:17 
     * @param record 类型对象
     * @return int 影响条数
     */
    int addType(Type record);

    /** 
     * 方法名称：getTypeByTid 
     * 方法描述：根据tid获取一个类型实例
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:44:52 
     * @param tid 主键
     * @return Type 类型实例
     */
    Type getTypeByTid(Integer tid);
}
