// CONCEPT OF ARRAYS USING FOR-EACH LOOP//

class student{
    String name;
    int age;
    int no;
}

public class ForEachArray
{
    public static void main(String args[]){
        student s1 = new student();
        s1.name = "sudheer";
        s1.age = 19;
        s1.no = 1234;
        student s2 = new student();
        s2.name = "praveen";
        s2.age = 25;
        s2.no = 5678;
        student s3 = new student();
        s3.name = "prabhas";
        s3.age = 45;
        s3.no = 9101;
        student students[] = new student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        for(student names: students){
            System.out.println(names.name +" " + names.age);
        }
    }
}