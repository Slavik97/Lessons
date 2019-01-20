import com.mysql.fabric.jdbc.FabricMySQLDriver;
import com.sun.scenario.effect.impl.sw.java.JSWBlend_COLOR_BURNPeer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class connMain extends JFrame{

    public static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    public static final String USER = "root";
    public static final String PASSWORD = "1234";




    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        try{
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);


        }catch (SQLException e1){
            e1.printStackTrace();
        }

        try(Connection connection1= DriverManager.getConnection(URL,USER,PASSWORD);
        Statement statement1 = connection1.createStatement()){
            ResultSet resultSet = statement1.executeQuery("SELECT * FROM users");
            System.out.println(resultSet);
        //            statement1.execute("INSERT INTO  users (name, age, email) VALUES ('Slava','21','sdfert@gmail.com')");
        }catch (SQLException e){
            e.printStackTrace();
        }


        /*JFrame frame = new JFrame("lll");
        JButton btn = new JButton("Connect");

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(500,500,200,300);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.add(btn);
        btn.setBounds(100,100,50,30);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });*/



    }
}
