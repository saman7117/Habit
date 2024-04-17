package Activity;

import UserPackage.User;

public class ToDo {
    public String name;
    protected double startTime;
    protected String color;

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }
    public String getInfo(){
        String d="";
        d = name + ":" + String.valueOf(startTime);
        return d;
    }

    public void setColor(String color) {
        if (Task.isValidColor(color))
            this.color = color;
        else
            System.out.println("color is not valid");
    }
}
