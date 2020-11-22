
import java.awt.Color;                                      //C. represent class
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import student_managment_system.Project.admin.login;
public class Portal extends JFrame {   //C.1
JFrame Student_Admin=new JFrame();
JFrame ADMIN=new JFrame();
JFrame student_login=new JFrame();
int y=1920;
int h=2000;
int g=2000;
		 JLabel uni_pic,CIIT_logo,Welcome,To,Student,student1,portal,A_S_picture2,
		 A_S_picture3,student_icon,admin_icon,uni_pic2,A_S_picture4,
		 A_S_picture5,A_S_picture6,admin_pic,Welcome2,To2,Admin,login,
		 username,password,admin_login_pic,message,admin_window_pic,window,student_pic,student_l,
		 student_rollno,student_pass,student_icon2,message1,
		 student_window_pic,student_reg,student_reg_pic,window2,student_name,std_father_name,
		 std_email,std_DOB,gender,std_cell_no,std_cnic,std_res_address,std_per_add,
		 std_nationality,scholorship_pic,scholor_pic,hec_sch_pic,hec_label,
		 strt_lbl,from_lbl,to_lbl,elg_lbl,inf_labl,Sch_pic2,
		 usaid_sch_pic,usaid_label,assign_pic,oop_pic, oop_lbl,assign_no
		 ,assign_topic,ques_no,upload_dte,last_dte,assign_pic2,
		 course_reg_pic,course_reg_lbl;
		 JButton next,admin,student,admin_login,admin_back,admin_exit
		 ,add_student,scholorship,student_fee_information,assignment,
		 quiz,marks,result,sign_in,student_back,student_exit,
		 course_reg,disp_scholorship,disp_mark,fee_information,assignment2,quizes,
		 disp_result,add_btn,hec_scholor,usaid_scholor,wwb_scholor,upload_btn,
		 oop_btn,cal2_btn,eca_btn,se_btn,pakstdy_btn,rwriting_btn,upld_btn,back_btn,reg_btn;
		    JTextField username_t,roll_no,name_txt,father_txt,cnic_txt,cell_txt,
		    email,assign_notxt,ques_no_txt;
		    JPasswordField Admin_pass,student_Password;
		    JComboBox department,session,date,month,year,nationality,date_combo,
		    month_combo,year_combo,date2_combo,month2_combo,year2_combo,date2,month2,year2;
		    JTextArea res_add_area,per_add_area,elg_txt_a,inf_txt_a, assign_topic_a;
		    JCheckBox std_reg_chkbx,oop_chkbx,eca_chkbx,se_chkbx,p_stdy_chkbx,cal1_chkbx,cal2_chkbx,r_w_chkbx,mangmnet_chkbx,itcp_chkbx;
		    JRadioButton male_r,female_r;
		    
