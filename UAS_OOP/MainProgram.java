import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainProgram{
    public static void main(String[]args){
        JFrame window = new JFrame("Data Student");
        window.setSize(400,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new FlowLayout());

        JButton button = new JButton("Tampilkan Data");
        window.add(button);

        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Student student = new Student("Leo ", 19 , 3);
                student.getInfo();
                Course course = new Course("OOP" , 9);
                course.setStudent(student);

                System.out.println("Course Name :" + course.getName());
                System.out.println("Credit :" + course.getCredit());
                System.out.println("Student :" + course.getStudent().name);
            }
        });

        window.setVisible(true);
    }


}