

import java.util.ArrayList;
import java.util.List;

/**
 * The type Student 1.
 */
class Student1 {
    private int age, rollnum;

    private String name;

    /**
     * Sets roll.
     *
     * @param r the r
     */
    public void setRoll(int r) {
        this.rollnum = r;
    }

    /**
     * Sets name.
     *
     * @param name1 the name 1
     */
    public void setName(String name1) {
        this.name = name1;
    }

    /**
     * Sets age.
     *
     * @param age1 the age 1
     */
    public void setAge(int age1) {
        this.age = age1;
    }

    /**
     * Get roll int.
     *
     * @return the int
     */
    public int  getRoll(){
        return this.rollnum;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }
}

/**
 * The type Student.
 */
public class Student{
    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String args[]) {
        List<Student1> studentList = new ArrayList<>();
        for (int i = 0; i < 4000; i++) {
            double random;
            int random1;
            String name2;
            Student1 stud = new Student1();
            stud.setRoll(i);
            random=Math.random();
            random1=(int)(random*1000);
            stud.setAge(random1);
            name2=String.valueOf(random1);
            name2=name2+"ust";
            stud.setName(name2);
            studentList.add(stud);

        }
        for(int i=0;i<4000;i++){
            System.out.println(studentList.get(i).getRoll());
            System.out.println(studentList.get(i).getName());
        }
        Student1 s1=new Student1();
        s1.setRoll(4000);
        studentList.add(s1);
        for(int i=0;i<=4000;i++){
            System.out.println(studentList.get(i).getRoll());
        }
        long time=System.currentTimeMillis();
        System.out.println(time);




    }


}

