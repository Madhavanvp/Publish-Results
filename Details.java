import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
class staff
{
	public String[] mark(int a[],int avg)
	{
		String[] b=new String[2];
		if(avg<50)
		{
			b[0]="Fail";
		}
		else if(avg<60 && avg>=50)
		{
			b[0]="D";
		}
		else if(avg<70 && avg>=60)
		{
			b[0]="C";
		}
		else if(avg<80 && avg>=70)
		{
			b[0]="B";
		}
		else if(avg<90 && avg>=80)
	    {
			b[0]="A";
		}
		else
		{
			b[0]="S";
		}
		return b;

	}
}
class student extends staff
{
	String[] g=new String[2];
	public String[] mark(int a[],int n)
	{
		int x,total=0,avg;
		for(x=0;x<a.length;x++)
		{
			total=total+a[x];
		}
		System.out.println("Total:"+total);
		String[] z=new String[5];
		z[0]=Integer.toString(total);
		avg=total/n;
		System.out.println("Percentage:"+avg+"%");
		g=super.mark(a,avg);
		z[1]=g[0];
		System.out.println("Grade:"+g);
		return z;
	}
}

class Details
{
public static void Studentdetails()
{
JFrame f =new JFrame("Students Information");
f.getContentPane().setBackground(Color.pink);
JLabel l1,l2,l2a,l3,l4,l5,l6,l7;
JTextField t1,t2,t3,t4,t5,t6,t7,t8;
JButton b1,b2;
l1=new JLabel("Student name:");
l1.setForeground (Color.red);
l1.setBounds(40,50,140,30);
l2=new JLabel("Subject 1:");
l2.setForeground (Color.red);
l2.setBounds(40,100,120,30);
l2a=new JLabel("Subject 2:");
l2a.setForeground (Color.red);
l2a.setBounds(40,150,120,30);
l3=new JLabel("Subject 3:");
l3.setForeground (Color.red);
l3.setBounds(40,200,140,30);
l4=new JLabel("Subject 4:");
l4.setForeground (Color.red);
l4.setBounds(40,250,140,30);
l5=new JLabel("Subject 5:");
l5.setForeground (Color.red);
l5.setBounds(40,300,120,30);
l6=new JLabel("total:");
l6.setForeground (Color.red);
l6.setBounds(40,350,70,20);
l7=new JLabel("grade:");
l7.setForeground (Color.red);
l7.setBounds(40,400,70,30);
t1=new JTextField();
t1.setBounds(150,50,180,30);
t2=new JTextField();
t2.setBounds(150,100,130,30);
t3=new JTextField();
t3.setBounds(150,150,130,30);
t4=new JTextField();
t4.setBounds(150,200,130,30);
t5=new JTextField();
t5.setBounds(150,250,130,30);
t6=new JTextField();
t6.setBounds(150,300,130,30);
t7=new JTextField();
t7.setBounds(150,350,130,30);
t8=new JTextField();
t8.setBounds(150,400,130,30);      
b1=new JButton("Submit");
b1.setBounds(150,500,100,30);
b2=new JButton("Close");
b2.setBounds(420,500,70,30);
int[] num=new int[5];
b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
String s1=t1.getText();
num[0]=Integer.parseInt(t2.getText());
num[1]=Integer.parseInt(t3.getText());
num[2]=Integer.parseInt(t4.getText());
num[3]=Integer.parseInt(t5.getText());
num[4]=Integer.parseInt(t6.getText());

if(e.getSource()==b1)
{
try
{
student s=new student();
String[] x=s.mark(num,5);
t7.setText(x[0]);
t8.setText(x[1]);
FileWriter w=new
FileWriter("Marks.txt",true);
w.write("Name: "+s1+"\n");
w.write("Subject1: "+num[0]+"\n");
w.write("Subject2: "+num[1]+"\n");
w.write("Subject3: "+num[2]+"\n");
w.write("Subject4: "+num[3]+"\n");
w.write("Subject5: "+num[4]+"\n");
w.write("Total: "+x[0]+"\n");
w.write("Grade: "+x[1]+"\n");
w.write("*********"+"\n");
w.close();
}
catch(Exception a)
{
System.out.println(a);
}
}

JOptionPane.showMessageDialog(f,"Successfully"+
"Submitted");
}
});
b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
f.dispose();
}
});
f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
{f.add(l1);}
{f.add(t1);}
{f.add(l2);}
{f.add(t2);}
{f.add(l2a);}
{f.add(t3);}
{f.add(l3);}
{f.add(t4);}
{f.add(l4);}
{f.add(t5);}
{f.add(l5);}
{f.add(t6);}
{f.add(l6);}
{f.add(t7);}
{f.add(l7);}
{f.add(t8);}
{f.add(b1);}
{f.add(b2);}
{f.setLayout(null);}
{f.setSize(1000,600);}
{f.setVisible(true);}
}
public static void main(String[] args) {
Studentdetails();
}
}