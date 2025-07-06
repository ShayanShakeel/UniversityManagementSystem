package package1;

import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class showresult extends javax.swing.JFrame {

    public showresult() {
        initComponents();
        btnup.setBackground(new java.awt.Color(0, 0, 0, 100));
         
        try
        {
            Conn c = new Conn();
            ResultSet rs = c.stmt.executeQuery("select * from student");
            while(rs.next())
            {
                choice.add(rs.getString("rollno"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
          
        choice.addItemListener(new ItemListener(){
            
        public void itemStateChanged(ItemEvent ie)
        {
        try
        {
            Conn c = new Conn();
            String q = "select  * from subject where rollno='"+choice.getSelectedItem()+"'";
            ResultSet rs = c.stmt.executeQuery(q);
            while(rs.next())
            {
                 sub1lbl.setText(rs.getString("subject1"));
                 sub2lbl.setText(rs.getString("subject2"));
                 sub3lbl.setText(rs.getString("subject3"));
                 sub4lbl.setText(rs.getString("subject4"));
                 sub5lbl.setText(rs.getString("subject5"));
                 sub6lbl.setText(rs.getString("subject6"));
                 sub7lbl.setText(rs.getString("subject7"));
                 sub8lbl.setText(rs.getString("subject8"));
                 sem.setText(rs.getNString("semester"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        } 
        
        try
        {
            Conn c = new Conn();
            String q1 = "select  * from marks where rollno='"+choice.getSelectedItem()+"'";
            ResultSet rs1 = c.stmt.executeQuery(q1);
         
            while(rs1.next())
                {
                 marks1lbl.setText(rs1.getString("marks1"));
                 marks2lbl.setText(rs1.getString("marks2"));
                 marks3lbl.setText(rs1.getString("marks3"));
                 marks4lbl.setText(rs1.getString("marks4"));
                 marks5lbl.setText(rs1.getString("marks5"));
                 marks6lbl.setText(rs1.getString("marks6"));
                 marks7lbl.setText(rs1.getString("marks7"));
                 marks8lbl.setText(rs1.getString("marks8"));
                }  
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
          try
          {
                   Conn c = new Conn();
                   String q = "select * from student where rollno='"+choice.getSelectedItem()+"'";
                   ResultSet rs2 = c.stmt.executeQuery(q);
                   while(rs2.next())
                {
                    name.setText(rs2.getString("name"));
                }
          }
         catch(Exception e)
         {
              e.printStackTrace();
         }
         
        }    
        });         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        btnup = new rojerusan.RSMaterialButtonRectangle();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sub1lbl = new javax.swing.JLabel();
        sub2lbl = new javax.swing.JLabel();
        marks1lbl = new javax.swing.JLabel();
        marks2lbl = new javax.swing.JLabel();
        sub3lbl = new javax.swing.JLabel();
        marks3lbl = new javax.swing.JLabel();
        marks4lbl = new javax.swing.JLabel();
        sub4lbl = new javax.swing.JLabel();
        sub5lbl = new javax.swing.JLabel();
        marks5lbl = new javax.swing.JLabel();
        marks6lbl = new javax.swing.JLabel();
        sub6lbl = new javax.swing.JLabel();
        sub7lbl = new javax.swing.JLabel();
        marks7lbl = new javax.swing.JLabel();
        sub8lbl = new javax.swing.JLabel();
        marks8lbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        sem = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        choice = new java.awt.Choice();
        jLabel7 = new javax.swing.JLabel();
        canbtn = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setBorder(null);
        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 0));

        btnup.setBackground(new java.awt.Color(0, 0, 0));
        btnup.setText("Result");
        btnup.setAutoscrolls(true);
        btnup.setFocusPainted(false);
        btnup.setFocusable(false);
        btnup.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");

        kGradientPanel2.setBackground(new java.awt.Color(0, 0, 0));
        kGradientPanel2.setBorder(null);
        kGradientPanel2.setkBorderRadius(90);
        kGradientPanel2.setkEndColor(new java.awt.Color(102, 102, 0));
        kGradientPanel2.setkGradientFocus(30);
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 0, 0));
        kGradientPanel2.setName(""); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Subjects");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Marks");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        sub1lbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sub1lbl.setForeground(new java.awt.Color(255, 255, 255));
        sub1lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sub1lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        sub2lbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sub2lbl.setForeground(new java.awt.Color(255, 255, 255));
        sub2lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sub2lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        marks1lbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        marks1lbl.setForeground(new java.awt.Color(255, 255, 255));
        marks1lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marks1lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        marks2lbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        marks2lbl.setForeground(new java.awt.Color(255, 255, 255));
        marks2lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marks2lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        sub3lbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sub3lbl.setForeground(new java.awt.Color(255, 255, 255));
        sub3lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sub3lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        marks3lbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        marks3lbl.setForeground(new java.awt.Color(255, 255, 255));
        marks3lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marks3lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        marks4lbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        marks4lbl.setForeground(new java.awt.Color(255, 255, 255));
        marks4lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marks4lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        sub4lbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sub4lbl.setForeground(new java.awt.Color(255, 255, 255));
        sub4lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sub4lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        sub5lbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sub5lbl.setForeground(new java.awt.Color(255, 255, 255));
        sub5lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sub5lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sub5lbl.setVerifyInputWhenFocusTarget(false);

        marks5lbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        marks5lbl.setForeground(new java.awt.Color(255, 255, 255));
        marks5lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marks5lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        marks6lbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        marks6lbl.setForeground(new java.awt.Color(255, 255, 255));
        marks6lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marks6lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        sub6lbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sub6lbl.setForeground(new java.awt.Color(255, 255, 255));
        sub6lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sub6lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        sub7lbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sub7lbl.setForeground(new java.awt.Color(255, 255, 255));
        sub7lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sub7lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        marks7lbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        marks7lbl.setForeground(new java.awt.Color(255, 255, 255));
        marks7lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marks7lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        sub8lbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sub8lbl.setForeground(new java.awt.Color(255, 255, 255));
        sub8lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sub8lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        marks8lbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        marks8lbl.setForeground(new java.awt.Color(255, 255, 255));
        marks8lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marks8lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(120, 120, 120))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(sub8lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(marks8lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(sub7lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(marks7lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(sub2lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(marks2lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(sub1lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(marks1lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(sub4lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(marks4lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(sub3lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(marks3lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(sub5lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sub6lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marks6lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marks5lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sub1lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks1lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sub2lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks2lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sub3lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks3lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sub4lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks4lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sub5lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks5lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sub6lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks6lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sub7lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks7lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sub8lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks8lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Semester");

        name.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        sem.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sem.setForeground(new java.awt.Color(255, 255, 255));
        sem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        choice.setBackground(new java.awt.Color(255, 255, 255));
        choice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        choice.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        choice.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Search by Roll No");

        canbtn.setText("Back To Home");
        canbtn.setkBackGroundColor(new java.awt.Color(51, 255, 0));
        canbtn.setkEndColor(new java.awt.Color(255, 255, 0));
        canbtn.setkHoverEndColor(new java.awt.Color(204, 204, 0));
        canbtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        canbtn.setkHoverStartColor(new java.awt.Color(102, 102, 0));
        canbtn.setkStartColor(new java.awt.Color(0, 0, 0));
        canbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnup, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addComponent(jLabel6)
                .addGap(36, 36, 36))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(choice, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(canbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnup, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(canbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnupActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void canbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canbtnMouseClicked
        home l = new home();
        l.setVisible(true);
        setVisible(false);    }//GEN-LAST:event_canbtnMouseClicked

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(showresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showresult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnup;
    private com.k33ptoo.components.KButton canbtn;
    private java.awt.Choice choice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel marks1lbl;
    private javax.swing.JLabel marks2lbl;
    private javax.swing.JLabel marks3lbl;
    private javax.swing.JLabel marks4lbl;
    private javax.swing.JLabel marks5lbl;
    private javax.swing.JLabel marks6lbl;
    private javax.swing.JLabel marks7lbl;
    private javax.swing.JLabel marks8lbl;
    private javax.swing.JLabel name;
    private javax.swing.JLabel sem;
    private javax.swing.JLabel sub1lbl;
    private javax.swing.JLabel sub2lbl;
    private javax.swing.JLabel sub3lbl;
    private javax.swing.JLabel sub4lbl;
    private javax.swing.JLabel sub5lbl;
    private javax.swing.JLabel sub6lbl;
    private javax.swing.JLabel sub7lbl;
    private javax.swing.JLabel sub8lbl;
    // End of variables declaration//GEN-END:variables
}
