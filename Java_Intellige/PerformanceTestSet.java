import java.util.HashSet;

public class PerformanceTestSet {
    public static void main(String args[]){
    HashSet<Student1> studentList = new HashSet<Student1>();
        for (int i = 0; i < 4000; i++) {
        double generateRandom;
        int random1;
        String name2;
        Student1 stud = new Student1();
        stud.setRoll(i);
        generateRandom=Math.random();
        random1=(int)(generateRandom*1000);
        stud.setAge(random1);
        name2=String.valueOf(random1);
        name2=name2+"ust";
        stud.setName(name2);
        studentList.add(stud);

    }
        for(Student1 i:studentList){
        System.out.println(i.getRoll());
        System.out.println(i.getName());
    }
    Student1 s1=new Student1();
        s1.setRoll(4000);
        studentList.add(s1);
        for(Student1 i:studentList){
        System.out.println(i.getRoll());
    }
    long time=System.currentTimeMillis();
        System.out.println(time);




}
}

