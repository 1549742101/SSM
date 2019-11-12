package app;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import vo.Order;
import vo.OrderDetail;
import vo.Student;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Test6 {
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
        List<Student> list=new ArrayList<>();
        Student s1=new Student();
        s1.setName("张三");
        Student s2=new Student();
        s2.setName("李四");
        list.add(s1);
        list.add(s2);
        /*for (Student i:list
        ) {
            System.out.println(i.getName());
        }*/
        List<String> list1=sqlSession.selectList("findStudentAndClass",list);
        for (String s:list1
             ) {
            System.out.println(s);
        }

        //5.关闭数据库
        sqlSession.close();
    }
}
