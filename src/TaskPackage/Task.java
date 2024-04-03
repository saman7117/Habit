//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package TaskPackage;
import UserPackage.User;
public class Task {
    public String name;
    public final String color ;
    User user ;
    private double start_time;
    private double finish_time;

    public double getDuration() {
        double v = this.finish_time - this.start_time;
        return v;
    }

    public boolean isValidColor(String testColor){
        if (testColor.length()!=6)
            return false;
        else{
            for(int i=0;i<6;i++){
                if(testColor.charAt(i)>='0' || testColor.charAt(i)<='9')
                    continue;
                else if(testColor.charAt(i)>='A' || testColor.charAt(i)<='F')
                    continue;
                else
                    return false;
            }
        }
        return true;
    }

    public Task(String name, User user, String color){
        this.name = name;
        this.user = user;
        this.color = color;
    }

    public Task(String name, User user){
        this.name = name;
        this.user = user;
        color = null;
    }

    public Task(){

        color = null;
    }

    public void setStart_time(double start_time) {
        if(start_time<0){
            System.out.println("Wrong Input");
        }
        this.start_time = start_time;
    }

    public void setFinish_time(double finish_time) {
        if(finish_time<start_time || finish_time < 0){
            System.out.println("Wrong Input");
        }
        this.finish_time = finish_time;
    }

    public void setName(String name) {
        if (name.length() <= 10)
        this.name = name;
        else
            System.out.println("Invalid name");
    }

    public String getName() {
        return name;
    }


}
