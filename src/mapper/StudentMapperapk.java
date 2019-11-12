package mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import vo.Student;

public interface StudentMapperapk {
    @Insert("Insert into student(no,name) values((#{no},#{name})")
    public void insert(Student vo);
    @Update("UPDATE student SET no=#{no} WHERE name = #{name}")
    public void update(Student vo);
    @Delete("delete from student where no=#{no} and name =#{name}")
    public void deleteById(int id);
}
