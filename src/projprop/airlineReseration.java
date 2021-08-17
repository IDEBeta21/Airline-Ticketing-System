/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projprop;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hp_cust
 */
public class airlineReseration extends javax.swing.JFrame {

    /**
     * Creates new form airlineReseration
     */
    
    String cntry="",cntnnt="",monthName,yearName;
    int numOfSeats=0;
    String distance;
    
    public airlineReseration() {
        initComponents();
        
        //<editor-fold defaultstate="collapsed" desc="Adding continents">
        continent.add("North America");
        continent.add("South America");
        continent.add("Asia");
        continent.add("Africa");
        continent.add("Australia / Oceania");
        continent.add("Europe");
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Adding Cities">
        country.add("Bermuda");                         country.add("Canada");                  country.add("Greenland");           country.add("St. Pierre & Miquel");         country.add("United States of America");
        country.add("Anguilla");                        country.add("Antigua and Barbuda");     country.add("Aruba");               country.add("Bahamas");                     country.add("Barbados");
        country.add("Bonaire, St. Eustalius & Saba");   country.add("British Virgin Islands");  country.add("Cayman Islands");      country.add("Cuba");                        country.add("Curacao");
        country.add("Dominica");                        country.add("Dominican Republic");      country.add("Grenada");             country.add("Guadeloupe");                  country.add("Haiti");
        country.add("Jamaica");                         country.add("Martinique");              country.add("Montserrat");          country.add("Puerto Rico");                 country.add("Saint-Barthelemy");
        country.add("Saint-Kitts & Nevis");             country.add("Saint Lucia");             country.add("St. Martin");          country.add("St. Vincent & Grenadines");    country.add("Sint. Maarten");
        country.add("Trinidad & Tobago");               country.add("Turks & Caicos Island");   country.add("U.S. Virgin Islands"); country.add("Belize");                      country.add("Costa Rica");
        country.add("El Salvador");                     country.add("Guatemala");               country.add("Honduras");            country.add("Mexico");                      country.add("Nicaragua");
        country.add("Panama");
        //</editor-fold>
        
        //Adding Seats
        seatClass.add("Class A");
        seatClass.add("Class B");
        seatClass.add("Class C");
        
        //Generating Number of Seats
        for(int a=0;a<10;a++){
            seatNum.add(Integer.toString(a+1));
        }
        
        //<editor-fold defaultstate="collapsed" desc="Generating Dates">
        for(int mnth=1;mnth<=12;mnth++){
            switch (mnth){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    for(int dy=1;dy<=31;dy+=3){
                        switch (mnth){
                            case 1:
                                monthName="January";
                                yearName="2020";
                            break;
                            case 3:
                                monthName="March";
                                yearName="2020";
                            break;
                            case 5:
                                monthName="May";
                                yearName="2019";
                            break;
                            case 7:
                                monthName="July";
                                yearName="2019";
                            break;
                            case 8:
                                monthName="August";
                                yearName="2019";
                            break;
                            case 10:
                                monthName="October";
                                yearName="2019";
                            break;
                            case 12:
                                monthName="December";
                                yearName="2019";
                            break;
                            
                                
                        }
                        flightDate.add(monthName+"/"+dy+"/"+yearName);
                    }   
                break;
                case 4:
                case 6:
                case 9:
                case 11:
                    for(int dy=1;dy<=30;dy+=3){
                        switch (mnth){
                            case 4:
                                monthName="April";
                                yearName="2019";
                            break;
                            case 6:
                                monthName="June";
                                yearName="2019";
                            break;
                            case 9:
                                monthName="September";
                                yearName="2019";
                            break;
                            case 11:
                                monthName="November";
                                yearName="2019";
                            break;
                            
                        }
                        flightDate.add(monthName+"/"+dy+"/"+yearName);
                    }   
                break;
                case 2:
                    for(int dy=1;dy<=28;dy+=3){
                        switch (mnth){
                            case 2:
                                monthName="February";
                                yearName="2020";
                            break;
                            
                        }
                        flightDate.add(monthName+"/"+dy+"/"+yearName);
                    }   
            }
        }
        //</editor-fold>
        
        //Adding Airline Companies
        airlineCompany.add("Philippine Airlines");
        airlineCompany.add("Cebu Pacific");
        airlineCompany.add("PAL Express");
        airlineCompany.add("Spirit of Manila");
        airlineCompany.add("Air Asia Zest");
        airlineCompany.add("Air Asia Philippines ");
        airlineCompany.add("Tigerair Philippine");
        airlineCompany.add("SEAIR International ");
        airlineCompany.add("Sky Jet");
        airlineCompany.add("South Phoenix Airways ");
        
        //Time of Flights
        flightTime.add("9:00 am");
        flightTime.add("5:00 pm");
        
        //Types of Flights
        travelType.add("One-Way");
        travelType.add("Round-Trip");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lastNametxt_ = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firstNametxt_ = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        middleNametxt_ = new javax.swing.JTextField();
        continent = new java.awt.Choice();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        country = new java.awt.Choice();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        afasdf = new javax.swing.JLabel();
        airlineCompany = new java.awt.Choice();
        flightDate = new java.awt.Choice();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        flightTime = new java.awt.Choice();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        travelType = new java.awt.Choice();
        jLabel14 = new javax.swing.JLabel();
        paymentTxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        changeTxt = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        viewRecordBtn = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        addRecordBtn = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        computePayment = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        computeCost = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        clearBtn = new javax.swing.JLabel();
        costTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        seatNum = new java.awt.Choice();
        seatClass = new java.awt.Choice();
        jPanel12 = new javax.swing.JPanel();
        check = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(51, 0, 153));

        jPanel3.setBackground(new java.awt.Color(51, 0, 153));

        jLabel1.setBackground(new java.awt.Color(51, 0, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(51, 0, 153));

        jLabel7.setBackground(new java.awt.Color(51, 0, 153));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("_");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(51, 0, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 184, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lastNametxt_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lastNametxt_.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("LAST NAME:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("FIRST NAME:");

        firstNametxt_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        firstNametxt_.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("MIDDLE NAME:");

        middleNametxt_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        middleNametxt_.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));

        continent.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        continent.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                continentItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("CONTINENT: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("COUNTRY: ");

        country.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TICKET RESERVATION");

        afasdf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        afasdf.setForeground(new java.awt.Color(240, 240, 240));
        afasdf.setText("SEAT NUMBER:");

        airlineCompany.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        flightDate.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("DATE OF DEPARTURE:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("TIME OF DEPARTURE:");

        flightTime.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("AIRLINE:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TRAVEL TYPE:");

        travelType.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("COST:");

        paymentTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        paymentTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("PAYMENT:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("CHANGE:");

        changeTxt.setEditable(false);
        changeTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        changeTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));

        jPanel6.setBackground(new java.awt.Color(51, 51, 255));

        viewRecordBtn.setBackground(new java.awt.Color(102, 102, 255));
        viewRecordBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewRecordBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewRecordBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewRecordBtn.setText("VIEW RECORD");
        viewRecordBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewRecordBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewRecordBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewRecordBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewRecordBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(51, 51, 255));
        jPanel7.setToolTipText("");

        addRecordBtn.setBackground(new java.awt.Color(102, 102, 255));
        addRecordBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addRecordBtn.setForeground(new java.awt.Color(255, 255, 255));
        addRecordBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addRecordBtn.setText("ADD RECORD");
        addRecordBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addRecordBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addRecordBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addRecordBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addRecordBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(51, 51, 255));
        jPanel8.setForeground(new java.awt.Color(240, 240, 240));

