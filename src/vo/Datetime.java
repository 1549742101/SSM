package vo;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Datetime {
    private String datetime;

    public String getDatetime() {
        setDatetime("");
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    public static void main(String[] args) {
        System.out.println(new Datetime().getDatetime());
    }
}
