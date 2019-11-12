package app;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import vo.Classes;
import vo.Student;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test_2 {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.得到执行sql的对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //3.执行sql语句
        Student student1 = new Student();
        List<Student> list = sqlSession.selectList("findStudentAndClass",student1);
       //4.输出结果
       for (Student studentVo : list) {
           Classes ch = studentVo.getClasses();
            System.out.println(""+studentVo.getName() + "\t" + ch.getName());
        }
        //5.关闭数据库
        sqlSession.close();
    }
}
