// package miniproject;

import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JLabel;


class Modificate extends JFrame {
	JButton b1, b2;
	JLabel l1;

	Modificate() {
		b1 = new JButton("compare");
		b2 = new JButton("merge");
		l1 = new JLabel("Result");
		add(b1);
		add(b2);
		add(l1);
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == b1) {

					File file1 = new File("D:\\FirstJavaProject\\src\\miniproject\\data1.txt");
					File file2 = new File("D:\\FirstJavaProject\\src\\miniproject\\data2.txt");
					FileReader r1 = null;
					try {
						r1 = new FileReader(file1);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					FileReader r2 = null;
					try {
						r2 = new FileReader(file2);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					BufferedReader reader1 = new BufferedReader(r1);
					BufferedReader reader2 = new BufferedReader(r2);
					String str1 = null;
					try {
						str1 = reader1.readLine();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					String str2 = null;
					try {
						str2 = reader2.readLine();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					boolean areequal = false;
					int lineno = 1;
					while (str1 != null && str2 != null) {
						if (str1.equalsIgnoreCase(str2)) {
							areequal = true;
							lineno++;
						} else {
							areequal = false;
							break;
						}
						try {
							str1 = reader1.readLine();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						try {
							str2 = reader2.readLine();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}

					if (areequal) {
						System.out.println("files are same");
					} else {
						System.out.println("files are not same at line number " + lineno);
					}

					if(e.getSource()==b2){
                        try{
                        PrintWriter pw = new PrintWriter("data3.txt");
                        BufferedReader br = new BufferedReader(new FileReader("data1.txt"));
                        String line = br.readLine();
            
                        while (line != null)
                    {
                        pw.println(line);
                        line = br.readLine();
                    }
                      
                    br = new BufferedReader(new FileReader("data2.txt"));
                      
                    line = br.readLine();
            
                    while(line != null)
                    {
                        pw.println(line);
                        line = br.readLine();
                    }
                    
                    pw.flush();
                    
                    // closing resources
                    br.close();
                    pw.close();
                }
                catch(IOException ex){System.out.println(ex);}
            }
				}
			}

		};
		b1.addActionListener(al);
		b2.addActionListener(al);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Modify {
	public static void main(String args[]) {
		Modificate obj = new Modificate();
	}
}

