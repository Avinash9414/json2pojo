package example2;

import com.example.types.Course;
import com.example.types.Location;
import com.example.types.Professor;
import com.example.types.Student;
import com.example.types.University;

import java.util.ArrayList;
import java.util.List;

public class Universities {

    public static void main(String[] args) {

        Professor p1= new Professor();
        p1.setName("Avinash");
        p1.setEmail("avi@gmail.com");
        Course c1=new Course();
        c1.setName("DBMS");
        c1.setCode("1DB18");
        c1.setProfessor(p1);
        System.out.println(c1.getName()+'\n'+c1.getCode()+'\n'+c1.getProfessor().getName());

        Location l1=new Location();
        l1.setCountry("India");
        l1.setCity("Bangalore");
        l1.setAddress("XYZ,2nd main,ASDASDASD");
        System.out.println(l1.getCountry()+'\n'+l1.getCity()+'\n'+l1.getAddress());

        Student s1=new Student();
        s1.setName("Vikas");
        s1.setAge(22);
        List<String> Courses2 = new ArrayList<>();
        Courses2.add("DBMS");
        Courses2.add("OS");
        Courses2.add("CNS");
        s1.setCoursesEnrolled(Courses2);
        System.out.println(s1.getName()+'\n'+s1.getAge()+'\n'+s1.getCoursesEnrolled());

        List<Course> Courses = new ArrayList<>();
        List<Student> s2=new ArrayList<>();
        s2.add(s1);
        Courses.add(c1);
        University u1=new University();
        u1.setName("BNMIT");
        u1.setCourses(Courses);
        u1.setLocation(l1);
        u1.setStudents(s2);
        System.out.println(u1.getName()+'\n'+u1.getCourses().getFirst().getName()+'\n'+u1.getLocation().getCountry()+'\n'+u1.getStudents().getFirst().getName());


    }
}
