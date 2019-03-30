package xjhxjhxjhxjh.com.github.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import xjhxjhxjhxjh.com.github.mapper.HighSpeedRailMapper;
import xjhxjhxjhxjh.com.github.pojo.HighSpeedRail;
import xjhxjhxjhxjh.com.github.service.HighSpeedRailService;
import xjhxjhxjhxjh.com.github.utils.MybatisUtils;

public class HighSpeedRailServiceImpl implements HighSpeedRailService{
    /**
         * 查询车次信息
     */
    @Override
    public List<HighSpeedRail> selByStartStationAndEndStation(int start, int end) {
        // 获取Session
        SqlSession session = MybatisUtils.getSession();
        return session.getMapper(HighSpeedRailMapper.class).selByStartStationAndEndStation(start, end);
    }

}
