package app;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import vo.Classes;
import vo.Order;
import vo.OrderDetail;
import vo.Student;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test4 {
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
        Order order = new Order();
        List<Order> list = sqlSession.selectList("findAllOrder",order);
        //4.输出结果
        for (Order o:
             list) {
            for (OrderDetail od:
                 o.getOrderDetail()) {
                System.out.print(o.getId()+"\t"+o.getEmployee().getName()+"\t"+
                        o.getCustomer().getName()+"\t"+o.getDatetime()+"\t");
                System.out.print(od.getGoods().getName()+"\t"+od.getGoods().getPrice()+"\t"+od.getAmount()+"\t"+od.getSum());
                System.out.println();
            }
        }
        //5.关闭数据库
        sqlSession.close();
    }
}
