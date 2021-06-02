package monit;
import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;

public class editPanel extends javax.swing.JFrame {
    
    public static float USD_RATE;
    public static float WON_RATE;
    public static float KES_RATE;
    public static float GBP_RATE;
    public static float EUR_RATE;
    public static float YUN_RATE;
    public static float YEN_RATE;
    public static float RUP_RATE;
    public static float FRC_RATE;
    public static float KRN_RATE;
    public static float GHS_RATE;
    public static float GAM_RATE;
    public static float NGI_RATE;
    public static float NPA_RATE;
    public static float NIC_RATE;
    public static float LAO_RATE;
    public static float ROM_RATE;
    public static float MOZ_RATE;
    public static float MYM_RATE;
    public static float MDG_RATE;    
   
    
    
    

    public editPanel() {
        initComponents();
        try {
            // TODO add your handling code here:
            File jsonFile = new File("/Users/juankim/NetBeansProjects/Monit/src/monit/exchangerate.json").getAbsoluteFile();
            
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonObject root = gson.fromJson(Files.newBufferedReader(jsonFile.toPath()), JsonObject.class);
            JsonObject information = root.getAsJsonObject("exchangeRate");
//            information.addProperty("USD_RATE", "1130f");
            USD_RATE = information.get("USD_RATE").getAsFloat();
            WON_RATE = information.get("WON_RATE").getAsFloat();
            KES_RATE = information.get("KES_RATE").getAsFloat();
            GBP_RATE = information.get("GBP_RATE").getAsFloat();
            EUR_RATE = information.get("EUR_RATE").getAsFloat();
            YUN_RATE = information.get("YUN_RATE").getAsFloat();
            YEN_RATE = information.get("YEN_RATE").getAsFloat();
            RUP_RATE = information.get("RUP_RATE").getAsFloat();
            FRC_RATE = information.get("FRC_RATE").getAsFloat();
            KRN_RATE = information.get("KRN_RATE").getAsFloat();
            GHS_RATE = information.get("GHS_RATE").getAsFloat();
            GAM_RATE = information.get("GAM_RATE").getAsFloat();
            NGI_RATE = information.get("NGI_RATE").getAsFloat();
            NPA_RATE = information.get("NPA_RATE").getAsFloat();
            NIC_RATE = information.get("NIC_RATE").getAsFloat();
            LAO_RATE = information.get("LAO_RATE").getAsFloat();
            ROM_RATE = information.get("ROM_RATE").getAsFloat();
            MOZ_RATE = information.get("MOZ_RATE").getAsFloat();
            MYM_RATE = information.get("MYM_RATE").getAsFloat();
            MDG_RATE = information.get("MDG_RATE").getAsFloat();
            usRT.setText(Float.toString(USD_RATE));
            krRT.setText(Float.toString(WON_RATE));
            kyRT.setText(Float.toString(KES_RATE));
            gbRT.setText(Float.toString(GBP_RATE));
            euRT.setText(Float.toString(EUR_RATE));
            cnRT.setText(Float.toString(YUN_RATE));
            jpRT.setText(Float.toString(YEN_RATE));
            idRT.setText(Float.toString(RUP_RATE));
            chRT.setText(Float.toString(FRC_RATE));
            seRT.setText(Float.toString(KRN_RATE));
            ghRT.setText(Float.toString(GHS_RATE));
            gamRT.setText(Float.toString(GAM_RATE));
            ngRT.setText(Float.toString(NGI_RATE));
            npRT.setText(Float.toString(NPA_RATE));
            niRT.setText(Float.toString(NIC_RATE));
            laoRT.setText(Float.toString(LAO_RATE));
            romRT.setText(Float.toString(ROM_RATE));
            mozRT.setText(Float.toString(MOZ_RATE));
            mymRT.setText(Float.toString(MYM_RATE));
            mgRT.setText(Float.toString(MDG_RATE));
        } catch (IOException ex) {
            Logger.getLogger(editPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    
    
    public static boolean isStringDouble(String s){
        try{
            Double.parseDouble(s);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        krRN = new javax.swing.JLabel();
        usRN = new javax.swing.JLabel();
        kyRN = new javax.swing.JLabel();
        confBut = new javax.swing.JButton();
        krRT = new javax.swing.JTextField();
        usRT = new javax.swing.JTextField();
        kyRT = new javax.swing.JTextField();
        kyRN1 = new javax.swing.JLabel();
        gbRT = new javax.swing.JTextField();
        ableLab = new javax.swing.JLabel();
        retriBut = new javax.swing.JButton();
        usRN1 = new javax.swing.JLabel();
        usRN2 = new javax.swing.JLabel();
        usRN3 = new javax.swing.JLabel();
        usRN4 = new javax.swing.JLabel();
        usRN5 = new javax.swing.JLabel();
        usRN6 = new javax.swing.JLabel();
        euRT = new javax.swing.JTextField();
        cnRT = new javax.swing.JTextField();
        jpRT = new javax.swing.JTextField();
        idRT = new javax.swing.JTextField();
        chRT = new javax.swing.JTextField();
        seRT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        usRN7 = new javax.swing.JLabel();
        ghRT = new javax.swing.JTextField();
        gamRT = new javax.swing.JTextField();
        ngRT = new javax.swing.JTextField();
        kyRN2 = new javax.swing.JLabel();
        npRT = new javax.swing.JTextField();
        usRN8 = new javax.swing.JLabel();
        usRN9 = new javax.swing.JLabel();
        usRN10 = new javax.swing.JLabel();
        usRN11 = new javax.swing.JLabel();
        usRN12 = new javax.swing.JLabel();
        usRN13 = new javax.swing.JLabel();
        niRT = new javax.swing.JTextField();
        laoRT = new javax.swing.JTextField();
        romRT = new javax.swing.JTextField();
        mozRT = new javax.swing.JTextField();
        mymRT = new javax.swing.JTextField();
        usRN14 = new javax.swing.JLabel();
        mgRT = new javax.swing.JTextField();
        kyRN3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Converter Editor");
        setResizable(false);

        krRN.setText("KR, Won");

        usRN.setText("US, Dollar");

        kyRN.setText("KY, KES");

        confBut.setText("Confirm");
        confBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confButActionPerformed(evt);
            }
        });

        krRT.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                krRTInputMethodTextChanged(evt);
            }
        });
        krRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krRTActionPerformed(evt);
            }
        });

        usRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usRTActionPerformed(evt);
            }
        });

        kyRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kyRTActionPerformed(evt);
            }
        });

        kyRN1.setText("GB, GBP ");

        gbRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gbRTActionPerformed(evt);
            }
        });

        ableLab.setText("...");

        retriBut.setText("Retrieve");
        retriBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retriButActionPerformed(evt);
            }
        });

        usRN1.setText("EUR, Euro");

        usRN2.setText("CN, Yuan");

        usRN3.setText("JP, Yen");

        usRN4.setText("IDN, Rupiah");

        usRN5.setText("CH, Franc");

        usRN6.setText("SE, Krona");

        euRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euRTActionPerformed(evt);
            }
        });

        cnRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnRTActionPerformed(evt);
            }
        });

        jpRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpRTActionPerformed(evt);
            }
        });

        idRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idRTActionPerformed(evt);
            }
        });

        chRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chRTActionPerformed(evt);
            }
        });

        seRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seRTActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 16)); // NOI18N
        jLabel1.setText("Please Update the RATES (Countries rate to Won)");

        usRN7.setText("CH, Cedi");

        ghRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ghRTActionPerformed(evt);
            }
        });

        gamRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamRTActionPerformed(evt);
            }
        });

        ngRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngRTActionPerformed(evt);
            }
        });

        kyRN2.setText("NP, Rupee");

        npRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npRTActionPerformed(evt);
            }
        });

        usRN8.setText("NI, Cordoba");

        usRN9.setText("LAO, Kip");

        usRN10.setText("ROM, Leu");

        usRN11.setText("MOZ, Metical");

        usRN12.setText("MYM, Kyat");

        usRN13.setText("MG, Ariary");

        niRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                niRTActionPerformed(evt);
            }
        });

        laoRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laoRTActionPerformed(evt);
            }
        });

        romRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                romRTActionPerformed(evt);
            }
        });

        mozRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mozRTActionPerformed(evt);
            }
        });

        mymRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mymRTActionPerformed(evt);
            }
        });

        usRN14.setText("GAM, Dalasi");

        mgRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgRTActionPerformed(evt);
            }
        });

        kyRN3.setText("NG, Naira");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(krRN)
                                .addGap(153, 153, 153))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(usRN)
                                            .addComponent(kyRN)
                                            .addComponent(kyRN1))
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(krRT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(gbRT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(kyRT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(usRT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(usRN1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(euRT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(usRN2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cnRT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(usRN3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jpRT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(usRN4)
                                                .addComponent(usRN5)
                                                .addComponent(usRN6))
                                            .addGap(12, 12, 12)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(seRT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(chRT, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                    .addComponent(idRT)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(retriBut)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(confBut)))
                                .addGap(9, 9, 9)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(usRN11)
                                            .addComponent(usRN12)
                                            .addComponent(usRN13)
                                            .addComponent(usRN10)
                                            .addComponent(usRN9))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(romRT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(laoRT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mozRT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mymRT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mgRT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(usRN14)
                                            .addComponent(kyRN3)
                                            .addComponent(kyRN2)
                                            .addComponent(usRN7)
                                            .addComponent(usRN8))
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(npRT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ngRT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(gamRT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ghRT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(niRT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
                            .addComponent(ableLab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(krRN)
                            .addComponent(krRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usRN7)
                            .addComponent(ghRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usRN, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kyRN)
                            .addComponent(kyRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kyRN1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gbRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usRN1)
                            .addComponent(euRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usRN2)
                            .addComponent(cnRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usRN3)
                            .addComponent(jpRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usRN4)
                            .addComponent(idRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chRT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usRN5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usRN6)
                            .addComponent(seRT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usRN14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gamRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kyRN3)
                            .addComponent(ngRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kyRN2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(npRT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usRN8)
                            .addComponent(niRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usRN9)
                            .addComponent(laoRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usRN10)
                            .addComponent(romRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usRN11)
                            .addComponent(mozRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mymRT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usRN12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usRN13)
                            .addComponent(mgRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retriBut)
                    .addComponent(confBut)
                    .addComponent(ableLab)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confButActionPerformed
        // TODO add your handling code here:
        if(!isStringDouble(krRT .getText()) || !isStringDouble(usRT.getText()) || 
                !isStringDouble(kyRT.getText()) || !isStringDouble(gbRT.getText()) || 
                !isStringDouble(euRT.getText()) || !isStringDouble(cnRT.getText()) || 
                !isStringDouble(jpRT.getText()) || !isStringDouble(idRT.getText()) || 
                !isStringDouble(chRT.getText()) || !isStringDouble(seRT.getText()) || 
                !isStringDouble(ghRT.getText()) || !isStringDouble(gamRT.getText()) ||
                !isStringDouble(ngRT.getText()) || !isStringDouble(npRT.getText()) ||
                !isStringDouble(niRT.getText()) || !isStringDouble(laoRT.getText()) ||
                !isStringDouble(romRT.getText()) || !isStringDouble(mozRT.getText()) ||
                !isStringDouble(mymRT.getText()) || !isStringDouble(mgRT.getText())
                ){
            ableLab.setText("Error Please use Integer or Float");
        }
        
        MonForm mf = new MonForm();
        USD_RATE = Float.valueOf(usRT.getText());
        WON_RATE = Float.valueOf(krRT.getText());
        KES_RATE = Float.valueOf(kyRT.getText());
        GBP_RATE = Float.valueOf(gbRT.getText());
        EUR_RATE = Float.valueOf(euRT.getText());
        YUN_RATE = Float.valueOf(cnRT.getText());
        YEN_RATE = Float.valueOf(jpRT.getText());
        RUP_RATE = Float.valueOf(idRT.getText());
        FRC_RATE = Float.valueOf(chRT.getText());
        KRN_RATE = Float.valueOf(seRT.getText());
        GHS_RATE = Float.valueOf(ghRT.getText());
        GAM_RATE = Float.valueOf(gamRT.getText());
        NGI_RATE = Float.valueOf(ngRT.getText());
        NPA_RATE = Float.valueOf(npRT.getText());
        NIC_RATE = Float.valueOf(niRT.getText());
        LAO_RATE = Float.valueOf(laoRT.getText());
        ROM_RATE = Float.valueOf(romRT.getText());
        MOZ_RATE = Float.valueOf(mozRT.getText());
        MYM_RATE = Float.valueOf(mymRT.getText());
        MDG_RATE = Float.valueOf(mgRT.getText());
        
        File jsonFile = new File("/Users/juankim/NetBeansProjects/Monit/src/monit/exchangerate.json").getAbsoluteFile();
        FileWriter writer = null;
            
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            JsonObject root = gson.fromJson(Files.newBufferedReader(jsonFile.toPath()), JsonObject.class);
            //Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
            JsonObject exchangeRate = root.getAsJsonObject("exchangeRate");
            exchangeRate.addProperty("USD_RATE", USD_RATE);
            exchangeRate.addProperty("WON_RATE", WON_RATE);
            exchangeRate.addProperty("KES_RATE", KES_RATE);
            exchangeRate.addProperty("GBP_RATE", GBP_RATE);
            exchangeRate.addProperty("EUR_RATE", EUR_RATE);
            exchangeRate.addProperty("YUN_RATE", YUN_RATE);
            exchangeRate.addProperty("YEN_RATE", YEN_RATE);
            exchangeRate.addProperty("RUP_RATE", RUP_RATE);
            exchangeRate.addProperty("FRC_RATE", FRC_RATE);
            exchangeRate.addProperty("KRN_RATE", KRN_RATE);
            exchangeRate.addProperty("GHS_RATE", GHS_RATE);
            exchangeRate.addProperty("GAM_RATE", GAM_RATE);
            exchangeRate.addProperty("NGI_RATE", NGI_RATE);
            exchangeRate.addProperty("NPA_RATE", NPA_RATE);
            exchangeRate.addProperty("NIC_RATE", NIC_RATE);
            exchangeRate.addProperty("LAO_RATE", LAO_RATE);
            exchangeRate.addProperty("ROM_RATE", ROM_RATE);
            exchangeRate.addProperty("MOZ_RATE", MOZ_RATE);
            exchangeRate.addProperty("MYM_RATE", MYM_RATE);
            exchangeRate.addProperty("MDG_RATE", MDG_RATE);
            String json = gson.toJson(root);
            writer = new FileWriter(jsonFile, false);
            writer.write(json);
            writer.flush();
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(editPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        mf.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_confButActionPerformed

    private void kyRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kyRTActionPerformed
        
    }//GEN-LAST:event_kyRTActionPerformed

    private void krRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_krRTActionPerformed

    private void gbRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gbRTActionPerformed
        
    }//GEN-LAST:event_gbRTActionPerformed

    private void usRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usRTActionPerformed
        
    }//GEN-LAST:event_usRTActionPerformed

    private void krRTInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_krRTInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_krRTInputMethodTextChanged

    private void retriButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retriButActionPerformed
        // TODO add your handling code here:
        krRT.setText(Float.toString(WON_RATE));
        usRT.setText(Float.toString(USD_RATE));
        kyRT.setText(Float.toString(KES_RATE));
        gbRT.setText(Float.toString(GBP_RATE));
        euRT.setText(Float.toString(EUR_RATE));
        cnRT.setText(Float.toString(YUN_RATE));
        jpRT.setText(Float.toString(YEN_RATE));
        idRT.setText(Float.toString(RUP_RATE));
        chRT.setText(Float.toString(FRC_RATE));
        seRT.setText(Float.toString(KRN_RATE));
        ghRT.setText(Float.toString(GHS_RATE));
        gamRT.setText(Float.toString(GAM_RATE));
        ngRT.setText(Float.toString(NGI_RATE));
        npRT.setText(Float.toString(NPA_RATE));
        niRT.setText(Float.toString(NIC_RATE));
        laoRT.setText(Float.toString(LAO_RATE));
        romRT.setText(Float.toString(ROM_RATE));
        mozRT.setText(Float.toString(MOZ_RATE));
        mymRT.setText(Float.toString(MYM_RATE));
        mgRT.setText(Float.toString(MDG_RATE));
        
        
    }//GEN-LAST:event_retriButActionPerformed

    private void euRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_euRTActionPerformed

    private void cnRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnRTActionPerformed

    private void jpRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpRTActionPerformed

    private void idRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idRTActionPerformed

    private void chRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chRTActionPerformed

    private void seRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seRTActionPerformed

    private void ghRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ghRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ghRTActionPerformed

    private void gamRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gamRTActionPerformed

    private void ngRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ngRTActionPerformed

    private void npRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_npRTActionPerformed

    private void niRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_niRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_niRTActionPerformed

    private void laoRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laoRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_laoRTActionPerformed

    private void romRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_romRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_romRTActionPerformed

    private void mozRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mozRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mozRTActionPerformed

    private void mymRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mymRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mymRTActionPerformed

    private void mgRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mgRTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                try {
                    new editPanel().setVisible(false);
                    
//                    File jsonFile = new File("/Users/juankim/NetBeansProjects/Monit/src/monit/exchangerate.json").getAbsoluteFile();
//                    
//                    Gson gson = new GsonBuilder().setPrettyPrinting().create();
//                    JsonObject root = gson.fromJson(Files.newBufferedReader(jsonFile.toPath()), JsonObject.class);
//                    JsonObject information = root.getAsJsonObject("exchangeRate");
//                    information.addProperty("USD_RATE", "1130f");
//                    USD_RATE = information.get("USD_RATE").getAsFloat();
//                    String won = information.get("WON_RATE").toString();
//                    String kes = information.get("KES_RATE").toString();
//                    String gbp = information.get("GBP_RATE").toString();
//                    String euro = information.get("EUR_RATE").toString();
//                    String yuan = information.get("YUN_RATE").toString();
//                    String yen = information.get("YEN_RATE").toString();
//                    String rup = information.get("RUP_RATE").toString();
//                    String frc = information.get("FRC_RATE").toString();
//                    String krn = information.get("KRN_RATE").toString();
                    
//                    System.out.println(USD_RATE);
//                    System.out.println(won);
//                    usRT.setText(USD_RATE);
//                } catch (IOException ex) {
//                    Logger.getLogger(editPanel.class.getName()).log(Level.SEVERE, null, ex);
//                }
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ableLab;
    private javax.swing.JTextField chRT;
    private javax.swing.JTextField cnRT;
    private javax.swing.JButton confBut;
    private javax.swing.JTextField euRT;
    private javax.swing.JTextField gamRT;
    private javax.swing.JTextField gbRT;
    private javax.swing.JTextField ghRT;
    private javax.swing.JTextField idRT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jpRT;
    private javax.swing.JLabel krRN;
    private javax.swing.JTextField krRT;
    private javax.swing.JLabel kyRN;
    private javax.swing.JLabel kyRN1;
    private javax.swing.JLabel kyRN2;
    private javax.swing.JLabel kyRN3;
    private javax.swing.JTextField kyRT;
    private javax.swing.JTextField laoRT;
    private javax.swing.JTextField mgRT;
    private javax.swing.JTextField mozRT;
    private javax.swing.JTextField mymRT;
    private javax.swing.JTextField ngRT;
    private javax.swing.JTextField niRT;
    private javax.swing.JTextField npRT;
    private javax.swing.JButton retriBut;
    private javax.swing.JTextField romRT;
    private javax.swing.JTextField seRT;
    private javax.swing.JLabel usRN;
    private javax.swing.JLabel usRN1;
    private javax.swing.JLabel usRN10;
    private javax.swing.JLabel usRN11;
    private javax.swing.JLabel usRN12;
    private javax.swing.JLabel usRN13;
    private javax.swing.JLabel usRN14;
    private javax.swing.JLabel usRN2;
    private javax.swing.JLabel usRN3;
    private javax.swing.JLabel usRN4;
    private javax.swing.JLabel usRN5;
    private javax.swing.JLabel usRN6;
    private javax.swing.JLabel usRN7;
    private javax.swing.JLabel usRN8;
    private javax.swing.JLabel usRN9;
    private javax.swing.JTextField usRT;
    // End of variables declaration//GEN-END:variables
}
