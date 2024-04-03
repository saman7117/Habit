//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package UserPackage;

import TaskPackage.Task;
import java.util.Vector;

import static UtilPackage.Util.*;

public class User {
    private String first_name;
    private String last_name;
    public String email;
    private String username;
    private String password;
    public int streak;

    Vector<Task> TaskList = new Vector<Task>();

    public Task createTask(String taskName) {
        Task task1 = new Task();
        task1.setName(taskName);
        if(!isTaskReptative(taskName)){
            TaskList.add(task1);
            return task1;
        }
        else {
            System.out.println("Task is REPTATIVE!!! try again...");
        }
        return task1;
    }

    public boolean isTaskReptative(String TaskName){
        for(Task test : TaskList){
            if(test.getName() == TaskName){
                return true;
            }
        }
        return false;
    }

    public String getFullName() {
        String FullName = "";
        FullName = this.first_name.concat(this.last_name);
        return FullName;
    }

    public User(String user, String pass, String Fname, String Lname, String mail) {
        this.username = user;
        this.password = pass;
        this.first_name = Fname;
        this.last_name = Lname;
        this.email = mail;
    }

    public User() {

    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if(ispasswordvalid(password)) {
            this.password = password;
        }
        else
            System.out.println("Invalid Password");
    }

    public void setFirst_name(String first_name) {
        if (first_name.charAt(0) >= 'a' && first_name.charAt(0) <= 'z') {
            first_name = Character.toUpperCase(first_name.charAt(0)) + first_name.substring(1);
        }

        this.first_name = first_name;
    }


    public void setLast_name(String last_name) {
        if (last_name.charAt(0) >= 'A' && last_name.charAt(0) <= 'Z') {
            last_name = Character.toLowerCase(last_name.charAt(0)) + last_name.substring(1);
        }

        this.last_name = last_name;
    }


    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public Object getTaskByName(String name){
        for (int i = 0; i < TaskList.size(); i++) {
            if (name == TaskList.get(i).getName()){
                return TaskList.get(i);
            }
        }
        System.out.println("Wrong Input");
        return null;
    }

    public Object getTaskByColor(String color){
        Task []task = new Task[10];
        boolean flag = false;
            for (int j = 0; j < task.length; j++) {
        for (int i = 0; i < TaskList.size(); i++) {
                if (color == TaskList.get(i).color) {
                    task[j] = TaskList.get(i);
                    break;
                }
            }
        }
        for (int i = 0; i < task.length; i++) {
            if (task[i] != null)
                flag = true;
        }
        if (flag == true)
            return task;
        else {
            System.out.println("Wrong Input");
            return null;
        }
    }
}
