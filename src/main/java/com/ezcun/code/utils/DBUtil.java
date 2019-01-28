package com.ezcun.code.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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

    @DataProvider
    public Object[] getUser() {
        List<String> list = ss.selectList("com.ezcun.code.utils.DBUtil.getUser");
        Object[] o = new Object[]{list};
        return o;
    }

    @Test(dataProvider = "getUser")
    public void Test(Object s) {
        System.out.println(s);
    }

}
