package xjhxjhxjhxjh.com.github.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import xjhxjhxjhxjh.com.github.mapper.StationMapper;
import xjhxjhxjhxjh.com.github.pojo.Station;
import xjhxjhxjhxjh.com.github.service.StationService;
import xjhxjhxjhxjh.com.github.utils.MybatisUtils;

public class StationServiceImpl implements StationService{

    /**
         * 查询出发站
     * @return
     */
    @Override
    public List<Station> selStartStation() {
        // 获取Session
        SqlSession session = MybatisUtils.getSession();
        return session.getMapper(StationMapper.class).selStartStation();
    }
    /**
         * 查询到达站
     */
    @Override
    public List<Station> selEndStation() {
        // 获取Session
        SqlSession session = MybatisUtils.getSession();
        return session.getMapper(StationMapper.class).selEndStation();
    }

}
