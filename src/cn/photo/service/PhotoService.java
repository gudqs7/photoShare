package cn.photo.service;

import java.util.List;

import cn.photo.entity.Photo;
import cn.photo.entity.PhotoExample;

/** 
 * 项目名称：PhotoShare 
 * 类名称：PhotoService 
 * 类描述：
 * 创建人：Guddqs 
 * 创建时间：2017年2月12日 上午9:18:18 
 * @version  
 */
public interface PhotoService {
	
    /** 
     * 方法名称：deleteByAid 
     * 方法描述：根据主键删除一个图片
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:38:11 
     * @param pid 主键
     * @return int 影响条数
     */
    int deleteByAid(Integer pid);

    /** 
     * 方法名称：addPhoto 
     * 方法描述：添加一个图片
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:39:17 
     * @param record 图片对象
     * @return int 影响条数
     */
    int addPhoto(Photo record);

    /** 
     * 方法名称：getPhotoByAid 
     * 方法描述：根据pid获取一个图片实例
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:44:52 
     * @param pid 主键
     * @return Photo 图片实例
     */
    Photo getPhotoByAid(Integer pid);
    
    /** 
     * 方法名称：findPhotoPageList 
     * 方法描述：
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午10:14:37 
     * @param example
     * @param first
     * @param max
     * @return List<Photo>
     */
    List<Photo> findPhotoPageList(PhotoExample example,int first ,int max);
}
