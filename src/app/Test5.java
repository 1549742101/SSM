package app;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import vo.ClassForm;
import vo.Classes;
import vo.Student;
import vo.StudentForm;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test5 {
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
        Student st = new Student();
        st.setNo(null);
        Classes c = new Classes();
        c.setNo("1");
        st.setClasses(c);
        List<Student> list = sqlSession.selectList("findStudentByClassAndS",st);
        for (Student student:list){
            System.out.println(student.getName());
        }
        sqlSession.close();
    }
}