        computePayment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        computePayment.setForeground(new java.awt.Color(240, 240, 240));
        computePayment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computePayment.setText("COMPUTE");
        computePayment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        computePayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                computePaymentMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(computePayment, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(computePayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(51, 51, 255));

        computeCost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        computeCost.setForeground(new java.awt.Color(240, 240, 240));
        computeCost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computeCost.setText("COMPUTE COST");
        computeCost.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        computeCost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                computeCostMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(computeCost, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(computeCost, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(51, 51, 255));

        clearBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(240, 240, 240));
        clearBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clearBtn.setText("CLEAR");
        clearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clearBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        costTxt.setEditable(false);
        costTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costTxtActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("CLASS:");

        seatNum.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        seatNum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seatNumMouseClicked(evt);
            }
        });

        seatClass.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        seatClass.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                seatClassItemStateChanged(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(51, 51, 255));

        check.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        check.setForeground(new java.awt.Color(240, 240, 240));
        check.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check.setText("CHECK");
        check.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        check.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(check, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(check, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(country, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lastNametxt_, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                                        .addComponent(continent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(travelType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(airlineCompany, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                                .addComponent(flightDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(seatClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(flightTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(afasdf, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 30, Short.MAX_VALUE))
                                    .addComponent(seatNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(firstNametxt_))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(middleNametxt_)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16)
                            .addComponent(changeTxt)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(paymentTxt)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(costTxt))
                        .addGap(52, 52, 52))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastNametxt_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(middleNametxt_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(firstNametxt_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(airlineCompany, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                    .addComponent(costTxt)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(continent, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(flightTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(paymentTxt)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(1, 1, 1))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(flightDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(afasdf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(changeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(seatClass, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(seatNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(38, 38, 38)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(travelType, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(131, 131, 131))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void seatClassItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_seatClassItemStateChanged
        // TODO add your handling code here:
        int sNum;
        switch(seatClass.getSelectedIndex()){
            case 0:
            seatNum.removeAll();
            for (sNum=1;sNum<=10;sNum++){
                seatNum.add(Integer.toString(sNum));
            }
            break;
            case 1:
            seatNum.removeAll();
            for (sNum=11;sNum<=20;sNum++){
                seatNum.add(Integer.toString(sNum));
            }
            break;
            case 2:
            seatNum.removeAll();
            for (sNum=21;sNum<=30;sNum++){
                seatNum.add(Integer.toString(sNum));
            }
            break;

        }
    }//GEN-LAST:event_seatClassItemStateChanged

    private void continentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_continentItemStateChanged
        // TODO add your handling code here:
        int cntnnt = continent.getSelectedIndex();

        switch(cntnnt){
            case 0://north america
                country.removeAll();
                
                country.add("Bermuda");                         
                country.add("Canada");                  
                country.add("Greenland");           
                country.add("St. Pierre & Miquel");         
                country.add("United States of America");

                country.add("Anguilla");                        
                country.add("Antigua and Barbuda");     
                country.add("Aruba");               
                country.add("Bahamas");                     
                country.add("Barbados");

                country.add("Bonaire, St. Eustalius & Saba");   
                country.add("British Virgin Islands");  
                country.add("Cayman Islands");      
                country.add("Cuba");                        
                country.add("Curacao");

                country.add("Dominica");                        
                country.add("Dominican Republic");     
                country.add("Grenada");    
                country.add("Guadeloupe");       
                country.add("Haiti");

                country.add("Jamaica");    
                country.add("Martinique");     
                country.add("Montserrat");   
                country.add("Puerto Rico");   
                country.add("Saint-Barthelemy");

                country.add("Saint-Kitts & Nevis");  
                country.add("Saint Lucia");  
                country.add("St. Martin");    
                country.add("St. Vincent & Grenadines");    
                country.add("Sint. Maarten");

                country.add("Trinidad & Tobago");    
                country.add("Turks & Caicos Island"); 
                country.add("U.S. Virgin Islands");
                country.add("Belize");   
                country.add("Costa Rica");

                country.add("El Salvador");     
                country.add("Guatemala");    
                country.add("Honduras");  
                country.add("Mexico");       
                country.add("Nicaragua");

                country.add("Panama");
            break;
                
            case 1://south america
                country.removeAll();
                
                country.add("Argentina");   
                country.add("Bolivia");         
                country.add("Brazil");          
                country.add("Chile");       
                country.add("Colombia");

                country.add("Ecuador");     
                country.add("Folkland Islands");
                country.add("French Guiana");  
                country.add("Guyana");     
                country.add("Paraguay");

                country.add("Peru");        
                country.add("Suriname");        
                country.add("Uruguay");        
                country.add("Venezuela");
            break;
                
            case 2://asia
                country.removeAll();
                //0
                country.add("Khazakhstan");
                country.add("Kyrgyzstan");
                country.add("Tajikistan");
                country.add("Turkmenistan");
                country.add("Uzbekistan");
                //5
                country.add("China");
                country.add("China, Hong Kong");
                country.add("China, Macau");
                country.add("Japan");
                country.add("North Korea");
                //10
                country.add("South Korea");
                country.add("Mongolia");
                country.add("Afghanistan");
                country.add("Bangladesh");
                country.add("Bhutan");
                //15
                country.add("India");
                country.add("Iran");
                country.add("Maldives");
                country.add("Nepal");
                country.add("Pakistan");
                //20
                country.add("Sri Lanka");
                country.add("Armenia");
                country.add("Azerbaijan");
                country.add("Bahrain");
                country.add("Cyprus");
                //25
                country.add("Georgia");
                country.add("Iraq");
                country.add("Israel");
                country.add("Jordan");
                country.add("Kuwait");
                //30
                country.add("Lebanon");
                country.add("Oman");
                country.add("Palestine");
                country.add("Qatar");
                country.add("Saudi Arabia");
                //35
                country.add("Syria");
                country.add("Turkey");
                country.add("United Arab Emirates");
                country.add("Yemen");
                country.add("Brunei");
                //40
                country.add("Cambodia");
                country.add("Indonesia");
                country.add("Laos");
                country.add("Malaysia");
                country.add("Myanmar (Burma)");
                //45
                country.add("Singapore");
                country.add("Thailand");
                country.add("Timor-Leste");
                country.add("Vietnam");
            break;
                
            case 3://africa
                country.removeAll();
                //0
                country.add("Burundi");
                country.add("Comoros");
                country.add("Djibouti");
                country.add("Eritrea");
                country.add("Ethiopia");
                //5
                country.add("Kenya");
                country.add("Madagascar");
                country.add("Malawi");
                country.add("Mauritius");
                country.add("Mayotte");
                //10
                country.add("Mozambique");
                country.add("Reunion");
                country.add("Rwanda");
                country.add("Seychelles");
                country.add("Somalia");
                //15
                country.add("Tanzania");
                country.add("Uganda");
                country.add("Zambia");
                country.add("Zimbabwe");
                country.add("Angola");
                //20
                country.add("Cameroon");
                country.add("Central African Republic");
                country.add("Chad");
                country.add("Congo (Zaire)");
                country.add("Congo Republic");
                //25
                country.add("Equatorial Guinea");
                country.add("Gabon");
                country.add("Sao Tome & Recipe");
                country.add("Algeria");
                country.add("Egypt");
                //30
                country.add("Libya");
                country.add("Morocco");
                country.add("Sudan");
                country.add("South Sudan");
                country.add("Tunisia");
                //35
                country.add("Western Sahara");
                country.add("Botswana");
                country.add("Lesotho");
                country.add("Namibia");
                country.add("South Africa");
                //40
                country.add("Swaziland");
                country.add("Benin");
                country.add("Burkina Faso");
                country.add("Cape Verde");
                country.add("Cote d'Ivoire");
                //45
                country.add("Gambia");
                country.add("Ghana");
                country.add("Guinea");
                country.add("Guinea-Bissau");
                country.add("Liberia");
                //50
                country.add("Mali");
                country.add("Mauritania");
                country.add("Niger");
                country.add("Nigeria");
                country.add("Saint Helena");
                //55
                country.add("Senegal");
                country.add("Sierra Leone");
                country.add("Togo");
            break;
                
            case 4://australia & oceania
                country.removeAll();
                //0
                country.add("Australia");
                country.add("New Zealand");
                country.add("Norfolk Island");
                country.add("Fiji");
                country.add("New Caledonia");
                //5
                country.add("Papua New Guinea");
                country.add("Solomon Islands");
                country.add("Vanuatu");
                country.add("Guam");
                country.add("Kiribati");
                //10
                country.add("Marshall Island");
                country.add("Micronesia");
                country.add("Nauru");
                country.add("Northern Mariana Island");
                country.add("Palua");
                //15
                country.add("American Samoa");
                country.add("Cook Islands");
                country.add("French Polynesia");
                country.add("Niue");
                country.add("Pitcairn Islands");
                //20
                country.add("Samoa");
                country.add("Tokelau");
                country.add("Tonga");
                country.add("Tuvalu");
                country.add("Wallis & Futuna Islands");
            break;
                
            case 5:
                country.removeAll();
                //0
                country.add("Belarus");
                country.add("Bulgaria");
                country.add("Czech Republic");
                country.add("Hungary");
                country.add("Moldova");
                //5
                country.add("Poland");
                country.add("Romania");
                country.add("Russia");
                country.add("Slovakia");
                country.add("Ukraine");
                //10
                country.add("Denmark");
                country.add("Estonia");
                country.add("Faroe Island (Denmark)");
                country.add("Finland");
                country.add("Guernsey");
                //15
                country.add("Iceland");
                country.add("Ireland");
                country.add("Isle of Man");
                country.add("Jersey");
                country.add("Latvia");
                //20
                country.add("Lithuania");
                country.add("Norway");
                country.add("Svalbard & Jan Mayen Island (Norway)");
                country.add("Sweden");
                country.add("United Kingdom");
                //25
                country.add("Albania");
                country.add("Andorra");
                country.add("Bosnia & Herzegovina");
                country.add("Croatia");
                country.add("Gibraltar");
                //30
                country.add("Greece");
                country.add("Holy See (Vatican City)");
                country.add("Italy");
                country.add("Kosovo");
                country.add("Macedonia");
                //35
                country.add("Malta");
                country.add("Montenegro");
                country.add("Portugal");
                country.add("San Marino");
                country.add("Serbia");
                //40
                country.add("Slovenia");
                country.add("Spain");
                country.add("Austria");
                country.add("Belgium");
                country.add("France");
                //45
                country.add("Germany");
                country.add("Liechtenstien");
                country.add("Luxembourg");
                country.add("Monaco");
                country.add("Netherlands");
                //50
                country.add("Switzerland");
            break;
        }
    }//GEN-LAST:event_continentItemStateChanged

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        projectProp login = new projectProp();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void addRecordBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRecordBtnMouseClicked
        // TODO add your handling code here:
        int continentslct = continent.getSelectedIndex();
        int classA=0,classB=0,classC=0;
        int countryslct = country.getSelectedIndex();
        
        String fileName=country.getSelectedItem().replace(' ','_')+
                airlineCompany.getSelectedItem().replace(' ','_')+
                flightDate.getSelectedItem().replace('/','_')+
                flightTime.getSelectedItem().replace(' ','_').replace(':','_')+
                travelType.getSelectedItem().replace(' ','_')+".txt";
        String dumm,lseatnum,lseatclass,lcountry,lairline,ldate,ltime,ltraveltype;
        
        boolean seathasvacant=true;
        
        if(lastNametxt_.getText().equals("")||firstNametxt_.getText().equals("")||middleNametxt_.getText().equals("")){
            String m1 = "FILL UP THE NAME CORRECTLY";
            errorM err = new errorM(m1);
            err.setVisible(true);
        }
        else{
            if (costTxt.getText().equals("")||paymentTxt.getText().equals("")||changeTxt.getText().equals("")){
                String m2 = "FILL UP THE PAYMENT CORRECTLY";
                errorM err = new errorM(m2);
                err.setVisible(true);
            }
            else{
                try {

                    Scanner file = new Scanner(new File(fileName));

                    while (file.hasNext()){
                        dumm = file.next();
                        lseatnum = file.next();
                        lseatclass = file.next();
                        dumm = file.nextLine();
                        int con_lseatnum = Integer.parseInt(lseatnum);

                        if(con_lseatnum==Integer.parseInt(seatNum.getSelectedItem())){
                            errorM errrr = new errorM("Can't Add");
                            setVisible(true);
                            seathasvacant = false;
                        }
                        /////////
                        if(lseatclass.equals("Class_A")){
                            classA++;
                        }

                        if(lseatclass.equals("Class_B")){
                            classB++;
                        }

                        if(lseatclass.equals("Class_C")){
                            classC++;
                        }
                        ////////

                    }

                    LineNumberReader record = new LineNumberReader(new FileReader(new File(fileName)));

                    while ((record.readLine())!=null){
                        numOfSeats=record.getLineNumber();
                    }

                    if (numOfSeats<30){

                        if(seathasvacant==true){

                        GregorianCalendar dateID    = new GregorianCalendar();
                        String h                    = Integer.toString(dateID.get(Calendar.HOUR));
                        String m                    = Integer.toString(dateID.get(Calendar.MINUTE));
                        String s                    = Integer.toString(dateID.get(Calendar.SECOND));
                        String mon                  = Integer.toString(dateID.get(Calendar.MONTH));
                        String day                  = Integer.toString(dateID.get(Calendar.DAY_OF_MONTH));
                        String year                 = Integer.toString(dateID.get(Calendar.YEAR));
                        String mill                 = Long.toString(dateID.getTimeInMillis());

                        String id = h+m+s+mon+day+year;

                        String rSeatNum     = seatNum.getSelectedItem().replace(' ','_');
                        String rSeatClass   = seatClass.getSelectedItem().replace(' ','_');
                        String rlname       = lastNametxt_.getText().replace(' ','_');
                        String rfname       = firstNametxt_.getText().replace(' ','_');
                        String rmname       = middleNametxt_.getText().replace(' ','_');
                        String rcontinent   = continent.getSelectedItem().replace(' ','_');
                        String rcountry     = country.getSelectedItem().replace(' ','_');
                        String rairline     = airlineCompany.getSelectedItem().replace(' ','_');
                        String rdate        = flightDate.getSelectedItem().replace(' ','_');
                        String rtime        = flightTime.getSelectedItem().replace(' ','_');
                        String rtraveltype  = travelType.getSelectedItem().replace(' ','_');
                        String rcost        = costTxt.getText().replace(' ','_');
                        String rpay         = paymentTxt.getText().replace(' ','_');

                        String passengerInfo; 
                        passengerInfo = id+" "+rSeatNum+" "+rSeatClass+" "+rlname+" "+rfname+" "+rmname+" "+rcontinent+" "+rcountry+" "+rairline+" "+" "+rdate+" "+rtime+" "+rtraveltype+" "+rcost+" "+rpay;
                        
                        
                        
                        FileWriter w = new FileWriter(fileName,true);
                        if(numOfSeats==0){
                        w.write(passengerInfo);
                        }else{
                        w.write("\n"+passengerInfo);
                        }
                        w.close();
                        
                        successM scc = new successM("Reservation Suceed");
                        scc.setVisible(true);

                        }else{

                            if(classA>=10&&seatClass.getSelectedIndex()==0){
                                errorM err1 = new errorM("Class A Full");
                                err1.setVisible(true);
                            }
                            else if(classB>=10&&seatClass.getSelectedIndex()==1){
                                errorM err2 = new errorM("Class B Full");
                                err2.setVisible(true);
                            }
                            else if(classC>=10&&seatClass.getSelectedIndex()==2){
                                errorM err3 = new errorM("Class C Full");
                                err3.setVisible(true);
                            }
                            else{
                                errorM err4 = new errorM("Seat Already Taken");
                                err4.setVisible(true);
                            }

                        }

                    }else{
                        errorM errrr = new errorM("FLIGHT FULL");
                        setVisible(true);
                    }


                } catch(FileNotFoundException exc){

                    errorM err1 = new errorM("TRY AGAIN");
                    err1.setVisible(true);
                    try{
                    Formatter file = new Formatter(fileName);
                    }catch(Exception e){
                        errorM err11 = new errorM("Fatal Error");
                        err11.setVisible(true);
                        JOptionPane.showMessageDialog(null,"Fatal error");
                    }

                } catch (IOException ex) {

                    Logger.getLogger(airlineReseration.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        }
    }//GEN-LAST:event_addRecordBtnMouseClicked
    
    private void viewRecordBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewRecordBtnMouseClicked
        String fileName=country.getSelectedItem().replace(' ','_')+
                    airlineCompany.getSelectedItem().replace(' ','_')+
                    flightDate.getSelectedItem().replace('/','_')+
                    flightTime.getSelectedItem().replace(' ','_').replace(':','_')+
                    travelType.getSelectedItem().replace(' ','_')+".txt";
        
        String countryName = country.getSelectedItem();
        String continentName = continent.getSelectedItem();
        String country_name = country.getSelectedItem();
        
        double dmiles = 0;
        double sCPrice = 0;
        double totalPrice = 0;

        //<editor-fold defaultstate="collapsed" desc="Distance (of cities) in miles">
        switch(country_name){
                case "Bermuda": dmiles=9269; break;                         
                case "Canada": dmiles=6921;  break;                         
                case "Greenland": dmiles=6543;  break;                         
                case "St. Pierre & Miquel": dmiles=8301;  break;                         
                case "United States of America": dmiles=8222;  break;
                case "Anguilla": dmiles=10256;  break;                         
                case "Antigua and Barbuda": dmiles=10347;  break;                         
                case "Aruba": dmiles=10500;  break;            
                case "Bahamas": dmiles=9510;  break;                         
                case "Barbados": dmiles=10626;  break;                         
                case  "Bonaire, St. Eustalius & Saba": dmiles=10566;  break;                         
                case  "British Virgin Islands": dmiles=10224;  break;                         
                case  "Cayman Islands": dmiles=9710;  break;                         
                case  "Cuba": dmiles=9709;  break;                         
                case  "Curacao": dmiles=10549;  break;                         
                case  "Dominica": dmiles=10463;  break;                         
                case  "Dominican Republic": dmiles=10100;  break;                         
                case  "Grenada": dmiles=10687;  break;                         
                case  "Guadeloupe": dmiles=10404;  break;                         
                case  "Haiti": dmiles=10031;  break;                         
                case  "Jamaica": dmiles=9926;  break;                         
                case  "Martinique": dmiles=10519;  break;                         
                case  "Montserrat": dmiles=10366;  break;                         
                case  "Puerto Rico": dmiles=10207;  break;                          
                case  "Saint-Barthelemy": dmiles= 10281; break; 
                case  "Saint-Kitts & Nevis": dmiles=10334;  break;                           
                case  "Saint Lucia": dmiles=10570;  break;                         
                case  "St. Martin": dmiles=10267;  break;                             
                case  "St. Vincent & Grenadines": dmiles=10631;  break;                            
                case  "Sint. Maarten": dmiles= 10269; break;                         
                case  "Trinidad & Tobago": dmiles= 10788; break;                         
                case  "Turks & Caicos Island": dmiles=9871;  break;                          
                case  "U.S. Virgin Islands": dmiles= 10226; break;                         
                case  "Belize": dmiles=9501;  break;                            
                case  "Costa Rica": dmiles=10083;  break;                         
                case  "El Salvador": dmiles= 9652; break;                              
                case  "Guatemala": dmiles= 9480; break;                            
                case  "Honduras": dmiles=9704;  break;                           
                case  "Mexico": dmiles= 8516; break;                               
                case  "Nicaragua": dmiles=9865;  break;                         
                case  "Panama": dmiles=10289; break; 
                case  "Argentina": dmiles= 10635; break;                         
                case  "Bolivia": dmiles= 12000; break;                         
                case  "Brazil": dmiles= 11996; break;                         
                case  "Chile": dmiles= 10650; break;                         
                case  "Colombia": dmiles= 10796; break;                         
                case  "Ecuador": dmiles= 10866; break;                         
                case  "Folkland Islands": dmiles= 9741; break;                                                 
                case  "French Guiana": dmiles=11216;  break;                                             
                case  "Guyana": dmiles=11203; break;                         
                case  "Paraguay": dmiles=11699;  break;                         
                case  "Peru": dmiles=11263;  break;                         
                case  "Suriname": dmiles= 11259; break;                         
                case  "Uruguay": dmiles=  11064;break;                         
                case  "Venezuela; ": dmiles= 10978; break;                                                
                case  "Khazakhstan": dmiles= 3953; break;                         
                case  "Kyrgyzstan": dmiles= 3431; break;                         
                case  "Tajikistan": dmiles=3555;  break;                         
                case  "Turkmenistan": dmiles=4173;  break;                         
                case  "Uzbekistan":dmiles=3940; break;
                case  "China": dmiles= 1927; break;                         
                case  "China, Hong Kong": dmiles= 828; break;                         
                case  "China, Macau": dmiles= 841;  break;                         
                case  "Japan": dmiles= 1908; break;                         
                case  "North Korea": dmiles= 1928; break;
                case  "South Korea": dmiles= 1633; break;                         
                case  "Mongolia": dmiles= 2567; break;                         
                case  "Afghanistan": dmiles= 3673; break;                         
                case  "Bangladesh": dmiles= 2185; break;                         
                case  "Bhutan": dmiles= 2259; break;                                      
                case  "India": dmiles= 2872; break;                         
                case  "Iran": dmiles= 4471; break;                         
                case  "Maldives": dmiles= 3380; break;                         
                case  "Nepal": dmiles= 2643; break;                         
                case  "Pakistan": dmiles=3541;  break;
                case  "Sri Lanka": dmiles=2803;  break;                         
                case  "Armenia": dmiles=4948;  break;                         
                case  "Azerbaijan": dmiles=4814;  break;                         
                case "Bahrain": dmiles= 4673;  break;                         
                case "Cyprus": dmiles=5614;  break;                        
                case "Georgia": dmiles=8917; break;
                case "Iraq": dmiles=5049; break; 
                case "Israel": dmiles=5580; break; 
                case "Jordan": dmiles=5504; break;
                case "Kuwait": dmiles= 4854; break;
                case "Lebanon": dmiles= 5491; break;
                case "Oman": dmiles=4352; break;
                case "Palestine": dmiles= 5550; break;
                case "Qatar": dmiles=4637; break;
                case "Saudi Arabia": dmiles=5028; break;
                case "Syria": dmiles=5305; break;
                case "Turkey": dmiles= 5474; break;
                case "United Arab Emirates": dmiles= 4479;  break;
                case "Yemen": dmiles= 4883; break;
                case "Brunei": dmiles= 750; break;
                case "Cambodia": dmiles= 10796; break;
                case "Indonesia": dmiles= 1086; break;
                case "Laos": dmiles=1364; break;
                case "Malaysia": dmiles=1477; break;
                case "Myanmar (Burma)": dmiles= 1809; break;
                case "Singapore": dmiles=1463; break;
                case "Thailand": dmiles=1405; break;
                case "Timor-Leste": dmiles=1526; break;
                case "Vietnam": dmiles=910; break;
                case "Burundi": dmiles=6391; break;
                case "Comoros": dmiles= 5634; break;
                case "Djibouti": dmiles=5318; break;
                case "Eritrea": dmiles= 5460; break;
                case "Ethiopia": dmiles= 5493; break;
                case "Kenya": dmiles=5802; break;
                case "Madagascar": dmiles=5544; break;
                case "Malawi": dmiles= 6251; break;
                case "Mauritius": dmiles=4926; break;
                case "Mayotte": dmiles=5536; break;
                case "Mozambique": dmiles= 6257;break;
                case "Reunion": dmiles=5066; break;
                case "Rwanda": dmiles=6372; break;
                case "Seychelles": dmiles=4704; break;
                case "Somalia": dmiles= 5166; break;
                case "Tanzania": dmiles=6104; break;
                case "Uganda": dmiles=6159; break;
                case "Zambia": dmiles= 6673; break;
                case "Zimbabwe": dmiles= 6670; break;
                case "Angola": dmiles=7319; break;
                case "Cameroon": dmiles=7390; break;
                case "Central African Republic": dmiles=6836; break;
                case "Chad": dmiles=6821; break;
                case "Congo (Zaire) ": dmiles=6950; break;
                case "Congo Republic": dmiles=7291; break;
                case "Equatorial Guinea": dmiles=7633; break;
                case "Gabon": dmiles=7583; break;
                case "Sao Tome & Recipe": dmiles= 6304;break;
                case "Algeria": dmiles=7532; break;
                case "Egypt": dmiles=5875; break;
                case "Libya": dmiles=6693; break;
                case "Morocco": dmiles=7853; break;
                case "Sudan": dmiles=6120; break;
                case "South Sudan": dmiles=6140; break;
                case "Tunisia": dmiles=6938; break;
                case "Western Sahara": dmiles=8441; break;
                case "Botswana": dmiles=6995; break;
                case "Lesotho": dmiles=6860; break;
                case "Namibia": dmiles=7392; break;
                case "South Africa": dmiles=7183; break;
                case "Swaziland": dmiles=6628; break;
                case "Benin": dmiles=8009; break;
                case "Burkina Faso": dmiles= 8179; break;
                case "Cape Verde": dmiles= 9284; break;
                case "Cote d'Ivoire": dmiles=8550; break;
                case "Gambia": dmiles= 8975; break;
                case "Ghana": dmiles= 8250; break;
                case "Guinea": dmiles=8747; break;
                case "Guinea-Bissau": dmiles=9023; break;
                case "Liberia": dmiles=8841; break;
                case "Mali": dmiles=8177; break;
                case "Mauritania": dmiles=8459; break;
                case "Niger": dmiles=7445; break;
                case "Nigeria": dmiles=7597; break;
                case "Saint Helena": dmiles=8919; break;
                case "Senegal": dmiles=8889; break;
                case "Sierra Leone": dmiles=8919; break;
                case "Togo": dmiles=8116; break;
                case "Australia": dmiles=2756; break;
                case "New Zealand": dmiles=5024; break;
                case "Norfolk Island": dmiles=4225; break;
                case "Fiji": dmiles=4379; break;
                case "New Caledonia": dmiles=3780; break;
                case "Papua New Guinea": dmiles=2018;  break;
                case "Solomon Islands": dmiles= 3057; break;
                case "Vanuatu": dmiles=3652; break;
                case "Guam": dmiles=1548; break;
                case "Kiribati": dmiles=4893; break;
                case "Marshall Island": dmiles=3378; break;
                case "Micronesia": dmiles= 1990;break;
                case "Nauru": dmiles=3227; break;
                case "Northern Mariana Island": dmiles=1608; break;
                case "Palua": dmiles=946; break;
                case "American Samoa": dmiles=5019; break;
                case "Cook Islands": dmiles=5813; break;
                case "French Polynesia": dmiles=6407; break;
                case "Niue": dmiles=5145; break;
                case "Pitcairn Islands": dmiles=7818; break;
                case "Samoa": dmiles=4883; break;
                case "Tokelau": dmiles=4800; break;
                case "Tonga": dmiles= 4877; break;
                case "Tuvalu": dmiles=4074; break;
                case "Wallis & Futuna Islands": dmiles=4518; break;
                case "Belarus": dmiles=5654; break;
                case "Bulgaria": dmiles=5926; break;
                case "Czech Republic": dmiles=6239; break;
                case "Hungary": dmiles=6125; break;
                case "Moldova": dmiles=5719; break;
                case "Poland": dmiles=6040; break;
                case "Romania": dmiles=5898; break;
                case "Russia": dmiles= 3458; break;
                case "Slovakia": dmiles=6085; break;
                case "Ukraine": dmiles=5589; break;
                case "Denmark": dmiles=6293; break;
                case "Estonia": dmiles= 5697; break;
                case "Faroe Island (Denmark) ": dmiles=6573; break;
                case "Finland": dmiles=5625; break;
                case "Guernsey": dmiles=6964; break;
                case "Iceland": dmiles=6681; break;
                case "Ireland": dmiles=7002; break;
                case "Isle of Man": dmiles=6849; break;
                case "Jersey": dmiles=6956; break;
                case "Latvia": dmiles=5738; break;
                case "Lithuania": dmiles=5792; break;
                case "Norway": dmiles=6199; break;
                case "Svalbard & Jan Mayen Island (Norway) ": dmiles=5500; break;
                case "Sweden": dmiles=5886; break;
                case "United Kingdom": dmiles=6754; break;
                case "Albania": dmiles=6218; break;
                case "Andorra": dmiles=7057; break;
                case "Bosnia & Herzegovina": dmiles=6279; break;
                case "Croatia": dmiles=6366; break;
                case "Gibraltar": dmiles=7603; break;
                case "Greece": dmiles=6176; break;
                case "Holy See (Vatican City)": dmiles=6576; break;
                case "Italy": dmiles=6571; break;
                case "Kosovo": dmiles=6153; break;
                case "Macedonia": dmiles=6142; break;
                case "Malta": dmiles=6631; break;
                case "Montenegro": dmiles=6225; break;
                case "Portugal": dmiles=7598; break;
                case "San Marino": dmiles=6521; break;
                case "Serbia": dmiles=6120; break;
                case "Slovenia": dmiles=6350; break;
                case "Spain": dmiles=7363; break;
                case "Austria": dmiles=6335; break;
                case "Belgium": dmiles=6661; break;
                case "France": dmiles=6897; break;
                case "Germany": dmiles=6407; break;
                case "Liechtenstien": dmiles=6560; break;
                case "Luxembourg": dmiles=6618; break;
                case "Monaco": dmiles=6755; break;
                case "Netherlands": dmiles=6575; break;
                case "Switzerland": dmiles=6627; break;
                default: costTxt.setText("Value cannot Find!!"); break;
        }
        //</editor-fold>

        this.distance=Double.toString(dmiles);

        try{
            
            viewRecord vr = new viewRecord(fileName,countryName,continentName,distance);
            vr.setVisible(true);
            dispose();
            
        }catch(Exception e){
            
            errorM errr = new errorM("File not Existed Yet");
            viewRecord vr = new viewRecord(fileName,countryName,continentName,distance);
            //vr.setVisible(false);
        }
    }//GEN-LAST:event_viewRecordBtnMouseClicked

    private void costTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costTxtActionPerformed

    private void computeCostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_computeCostMouseClicked
        // TODO add your handling code here:
        
        int continentslct = continent.getSelectedIndex();
        int classA=0,classB=0,classC=0;
        int countryslct = country.getSelectedIndex();
        
        String fileName=country.getSelectedItem().replace(' ','_')+
                airlineCompany.getSelectedItem().replace(' ','_')+
                flightDate.getSelectedItem().replace('/','_')+
                flightTime.getSelectedItem().replace(' ','_').replace(':','_')+
                travelType.getSelectedItem().replace(' ','_')+".txt";
        String dumm,lseatnum,lseatclass,lcountry,lairline,ldate,ltime,ltraveltype,classFull;
        
        boolean seathasvacant=true;
        
        errorM err;
        
        try {

            Scanner file = new Scanner(new File(fileName));

            while (file.hasNext()){
                dumm = file.next();
                lseatnum = file.next();
                lseatclass = file.next();
                dumm = file.nextLine();
                int con_lseatnum = Integer.parseInt(lseatnum);

                if(con_lseatnum==Integer.parseInt(seatNum.getSelectedItem())){
                    //JOptionPane.showMessageDialog(null,"Can't add");
                    seathasvacant = false;
                }
                /////////
                if(lseatclass.equals("Class_A")){
                    classA++;
                }

                if(lseatclass.equals("Class_B")){
                    classB++;
                }

                if(lseatclass.equals("Class_C")){
                    classC++;
                }
                ////////

            }

            LineNumberReader record = new LineNumberReader(new FileReader(new File(fileName)));

            while ((record.readLine())!=null){
                numOfSeats=record.getLineNumber();
            }

            if (numOfSeats<30){

                if(seathasvacant==false){

                    if(classA>=10&&seatClass.getSelectedIndex()==0){
                        classFull = "Class A Full";
                    }
                    else if(classB>=10&&seatClass.getSelectedIndex()==1){
                        //JOptionPane.showMessageDialog(null,"Class B full");
                        classFull = "Class B Full";
                    }
                    else if(classC>=10&&seatClass.getSelectedIndex()==2){
                        //JOptionPane.showMessageDialog(null,"Class C full");
                        classFull = "Class C Full";
                    }
                    else{
                        //JOptionPane.showMessageDialog(null,"seat already taken");
                        classFull= "Seat Already Taken";
                    }

                    err = new errorM(classFull);
                    err.setVisible(true);

                }else{
                    String country_name = country.getSelectedItem();

                    double dmiles = 0;
                    double sCPrice = 0;
                    double totalPrice = 0;

                    // <editor-fold defaultstate="collapsed" desc="Distance (in miles) of cities">
                    switch(country_name){
                            case "Bermuda": dmiles=9269; break;                         
                            case "Canada": dmiles=6921;  break;                         
                            case "Greenland": dmiles=6543;  break;                         
                            case "St. Pierre & Miquel": dmiles=8301;  break;                         
                            case "United States of America": dmiles=8222;  break;
                            case "Anguilla": dmiles=10256;  break;                         
                            case "Antigua and Barbuda": dmiles=10347;  break;                         
                            case "Aruba": dmiles=10500;  break;            
                            case "Bahamas": dmiles=9510;  break;                         
                            case "Barbados": dmiles=10626;  break;                         
                            case  "Bonaire, St. Eustalius & Saba": dmiles=10566;  break;                         
                            case  "British Virgin Islands": dmiles=10224;  break;                         
                            case  "Cayman Islands": dmiles=9710;  break;                         
                            case  "Cuba": dmiles=9709;  break;                         
                            case  "Curacao": dmiles=10549;  break;                         
                            case  "Dominica": dmiles=10463;  break;                         
                            case  "Dominican Republic": dmiles=10100;  break;                         
                            case  "Grenada": dmiles=10687;  break;                         
                            case  "Guadeloupe": dmiles=10404;  break;                         
                            case  "Haiti": dmiles=10031;  break;                         
                            case  "Jamaica": dmiles=9926;  break;                         
                            case  "Martinique": dmiles=10519;  break;                         
                            case  "Montserrat": dmiles=10366;  break;                         
                            case  "Puerto Rico": dmiles=10207;  break;                          
                            case  "Saint-Barthelemy": dmiles= 10281; break; 
                            case  "Saint-Kitts & Nevis": dmiles=10334;  break;                           
                            case  "Saint Lucia": dmiles=10570;  break;                         
                            case  "St. Martin": dmiles=10267;  break;                             
                            case  "St. Vincent & Grenadines": dmiles=10631;  break;                            
                            case  "Sint. Maarten": dmiles= 10269; break;                         
                            case  "Trinidad & Tobago": dmiles= 10788; break;                         
                            case  "Turks & Caicos Island": dmiles=9871;  break;                          
                            case  "U.S. Virgin Islands": dmiles= 10226; break;                         
                            case  "Belize": dmiles=9501;  break;                            
                            case  "Costa Rica": dmiles=10083;  break;                         
                            case  "El Salvador": dmiles= 9652; break;                              
                            case  "Guatemala": dmiles= 9480; break;                            
                            case  "Honduras": dmiles=9704;  break;                           
                            case  "Mexico": dmiles= 8516; break;                               
                            case  "Nicaragua": dmiles=9865;  break;                         
                            case  "Panama": dmiles=10289; break; 
                            case  "Argentina": dmiles= 10635; break;                         
                            case  "Bolivia": dmiles= 12000; break;                         
                            case  "Brazil": dmiles= 11996; break;                         
                            case  "Chile": dmiles= 10650; break;                         
                            case  "Colombia": dmiles= 10796; break;                         
                            case  "Ecuador": dmiles= 10866; break;                         
                            case  "Folkland Islands": dmiles= 9741; break;                                                 
                            case  "French Guiana": dmiles=11216;  break;                                             
                            case  "Guyana": dmiles=11203; break;                         
                            case  "Paraguay": dmiles=11699;  break;                         
                            case  "Peru": dmiles=11263;  break;                         
                            case  "Suriname": dmiles= 11259; break;                         
                            case  "Uruguay": dmiles=  11064;break;                         
                            case  "Venezuela; ": dmiles= 10978; break;                                                
                            case  "Khazakhstan": dmiles= 3953; break;                         
                            case  "Kyrgyzstan": dmiles= 3431; break;                         
                            case  "Tajikistan": dmiles=3555;  break;                         
                            case  "Turkmenistan": dmiles=4173;  break;                         
                            case  "Uzbekistan":dmiles=3940; break;
                            case  "China": dmiles= 1927; break;                         
                            case  "China, Hong Kong": dmiles= 828; break;                         
                            case  "China, Macau": dmiles= 841;  break;                         
                            case  "Japan": dmiles= 1908; break;                         
                            case  "North Korea": dmiles= 1928; break;
                            case  "South Korea": dmiles= 1633; break;                         
                            case  "Mongolia": dmiles= 2567; break;                         
                            case  "Afghanistan": dmiles= 3673; break;                         
                            case  "Bangladesh": dmiles= 2185; break;                         
                            case  "Bhutan": dmiles= 2259; break;                                      
                            case  "India": dmiles= 2872; break;                         
                            case  "Iran": dmiles= 4471; break;                         
                            case  "Maldives": dmiles= 3380; break;                         
                            case  "Nepal": dmiles= 2643; break;                         
                            case  "Pakistan": dmiles=3541;  break;
                            case  "Sri Lanka": dmiles=2803;  break;                         
                            case  "Armenia": dmiles=4948;  break;                         
                            case  "Azerbaijan": dmiles=4814;  break;                         
                            case "Bahrain": dmiles= 4673;  break;                         
                            case "Cyprus": dmiles=5614;  break;                        
                            case "Georgia": dmiles=8917; break;
                            case "Iraq": dmiles=5049; break; 
                            case "Israel": dmiles=5580; break; 
                            case "Jordan": dmiles=5504; break;
                            case "Kuwait": dmiles= 4854; break;
                            case "Lebanon": dmiles= 5491; break;
                            case "Oman": dmiles=4352; break;
                            case "Palestine": dmiles= 5550; break;
                            case "Qatar": dmiles=4637; break;
                            case "Saudi Arabia": dmiles=5028; break;
                            case "Syria": dmiles=5305; break;
                            case "Turkey": dmiles= 5474; break;
                            case "United Arab Emirates": dmiles= 4479;  break;
                            case "Yemen": dmiles= 4883; break;
                            case "Brunei": dmiles= 750; break;
                            case "Cambodia": dmiles= 10796; break;
                            case "Indonesia": dmiles= 1086; break;
                            case "Laos": dmiles=1364; break;
                            case "Malaysia": dmiles=1477; break;
                            case "Myanmar (Burma)": dmiles= 1809; break;
                            case "Singapore": dmiles=1463; break;
                            case "Thailand": dmiles=1405; break;
                            case "Timor-Leste": dmiles=1526; break;
                            case "Vietnam": dmiles=910; break;
                            case "Burundi": dmiles=6391; break;
                            case "Comoros": dmiles= 5634; break;
                            case "Djibouti": dmiles=5318; break;
                            case "Eritrea": dmiles= 5460; break;
                            case "Ethiopia": dmiles= 5493; break;
                            case "Kenya": dmiles=5802; break;
                            case "Madagascar": dmiles=5544; break;
                            case "Malawi": dmiles= 6251; break;
                            case "Mauritius": dmiles=4926; break;
                            case "Mayotte": dmiles=5536; break;
                            case "Mozambique": dmiles= 6257;break;
                            case "Reunion": dmiles=5066; break;
                            case "Rwanda": dmiles=6372; break;
                            case "Seychelles": dmiles=4704; break;
                            case "Somalia": dmiles= 5166; break;
                            case "Tanzania": dmiles=6104; break;
                            case "Uganda": dmiles=6159; break;
                            case "Zambia": dmiles= 6673; break;
                            case "Zimbabwe": dmiles= 6670; break;
                            case "Angola": dmiles=7319; break;
                            case "Cameroon": dmiles=7390; break;
                            case "Central African Republic": dmiles=6836; break;
                            case "Chad": dmiles=6821; break;
                            case "Congo (Zaire) ": dmiles=6950; break;
                            case "Congo Republic": dmiles=7291; break;
                            case "Equatorial Guinea": dmiles=7633; break;
                            case "Gabon": dmiles=7583; break;
                            case "Sao Tome & Recipe": dmiles= 6304;break;
                            case "Algeria": dmiles=7532; break;
                            case "Egypt": dmiles=5875; break;
                            case "Libya": dmiles=6693; break;
                            case "Morocco": dmiles=7853; break;
                            case "Sudan": dmiles=6120; break;
                            case "South Sudan": dmiles=6140; break;
                            case "Tunisia": dmiles=6938; break;
                            case "Western Sahara": dmiles=8441; break;
                            case "Botswana": dmiles=6995; break;
                            case "Lesotho": dmiles=6860; break;
                            case "Namibia": dmiles=7392; break;
                            case "South Africa": dmiles=7183; break;
                            case "Swaziland": dmiles=6628; break;
                            case "Benin": dmiles=8009; break;
                            case "Burkina Faso": dmiles= 8179; break;
                            case "Cape Verde": dmiles= 9284; break;
                            case "Cote d'Ivoire": dmiles=8550; break;
                            case "Gambia": dmiles= 8975; break;
                            case "Ghana": dmiles= 8250; break;
                            case "Guinea": dmiles=8747; break;
                            case "Guinea-Bissau": dmiles=9023; break;
                            case "Liberia": dmiles=8841; break;
                            case "Mali": dmiles=8177; break;
                            case "Mauritania": dmiles=8459; break;
                            case "Niger": dmiles=7445; break;
                            case "Nigeria": dmiles=7597; break;
                            case "Saint Helena": dmiles=8919; break;
                            case "Senegal": dmiles=8889; break;
                            case "Sierra Leone": dmiles=8919; break;
                            case "Togo": dmiles=8116; break;
                            case "Australia": dmiles=2756; break;
                            case "New Zealand": dmiles=5024; break;
                            case "Norfolk Island": dmiles=4225; break;
                            case "Fiji": dmiles=4379; break;
                            case "New Caledonia": dmiles=3780; break;
                            case "Papua New Guinea": dmiles=2018;  break;
                            case "Solomon Islands": dmiles= 3057; break;
                            case "Vanuatu": dmiles=3652; break;
                            case "Guam": dmiles=1548; break;
                            case "Kiribati": dmiles=4893; break;
                            case "Marshall Island": dmiles=3378; break;
                            case "Micronesia": dmiles= 1990;break;
                            case "Nauru": dmiles=3227; break;
                            case "Northern Mariana Island": dmiles=1608; break;
                            case "Palua": dmiles=946; break;
                            case "American Samoa": dmiles=5019; break;
                            case "Cook Islands": dmiles=5813; break;
                            case "French Polynesia": dmiles=6407; break;
                            case "Niue": dmiles=5145; break;
                            case "Pitcairn Islands": dmiles=7818; break;
                            case "Samoa": dmiles=4883; break;
                            case "Tokelau": dmiles=4800; break;
                            case "Tonga": dmiles= 4877; break;
                            case "Tuvalu": dmiles=4074; break;
                            case "Wallis & Futuna Islands": dmiles=4518; break;
                            case "Belarus": dmiles=5654; break;
                            case "Bulgaria": dmiles=5926; break;
                            case "Czech Republic": dmiles=6239; break;
                            case "Hungary": dmiles=6125; break;
                            case "Moldova": dmiles=5719; break;
                            case "Poland": dmiles=6040; break;
                            case "Romania": dmiles=5898; break;
                            case "Russia": dmiles= 3458; break;
                            case "Slovakia": dmiles=6085; break;
                            case "Ukraine": dmiles=5589; break;
                            case "Denmark": dmiles=6293; break;
                            case "Estonia": dmiles= 5697; break;
                            case "Faroe Island (Denmark) ": dmiles=6573; break;
                            case "Finland": dmiles=5625; break;
                            case "Guernsey": dmiles=6964; break;
                            case "Iceland": dmiles=6681; break;
                            case "Ireland": dmiles=7002; break;
                            case "Isle of Man": dmiles=6849; break;
                            case "Jersey": dmiles=6956; break;
                            case "Latvia": dmiles=5738; break;
                            case "Lithuania": dmiles=5792; break;
                            case "Norway": dmiles=6199; break;
                            case "Svalbard & Jan Mayen Island (Norway) ": dmiles=5500; break;
                            case "Sweden": dmiles=5886; break;
                            case "United Kingdom": dmiles=6754; break;
                            case "Albania": dmiles=6218; break;
                            case "Andorra": dmiles=7057; break;
                            case "Bosnia & Herzegovina": dmiles=6279; break;
                            case "Croatia": dmiles=6366; break;
                            case "Gibraltar": dmiles=7603; break;
                            case "Greece": dmiles=6176; break;
                            case "Holy See (Vatican City)": dmiles=6576; break;
                            case "Italy": dmiles=6571; break;
                            case "Kosovo": dmiles=6153; break;
                            case "Macedonia": dmiles=6142; break;
                            case "Malta": dmiles=6631; break;
                            case "Montenegro": dmiles=6225; break;
                            case "Portugal": dmiles=7598; break;
                            case "San Marino": dmiles=6521; break;
                            case "Serbia": dmiles=6120; break;
                            case "Slovenia": dmiles=6350; break;
                            case "Spain": dmiles=7363; break;
                            case "Austria": dmiles=6335; break;
                            case "Belgium": dmiles=6661; break;
                            case "France": dmiles=6897; break;
                            case "Germany": dmiles=6407; break;
                            case "Liechtenstien": dmiles=6560; break;
                            case "Luxembourg": dmiles=6618; break;
                            case "Monaco": dmiles=6755; break;
                            case "Netherlands": dmiles=6575; break;
                            case "Switzerland": dmiles=6627; break;
                            default: costTxt.setText("Value cannot Find!!"); break;
                    }
                    // </editor-fold>

                    this.distance=Double.toString(dmiles);

                    switch (seatClass.getSelectedIndex()){
                        case 0:sCPrice=2000;break;
                        case 1:sCPrice=1000;break;
                        case 2:sCPrice=500;break;
                    }

                    totalPrice = sCPrice+(dmiles*5.81);
                    costTxt.setText(Double.toString(totalPrice));
                }

            }else{
                    errorM errr = new errorM("Flight Full");
                    errr.setVisible(true);
            }


        } catch(FileNotFoundException exc){

            JOptionPane.showMessageDialog(null,"Record Directory not Found!! \nPlease Try again");
            errorM errr = new errorM("Try again");
            errr.setVisible(true);
            try{
            Formatter file = new Formatter(fileName);
            }catch(Exception e){
                //JOptionPane.showMessageDialog(null,"Fatal error");
                errorM errrr = new errorM("Fatal Error");
                errrr.setVisible(true);
            }

        } catch (IOException ex) {

            Logger.getLogger(airlineReseration.class.getName()).log(Level.SEVERE, null, ex);

        }
        
        
        
    }//GEN-LAST:event_computeCostMouseClicked

    private void seatNumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seatNumMouseClicked
        
        
    }//GEN-LAST:event_seatNumMouseClicked

    private void computePaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_computePaymentMouseClicked
        // TODO add your handling code here:
        DecimalFormat df = new DecimalFormat("##0.00");
        
        try{
            if (Double.parseDouble(paymentTxt.getText()) >= Double.parseDouble(costTxt.getText())){
                double pymnt=Double.parseDouble(paymentTxt.getText());
                double cst = Double.parseDouble(costTxt.getText());
                
                double chng =  pymnt - cst;
                String fchng = df.format(chng);
                changeTxt.setText(fchng);
            }else{
                String m2 = "PAYMENT NOT ENOUGH";
                errorM e1 = new errorM(m2);
                e1.setVisible(true);
            }
        }catch(NumberFormatException e){
            errorM asdf = new errorM("INPUT ERROR");
            asdf.setVisible(true);
        }
        
    }//GEN-LAST:event_computePaymentMouseClicked

    private void checkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkMouseClicked
        try {
            // TODO add your handling code here:
            String fileName=country.getSelectedItem().replace(' ','_')+
                    airlineCompany.getSelectedItem().replace(' ','_')+
                    flightDate.getSelectedItem().replace('/','_')+
                    flightTime.getSelectedItem().replace(' ','_').replace(':','_')+
                    travelType.getSelectedItem().replace(' ','_')+".txt";
            int continentslct = continent.getSelectedIndex();
            int classA=0,classB=0,classC=0;
            int countryslct = country.getSelectedIndex();
            String dumm,lseatnum,lseatclass,lcountry,lairline,ldate,ltime,ltraveltype,classFull;
            boolean seathasvacant=true;
            
            errorM err;
            successM scc;
            
            Scanner file = new Scanner(new File(fileName));
            
            while (file.hasNext()){
                dumm = file.next();
                lseatnum = file.next();
                lseatclass = file.next();
                dumm = file.nextLine();
                int con_lseatnum = Integer.parseInt(lseatnum);
                
                if(con_lseatnum==Integer.parseInt(seatNum.getSelectedItem())){
                    //JOptionPane.showMessageDialog(null,"Can't add");
                    errorM errr = new errorM("Can't Add");
                    seathasvacant = false;
                }
                /////////
                if(lseatclass.equals("Class_A")){
                    classA++;
                }
                
                if(lseatclass.equals("Class_B")){
                    classB++;
                }
                
                if(lseatclass.equals("Class_C")){
                    classC++;
                }
                ////////
            }
            
            LineNumberReader record = new LineNumberReader(new FileReader(new File(fileName)));

            while ((record.readLine())!=null){
                numOfSeats=record.getLineNumber();
            }
            
            if (numOfSeats<30){

                        if(seathasvacant==false){

                            if(classA>=10&&seatClass.getSelectedIndex()==0){
                                classFull = "Class A Full";
                            }
                            else if(classB>=10&&seatClass.getSelectedIndex()==1){
                                //JOptionPane.showMessageDialog(null,"Class B full");
                                classFull = "Class B Full";
                            }
                            else if(classC>=10&&seatClass.getSelectedIndex()==2){
                                //JOptionPane.showMessageDialog(null,"Class C full");
                                classFull = "Class C Full";
                            }
                            else{
                                //JOptionPane.showMessageDialog(null,"seat already taken");
                                classFull= "Seat Already Taken";
                            }
                            
                            err = new errorM(classFull);
                            err.setVisible(true);

                        }else{
                            successM scc1 = new successM("Flight Available");
                            scc1.setVisible(true);
                        }
            }else{
                err = new errorM("Flight Full");
                err.setVisible(true);
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(airlineReseration.class.getName()).log(Level.SEVERE, null, ex);
        } catch(IOException e){
            errorM err1 = new errorM("You Have An Error");
            err1.setVisible(true);
        }
    }//GEN-LAST:event_checkMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addRecordBtn;
    private javax.swing.JLabel afasdf;
    private java.awt.Choice airlineCompany;
    private javax.swing.JTextField changeTxt;
    private javax.swing.JLabel check;
    private javax.swing.JLabel clearBtn;
    private javax.swing.JLabel computeCost;
    private javax.swing.JLabel computePayment;
    private java.awt.Choice continent;
    private javax.swing.JTextField costTxt;
    private java.awt.Choice country;
    private javax.swing.JTextField firstNametxt_;
    private java.awt.Choice flightDate;
    private java.awt.Choice flightTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lastNametxt_;
    private javax.swing.JTextField middleNametxt_;
    private javax.swing.JTextField paymentTxt;
    private java.awt.Choice seatClass;
    private java.awt.Choice seatNum;
    private java.awt.Choice travelType;
    private javax.swing.JLabel viewRecordBtn;
    // End of variables declaration//GEN-END:variables
}
