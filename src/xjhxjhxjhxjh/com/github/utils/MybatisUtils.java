package xjhxjhxjhxjh.com.github.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtils {
    // factory实例化的过程是一个比较耗费性能的过程.
    // 保证有且只有一个factory
    private static SqlSessionFactory factory;
    // 定义一个集合 ThreadLocal 对象来保存当前线程的连接
    private static ThreadLocal<SqlSession> tl = new ThreadLocal<SqlSession>();
    
    static {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis.xml");
            factory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    /**
         *  获取Sqlsession
     * @return
     */
    public static SqlSession getSession() {
        SqlSession sqlSession = tl.get();
        if (sqlSession == null) {
            tl.set(factory.openSession());
        }
        return tl.get();
    }
    
    public static void closeSession(){
        SqlSession sqlSession = tl.get();
        if(sqlSession != null){
            sqlSession.close();
        }
        tl.set(null);
    }
}