		    public void scholorship(){                                      //SCHOLORSHIP FUNCTION.
			
		    	Font f9=new Font("Serif", Font.BOLD, 25);
  		   Font f10=new Font("Serif", Font.BOLD, 17);
			strt_lbl=new JLabel("START");hec_sch_pic.add(strt_lbl);strt_lbl.setBounds(395,75,100,40);strt_lbl.setFont(f9);strt_lbl.setForeground(Color.orange);
				from_lbl=new JLabel("FROM");hec_sch_pic.add(from_lbl);from_lbl.setBounds(40,130,100,40);from_lbl.setFont(f9);from_lbl.setForeground(Color.GREEN);
				String[] d=new String[31];
				for(int i=1;i<=31;i++){
					d[i-1]=Integer.toString(i);
					date_combo=new JComboBox(d);	
				}
				hec_sch_pic.add(date_combo);date_combo.setBounds(130,135,65,30);date_combo.setFont(f9);date_combo.setForeground(Color.DARK_GRAY);
				String date=(String)date_combo.getSelectedItem();
				
				String month[]={"january","february","march","april","may","june","july","august","september","october","november","december"};
				month_combo=new JComboBox(month);hec_sch_pic.add(month_combo);month_combo.setBounds(210,135,130,30);month_combo.setFont(f9);month_combo.setForeground(Color.DARK_GRAY);
				String months=(String)month_combo.getSelectedItem();
				String y[]={"2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
			/*	for(int i=0;i<20;i++){
					y[i]=Integer.toString(h);
					h++;
					year_combo=new JComboBox(y);
				}*/
				
				year_combo=new JComboBox(y);hec_sch_pic.add(year_combo);year_combo.setBounds(350,135,90,30);year_combo.setFont(f9);year_combo.setForeground(Color.DARK_GRAY);
				String year=(String)year_combo.getSelectedItem();
				to_lbl=new JLabel("TO");hec_sch_pic.add(to_lbl);to_lbl.setBounds(475,130,60,40);to_lbl.setFont(f9);to_lbl.setForeground(Color.GREEN);
				String[] D=new String[31];
				for(int i=1;i<=31;i++){
					D[i-1]=Integer.toString(i);
					date2_combo=new JComboBox(D);	
				}
				hec_sch_pic.add(date2_combo);date2_combo.setBounds(540, 135, 65, 30);date2_combo.setFont(f9);date2_combo.setForeground(Color.DARK_GRAY);
				String date2=(String)date2_combo.getSelectedItem();
				String m[]={"january","february","march","april","may","june","july","august","september","october","november","december"};
				month2_combo=new JComboBox(m);hec_sch_pic.add(month2_combo);month2_combo.setBounds(620,135,130,30);month2_combo.setFont(f9);month2_combo.setForeground(Color.DARK_GRAY);
				String months2=(String)month2_combo.getSelectedItem();
			String years[]={"2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};//=new String[20];
			/*for(int i=0;i<20;i++){
				years[i]=Integer.toString(g);
				g++;
				year2_combo=new JComboBox(years);
			}*/
			year2_combo=new JComboBox(years);hec_sch_pic.add(year2_combo);year2_combo.setBounds(760,135,90,30);year2_combo.setFont(f9);year2_combo.setForeground(Color.DARK_GRAY);        
			String year2=(String)year2_combo.getSelectedItem();
			elg_lbl=new JLabel("ELIGIBILITY CRITERIA");hec_sch_pic.add(elg_lbl);elg_lbl.setBounds(40,230,300,40);elg_lbl.setFont(f9);elg_lbl.setForeground(Color.YELLOW);
			elg_txt_a=new JTextArea();hec_sch_pic.add(elg_txt_a);elg_txt_a.setBounds(40,270,500,100);elg_txt_a.setFont(f10);elg_txt_a.setForeground(Color.DARK_GRAY);
			inf_labl=new JLabel("INFORMATION");hec_sch_pic.add(inf_labl);inf_labl.setBounds(40,375,200,40);inf_labl.setFont(f9);inf_labl.setForeground(Color.YELLOW);
			inf_txt_a=new JTextArea();hec_sch_pic.add(inf_txt_a);inf_txt_a.setBounds(40,420,500,100);inf_txt_a.setFont(f10);inf_txt_a.setForeground(Color.DARK_GRAY);
			upload_btn=new JButton("UPLOAD");	hec_sch_pic.add(upload_btn);upload_btn.setBounds(720,520,150,40);upload_btn.setFont(f9);upload_btn.setForeground(Color.RED);
		   Sch_pic2=new JLabel();hec_sch_pic.add(Sch_pic2);Sch_pic2.setBounds(550,267,330,250);Sch_pic2.setIcon(new ImageIcon("E:\\image\\schh2.jpg"));
		   back_btn=new JButton("BACK");hec_sch_pic.add(back_btn);back_btn.setBounds(0,560,100,40);back_btn.setFont(f9);back_btn.setForeground(Color.RED);
    	   
		}
		        public void assignment(){                              //ASSIGNEMENT FUNCTION.
		        	
		        	Font f12=new Font("Serif", Font.BOLD, 25);
            		 Font f13=new Font("Serif", Font.BOLD, 20);
            		 assign_pic2=new JLabel();oop_pic.add(assign_pic2);assign_pic2.setBounds(500, 50, 400, 300);assign_pic2.setIcon(new ImageIcon("E:\\image\\12.png"));
		    	     assign_no=new JLabel("ASSIGNMENT NO #");oop_pic.add( assign_no); assign_no.setBounds(50,100,300,40); assign_no.setFont(f12); assign_no.setForeground(Color.RED);
                    assign_notxt=new JTextField();oop_pic.add(assign_notxt);assign_notxt.setBounds(300, 105, 150, 30); assign_notxt.setFont(f12); assign_notxt.setForeground(Color.DARK_GRAY);
                	String assignment_no=assign_notxt.getText();
                	 assign_topic=new JLabel("TOPIC");oop_pic.add(assign_topic);assign_topic.setBounds(50,160,300,40);assign_topic.setFont(f12);assign_topic.setForeground(Color.RED);
                	 assign_topic_a=new JTextArea();oop_pic.add( assign_topic_a); assign_topic_a.setBounds(145,150,305,100); assign_topic_a.setFont(f13); assign_topic_a.setForeground(Color.DARK_GRAY);
                	 ques_no=new JLabel("QUESTION NO #");oop_pic.add(ques_no);ques_no.setBounds(50,270,300,40);ques_no.setFont(f12); ques_no.setForeground(Color.RED);
                	 ques_no_txt=new JTextField();oop_pic.add( ques_no_txt); ques_no_txt.setBounds(300,265,150,30);ques_no_txt.setFont(f13); ques_no_txt.setForeground(Color.DARK_GRAY);
                	upload_dte=new JLabel("UPLOADED DATE");oop_pic.add(upload_dte);upload_dte.setBounds(50,330,300,40);upload_dte.setFont(f12); upload_dte.setForeground(Color.RED);
                	String[] day=new String[31];
					for(int i=1;i<=31;i++){
						day[i-1]=Integer.toString(i);
					date=new JComboBox(day);
					}
					date.setBounds(300, 335,60, 25);oop_pic.add(date);date.setFont(f13);date.setForeground(Color.DARK_GRAY);
						String[] mon={"january","february","march","april","may","june","july","august","september","october","november","december"};
						month=new JComboBox(mon);oop_pic.add(month);month.setBounds(380,335,120,25);month.setFont(f13);month.setForeground(Color.DARK_GRAY);
						String years[]={"2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
						/*for(int i=0;i<=118;i++){
							years[i]=Integer.toString(y);
							y++;
							year=new JComboBox(years);
						}*/
						year=new JComboBox(years);year.setBounds(520,335,70,25);oop_pic.add(year);year.setFont(f13);year.setForeground(Color.DARK_GRAY);
                	    last_dte=new JLabel("SUBMISSION DATE");oop_pic.add(last_dte);last_dte.setBounds(50,390,300,40);last_dte.setFont(f12);last_dte.setForeground(Color.RED);
                	
                	    String[] day2=new String[31];
						for(int i=1;i<=31;i++){
							day2[i-1]=Integer.toString(i);
						date2=new JComboBox(day2);
						}
						date2.setBounds(300, 395,60, 25);oop_pic.add(date2);date2.setFont(f13);date2.setForeground(Color.DARK_GRAY);
							String[] mon2={"january","february","march","april","may","june","july","august","september","october","november","december"};
							month2=new JComboBox(mon2);oop_pic.add(month2);month2.setBounds(380,395,120,25);month2.setFont(f13);month2.setForeground(Color.DARK_GRAY);
							String years2[]={"2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
							/*for(int i=0;i<=118;i++){
								years[i]=Integer.toString(h);
								h++;
								year2=new JComboBox(years2);
							}*/
							
							year2=new JComboBox(years2);year2.setBounds(520,395,70,25);oop_pic.add(year2);year2.setFont(f13);year2.setForeground(Color.DARK_GRAY);
                	          
		                       upld_btn=new JButton("UPLOAD");oop_pic.add(upld_btn);upld_btn.setBounds(380,485,130,40);upld_btn.setFont(f13);upld_btn.setForeground(Color.BLUE);
                	
                	
		    }
		    Portal(){          //constractor of Portal class 
		    	
		        uni_pic=new JLabel();add(uni_pic);uni_pic.setBounds(0,130,900,600); uni_pic.setIcon(new ImageIcon("E:\\image\\schools.jpg"));
		        uni_pic2=new JLabel();add(uni_pic2);uni_pic2.setBounds(0,120,900,10); uni_pic2.setIcon(new ImageIcon("E:\\image\\3.jpg"));
		        CIIT_logo=new JLabel();add(CIIT_logo);CIIT_logo.setBounds(20,0,480,100); CIIT_logo.setIcon(new ImageIcon("E:\\image\\logo.png")); 
		        Welcome=new JLabel("WELCOME");add(Welcome);Welcome.setBounds(640,10,300,50); Font f=new Font("Serif", Font.BOLD, 30);
		        new Font("SansSerif", Font.BOLD, 30); Welcome.setFont(f); Welcome.setForeground(Color.MAGENTA);
		        To=new JLabel("TO");add(To);To.setBounds(705,40,100,50);To.setFont(f); To.setForeground(Color.RED);
		        Student=new JLabel("STUDENT");add(Student);Student.setBounds(570,70,300,50);new Font("Serif", Font.BOLD, 30);Student.setForeground(Color.GREEN); Student.setFont(f);
		        portal=new JLabel("PORTAL");add(portal);portal.setBounds(730,70,300,50);Font f1=new Font("Serif", Font.BOLD, 30);portal.setFont(f1);portal.setForeground(Color.GREEN);
		        next=new JButton("NEXT"); add(next);next.setBounds(770,560,120,50);new Font("Serif", Font.BOLD, 20);next.setForeground(Color.MAGENTA);next.setFont(f);
		          JLabel l; l=new JLabel("ABC"); l.setBounds(100,0,100,30);  add(l);//this label is used to add a button.
		          
		       next.addActionListener(new next());     //ACTIONLISTENER FOR NEXT BUTTON
		      }
		    
		    /*******************************************************************************
		     *******************************************************************************
		     *                                                                             *
		     *                      NEXT BUTTON INNER CLASS                                *  
		     *                                                                             *
		     ******************************************************************************
		     *******************************************************************************/
		    
		    public class next implements ActionListener{         //C.2
		    public void actionPerformed(ActionEvent e){
		    	if(e.getSource()==next){
		    		//JFrame Student_Admin=new JFrame();
		    		Student_Admin.setVisible(true);
		    		setVisible(false);
		    		Student_Admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    		Student_Admin.setBounds(100,50,900,600);
		    		Student_Admin.setLayout(null);
		    		A_S_picture2=new JLabel();Student_Admin.add(A_S_picture2);  A_S_picture2.setBounds(0,0,900,90); A_S_picture2.setIcon(new ImageIcon("E:\\image\\A_S.jpg"));
		    		A_S_picture3=new JLabel();Student_Admin.add(A_S_picture3);  A_S_picture3.setBounds(0,460,900,100); A_S_picture3.setIcon(new ImageIcon("E:\\image\\A_S2.jpg"));
		    		admin=new JButton("ADMIN");Student_Admin.add(admin);admin.setBounds(150,250,130,50);Font f2=new Font("Serif", Font.BOLD, 20);admin.setForeground(Color.blue);admin.setFont(f2);
		    		student=new JButton("STUDENT");Student_Admin.add(student);student.setBounds(580,250,130,50);new Font("Serif", Font.BOLD, 20);student.setForeground(Color.blue);student.setFont(f2);
		    		A_S_picture4=new JLabel();Student_Admin.add(A_S_picture4);A_S_picture4.setBounds(420,90,30,400);A_S_picture4.setIcon(new ImageIcon("E:\\image\\A_S4.jpg"));
		    		A_S_picture5=new JLabel();Student_Admin.add(A_S_picture5);A_S_picture5.setBounds(0,90,20,400);A_S_picture5.setIcon(new ImageIcon("E:\\image\\A_S5.jpg"));
		    		A_S_picture6=new JLabel();Student_Admin.add(A_S_picture6);A_S_picture6.setBounds(860,90,30,400);A_S_picture6.setIcon(new ImageIcon("E:\\image\\A_S6.jpg"));
		    		Container c=Student_Admin.getContentPane();
		    		c.setBackground(Color.red);
		    		admin.addActionListener(new ADMIN());           //ACTION LISTENER FOR ADMIN BUTTON
		    		student.addActionListener(new student());       //ACTIONLISTENER FOR STUDENT BUTTON
		    		
		    	}
		    }
		    }
		    
		    /*******************************************************************************
		     *******************************************************************************
		     *                                                                             *
		     *                      ADMIN BUTTON INNER CLASS                               *                
		     *                                                                             *
		     ******************************************************************************
		     *******************************************************************************/                    
		     
		    public class ADMIN implements ActionListener{               //C.3
		    	public void actionPerformed(ActionEvent e){
		    	
		    
		    			if(e.getSource()==admin){
		    				
		    				JFrame ADMIN=new JFrame();
		    				ADMIN.setVisible(true);
		    				Student_Admin.setVisible(false);
		    				ADMIN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    				ADMIN.setBounds(100,50,900,600);
		    				ADMIN.setLayout(null);
		    				ADMIN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    				admin_pic=new JLabel();ADMIN.add(admin_pic);admin_pic.setBounds(0,0,900,600);admin_pic.setIcon(new ImageIcon("E:\\image\\admin.jpg"));
		    				admin_login_pic=new JLabel();admin_pic.add(admin_login_pic);admin_login_pic.setBounds(580,-80,400,700);admin_login_pic.setIcon(new ImageIcon("E:\\image\\admin.png"));
		    				 Welcome2=new JLabel("WELCOME");admin_pic.add(Welcome2);Welcome2.setBounds(350,20,300,50); Font f=new Font("Serif", Font.BOLD, 30);Welcome2.setFont(f);Welcome2.setForeground(Color.red);
		    				 To2=new JLabel("TO");admin_pic.add(To2);To2.setBounds(400,70,100,50);To2.setFont(f); To2.setForeground(Color.RED);To2.setFont(f);
		    				 Admin=new JLabel("ADMIN");admin_pic.add( Admin); Admin.setBounds(300,110,150,50); Admin.setFont(f);  Admin.setForeground(Color.RED); Admin.setFont(f);
		    				 login=new JLabel("LOGIN");admin_pic.add(login);login.setBounds(430,110,150,50);login.setFont(f); login.setForeground(Color.RED);login.setFont(f);
		    				 username=new JLabel("USERNAME");admin_pic.add(username);username.setBounds(70,200,200,50);username.setFont(f); username.setForeground(Color.green);username.setFont(f);
		    				 password=new JLabel("PASSWORD");admin_pic.add(password);password.setBounds(70,290,200,50);password.setFont(f); password.setForeground(Color.green);
		    				 username_t=new JTextField();admin_pic.add(username_t);username_t.setBounds(270, 205, 200,40);Font f1=new Font("Serif", Font.BOLD, 20);username_t.setFont(f);username_t.setForeground(Color.darkGray);
		    				 Admin_pass=new JPasswordField();admin_pic.add(Admin_pass);Admin_pass.setBounds(270, 290, 200,40); Admin_pass.setFont(f1);Admin_pass.setForeground(Color.DARK_GRAY);
		    				 admin_login=new JButton("LOGIN");admin_pic.add(admin_login);admin_login.setBounds(330,400,100,40);admin_login.setFont(f1);admin_login.setForeground(Color.blue);
		    				 admin_back=new JButton("BACK");admin_pic.add(admin_back);admin_back.setBounds(0,520,100,40);admin_back.setFont(f1);admin_back.setForeground(Color.MAGENTA);
		    				admin_exit=new JButton("EXIT");admin_pic.add(admin_exit);admin_exit.setBounds(805,520,100,40);admin_exit.setFont(f1);admin_exit.setForeground(Color.MAGENTA);
		    				
		    				 admin_login.addActionListener(new admin_login());         //ACTONLISTENER FOR ADMIN LOGIN BUTTON
		    				 admin_back.addActionListener(new  back());                // ACTIONLISTENER FOR ADMIN BACK BUTTON
		    				 admin_exit.addActionListener(new back());                 // ACTIONLISTENER FOR ADMIN EXIT BUTTON
		    				}
		    				
		    			}
		    				}
		    /*******************************************************************************
		     *******************************************************************************
		     *                                                                             *
		     *                    ADMIN LOGIN BUTTON INNER CLASS                                *  
		     *                                                                             *
		     ******************************************************************************
		     *******************************************************************************/
		    
		                   public class admin_login implements ActionListener{         //C.4
		                	   public void actionPerformed(ActionEvent e){
		                		   if(e.getSource()==admin_login){
		                			   String username=username_t.getText();
		                			   String passwor=Admin_pass.getText();
		                			   if(username.equals("qwerty") && passwor.equals("12345")){
		                			   JFrame admin_login=new JFrame();
		                			   admin_login.setVisible(true);
		                			   ADMIN.setVisible(false);
		                			   admin_login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                			   admin_login.setBounds(100,50,900,600);
		                			   admin_login.setLayout(null);
		                			   Font f1=new Font("Serif", Font.BOLD, 20);
		                			   admin_window_pic=new JLabel(); admin_login.add(admin_window_pic);admin_window_pic.setBounds(0,0,900,600);admin_window_pic.setIcon(new ImageIcon("E:\\image\\8s.jpg"));
		                			   Welcome2=new JLabel("WELCOME");admin_window_pic.add(Welcome2);Welcome2.setBounds(350,20,300,50); Font f=new Font("Serif", Font.BOLD, 30);Welcome2.setFont(f);Welcome2.setForeground(Color.RED);
		  		    				 To2=new JLabel("TO");admin_window_pic.add(To2);To2.setBounds(400,70,100,50);To2.setFont(f); To2.setForeground(Color.RED);To2.setFont(f);
		  		    				 Admin=new JLabel("ADMIN");admin_window_pic.add( Admin); Admin.setBounds(300,110,150,50); Admin.setFont(f);  Admin.setForeground(Color.RED); Admin.setFont(f);
		  		    				window=new JLabel("WINDOW");admin_window_pic.add(window);window.setBounds(430,110,150,50);window.setFont(f); window.setForeground(Color.RED);window.setFont(f);
		  		    				add_student=new JButton("ADD STUDENT"); admin_window_pic.add(add_student); add_student.setBounds(50,220,200,40); add_student.setForeground(Color.blue);add_student.setFont(f1);
		  		    				scholorship=new JButton("SCHOLOSHIP"); admin_window_pic.add(scholorship); scholorship.setBounds(320,220,200,40); scholorship.setForeground(Color.blue);scholorship.setFont(f1);
		  		    				student_fee_information=new JButton("REGISTERED COURSES"); admin_window_pic.add(student_fee_information); student_fee_information.setBounds(580,220,280,40); student_fee_information.setForeground(Color.blue);student_fee_information.setFont(f1);
		  		    				assignment=new JButton("ASSIGNMENT"); admin_window_pic.add(assignment); assignment.setBounds(50,350,200,40); assignment.setForeground(Color.blue);assignment.setFont(f1);
		  		    				quiz=new JButton("QUIZES"); admin_window_pic.add(quiz); quiz.setBounds(320,350,200,40); quiz.setForeground(Color.blue);quiz.setFont(f1);
		  		    		        marks=new JButton("MARKS"); admin_window_pic.add(marks); marks.setBounds(580,350,280,40); marks.setForeground(Color.blue);marks.setFont(f1);
		  		    		       result=new JButton("RESULT"); admin_window_pic.add( result);  result.setBounds(320,480,200,40);  result.setForeground(Color.blue); result.setFont(f1);
		  		    		     
		  		    		       add_student.addActionListener(new addstudent());   //ACTIONLISTENER FOR ADD STUDENT BUTTON
		  		    		       scholorship.addActionListener(new scholorship());  //ACTIONLISTENER FOR SCHOLORSHIP BUTTON
		  		    		       assignment.addActionListener(new assignment());      //ACTIONLISTENER FOR ASSIGNMENT BUTTON
		  		    		       marks.addActionListener(new mark());
		                			   
		                			   }
		                			   else
		                			   {
		                				   JFrame messagew=new JFrame();
		                				   messagew.setVisible(true);
		                				   messagew.setLayout(null);
		                				   messagew.setBounds(100,50,360,180);
		                				   Font f6=new Font("Serif", Font.BOLD, 15);
			    							JLabel pict=new JLabel(); messagew.add(pict);pict.setBounds(0, 0, 360, 180);pict.setIcon(new ImageIcon("E:\\image\7s.jpg"));
			    							JLabel submit3=new JLabel("WRONG ENTRY TRY AGAIN...");pict.add(submit3);submit3.setBounds(35,10,300,100);new Font("Serif", Font.BOLD, 25);submit3.setFont(f6);submit3.setForeground(Color.DARK_GRAY);    
		                				 
		                				   
		                			   }
		                		   }  
		                			   }
		                		   }
		                   
		                 /*******************************************************************************
		       		     *******************************************************************************
		       		     *                                                                             *
		       		     *                      ADMIN BACK AND EXIT BUTTON INNER CLASS                       *  
		       		     *                                                                             *
		       		     ******************************************************************************
		       		     *******************************************************************************/
		                  
		                   public class back implements ActionListener{                    // C.5
		                	   public void actionPerformed(ActionEvent e){
		                		   if(e.getSource()==admin_back){
		                				   Student_Admin.setVisible(true);
		                				   ADMIN.setVisible(false);
		                				   
		                	   }
		                			   if(e.getSource()==admin_exit){
		                				   ADMIN.setVisible(false);
		                				   
		                			   }
		                	   }
		                   }
		                     /*******************************************************************************
			       		     *******************************************************************************
			       		     *                                                                             *
			       		     *                      STUDENT BUTTON INNER CLASS                       *  
			       		     *                                                                             *
			       		     ******************************************************************************
			       		     *******************************************************************************/
		                  
		                   public class student implements ActionListener{             //C.6
		                	   public void actionPerformed(ActionEvent e){
		                		   if(e.getSource()==student){
		                			   JFrame student=new JFrame();
		                			   student.setVisible(true);
		                			   Student_Admin.setVisible(false);
		                			   Student_Admin.setVisible(false);
		                			   student.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                			   student.setLayout(null);
		                			   student.setBounds(100,50,900,600);
		                			   student_pic=new JLabel();student.add(student_pic); student_pic.setBounds(0,0,900,600);student_pic.setIcon(new ImageIcon("E:\\image\\3.jpg"));
		  		    				 Welcome2=new JLabel("WELCOME");student_pic.add(Welcome2);Welcome2.setBounds(350,20,300,50); Font f=new Font("Serif", Font.BOLD, 30);Welcome2.setFont(f);Welcome2.setForeground(Color.red);
				    				 To2=new JLabel("TO");student_pic.add(To2);To2.setBounds(400,70,100,50);To2.setFont(f); To2.setForeground(Color.RED);To2.setFont(f);
				    				 student_l=new JLabel("STUDENT");student_pic.add(student_l); student_l.setBounds(280,110,150,50);student_l.setFont(f);  student_l.setForeground(Color.RED); student_l.setFont(f);
				    				 login=new JLabel("LOGIN");student_pic.add(login);login.setBounds(450,110,150,50);login.setFont(f); login.setForeground(Color.RED);login.setFont(f);
				    				 student_rollno=new JLabel("ROLL  NO");student_pic.add(student_rollno);student_rollno.setBounds(20,210,200,40);student_rollno.setFont(f);student_rollno.setForeground(Color.green);
				    				 student_pass=new JLabel("PASSWORD");student_pic.add(student_pass);student_pass.setBounds(20,300,200,40);student_pass.setFont(f);student_pass.setForeground(Color.green); Font f3=new Font("Serif", Font.BOLD, 20);
				    				 String[] se={"FA01","FA02","FA03","FA04","FA05","FA06","FA07","FA08","FA09","FA10","FA11","FA12","FA13","FA14","FA15","FA16","SP01","SP02","SP03","SP04","SP05","SP06","SP07","SP08","SP09","SP10","SP11","SP12","SP13","SP14","SP15","SP16"};
				    					session=new JComboBox(se);student_pic.add(session);session.setBounds(230,210,100,40);session.setFont(f3);session.setForeground(Color.DARK_GRAY);
				    					String[] dep={"BCS","BTN","BTY","BSE","BBA","EEE","BES","ECE","CVE","BSS","BDS","BEE","BIT","BBA","MBA","MDS","MBO","MS(CE)","PCS","PDS","PEE",};
				    					department=new JComboBox(dep);department=new JComboBox(dep);student_pic.add(department);department.setBounds(350,210,100,40);department.setFont(f3);department.setForeground(Color.DARK_GRAY);
				    				    roll_no=new JTextField();student_pic.add(roll_no);roll_no.setBounds(470, 210, 180, 40);roll_no.setFont(f3);roll_no.setForeground(Color.DARK_GRAY);
		                		       student_Password=new JPasswordField();student_pic.add( student_Password); student_Password.setBounds(230,300,420,40); student_Password.setFont(f3); student_Password.setForeground(Color.DARK_GRAY);
		                		        student_icon2=new JLabel();student_pic.add(student_icon2);student_icon2.setBounds(640,0,600,380);student_icon2.setIcon(new ImageIcon("E:\\image\\Sa.png"));
		                		        sign_in=new JButton("LOGIN");student_pic.add(sign_in);sign_in.setBounds(350,400,110,40);sign_in.setFont(f3);sign_in.setForeground(Color.BLUE);
		                		      student_back=new JButton("BACK");student_pic.add(student_back);student_back.setBounds(0,520,100,40);student_back.setFont(f3);student_back.setForeground(Color.MAGENTA);
		   		    				  student_exit=new JButton("EXIT");student_pic.add(student_exit);student_exit.setBounds(805,520,100,40);student_exit.setFont(f3);student_exit.setForeground(Color.MAGENTA);
		                		      
		   		    				  sign_in.addActionListener(new student_login());          //ACTIONLISTENER FOR STUDENT SIGN IN BUTTON
		                		      student_back.addActionListener(new back1());            // ACTIONLISTENER FOR STUDENT BACK BUTTON
		                		      student_exit.addActionListener(new back1());           //ACTIONLISTENER FOR STUDENT EXIT BUTTON
		                		      
		                		      
		                		   }
		                		   
		                	   }
		                   }
		                   
		                    /*******************************************************************************
			       		     *******************************************************************************
			       		     *                                                                             *
			       		     *                      STUDENT SIGNIN BUTTON INNER CLASS                      *  
			       		     *                                                                             *
			       		     ******************************************************************************
			       		     *******************************************************************************/
		                    
		                   public class student_login implements ActionListener{          //C.7
		                	   public void actionPerformed(ActionEvent e){
		                		   if(e.getSource()==sign_in){
		                			   String session1=(String)session.getSelectedItem();
		                			   String depart=(String)department.getSelectedItem();
		                			   String rollno=roll_no.getText();
		                			  String passwrd= student_Password.getText();	                			   
		                			 if(session1.equals("FA16")&& depart.equals("BSE")&& rollno.equals("104")&&passwrd.equals("iqbal")||rollno.equals("189")&& passwrd.equals("shoaib") || rollno.equals("117")&& passwrd.equals("zia")|| rollno.equals("138")&& passwrd.equals("hamza")){
		                			  
		                			   student_login.setVisible(true);
		                			   student.setVisible(false);
		                			   student_login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                			   student_login.setLayout(null);
		                			   student_login.setBounds(100,50,900,600);
		                			   Font f1=new Font("Serif", Font.BOLD, 20);
		                			   student_window_pic=new JLabel(); student_login.add(student_window_pic);student_window_pic.setBounds(0,0,900,600);student_window_pic.setIcon(new ImageIcon("E:\\image\\std.jpg"));
		                			   Welcome2=new JLabel("WELCOME");student_window_pic.add(Welcome2);Welcome2.setBounds(350,20,300,50); Font f=new Font("Serif", Font.BOLD, 30);Welcome2.setFont(f);Welcome2.setForeground(Color.RED);
		  		    				 To2=new JLabel("TO");student_window_pic.add(To2);To2.setBounds(400,70,100,50);To2.setFont(f); To2.setForeground(Color.RED);To2.setFont(f);
		  		    				 student1=new JLabel("STUDENT");student_window_pic.add( student1); student1.setBounds(260,110,150,50); student1.setFont(f);  student1.setForeground(Color.RED);student1.setFont(f);
		  		    				window=new JLabel("WINDOW");student_window_pic.add(window);window.setBounds(440,110,150,50);window.setFont(f); window.setForeground(Color.RED);window.setFont(f);
		  		    				course_reg=new JButton("COURSE REGISTERATION"); student_window_pic.add(course_reg); course_reg.setBounds(10,220,300,40); course_reg.setForeground(Color.blue);course_reg.setFont(f1);
		  		    				disp_scholorship=new JButton(" DISPLAY SCHOLORSHIP"); student_window_pic.add(disp_scholorship); disp_scholorship.setBounds(350,220,265,40); disp_scholorship.setForeground(Color.blue);disp_scholorship.setFont(f1);
		  		    				disp_mark=new JButton("DISPLAY MARKS"); student_window_pic.add(disp_mark); disp_mark.setBounds(655,220,220,40); disp_mark.setForeground(Color.blue);disp_mark.setFont(f1);
		  		    				fee_information=new JButton("REGISTERED COURSES"); student_window_pic.add(fee_information); fee_information.setBounds(10,350,300,40); fee_information.setForeground(Color.blue);fee_information.setFont(f1);
		  		    				assignment2=new JButton("ASSIGNMENTS"); student_window_pic.add(assignment2); assignment2.setBounds(350,350,265,40); assignment2.setForeground(Color.blue);assignment2.setFont(f1);
		  		    		        quizes=new JButton("QUIZES"); student_window_pic.add(quizes); quizes.setBounds(655,350,220,40); quizes.setForeground(Color.blue);quizes.setFont(f1);
		  		    		       disp_result=new JButton("DISPALY RESULT"); student_window_pic.add(disp_result); disp_result.setBounds(350,480,265,40);  disp_result.setForeground(Color.blue); disp_result.setFont(f1);
		                			
		  		    		     course_reg.addActionListener(new course_reg());            //ACTIONLISTENER FOR COURSE REGISTERATION BUTTON.
		                		   
		                			 }
		                			   else
		                			   {
		                				  message1=new JLabel("WRONG ENTRY TRY AGAIN...."); student_pic.add(message1);message1.setBounds(270,500,300,50);Font f4=new Font("SansSerif", Font.BOLD, 20);message1.setFont(f4);message1.setForeground(Color.RED);
		                			   }
		                		   
		                		  }
		                	   
		                		   
		                	  }
		                   }
		                   
		                    /*******************************************************************************
			       		     *******************************************************************************
			       		     *                                                                             *
			       		     *                      STUDENT BACK AND EXIT BUTTON INNER CLASS               *  
			       		     *                                                                             *
			       		     ******************************************************************************
			       		     *******************************************************************************/
			                  
		                   public class back1 implements ActionListener{                    // C.8
		                	   public void actionPerformed(ActionEvent e){
		                		   if(e.getSource()==student_back){
		                			   Student_Admin.setVisible(true);
		                			   student.setVisible(false);
		                				   
		                	   }
		                			   if(e.getSource()==student_exit){
		                				   student.setVisible(false);
		                				   
		                			   }
		                   }   
		                   }
		                   /*******************************************************************************
			       		     *******************************************************************************
			       		     *                                                                             *
			       		     *                     ADD STUDENT BUTTON INNER CLASS               *  
			       		     *                                                                             *
			       		     ******************************************************************************
			       		     *******************************************************************************/
                              
		                   public class addstudent implements ActionListener{                        // C.9
		                	   public void actionPerformed(ActionEvent e){
		                		   if(e.getSource()==add_student){
		                			   JFrame add_students=new JFrame();
		                			   add_students.setVisible(true);
		                			   student_login.setVisible(false);
		                			   add_students.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                			   add_students.setLayout(null);
		                			   add_students.setBounds(100,50,1400,680);
		                			   Font f5= new Font("Serif", Font.BOLD, 30);
		                			   student_reg_pic=new JLabel();add_students.add( student_reg_pic); student_reg_pic.setBounds(0,0,1400,680); student_reg_pic.setIcon(new ImageIcon("E:\\image\\7s.jpg"));
		                			   student_reg=new JLabel("STUDENT REGISTERATION"); student_reg_pic.add(student_reg);  student_reg.setBounds(240,-60,500,160);  new Font("Serif", Font.BOLD, 30); student_reg.setFont(f5); student_reg.setForeground(Color.RED);            			   
		                			   window2=new JLabel("WINDOW"); student_reg_pic.add(  window2); window2.setBounds(360,-10,500,160);   new Font("Serif", Font.BOLD, 30); window2.setFont(f5); window2.setForeground(Color.ORANGE);            			    
		                			  Font f7= new Font("Serif", Font.BOLD, 19); 
		                			   student_name=new JLabel("NAME");student_reg_pic.add(student_name);student_name.setBounds(90,120,140,20); new Font("Serif", Font.BOLD, 15);student_name.setFont(f7);student_name.setForeground(Color.YELLOW);
		    							std_father_name=new JLabel("FATHER NAME");student_reg_pic.add(std_father_name);std_father_name.setBounds(90,180,160,20);new Font("Serif", Font.BOLD, 15);std_father_name.setFont(f7);std_father_name.setForeground(Color.YELLOW);
		    							std_email=new JLabel("EMAIL");student_reg_pic.add(std_email);std_email.setBounds(90,240,140,20);new Font("Serif", Font.BOLD, 15);std_email.setFont(f7);std_email.setForeground(Color.YELLOW);
		    							std_DOB=new JLabel("DATE OF BIRTH");student_reg_pic.add(std_DOB);std_DOB.setBounds(90,360,170,20);new Font("Serif", Font.BOLD, 15);std_DOB.setFont(f7);std_DOB.setForeground(Color.YELLOW);
		    							
		    							String[] day=new String[31];
		    							for(int i=1;i<=31;i++){
		    								day[i-1]=Integer.toString(i);
		    							date=new JComboBox(day);
		    							}
		    							date.setBounds(285, 360,50, 22);student_reg_pic.add(date);new Font("Serif", Font.BOLD, 15);date.setFont(f7);date.setForeground(Color.DARK_GRAY);student_reg_pic.add(date);
		    								String[] mon={"january","february","march","april","may","june","july","august","september","october","november","december"};
		    								month=new JComboBox(mon);student_reg_pic.add(month);month.setBounds(355,360,120,22);new Font("Serif", Font.BOLD, 15);month.setFont(f7);month.setForeground(Color.DARK_GRAY);student_reg_pic.add(month);
		    							String [] years=new String[119];
		    								for(int i=0;i<=118;i++){
		    									years[i]=Integer.toString(y);
		    									y++;
		    									year=new JComboBox(years);
		    								}
		    								year.setBounds(500,360,70,22);student_reg_pic.add(year);new Font("Serif", Font.BOLD, 15);year.setFont(f7);year.setForeground(Color.DARK_GRAY);
		    								gender=new JLabel("GENDER");student_reg_pic.add(gender);gender.setBounds(90,420,140,22);new Font("Serif", Font.BOLD, 15);gender.setFont(f7);gender.setForeground(Color.YELLOW);
		    							std_cell_no=new JLabel("CELL NO");student_reg_pic.add(std_cell_no);std_cell_no.setBounds(90,300,140,22);new Font("Serif", Font.BOLD, 15);std_cell_no.setFont(f7);std_cell_no.setForeground(Color.YELLOW);
		    							std_cnic=new JLabel("CNIC");student_reg_pic.add(std_cnic);std_cnic.setBounds(90,480,140,22);new Font("Serif", Font.BOLD, 15);std_cnic.setFont(f7);std_cnic.setForeground(Color.YELLOW);
		    							std_res_address=new JLabel("RESIDENTIAL ADDRESS");student_reg_pic.add(std_res_address);std_res_address.setBounds(90,560, 250, 22);new Font("Serif", Font.BOLD, 15);std_res_address.setFont(f7);std_res_address.setForeground(Color.YELLOW);
		    							res_add_area=new JTextArea();student_reg_pic.add(res_add_area);res_add_area.setBounds(345,530,300,80);new Font("Serif", Font.BOLD, 15);res_add_area.setFont(f7);std_res_address.setForeground(Color.YELLOW);
		    							std_per_add=new JLabel("PERMANNET ADDRESS");student_reg_pic.add(std_per_add);std_per_add.setBounds(640,120,250,20);new Font("Serif", Font.BOLD, 15);std_per_add.setFont(f7);std_per_add.setForeground(Color.YELLOW);
		    						    per_add_area=new JTextArea();student_reg_pic.add(per_add_area);per_add_area.setBounds(880,100,300,80);new Font("Serif", Font.BOLD, 15);per_add_area.setFont(f7);per_add_area.setForeground(Color.DARK_GRAY);
		    							std_nationality=new JLabel("NATIONALITY");student_reg_pic.add(std_nationality);std_nationality.setBounds(640,220,160,22);new Font("Serif", Font.BOLD, 15);std_nationality.setFont(f7);std_nationality.setForeground(Color.YELLOW);
		    							String nationality1[]={"USA","Iran","Afghanistan","India","UK","UAE","Pakistan","Russia","Germani","Saudi Arabia","China","Japan","Turkey","England","Australia","Canda","Itly","Ireland","South Africa"};
		    							nationality=new JComboBox(nationality1);student_reg_pic.add(nationality);nationality.setBounds(880,220,150,22);new Font("Serif", Font.BOLD, 15);nationality.setFont(f7);nationality.setForeground(Color.DARK_GRAY);
		    							std_reg_chkbx=new JCheckBox("I AGREE THE ABOVE INFORMATION ARE CORRECT");student_reg_pic.add(std_reg_chkbx);std_reg_chkbx.setBounds(690,350,530,17);new Font("Serif", Font.BOLD, 15);std_reg_chkbx.setFont(f7);std_reg_chkbx.setForeground(Color.BLUE);
		    							add_btn=new JButton("ADD");student_reg_pic.add(add_btn);add_btn.setBounds(920,450,100,40);new Font("Serif", Font.BOLD, 15);add_btn.setFont(f7);add_btn.setForeground(Color.RED);
		    							name_txt=new JTextField();student_reg_pic.add(name_txt);name_txt.setBounds(285,120,180,30);name_txt.getText();new Font("Serif", Font.BOLD, 15);name_txt.setFont(f7);name_txt.setForeground(Color.DARK_GRAY);
		    							father_txt=new JTextField();student_reg_pic.add(father_txt);father_txt.setBounds(285, 180, 180, 30);father_txt.getText();new Font("Serif", Font.BOLD, 15);father_txt.setFont(f7);father_txt.setForeground(Color.DARK_GRAY);
		    							email=new JTextField();student_reg_pic.add(email);email.setBounds(285, 240, 180, 30);email.getText();;new Font("Serif", Font.BOLD, 15);email.setFont(f7);email.setForeground(Color.DARK_GRAY);
		    							cell_txt=new JTextField();student_reg_pic.add(cell_txt);cell_txt.setBounds(285, 300, 180, 30);cell_txt.getText();;new Font("Serif", Font.BOLD, 15);cell_txt.setFont(f7);cell_txt.setForeground(Color.DARK_GRAY);
		    							male_r=new JRadioButton("Male");student_reg_pic.add(male_r);male_r.setBounds(285,420,80,25);;
		    							female_r=new JRadioButton("Female");student_reg_pic.add(female_r); female_r.setBounds(380,420,80,25);
		    							cnic_txt=new JTextField();student_reg_pic.add(cnic_txt);cnic_txt.setBounds(285, 480, 180, 30);cnic_txt.getText();;new Font("Serif", Font.BOLD, 15);cnic_txt.setFont(f7);cnic_txt.setForeground(Color.DARK_GRAY);
		    							ButtonGroup gender=new ButtonGroup();
		    							gender.add(male_r);
		    							gender.add(female_r);
		    							
		    							add_btn.addActionListener(new Add());  //ACTIONLISTNER FOR SUBMIT BUTTON 
		    						}
		                	   }
		    					
		    				/*******************************************************************************
			       		     *******************************************************************************
			       		     *                                                                             *
			       		     *                     ADD BUTTON INNER CLASS                          *  
			       		     *                                                                             *
			       		     ******************************************************************************
			       		     *******************************************************************************/
                              public class Add implements ActionListener{             //C.10
                            	  public void actionPerformed(ActionEvent e){
                              
		    				if(e.getSource()==add_btn){
		    						if(std_reg_chkbx.isSelected()==true){
		    							String name=name_txt.getText();
		    							String father_name=father_txt.getText();
		    							String email1=email.getText();
		    							String day1=(String)date.getSelectedItem();
		    							String month1=(String)month.getSelectedItem();
		    							String year1=(String)year.getSelectedItem();
		    							String nation=(String)nationality.getSelectedItem();
		    							String gend="MALE";
		    							if(female_r.isSelected()==true){
		    								 gend="FEMALE";
		    							}
		    							String cell_no=cell_txt.getText();
		    							String r_add=res_add_area.getText();
		    							String p_add=per_add_area.getText();
		    							JFrame stor=new JFrame();
		    							stor.setBounds(100,50,900,600);
		    							stor.setLayout(null);
		    							stor.setVisible(true);
		    							JLabel set_pic;
		    							set_pic=new JLabel();
		    							stor.add(set_pic);set_pic.setBounds(0,0,900,600);set_pic.setIcon(new ImageIcon("E:\\image\\r.jpg"));
		    							JTextArea a;
		    							a=new JTextArea();set_pic.add(a);a.setBounds(0,0,900,600);Font f6=new Font("Serif", Font.BOLD, 20);a.setFont(f6);a.setForeground(Color.DARK_GRAY);    
		    							a.setText("STUDENT ARE REGISTERED SUCCESSFULLY\n\n"+"name:\t\t"+name+"\n\n father name:\t\t"+father_name+"\n\n email:\t\t"+email1+"\n\nDOB:\t\t"+day1+""+month1+""+year1+"\n\nGender:\t\t"+gend+"\n\nReidential address:\t"+r_add+"\n\nPermanent address:\t"+p_add+"\n\nNationality:\t\t"+nation);
		    						}
		    						else
		    						{
		    							JFrame chkbox=new JFrame();
		    							chkbox.setVisible(true);
		    							chkbox.setLayout(null);
		    							chkbox.setBounds(100,50,360,180);
		    							JLabel pic=new JLabel();chkbox.add(pic);pic.setBounds(0, 0, 360, 180);pic.setIcon(new ImageIcon("E:\\image\\7s.jpg"));
		    							JLabel submit2=new JLabel("FIRST CONFIRM THE INFORMATION");pic.add(submit2);submit2.setBounds(20,10,300,100);Font f6=new Font("Serif", Font.BOLD, 15);submit2.setFont(f6);submit2.setForeground(Color.DARK_GRAY);    
                            	  }
		    					}
                            	  }
                              }
		                   }
		                    /*******************************************************************************
			       		     *******************************************************************************
			       		     *                                                                             *
			       		     *                     SCHOLORSHIP BUTTON INNER CLASS                               *  
			       		     *                                                                             *
			       		     ******************************************************************************
			       		     *******************************************************************************/
		                    
		                   public class scholorship implements ActionListener{              //C.11
		                	   public void actionPerformed(ActionEvent e){
		                		   JFrame scholor=new JFrame();
		                		   scholor.setVisible(true);
		                		   scholor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                		   scholor.setLayout(null);
		                		   scholor.setBounds(100,50,900,600);
		                		   Font f8=new Font("Serif", Font.BOLD, 25);
		                		  
		                		   scholorship_pic=new JLabel(); scholor.add(scholorship_pic); scholorship_pic.setBounds(0,0,900,600);scholorship_pic.setIcon(new ImageIcon("E:\\image\\sch.jpg"));
		                		   hec_scholor=new JButton("HEC");scholorship_pic.add(hec_scholor);hec_scholor.setBounds(55,350,120,40);hec_scholor.setFont(f8);hec_scholor.setForeground(Color.RED);
		                		   usaid_scholor=new JButton("USAID");scholorship_pic.add(usaid_scholor);usaid_scholor.setBounds(55,420,120,40);usaid_scholor.setFont(f8);usaid_scholor.setForeground(Color.RED);
		                		   wwb_scholor=new JButton("WWB");scholorship_pic.add(wwb_scholor);wwb_scholor.setBounds(55,490,120,40);wwb_scholor.setFont(f8);wwb_scholor.setForeground(Color.RED);
		                	       
		                		   hec_scholor.addActionListener(new hec_scholorship());     //ACTIONLISTENER FOR HEC   SCHOLORSHIP BUTTON
		                	       usaid_scholor.addActionListener(new usaid());            //ACTIONLISTENER  FOR USAID SCHOLORSHIP BUTTON
		                	       wwb_scholor.addActionListener(new wwb());                //ACTIONLISTENER  FOR WWB   SCHOLORSHIP BUTTON
		                	   }
		                   }
		                   
		                    /*******************************************************************************
			       		     *******************************************************************************
			       		     *                                                                             *
			       		     *                    HEC SCHOLORSHIP BUTTON INNER CLASS                       *  
			       		     *                                                                             *
			       		     ******************************************************************************
			       		     *******************************************************************************/
		                    
		                   public class hec_scholorship implements ActionListener{                       // C.12
		                	   public void actionPerformed(ActionEvent e){
		                		   JFrame hec=new JFrame();
		                		   hec.setVisible(true);
		                		   hec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                		   hec.setLayout(null);
		                		   hec.setBounds(100,50,900,600);
		                		  Font f9=new Font("Serif", Font.BOLD, 25);
		                		  Font f10=new Font("Serif", Font.BOLD, 17);
		                		   hec_sch_pic=new JLabel();hec.add(hec_sch_pic);hec_sch_pic.setBounds(0,0,900,600);hec_sch_pic.setIcon(new ImageIcon("E:\\image\\ee.jpeg"));
		                		  hec_label=new JLabel("HEC NEED BASE SCHOLORSHIP");hec_sch_pic.add(hec_label);hec_label.setBounds(260,30,400,40);hec_label.setFont(f9);hec_label.setForeground(Color.RED);
		                		  
		                		  scholorship();     //CALLING SCHOLORSHIP FUNCTION.      
		                	   }
		                   }
		                   
		                   /*******************************************************************************
			       		     *******************************************************************************
			       		     *                                                                             *
			       		     *                    USAID SCHOLORSHIP BUTTON INNER CLASS                       *  
			       		     *                                                                             *
			       		     ******************************************************************************
			       		     *******************************************************************************/
		                   
		                     public class usaid implements ActionListener{                  //C.13
		                	   public void actionPerformed(ActionEvent e){
		                		   
		                		   JFrame usaid=new JFrame();
		                		   usaid.setVisible(true);
		                		   usaid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                		   usaid.setLayout(null);
		                		   usaid.setBounds(100,50,900,600);
		                		   Font f9=new Font("Serif", Font.BOLD, 25);
			                		  Font f10=new Font("Serif", Font.BOLD, 17);
			                		  hec_sch_pic=new JLabel();usaid.add(hec_sch_pic);hec_sch_pic.setBounds(0,0,900,600);hec_sch_pic.setIcon(new ImageIcon("E:\\image\\ss.jpg"));
			                		  hec_label=new JLabel("USAID NEED BASE SCHOLORSHIP");hec_sch_pic.add(hec_label);hec_label.setBounds(260,30,440,40);hec_label.setFont(f9);hec_label.setForeground(Color.RED);
		                		
			                		  scholorship();                    // CALLING SCHOLOSHIP FUNCTION.
		                	   }
		                   }
		                   
		                        /*******************************************************************************
				       		     *******************************************************************************
				       		     *                                                                             *
				       		     *                    WWB SCHOLORSHIP BUTTON INNER CLASS                       *  
				       		     *                                                                             *
				       		     ******************************************************************************
				       		     *******************************************************************************/
		                   
		                        public class wwb implements ActionListener{                    //C.14
		                	   public void actionPerformed(ActionEvent e){
		                		   
		                		   JFrame wwb=new JFrame();
		                		   wwb.setVisible(true);
		                		   wwb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                		   wwb.setLayout(null);
		                		   wwb.setBounds(100,50,900,600);
		                		   Font f9=new Font("Serif", Font.BOLD, 25);
			                		  Font f10=new Font("Serif", Font.BOLD, 17);
			                		  hec_sch_pic=new JLabel();wwb.add(hec_sch_pic);hec_sch_pic.setBounds(0,0,900,600);hec_sch_pic.setIcon(new ImageIcon("E:\\image\\3.jpg"));
			                		  hec_label=new JLabel("WWB NEED BASE SCHOLORSHIP");hec_sch_pic.add(hec_label);hec_label.setBounds(260,30,440,40);hec_label.setFont(f9);hec_label.setForeground(Color.RED);
		                		
			                		  scholorship();                    //CALLING SCHOLORSHIP FUNCTION.
		                	   }
		                   }
		                        /*******************************************************************************
				       		     *******************************************************************************
				       		     *                                                                             *
				       		     *                     ASSIGNMENT BUTTON INNER CLASS                           *  
				       		     *                                                                             *
				       		     *******************************************************************************
				       		     *******************************************************************************/
		                        
		                        
		                        public class assignment implements ActionListener{                 //C.15
		                        	public void actionPerformed(ActionEvent e){
		                        		JFrame assgn=new JFrame();
		                        		assgn.setVisible(true);
		                        		assgn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                        		assgn.setLayout(null);
		                        		assgn.setBounds(100,50,900,600);
		                        		Font f11=new Font("Serif", Font.BOLD, 25);
		                        	assign_pic=new JLabel();assgn.add(assign_pic);assign_pic.setBounds(0,0,900,600);assign_pic.setIcon(new ImageIcon("E:\\image\\b.jpg"));
		                        	oop_btn=new JButton("OOP");assign_pic.add(oop_btn);oop_btn.setBounds(240,200,100,40);oop_btn.setFont(f11);oop_btn.setForeground(Color.RED);
		                        	eca_btn=new JButton("ECA");assign_pic.add(eca_btn);eca_btn.setBounds(400,200,100,40);eca_btn.setFont(f11);eca_btn.setForeground(Color.RED);
		                        	se_btn=new JButton("SE");assign_pic.add(se_btn);se_btn.setBounds(560,200,100,40);se_btn.setFont(f11);se_btn.setForeground(Color.RED);
		                        	pakstdy_btn=new JButton("P-STUDY");assign_pic.add(pakstdy_btn);pakstdy_btn.setBounds(270,320,160,40);pakstdy_btn.setFont(f11);pakstdy_btn.setForeground(Color.BLUE);
		                        	rwriting_btn=new JButton("R-WRITING");assign_pic.add(rwriting_btn);rwriting_btn.setBounds(450,320,180,40);rwriting_btn.setFont(f11);rwriting_btn.setForeground(Color.BLUE);
		                        	cal2_btn=new JButton("CALCULUS-2");assign_pic.add(cal2_btn);cal2_btn.setBounds(350,440,200,40);cal2_btn.setFont(f11);cal2_btn.setForeground(Color.MAGENTA);
		                        	
		                        	oop_btn.addActionListener(new oop());                    // ACTIONLISTENER FOR OOP       BUTTON.
		                        	eca_btn.addActionListener(new eca());                   // ACTIONLISTENER  FOR ECA       BUTTON.
		                        	se_btn.addActionListener(new se());                    // ACTIONLISTENER   FOR SE        BUTTON.
		                        	pakstdy_btn.addActionListener(new p_study());         // ACTIONLISTENER    FOR P_STDY    BUTTON.
		                        	rwriting_btn.addActionListener(new r_wrtng());       // ACTIONLISTENER     FOR R_WRITING BUTTON.
		                        	cal2_btn.addActionListener(new cal2());             // ACTIONLISTENER      FOR CAL       BUTTON.
		                        	}
		                        }
		                        
		                        /*******************************************************************************
				       		     *******************************************************************************
				       		     *                                                                             *
				       		     *                     OOP BUTTON INNER CLASS                                  *  
				       		     *                                                                             *
				       		     *******************************************************************************
				       		     *******************************************************************************/
		                        
		                        public class oop implements ActionListener{                                //C.16
		                        	public void actionPerformed(ActionEvent e){
		                        		JFrame oop=new JFrame();
		                        		 oop.setVisible(true);
		                        		 oop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                        		 oop.setLayout(null);
		                        		 oop.setBounds(100,50,900,600);
		                        		 Font f12=new Font("Serif", Font.BOLD, 25);
		                        		 Font f13=new Font("Serif", Font.BOLD, 20);
                        		oop_pic=new JLabel(); oop.add(oop_pic);oop_pic.setBounds(0,0,900,600);oop_pic.setIcon(new ImageIcon("E:\\image\\3.jpg"));
		                        oop_lbl=new JLabel("OBJECT ORIENTED PROGRAMMING(OOP)");	oop_pic.add( oop_lbl); oop_lbl.setBounds(200,30,550,40);oop_lbl.setFont(f12);oop_lbl.setForeground(Color.GREEN);
		                        	assignment();                    //   CALLING ASSIGNMENT FUNCTION.
		                        	
		                        	}
		                        }
		                        /*******************************************************************************
				       		     *******************************************************************************
				       		     *                                                                             *
				       		     *                    ECA BUTTON INNER CLASS                                   *  
				       		     *                                                                             *
				       		     *******************************************************************************
				       		     *******************************************************************************/
		                      
		                        public class eca implements ActionListener{                              //C.17
		                        	public void actionPerformed(ActionEvent e){
		                        		JFrame eca=new JFrame();
		                        		eca.setVisible(true);
		                        		eca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                        		eca.setLayout(null);
		                        		eca.setBounds(100,50,900,600);
		                        		 Font f12=new Font("Serif", Font.BOLD, 25);
		                        		 Font f13=new Font("Serif", Font.BOLD, 20);
                       		             oop_pic=new JLabel();eca.add(oop_pic);oop_pic.setBounds(0,0,900,600);oop_pic.setIcon(new ImageIcon("E:\\image\\r.jpg"));
		                                 oop_lbl=new JLabel("ELECTRIC CIRCUIT ANALYSIS(ECA)");	oop_pic.add( oop_lbl); oop_lbl.setBounds(200,30,550,40);oop_lbl.setFont(f12);oop_lbl.setForeground(Color.CYAN);	
		                                 assignment();               //   CALLING ASSIGNMENT FUNCTION.
		                        	}
		                        }
		                        /*******************************************************************************
				       		     *******************************************************************************
				       		     *                                                                             *
				       		     *                    SE BUTTON INNER CLASS                                    *  
				       		     *                                                                             *
				       		     *******************************************************************************
				       		     *******************************************************************************/
		                        
		                        public class se implements ActionListener{                      //C.18
		                        	public void actionPerformed(ActionEvent e){  
		                        		JFrame se=new JFrame();
		                        		se.setVisible(true);
		                        		se.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                        		se.setLayout(null);
		                        		se.setBounds(100,50,900,600);
		                        		 Font f12=new Font("Serif", Font.BOLD, 25);
		                        		 Font f13=new Font("Serif", Font.BOLD, 20);
                       		             oop_pic=new JLabel();se.add(oop_pic);oop_pic.setBounds(0,0,900,600);oop_pic.setIcon(new ImageIcon("E:\\image\\ee.jpeg"));
		                                 oop_lbl=new JLabel("SOFTWRE ENGINEERING(SE)");	oop_pic.add( oop_lbl); oop_lbl.setBounds(200,30,550,40);oop_lbl.setFont(f12);oop_lbl.setForeground(Color.CYAN);	
		                                 assignment();                 //   CALLING ASSIGNMENT FUNCTION.
		                        	}
		                        }
		                        /*******************************************************************************
				       		     *******************************************************************************
				       		     *                                                                             *
				       		     *                     CAL2 BUTTON INNER CLASS                                 *  
				       		     *                                                                             *
				       		     *******************************************************************************
				       		     *******************************************************************************/
		                        
		                        public class cal2 implements ActionListener{                //C.19
		                        	public void actionPerformed(ActionEvent e){
		                        		JFrame cal=new JFrame();
		                        		 cal.setVisible(true);
		                        		 cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                        		 cal.setLayout(null);
		                        		 cal.setBounds(100,50,900,600);
		                        		 Font f12=new Font("Serif", Font.BOLD, 25);
		                        		 Font f13=new Font("Serif", Font.BOLD, 20);
                       		             oop_pic=new JLabel(); cal.add(oop_pic);oop_pic.setBounds(0,0,900,600);oop_pic.setIcon(new ImageIcon("E:\\image\\ss.jpg"));
		                                 oop_lbl=new JLabel("MULTIVARAIBLE CALCULUS(CAL2)");oop_pic.add( oop_lbl); oop_lbl.setBounds(200,30,550,40);oop_lbl.setFont(f12);oop_lbl.setForeground(Color.GREEN);	
		                                 assignment();                    //   CALLING ASSIGNMENT FUNCTION.
		                        	}
		                        }
		                        /*******************************************************************************
				       		     *******************************************************************************
				       		     *                                                                             *
				       		     *                    R_WRITING BUTTON INNER CLASS                             *  
				       		     *                                                                             *
				       		     *******************************************************************************
				       		     *******************************************************************************/
		                       
		                        public class r_wrtng implements ActionListener{                     //C.20
		                        	public void actionPerformed(ActionEvent e){
		                        		JFrame rp_r=new JFrame();
		                        		rp_r.setVisible(true);
		                        		rp_r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                        		rp_r.setLayout(null);
		                        		rp_r.setBounds(100,50,900,600);
		                        		 Font f12=new Font("Serif", Font.BOLD, 25);
		                        		 Font f13=new Font("Serif", Font.BOLD, 20);
                       		             oop_pic=new JLabel();rp_r.add(oop_pic);oop_pic.setBounds(0,0,900,600);oop_pic.setIcon(new ImageIcon("E:\\image\\std.jpg"));
		                                 oop_lbl=new JLabel("REPORT WRITING(RP-R)");oop_pic.add( oop_lbl); oop_lbl.setBounds(200,30,550,40);oop_lbl.setFont(f12);oop_lbl.setForeground(Color.BLUE);	
		                                 assignment();                       //   CALLING ASSIGNMENT FUNCTION.
		                        	}
		                        }
		                        /*******************************************************************************
				       		     *******************************************************************************
				       		     *                                                                             *
				       		     *                    P_STUDY BUTTON INNER CLASS                               *  
				       		     *                                                                             *
				       		     *******************************************************************************
				       		     *******************************************************************************/
		                      
		                        public class p_study implements ActionListener{                      // C.21
		                        	public void actionPerformed(ActionEvent e){
		                        		JFrame p_stdy=new JFrame();
		                        		p_stdy.setVisible(true);
		                        		p_stdy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                        		p_stdy.setLayout(null);
		                        		p_stdy.setBounds(100,50,900,600);
		                        		 Font f12=new Font("Serif", Font.BOLD, 25);
		                        		 Font f13=new Font("Serif", Font.BOLD, 20);
                       		             oop_pic=new JLabel();p_stdy.add(oop_pic);oop_pic.setBounds(0,0,900,600);oop_pic.setIcon(new ImageIcon("E:\\image\\sc.jpg"));
		                                 oop_lbl=new JLabel("PAKISTAN STUDY(P-STUDY)");	oop_pic.add( oop_lbl); oop_lbl.setBounds(200,30,550,40);oop_lbl.setFont(f12);oop_lbl.setForeground(Color.BLUE);	
		                                 
		                                 assignment();                         //   CALLING ASSIGNMENT FUNCTION.
		                        	}
		                        }
		                        /*******************************************************************************
				       		     *******************************************************************************
				       		     *                                                                             *
				       		     *               COURSE REGISTERATION BUTTON INNER CLASS                       *  
				       		     *                                                                             *
				       		     *******************************************************************************
				       		     *******************************************************************************/
		                      
		                        public class course_reg implements ActionListener{                                          // C.22
		                        	public void actionPerformed(ActionEvent e){
		                        		JFrame crs_reg=new JFrame();
		                        		crs_reg.setVisible(true);
		                        		crs_reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                        		crs_reg.setLayout(null);
		                        		crs_reg.setBounds(100,50,900,600);
		                        		Font f14=new Font("Serif", Font.BOLD, 20);
		                        		course_reg_pic=new JLabel();crs_reg.add(course_reg_pic);course_reg_pic.setBounds(0,0,900,600);course_reg_pic.setIcon(new ImageIcon("E:\\image\\b.jpg"));
		                        		 Welcome2=new JLabel("WELCOME");course_reg_pic.add(Welcome2);Welcome2.setBounds(350,20,300,50); Font f=new Font("Serif", Font.BOLD, 30);Welcome2.setFont(f);Welcome2.setForeground(Color.CYAN);
		    		    				 To2=new JLabel("TO");course_reg_pic.add(To2);To2.setBounds(410,70,100,50);To2.setFont(f); To2.setForeground(Color.GREEN);To2.setFont(f);
		    		    				 course_reg_lbl=new JLabel("COURSE REGISTERATION WINDOW");course_reg_pic.add(course_reg_lbl);course_reg_lbl.setBounds(160,110,550,50); course_reg_lbl.setForeground(Color.YELLOW);course_reg_lbl.setFont(f);
		    		    				 oop_chkbx=new JCheckBox("OBJECT ORIENTED PROGRAMMING(OOP)");course_reg_pic.add(oop_chkbx);oop_chkbx.setBounds(40,180,440,20);oop_chkbx.setFont(f14);oop_chkbx.setForeground(Color.RED);
		    		    				 eca_chkbx=new JCheckBox("ELECTRIC CIRCUIT ANALYSIS (ECA)");course_reg_pic.add( eca_chkbx); eca_chkbx.setBounds(40,210,440,20); eca_chkbx.setFont(f14); eca_chkbx.setForeground(Color.RED); 
		    		    				 se_chkbx=new JCheckBox("SOFTWARE ENGINEERING (SE)");course_reg_pic.add(se_chkbx);se_chkbx.setBounds(40,240,440,20);se_chkbx.setFont(f14);se_chkbx.setForeground(Color.RED);
		    		    				 p_stdy_chkbx=new JCheckBox("PAKISTAN STUDY (PAK-STUDY)");course_reg_pic.add(p_stdy_chkbx);p_stdy_chkbx.setBounds(40,270,440,20);p_stdy_chkbx.setFont(f14);p_stdy_chkbx.setForeground(Color.RED);
		    		    				 cal1_chkbx=new JCheckBox("CALCULUS AND ANALYTICAL GEOMENTRY");course_reg_pic.add(cal1_chkbx);cal1_chkbx.setBounds(40,300,440,20);cal1_chkbx.setFont(f14);cal1_chkbx.setForeground(Color.RED);
		    		    				 cal2_chkbx=new JCheckBox("MULTIVARIABLE CALCULUS(CAL2)");course_reg_pic.add(cal2_chkbx);cal2_chkbx.setBounds(40,330,440,20);cal2_chkbx.setFont(f14);cal2_chkbx.setForeground(Color.RED);
		    		    				 r_w_chkbx=new JCheckBox("REPORT WRITING SKILL(R-WRITING)");course_reg_pic.add(r_w_chkbx);r_w_chkbx.setBounds(40,360,440,20);r_w_chkbx.setFont(f14);r_w_chkbx.setForeground(Color.RED);
		    		    				 mangmnet_chkbx=new JCheckBox("MAMAGMENT SCIENCE (M-SCIENCE)");course_reg_pic.add(mangmnet_chkbx); mangmnet_chkbx.setBounds(40,390,440,20); mangmnet_chkbx.setFont(f14); mangmnet_chkbx.setForeground(Color.RED);
		    		    				 itcp_chkbx=new JCheckBox("INTRO.. TO COMP.. AND PROG..(ITCP)");course_reg_pic.add(itcp_chkbx);itcp_chkbx.setBounds(40,420,440,20);itcp_chkbx.setFont(f14);itcp_chkbx.setForeground(Color.RED);
		                        	     reg_btn=new JButton("REGISTER");course_reg_pic.add(reg_btn);reg_btn.setBounds(400,500,140,40);reg_btn.setFont(f14);reg_btn.setForeground(Color.RED);setFont(f14);reg_btn.setForeground(Color.BLUE);
		                        	}
		                        }
		                        /*******************************************************************************
				       		     *******************************************************************************
				       		     *                                                                             *
				       		     *               MARKS BUTTON INNER CLASS                                      *  
				       		     *                                                                             *
				       		     *******************************************************************************
				       		     ******************************************************************************/
		                        
		                        public class mark implements ActionListener{                   //C.23
		                        	public void actionPerformed(ActionEvent e){
		                        		JFrame mark=new JFrame();
		                        		mark.setVisible(true);
		                        		mark.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                        		mark.setLayout(null);
		                        		mark.setBounds(100,50,900,600);
		                        		Font f11=new Font("Serif", Font.BOLD, 25);
			                        	assign_pic=new JLabel();mark.add(assign_pic);assign_pic.setBounds(0,0,900,600);assign_pic.setIcon(new ImageIcon("E:\\image\\p.jpg"));  //p.
			                        	oop_btn=new JButton("OOP");assign_pic.add(oop_btn);oop_btn.setBounds(240,200,100,40);oop_btn.setFont(f11);oop_btn.setForeground(Color.RED);
			                        	eca_btn=new JButton("ECA");assign_pic.add(eca_btn);eca_btn.setBounds(400,200,100,40);eca_btn.setFont(f11);eca_btn.setForeground(Color.RED);
			                        	se_btn=new JButton("SE");assign_pic.add(se_btn);se_btn.setBounds(560,200,100,40);se_btn.setFont(f11);se_btn.setForeground(Color.RED);
			                        	pakstdy_btn=new JButton("P-STUDY");assign_pic.add(pakstdy_btn);pakstdy_btn.setBounds(270,320,160,40);pakstdy_btn.setFont(f11);pakstdy_btn.setForeground(Color.BLUE);
			                        	rwriting_btn=new JButton("R-WRITING");assign_pic.add(rwriting_btn);rwriting_btn.setBounds(450,320,180,40);rwriting_btn.setFont(f11);rwriting_btn.setForeground(Color.BLUE);
			                        	cal2_btn=new JButton("CALCULUS-2");assign_pic.add(cal2_btn);cal2_btn.setBounds(350,440,200,40);cal2_btn.setFont(f11);cal2_btn.setForeground(Color.MAGENTA);
			                        	
		                        	
		                        	}
		                        }
		   ///////////////////////////////////////////////////
		                   
		  //                   MAIN METHOD                 //
		                   
		  ///////////////////////////////////////////////////                 
	    
		public static  void main(String[] args) {
		JFrame f=new Portal();
        f.setVisible(true);
        f.setBounds(100,50,900,650);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

		                   }
