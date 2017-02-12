package cn.photo.service;

import java.util.List;

import cn.photo.entity.Member;
import cn.photo.entity.MemberExample;

/** 
 * 项目名称：PhotoShare 
 * 类名称：MemberService 
 * 类描述：用户管理类
 * 创建人：Guddqs 
 * 创建时间：2017年2月12日 上午8:32:33 
 * @version  
 */
public interface MemberService {
	
    /** 
     * 方法名称：count 
     * 方法描述：用于统计用户记录总条数,分页
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:38:30 
     * @param example
     * @return int
     */
    int count(MemberExample example);

    /** 
     * 方法名称：deleteByUid 
     * 方法描述：根据主键删除一个用户
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:38:11 
     * @param uid 主键
     * @return int 影响条数
     */
    int deleteByUid(Integer uid);

    /** 
     * 方法名称：addMember 
     * 方法描述：添加一个用户
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:39:17 
     * @param record 用户对象
     * @return int 影响条数
     */
    int addMember(Member record);

    /** 
     * 方法名称：findMemberPageList 
     * 方法描述：用于查找用户列表
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:42:49 
     * @param example 条件对象
     * @param first 分页参数:起始条数
     * @param max 分页参数:最大条数
     * @return List<Member> 用户结果集
     */
    List<Member> findMemberPageList(MemberExample example,int first,int max);

    /** 
     * 方法名称：getMemberByUid 
     * 方法描述：根据uid获取一个用户实例
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:44:52 
     * @param uid 主键
     * @return Member 用户实例
     */
    Member getMemberByUid(Integer uid);

    /** 
     * 方法名称：getMemberByPhone 
     * 方法描述：根据用户手机号获取用户信息,用户登录
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:54:17 
     * @param phone 手机号
     * @return Member 用户实例
     */
    Member getMemberByPhone(String phone);
    
    /** 
     * 方法名称：updateMemberByUid 
     * 方法描述：根据主键修改用户信息
     * 创建人：Guddqs 
     * 创建时间：2017年2月12日 上午8:55:27 
     * @param record 用户实例
     * @return int 影响条数
     */
    int updateMemberByUid(Member record);
}
