/*
 * GUI app to print orders of a restaurant
 * swing library is used 
 * It is project of an assignment given in coursera
 */
 
//import javafx.scene.control.RadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 *
 * @author Administrator
 */
public class MyRestaurant extends JFrame {
    JLabel Customer,Name,Contact,Food,Drink,type;
    JTextField tfNumber,tfName,tfContact;
    JComboBox cbFood,cbDrink;
    JButton Reset,Print,Reciept;
    JRadioButton r1,r2;
    JTextArea area1,area2;
    MyRestaurant(){
        setTitle("Restaurant and Coffee");
        setSize(700,500);
        setLayout(null);
        Customer = new JLabel("Customer No:");
        Customer.setBounds(20,50, 120, 30);
        tfNumber= new JTextField();
        tfNumber.setBounds(150,50,150,30);
        
        Name= new JLabel("Name:");
        Name.setBounds(20,100, 120, 30);
        tfName= new JTextField();
        tfName.setBounds(150,100,150,30);
        
        Contact=new JLabel("Contact:");
        Contact.setBounds(20,150,120,30);
        tfContact= new JTextField();
        tfContact.setBounds(150,150,150,30);
        
        Food = new JLabel("Food:");
        Food.setBounds(20,200,120,30);
        String foods[]={"Pasta","Pizza","kebab"};
        cbFood= new JComboBox(foods);
        cbFood.setBounds(150,200,150,30);
        
        Drink= new JLabel("Drinks:");
        Drink.setBounds(20,250,150,30);
        String drinks[]={"sprite","fanta","water"};
        cbDrink =new JComboBox(drinks);
        cbDrink.setBounds(150,250,150,30);
        
        type =new JLabel("Type:");
        type.setBounds(20, 300, 120, 30);
        r1= new JRadioButton("Diet");
        r2 =new JRadioButton("NOrmal");
        r1.setBounds(150,300,60,30);
        r2.setBounds(220,300,60,30);
        area2=new JTextArea();
        area2.setBounds(140,330,150,100);
        
        
        Reciept= new JButton("Generate");
        Reciept.setBounds(320,100,80,40);
        Reset=new JButton("Reset");
        Reset.setBounds(400,100,80,40);
        Print =new JButton("Print");
        Print.setBounds(480,100,80,40);
        area1= new JTextArea();
        area1.setBounds(320,140,240,240);
        
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        
        
        
       
       
        
        
        getContentPane().add(Customer);
        getContentPane().add(tfNumber);
        getContentPane().add(Name);
        getContentPane().add(tfName);
        getContentPane().add(Contact);
        getContentPane().add(tfContact);
        getContentPane().add(Food);
        getContentPane().add(cbFood);
        getContentPane().add(Drink);
        getContentPane().add(cbDrink);
        getContentPane().add(type);
        getContentPane().add(r1);
        getContentPane().add(r2);
        getContentPane().add(area2);
                
        getContentPane().add(Reciept);
        getContentPane().add(Reset);
        getContentPane().add(Print);
        getContentPane().add(area1);
        //getContentPane().add(cbDrink);
        setVisible(true);
        Reset.addactionlistener(new ActionLitsener());
        
        
                
        
        
    }
    
    public static void main(String[] args){
        
     new MyRestaurant();       
    }
    
}
