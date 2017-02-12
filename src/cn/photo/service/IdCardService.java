package cn.photo.service;

import cn.photo.entity.IdCard;

/** 
 * 项目名称：PhotoShare 
 * 类名称：IdCardService 
 * 类描述：
 * 创建人：Guddqs 
 * 创建时间：2017年2月12日 上午9:18:18 
 * @version  
 */
public interface IdCardService {
	
    /** 
     * 方法名称：deleteByAid 
     * 方法描述：根据主键删除一个身份证
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:38:11 
     * @param cid 主键
     * @return int 影响条数
     */
    int deleteByAid(Integer cid);

    /** 
     * 方法名称：addIdCard 
     * 方法描述：添加一个身份证
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:39:17 
     * @param record 身份证对象
     * @return int 影响条数
     */
    int addIdCard(IdCard record);

    /** 
     * 方法名称：getIdCardByAid 
     * 方法描述：根据cid获取一个身份证实例
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:44:52 
     * @param cid 主键
     * @return IdCard 身份证实例
     */
    IdCard getIdCardByAid(Integer cid);
}
