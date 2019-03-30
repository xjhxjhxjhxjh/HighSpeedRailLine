package xjhxjhxjhxjh.com.github.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import xjhxjhxjhxjh.com.github.pojo.HighSpeedRail;

public interface HighSpeedRailMapper {
    /**
         * 查询车次信息
     * @param start
     * @param end
     * @return
     */
    List<HighSpeedRail> selByStartStationAndEndStation(@Param("start")int start, @Param("end")int end);
}
