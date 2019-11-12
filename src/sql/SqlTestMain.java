package sql;

import java.sql.ResultSet;

public class SqlTestMain {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        ResultSet rs = db.executeQuery("select * from user");
        try {
            while (rs.next()){
                System.out.println(rs.getString("username"));
                System.out.println(rs.getString("password"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
