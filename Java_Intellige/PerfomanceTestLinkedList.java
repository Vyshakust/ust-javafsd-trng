import java.util.LinkedList;

public class PerfomanceTestLinkedList {

    public static void main(String args[]){
        LinkedList<Student1> studentList = new LinkedList<>();
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


