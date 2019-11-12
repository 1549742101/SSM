package app;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import vo.ClassForm;
import vo.StudentForm;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Test_3 {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.得到执行sql的对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        ClassForm cf = new ClassForm();
        List<ClassForm> list = sqlSession.selectList("findStudentAndClass",cf);
        for (ClassForm cf1:list){
            for (StudentForm sf:cf1.getSflist()){
                System.out.println(cf1.getName());
                System.out.println(sf.getName());
            }
        }
        sqlSession.close();
    }
}
