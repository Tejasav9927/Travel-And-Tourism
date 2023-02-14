/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.with.tejasav;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard  extends JFrame implements ActionListener{
    
    JButton addpersondetails,viewpersondetails,viewhotels,destinations,payments,calculator,notepad,about,checkpack,bookpack,Updatepersondetails,bookhotels;
    JButton viewpack,viewbookhotels,delpersondetails;
    String username;
Dashboard(String username)
{
    this.username=username;
//setBounds(0,0,1600,1000);or
    setExtendedState(JFrame.MAXIMIZED_BOTH);
setLayout(null);

JPanel p1=new JPanel();
p1.setLayout(null);
p1.setBackground(new Color(0,0,102));
p1.setBounds(0,0,1600,65);
add(p1);
ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
Image i2=i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
ImageIcon i3=new ImageIcon(i2);
JLabel icon=new JLabel(i3);
icon.setBounds(5,0,70,70);
p1.add(icon);

JLabel heading = new JLabel("Dashboard");
heading.setBounds(80,10,300,40);
heading.setForeground(Color.WHITE);
heading.setFont(new Font("Tahoma",Font.BOLD,30));
p1.add(heading);

JPanel p2=new JPanel();
p2.setLayout(null);
p2.setBackground(new Color(0,0,102));
p2.setBounds(0,65,300,900);
add(p2);

addpersondetails=new JButton("Add Person Details");
addpersondetails.setBounds(0,0,300,40);
addpersondetails.setBackground(new Color(0,0,102));
addpersondetails.setForeground(Color.WHITE);
addpersondetails.setFont(new Font("Tahoma",Font.PLAIN,20));
addpersondetails.setMargin(new Insets(0,0,0,100));
addpersondetails.addActionListener(this);
p2.add(addpersondetails);


 Updatepersondetails=new JButton("Update Person Details");
Updatepersondetails.setBounds(0,40,300,40);
Updatepersondetails.setBackground(new Color(0,0,102));
Updatepersondetails.setForeground(Color.WHITE);
Updatepersondetails.setFont(new Font("Tahoma",Font.PLAIN,20));
Updatepersondetails.setMargin(new Insets(0,0,0,70));
Updatepersondetails.addActionListener(this);
p2.add(Updatepersondetails);


 viewpersondetails=new JButton("View Details");
viewpersondetails.setBounds(0,80,300,40);
viewpersondetails.setBackground(new Color(0,0,102));
viewpersondetails.setForeground(Color.WHITE);
viewpersondetails.setFont(new Font("Tahoma",Font.PLAIN,20));
viewpersondetails.setMargin(new Insets(0,0,0,160));
viewpersondetails.addActionListener(this);
p2.add(viewpersondetails);


 delpersondetails=new JButton("Delete Person Details");
delpersondetails.setBounds(0,120,300,40);
delpersondetails.setBackground(new Color(0,0,102));
delpersondetails.setForeground(Color.WHITE);
delpersondetails.setFont(new Font("Tahoma",Font.PLAIN,20));

delpersondetails.setMargin(new Insets(0,0,0,80));
delpersondetails.addActionListener(this);

p2.add(delpersondetails);


 checkpack=new JButton("Check Packages");
checkpack.setBounds(0,160,300,40);
checkpack.setBackground(new Color(0,0,102));
checkpack.setForeground(Color.WHITE);
checkpack.setFont(new Font("Tahoma",Font.PLAIN,20));
checkpack.setMargin(new Insets(0,0,0,130));
checkpack.addActionListener(this);
p2.add(checkpack);

 bookpack=new JButton("Book Packages");
bookpack.setBounds(0,200,300,40);
bookpack.setBackground(new Color(0,0,102));
bookpack.setForeground(Color.WHITE);
bookpack.setFont(new Font("Tahoma",Font.PLAIN,20));
bookpack.setMargin(new Insets(0,0,0,140));
bookpack.addActionListener(this);
p2.add(bookpack);

viewpack=new JButton("View Packages");
viewpack.setBounds(0,240,300,40);
viewpack.setBackground(new Color(0,0,102));
viewpack.setForeground(Color.WHITE);
viewpack.setFont(new Font("Tahoma",Font.PLAIN,20));
viewpack.setMargin(new Insets(0,0,0,130));
viewpack.addActionListener(this);
p2.add(viewpack);

 viewhotels=new JButton("View Hotels");
viewhotels.setBounds(0,280,300,40);
viewhotels.setBackground(new Color(0,0,102));
viewhotels.setForeground(Color.WHITE);
viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
viewhotels.setMargin(new Insets(0,0,0,160));
viewhotels.addActionListener(this);
p2.add(viewhotels);

 bookhotels=new JButton("Book Hotels");
bookhotels.setBounds(0,320,300,40);
bookhotels.setBackground(new Color(0,0,102));
bookhotels.setForeground(Color.WHITE);
bookhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
bookhotels.setMargin(new Insets(0,0,0,160));
bookhotels.addActionListener(this);

p2.add(bookhotels);


 viewbookhotels=new JButton("View Booked Hotels");
viewbookhotels.setBounds(0,360,300,40);
viewbookhotels.setBackground(new Color(0,0,102));
viewbookhotels.setForeground(Color.WHITE);
viewbookhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
viewbookhotels.setMargin(new Insets(0,0,0,90));
viewbookhotels.addActionListener(this);

p2.add(viewbookhotels);

 destinations=new JButton("Destinations");
destinations.setBounds(0,400,300,40);
destinations.setBackground(new Color(0,0,102));
destinations.setForeground(Color.WHITE);
destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
destinations.setMargin(new Insets(0,0,0,160));
destinations.addActionListener(this);
p2.add(destinations);

 payments=new JButton("Payments");
payments.setBounds(0,440,300,40);
payments.setBackground(new Color(0,0,102));
payments.setForeground(Color.WHITE);
payments.setFont(new Font("Tahoma",Font.PLAIN,20));
payments.setMargin(new Insets(0,0,0,180));
payments.addActionListener(this);

p2.add(payments);

 calculator=new JButton("Calculator");
calculator.setBounds(0,480,300,40);
calculator.setBackground(new Color(0,0,102));
calculator.setForeground(Color.WHITE);
calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
calculator.setMargin(new Insets(0,0,0,180));
calculator.addActionListener(this);
p2.add(calculator);


notepad=new JButton("Notepad");
notepad.setBounds(0,520,300,40);
notepad.setBackground(new Color(0,0,102));
notepad.setForeground(Color.WHITE);
notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
notepad.setMargin(new Insets(0,0,0,200));
notepad.addActionListener(this);
p2.add(notepad);


 about=new JButton("About");
about.setBounds(0,560,300,40);
about.setBackground(new Color(0,0,102));
about.setForeground(Color.WHITE);
about.setFont(new Font("Tahoma",Font.PLAIN,20));
about.setMargin(new Insets(0,0,0,220));
about.addActionListener(this);
p2.add(about);


ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
Image i5=i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
ImageIcon i6=new ImageIcon(i5);
JLabel image =new JLabel(i6);
image.setBounds(0,0,1650,1000);
add(image);

JLabel text=new JLabel("Travel and Tourism Management System");
text.setBounds(400,70,1200,70);
text.setForeground(Color.WHITE);
text.setFont(new Font("Raleway",Font.PLAIN,45));
image.add(text);




setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
    if(ae.getSource()==addpersondetails)
    {
        new AddCustomer(username);
    }
    else if(ae.getSource()==viewpersondetails)
    {
        new ViewCustomer(username);
    }
     else if(ae.getSource()==Updatepersondetails)
    {
        new UpdateCustomer(username);
    }
    else if(ae.getSource()==checkpack)
    {
        new CheckPackage();
    }
    else if(ae.getSource()==viewpack)
    {
        new ViewPackage(username);
    }
     else if(ae.getSource()==bookpack)
    {
        new BookPackage(username);
    }
    
    else if(ae.getSource()==viewhotels)
    {
        new CheckHotels();
    }
    else if(ae.getSource()==destinations)
    {
        new Destinations();
    }
     else if(ae.getSource()==delpersondetails)
    {
        new DeleteDetails(username);
    }
    else if(ae.getSource()==payments)
    {
        new Payment();
    }
     else if(ae.getSource()==bookhotels)
    {
        new BookHotel(username);
    }
      else if(ae.getSource()==viewbookhotels)
    {
        new ViewBookedHotel (username);
    }
     
    else if(ae.getSource()==calculator)
    {
        try{
            Runtime.getRuntime().exec("calc.exe");
        }catch(Exception e)
        { 
            e.printStackTrace();
        }
    }
    else if(ae.getSource()==notepad)
    {
        try{
            Runtime.getRuntime().exec("notepad.exe");
        }catch(Exception e)
        { 
            e.printStackTrace();
        }
    }
    else if(ae.getSource()==about)
    {
        new About();
         
         
    }
}
    public static void main(String[] args)
    {
        new Dashboard("");
    }
    
}
