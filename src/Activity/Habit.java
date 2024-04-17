package Activity;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Habit extends ToDo {
    private int frequency;
    private String category;
    public void setStarttime(double s){
        this.startTime = s;
    }
    @Override
    public String getInfo() {
        String f = super.getInfo();
        f+=category + "With frequency of :" + String.valueOf(frequency);
        return f;
    }
}
