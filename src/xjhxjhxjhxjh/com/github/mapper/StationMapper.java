package xjhxjhxjhxjh.com.github.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import xjhxjhxjhxjh.com.github.pojo.Station;

public interface StationMapper {
    /**
         * 查询出发站
     * @return
     */
    @Select("select * from station where sid in (select distinct startStation from HighSpeedRail)")
    List<Station> selStartStation();
    
    /**
         * 查询到达站
     * @return
     */
    @Select("select * from station where sid in (select distinct endStation from HighSpeedRail)")
    List<Station> selEndStation();
}
