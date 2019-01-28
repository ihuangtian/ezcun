package com.ezcun.code.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author Huangtian
 * @create 2019-01-27 22:59
 */
public class DBUtil {
    SqlSessionFactory ssf;

    {
        try {
            ssf = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    SqlSession ss = ssf.openSession();

    //@DataProvider(name = "getUser")
    //public void getUser() {
    //    List<Map<String, Object>> userList = ss.selectList("com.ezcun.code.utils.DBUtil.getUser");
    //}

    //@Test(dataProvider = "getUser")
    //public void testMethod(Object user) {
    //    System.out.println(user);
    //}
}
