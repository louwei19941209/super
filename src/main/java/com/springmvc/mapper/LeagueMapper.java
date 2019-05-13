package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.League;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 申请加盟表数据访问接口
 *
 * @author 自动生成
 * @version $Id: leagueMapper.java, v 0.1  2019-4-19 10:03:56  自动生成 Exp $
 */
public interface LeagueMapper {

    /**
     * 删除
     *
     * @param id 主键
     * @return int
     */
    int deleteByPrimaryKey(int id);

    /**
     * 添加
     *
     * @param record {@link League}
     * @return int
     */
    int insert(League record);

    /**
     * 选择添加
     *
     * @param record {@link League}
     * @return int
     */
    int insertSelective(League record);

    /**
     * 根据id查询
     *
     * @param id 主键
     * @return League
     */
    League selectByPrimaryKey(int id);

    /**
     * 按条件修改
     *
     * @param record {@link League}
     * @return int
     */
    int updateByPrimaryKeySelective(League record);

    /**
     * 分页查询
     *
     * @param param  {@link PageParam}
     * @param league {@link League}
     * @return List<League>
     */
    List<League> selectLeagueByPage(@Param("PageParam") PageParam param, @Param("league") League league);

    /**
     * 根据省id查询城市
     *
     * @param id 省id
     * @return List<Map   <   String   ,       Object>>
     */
    List<Map<String, Object>> selectCity(String id);

}