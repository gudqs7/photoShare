package cn.photo.service;

import java.util.List;

import cn.photo.entity.Album;
import cn.photo.entity.AlbumExample;

/** 
 * 项目名称：PhotoShare 
 * 类名称：AlbumService 
 * 类描述：
 * 创建人：Guddqs 
 * 创建时间：2017年2月12日 上午9:18:18 
 * @version  
 */
public interface AlbumService {
	
    /** 
     * 方法名称：count 
     * 方法描述：用于统计相册记录总条数,分页
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:38:30 
     * @param example 条件对象
     * @return int 总条数
     */
    int count(AlbumExample example);

    /** 
     * 方法名称：deleteByAid 
     * 方法描述：根据主键删除一个相册
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:38:11 
     * @param uid 主键
     * @return int 影响条数
     */
    int deleteByAid(Integer uid);

    /** 
     * 方法名称：addAlbum 
     * 方法描述：添加一个相册
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:39:17 
     * @param record 相册对象
     * @return int 影响条数
     */
    int addAlbum(Album record);

    /** 
     * 方法名称：findAlbumPageList 
     * 方法描述：用于查找相册列表
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:42:49 
     * @param example 条件对象
     * @param first 分页参数:起始条数
     * @param max 分页参数:最大条数
     * @return List<Album> 相册结果集
     */
    List<Album> findAlbumPageList(AlbumExample example,int first,int max);

    /** 
     * 方法名称：getAlbumByAid 
     * 方法描述：根据uid获取一个相册实例
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:44:52 
     * @param uid 主键
     * @return Album 相册实例
     */
    Album getAlbumByAid(Integer uid);

    /** 
     * 方法名称：updateAlbumByAid 
     * 方法描述：根据主键修改相册信息
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:55:27 
     * @param record 相册实例
     * @return int 影响条数
     */
    int updateAlbumByAid(Album record);
}
