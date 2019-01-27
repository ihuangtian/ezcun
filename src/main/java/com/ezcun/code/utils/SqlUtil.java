package com.ezcun.code.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Huangtian
 * @create 2019-01-27 22:59
 */
public class SqlUtil {
    SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
    InputStream ins;

    {
        try {
            ins = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    SqlSessionFactory ssf = sfb.build(ins);
    SqlSession ss = ssf.openSession();

    public SqlUtil() {
        this.ss=ss;
    }
}
