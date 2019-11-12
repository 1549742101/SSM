package vo;

import java.util.List;

public class ClassForm {
    private String no;
    private String name;
    private List<StudentForm> sflist;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentForm> getSflist() {
        return sflist;
    }

    public void setSflist(List<StudentForm> sflist) {
        this.sflist = sflist;
    }
}
