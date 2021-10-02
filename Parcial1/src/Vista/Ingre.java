package Vista;

import Modelo.Usuario;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Ingre extends javax.swing.JFrame {

    Interfaz nuevo = new Interfaz();
    public Ingre() {
        initComponents();
         this.setLocationRelativeTo(null); 
    }
public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("newpackage/icon.png"));
        return retValue;
    }
public ImageIcon rezicePic(String picPath) {
        
    ImageIcon IMAGEN= new ImageIcon(picPath);
    Image img=IMAGEN.getImage().getScaledInstance(jLabelPic.getWidth(), jLabelPic.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon MIIMG=new ImageIcon(img);
    
        return  MIIMG;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        sal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        gene = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ape = new javax.swing.JTextField();
        jt_cedula = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Fecha = new javax.swing.JTextField();
        EDAD = new javax.swing.JTextField();
        jt_nombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Fecha1 = new javax.swing.JTextField();
        EDAD1 = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnCalcular3 = new javax.swing.JButton();
        EDAD2 = new javax.swing.JTextField();
        btnCalcular2 = new javax.swing.JButton();
        jLabelPic = new javax.swing.JLabel();
        btnCalcular1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Volver");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));
        getContentPane().add(sal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 150, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Dia/Mes/Año");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 90, -1));

        gene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geneActionPerformed(evt);
            }
        });
        getContentPane().add(gene, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 150, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Digite su fecha de ingreso");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        ape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apeActionPerformed(evt);
            }
        });
        getContentPane().add(ape, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 150, -1));

        jt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_cedulaActionPerformed(evt);
            }
        });
        getContentPane().add(jt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 150, -1));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("digite su nacimiento");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        Fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaActionPerformed(evt);
            }
        });
        getContentPane().add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 160, -1));

        EDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDADActionPerformed(evt);
            }
        });
        getContentPane().add(EDAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 260, 40));

        jt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(jt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 150, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Dia/Mes/Año");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 90, -1));

        Fecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fecha1ActionPerformed(evt);
            }
        });
        getContentPane().add(Fecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 160, -1));

        EDAD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDAD1ActionPerformed(evt);
            }
        });
        getContentPane().add(EDAD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 310, 40));

        btnCalcular.setBackground(new java.awt.Color(0, 0, 0));
        btnCalcular.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular Edad");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        btnCalcular3.setBackground(new java.awt.Color(0, 0, 0));
        btnCalcular3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCalcular3.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular3.setText("Buscar");
        btnCalcular3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 80, -1));

        EDAD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDAD2ActionPerformed(evt);
            }
        });
        getContentPane().add(EDAD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 310, 40));

        btnCalcular2.setBackground(new java.awt.Color(0, 0, 0));
        btnCalcular2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCalcular2.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular2.setText("Calcular Prestaciones");
        btnCalcular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 170, -1));

        jLabelPic.setBackground(new java.awt.Color(0, 0, 51));
        jLabelPic.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelPic.setForeground(new java.awt.Color(0, 51, 102));
        jLabelPic.setOpaque(true);
        getContentPane().add(jLabelPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 170, 150));

        btnCalcular1.setBackground(new java.awt.Color(0, 0, 0));
        btnCalcular1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCalcular1.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular1.setText("Calcular Antigüedad");
        btnCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 160, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Cedula :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 70, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apellido:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Genero:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Salario:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Datos empleado");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/fondo-azul.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 580));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/fondo-azul.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_nombreActionPerformed
    }//GEN-LAST:event_jt_nombreActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try{
            int temp = Integer.parseInt(sal.getText());
             
            
            
            if(ValidarId(jt_cedula.getText())){
                Usuario usu = new Usuario(jt_cedula.getText(),jt_nombre.getText(), ape.getText(),gene.getText(), temp,EDAD.getText(),EDAD1.getText(),jLabelPic.getText());
                nuevo.cap.add(usu);
            }else{
                JOptionPane.showMessageDialog(null, "La Cedula ya está registrada ingrese otra");
            }
            
        }catch(NumberFormatException exp){
            JOptionPane.showMessageDialog(null, "Por favor llene todas las casillas");
            System.out.println(exp);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_cedulaActionPerformed
    }//GEN-LAST:event_jt_cedulaActionPerformed
    private void geneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geneActionPerformed
    }//GEN-LAST:event_geneActionPerformed

    private void apeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apeActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        Edad();    
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void FechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaActionPerformed

    private void EDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EDADActionPerformed

    private void Fecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fecha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Fecha1ActionPerformed

    private void EDAD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDAD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EDAD1ActionPerformed

    private void btnCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular1ActionPerformed
       INGRESO();  
    }//GEN-LAST:event_btnCalcular1ActionPerformed

    private void EDAD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDAD2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EDAD2ActionPerformed

    private void btnCalcular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular2ActionPerformed
      Prestacion(); 
    }//GEN-LAST:event_btnCalcular2ActionPerformed

    private void btnCalcular3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular3ActionPerformed
       imagenn();
       
    }//GEN-LAST:event_btnCalcular3ActionPerformed

   

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Ingre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField EDAD;
    public javax.swing.JTextField EDAD1;
    public javax.swing.JTextField EDAD2;
    public javax.swing.JTextField Fecha;
    public javax.swing.JTextField Fecha1;
    public javax.swing.JTextField ape;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCalcular1;
    private javax.swing.JButton btnCalcular2;
    private javax.swing.JButton btnCalcular3;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    public javax.swing.JTextField gene;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPic;
    public javax.swing.JTextField jt_cedula;
    public javax.swing.JTextField jt_nombre;
    public javax.swing.JTextField sal;
    // End of variables declaration//GEN-END:variables

    private boolean ValidarId(String ced) {
                
        for(int i=0; i<nuevo.cap.size(); i++){
            if(nuevo.cap.get(i).getCedula().equals(ced)){
                return false;
            }
        }
        return true;
    }
    public  String Edad() {
      DateTimeFormatter date=DateTimeFormatter.ofPattern("dd/MM/yyyy");
      LocalDate fecha=LocalDate.parse(Fecha.getText(), date);
      LocalDate actual=LocalDate.now();

      Period periodo=Period.between(fecha, actual);
       String resultado=(periodo.getYears()+"Años, "+periodo.getMonths()+"meses"+periodo.getDays()+"Dias");
       EDAD.setText(resultado);
       return resultado;
    }
     public  String INGRESO() {
      DateTimeFormatter date=DateTimeFormatter.ofPattern("dd/MM/yyyy");
      LocalDate fecha=LocalDate.parse(Fecha1.getText(), date);
      LocalDate actual=LocalDate.now();

      Period periodo=Period.between(fecha, actual);
       String resultado=(periodo.getYears()+"Años, "+periodo.getMonths()+"meses");
       EDAD1.setText(resultado);
       return resultado;
    }         
      public  String Prestacion() {
      DateTimeFormatter date=DateTimeFormatter.ofPattern("dd/MM/yyyy");
      LocalDate fecha=LocalDate.parse(Fecha1.getText(), date);
      LocalDate actual=LocalDate.now();

      Period periodo=Period.between(fecha, actual);
       String resultado=("$"+((periodo.getYears()*12)+(periodo.getMonths()))/12);
       int meses;
       
       EDAD2.setText(resultado);
       return resultado;
    }    
      
      public void imagenn(){
     JFileChooser filec=new JFileChooser();
       filec.setCurrentDirectory(new File(System.getProperty("user.home")));
       //Extencion FILE
       FileNameExtensionFilter fileFilter=new FileNameExtensionFilter("*.images","jpg","png","gif"); 
       filec.addChoosableFileFilter(fileFilter);
       
       int fileState =filec.showSaveDialog(null);
        if(fileState==JFileChooser.APPROVE_OPTION){
            
            File SelectedFile=filec.getSelectedFile();
            String path=SelectedFile.getAbsolutePath();
            jLabelPic.setIcon(rezicePic(path));            
        }
        
        else if(fileState==JFileChooser.CANCEL_OPTION){
            JOptionPane.showMessageDialog(this,"IMAGEN NO SELECCIONADA!");
        }
      }
}
