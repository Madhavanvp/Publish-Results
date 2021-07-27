import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException; 
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class result 
{    
    public static void Studentdetails()throws IOException {  
    JFrame f; 

    JButton b1,b2,b3; 
    JLabel j1;
    JTextField t1; 
    JScrollPane sp;
    
    DefaultTableModel tableModel;
    JTable jt;   
    f=new JFrame("RESULT");
    f.getContentPane().setBackground(Color.pink); 
    j1=new JLabel("Enter Name:");
    j1.setBounds(40,50,140,30);
    t1=new JTextField();
    t1.setBounds(150,50,180,30);
    b1=new JButton("Submit");
    b1.setForeground (Color.red);
    b1.setBounds(50,100,150,50);
    b2=new JButton("Close");
    b2.setForeground (Color.red);
    b2.setBounds(220,100,150,50);
    b3=new JButton("delete");
    b3.setForeground (Color.red);
    b3.setBounds(400,100,150,50);
    
    String col[]={"Subject","mark"};   
     tableModel = new DefaultTableModel(0,0);
      jt=new JTable(tableModel);  
       sp=new JScrollPane(jt); 
    
    b1.addActionListener(new ActionListener()
    {
    public void actionPerformed(ActionEvent e)
    {
        try
        {
    jt.setBounds(100,180,400,240);
    jt.setRowHeight(30); 
  tableModel.setColumnIdentifiers(col);
    File f1=new File("e:\\marks.txt"); 
      String[] words=new String[10000];
      String[] full=new String[10000];  
      FileReader fr = new FileReader(f1); 
      BufferedReader br = new BufferedReader(fr);   
      String s; 
      String s1=t1.getText();
      int j=0;
      while((s=br.readLine())!=null)
      {
        int i;
         words=s.split(" ");
         for (i=0;i<words.length;i++) 
      {
        full[j++]=words[i];
        
      }
      } 
      int k=0,l,m;
      for(l=0;full[l]!=null;l++)
      {
        if(full[l].equalsIgnoreCase(s1))
        {
          k=l;
          break;
        }
      }
      int z=0;
    Font font = new Font("Verdana", Font.BOLD, 16);
    jt.setFont(font);
    jt.setBackground(Color.yellow);
    jt.setForeground(Color.black);
      tableModel.addRow(new Object[]{"Subject","Marks"});
      for(m=k+1;m<k+15;m=m+2)
      {   
           tableModel.addRow(new Object[]{full[m],full[m+1]});
      }

  }
  catch(Exception c)
      {
        System.out.println("Error"+c);
      }
}
});
b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
f.dispose();
}
});
b3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
tableModel.setRowCount(0);
t1.setText("");
}
});
    {f.add(j1);}
    {f.add(t1);}
    {f.add(b1);}
    {f.add(b2);}
    {f.add(b3);}
    {f.add(jt);}            
    {f.setLayout(null);}
{f.setSize(600,600);}
{f.setVisible(true);}   
}     
public static void main(String[] args)throws IOException 
{    
Studentdetails();   
}    
}  