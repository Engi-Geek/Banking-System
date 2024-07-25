
package banking.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    Login(){
        //for frame title
        setTitle("AUTOMATED TAILOR MACHINE");
        //to remove default layout for image on frame
        setLayout(null);
        //import images from directory and scaling it 
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 =i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label= new JLabel(i3);
        // custom image layout
        label.setBounds(70,10,100,100);
        add(label);
        //text lable on frame
        JLabel text =new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
         JLabel cardno =new JLabel("CARD NO:");
         cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120,150,150,30);
        add(cardno);
        
        JTextField cardTextField = new  JTextField();
        cardTextField.setBounds(300,150,230,30);
        add(cardTextField);
        
        
        JLabel pin =new JLabel("PIN:");
        pin.setFont(new Font("Ralewayy",Font.BOLD,28));
        pin.setBounds(120,200,400,40);
        add(pin);
        
        JTextField pinTextField = new  JTextField();
        pinTextField.setBounds(300,200,230,30);
        add(pinTextField);
        
        //buttons
        
        JButton login=new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        JButton clear=new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
         JButton signup=new JButton("SIGNUP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
      signup.addActionListener(this);
        add(signup);
        
        
        //colour for frame
        getContentPane().setBackground(Color.WHITE);
        //frame stats
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
        
        
    }

 public void actionPerformed( ActionEvent ac){}
    public static void main(String[] args) {
        new Login();  
        
    }
    
}
