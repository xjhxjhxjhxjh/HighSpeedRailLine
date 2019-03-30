package xjhxjhxjhxjh.com.github.service;

import java.util.List;

import xjhxjhxjhxjh.com.github.pojo.Station;

public interface StationService {
    /**
         * 查询出发站
     * @return
     */
    List<Station> selStartStation();
    
    /**
         * 查询到达站
     * @return
     */
    List<Station> selEndStation();
}
