package xjhxjhxjhxjh.com.github.service;

import java.util.List;


import xjhxjhxjhxjh.com.github.pojo.HighSpeedRail;

public interface HighSpeedRailService {
    /**
         * 查询车次信息
     * @param start
     * @param end
     * @return
     */
    List<HighSpeedRail> selByStartStationAndEndStation(int start,int end);
}
