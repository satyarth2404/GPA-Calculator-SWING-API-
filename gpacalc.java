import javax.swing.*;
import java.awt.event.*;
public class gpacalc implements ActionListener {
	JLabel n,r,l1,l2,l3,l4,l5,l6,res1,res2,res3;
	JComboBox cr1,gr1,cr2,gr2,cr3,gr3,cr4,gr4,cr5,gr5,cr6,gr6;
	JTextField name,reg;
	JButton b1;
	gpacalc() {
		JFrame f=new JFrame("GPA Calculator");
		n=new JLabel("Name");
		n.setBounds(20,30,80,30);
		name=new JTextField();
		name.setBounds(100,30,170,30);
		r=new JLabel("Reg");
		r.setBounds(20,90,80,30);
		reg=new JTextField();
		reg.setBounds(100,90,170,30);
		l1=new JLabel("Subject1");
		l1.setBounds(20,150,80,30);
		String credit[]={"----","5","4","3","2","1"};
		String grades[]={"----","S","A","B","C","D","E","F","N"};
		cr1=new JComboBox(credit);
		cr1.setBounds(100,150,80,30);
		gr1=new JComboBox(grades);
		gr1.setBounds(190,150,80,30);
		l2=new JLabel("Subject2");
		l2.setBounds(20,210,80,30);
		cr2=new JComboBox(credit);
		cr2.setBounds(100,210,80,30);
		gr2=new JComboBox(grades);
		gr2.setBounds(190,210,80,30);
		l3=new JLabel("Subject3");
		l3.setBounds(20,270,80,30);
		cr3=new JComboBox(credit);
		cr3.setBounds(100,270,80,30);
		gr3=new JComboBox(grades);
		gr3.setBounds(190,270,80,30);
		l4=new JLabel("Subject4");
		l4.setBounds(20,330,80,30);
		cr4=new JComboBox(credit);
		cr4.setBounds(100,330,80,30);
		gr4=new JComboBox(grades);
		gr4.setBounds(190,330,80,30);
		l5=new JLabel("Subject5");
		l5.setBounds(20,390,80,30);
		cr5=new JComboBox(credit);
		cr5.setBounds(100,390,80,30);
		gr5=new JComboBox(grades);
		gr5.setBounds(190,390,80,30);
		l6=new JLabel("Subject6");
		l6.setBounds(20,450,80,30);
		cr6=new JComboBox(credit);
		cr6.setBounds(100,450,80,30);
		gr6=new JComboBox(grades);
		gr6.setBounds(190,450,80,30);
		b1=new JButton("Calculate");
		b1.setBounds(100,510,170,30);
		b1.addActionListener(this);
		res1=new JLabel();
		res1.setBounds(20,570,300,30);
		res2=new JLabel();
		res2.setBounds(20,620,300,30);
		res3=new JLabel();
		res3.setBounds(20,670,300,30);
		f.add(n);f.add(r);f.add(name);f.add(reg);f.add(l1);f.add(cr1);f.add(gr1);
		f.add(l2);f.add(cr2);f.add(gr2);f.add(l3);f.add(cr3);f.add(gr3);f.add(l4);f.add(cr4);f.add(gr4);
		f.add(l5);f.add(cr5);f.add(gr5);f.add(l6);f.add(cr6);f.add(gr6);f.add(b1);f.add(res1);f.add(res2);f.add(res3);
		f.setSize(400,1000);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		double credsum=0.0,gradsum=0.0;
		String sub1=(String)cr1.getSelectedItem();
		credsum=credsum + Double.parseDouble(sub1);
		String sub2=(String)cr2.getSelectedItem();
		credsum=credsum + Double.parseDouble(sub2);
		String sub3=(String)cr3.getSelectedItem();
		credsum=credsum + Double.parseDouble(sub3);
		String sub4=(String)cr4.getSelectedItem();
		credsum=credsum + Double.parseDouble(sub4);
	    String sub5=(String)cr5.getSelectedItem();
		credsum=credsum + Double.parseDouble(sub5);
		String sub6=(String)cr6.getSelectedItem();
		credsum=credsum + Double.parseDouble(sub6);
		
		String grade1=(String)gr1.getSelectedItem();
		if(grade1.equals("S"))
		gradsum=gradsum+(Double.parseDouble(sub1)*10.0);
	    if(grade1.equals("A"))
		gradsum=gradsum+(Double.parseDouble(sub1)*9.0);
	    if(grade1.equals("B"))
		gradsum=gradsum+(Double.parseDouble(sub1)*8.0);
	    if(grade1.equals("C"))
		gradsum=gradsum+(Double.parseDouble(sub1)*7.0);
	    if(grade1.equals("D"))
		gradsum=gradsum+(Double.parseDouble(sub1)*6.0);
        if(grade1.equals("E"))
		gradsum=gradsum+(Double.parseDouble(sub1)*5.0);
		if(grade1.equals("F"))
		gradsum=gradsum+(Double.parseDouble(sub1)*4.0);
        if(grade1.equals("N"))
		gradsum=gradsum+(Double.parseDouble(sub1)*0.0);	
	
		String grade2=(String)gr2.getSelectedItem();
		if(grade2.equals("S"))
		gradsum=gradsum+(Double.parseDouble(sub2)*10.0);
	    if(grade2.equals("A"))
		gradsum=gradsum+(Double.parseDouble(sub2)*9.0);
	    if(grade2.equals("B"))
		gradsum=gradsum+(Double.parseDouble(sub2)*8.0);
	    if(grade2.equals("C"))
		gradsum=gradsum+(Double.parseDouble(sub2)*7.0);
	    if(grade2.equals("D"))
		gradsum=gradsum+(Double.parseDouble(sub2)*6.0);
        if(grade2.equals("E"))
		gradsum=gradsum+(Double.parseDouble(sub2)*5.0);
		if(grade2.equals("F"))
		gradsum=gradsum+(Double.parseDouble(sub2)*4.0);
        if(grade2.equals("N"))
		gradsum=gradsum+(Double.parseDouble(sub2)*0.0);	
	
		String grade3=(String)gr3.getSelectedItem();
		if(grade3.equals("S"))
		gradsum=gradsum+(Double.parseDouble(sub3)*10.0);
	    if(grade3.equals("A"))
		gradsum=gradsum+(Double.parseDouble(sub3)*9.0);
	    if(grade3.equals("B"))
		gradsum=gradsum+(Double.parseDouble(sub3)*8.0);
	    if(grade3.equals("C"))
		gradsum=gradsum+(Double.parseDouble(sub3)*7.0);
	    if(grade3.equals("D"))
		gradsum=gradsum+(Double.parseDouble(sub3)*6.0);
        if(grade3.equals("E"))
		gradsum=gradsum+(Double.parseDouble(sub3)*5.0);
		if(grade3.equals("F"))
		gradsum=gradsum+(Double.parseDouble(sub3)*4.0);
        if(grade3.equals("N"))
		gradsum=gradsum+(Double.parseDouble(sub3)*0.0);	
	
		String grade4=(String)gr4.getSelectedItem();
		if(grade4.equals("S"))
		gradsum=gradsum+(Double.parseDouble(sub4)*10.0);
	    if(grade4.equals("A"))
		gradsum=gradsum+(Double.parseDouble(sub4)*9.0);
	    if(grade4.equals("B"))
		gradsum=gradsum+(Double.parseDouble(sub4)*8.0);
	    if(grade4.equals("C"))
		gradsum=gradsum+(Double.parseDouble(sub4)*7.0);
	    if(grade4.equals("D"))
		gradsum=gradsum+(Double.parseDouble(sub4)*6.0);
        if(grade4.equals("E"))
		gradsum=gradsum+(Double.parseDouble(sub4)*5.0);
		if(grade4.equals("F"))
		gradsum=gradsum+(Double.parseDouble(sub4)*4.0);
        if(grade4.equals("N"))
		gradsum=gradsum+(Double.parseDouble(sub4)*0.0);	
	
		String grade5=(String)gr5.getSelectedItem();
		if(grade5.equals("S"))
		gradsum=gradsum+(Double.parseDouble(sub5)*10.0);
	    if(grade5.equals("A"))
		gradsum=gradsum+(Double.parseDouble(sub5)*9.0);
	    if(grade5.equals("B"))
		gradsum=gradsum+(Double.parseDouble(sub5)*8.0);
	    if(grade5.equals("C"))
		gradsum=gradsum+(Double.parseDouble(sub5)*7.0);
	    if(grade5.equals("D"))
		gradsum=gradsum+(Double.parseDouble(sub5)*6.0);
        if(grade5.equals("E"))
		gradsum=gradsum+(Double.parseDouble(sub5)*5.0);
		if(grade5.equals("F"))
		gradsum=gradsum+(Double.parseDouble(sub5)*4.0);
        if(grade5.equals("N"))
		gradsum=gradsum+(Double.parseDouble(sub5)*0.0);	
	
		String grade6=(String)gr6.getSelectedItem();
		if(grade6.equals("S"))
		gradsum=gradsum+(Double.parseDouble(sub6)*10.0);
	    if(grade6.equals("A"))
		gradsum=gradsum+(Double.parseDouble(sub6)*9.0);
	    if(grade6.equals("B"))
		gradsum=gradsum+(Double.parseDouble(sub6)*8.0);
	    if(grade6.equals("C"))
		gradsum=gradsum+(Double.parseDouble(sub6)*7.0);
	    if(grade6.equals("D"))
		gradsum=gradsum+(Double.parseDouble(sub6)*6.0);
        if(grade6.equals("E"))
		gradsum=gradsum+(Double.parseDouble(sub6)*5.0);
		if(grade6.equals("F"))
		gradsum=gradsum+(Double.parseDouble(sub6)*4.0);
        if(grade6.equals("N"))
		gradsum=gradsum+(Double.parseDouble(sub6)*0.0);	
	
		double gpac=gradsum/credsum;
		String nm=name.getText();
		String regno=reg.getText();
		String data1="Name :"+nm;
		String data2="Register No :"+regno;
		String data3="GPA :"+gpac;
		res1.setText(data1);
		res2.setText(data2);
		res3.setText(data3);
	}
	public static void main(String args[])throws Exception {
		new gpacalc();
	}
}