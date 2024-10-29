package Projet_final;

import static Projet_final.FrameAM.fich;
import java.awt.Toolkit;

import java.awt.event.WindowEvent;

import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;



public class ResAlignement extends javax.swing.JFrame {

    // déclaration Variables  
	
    public static javax.swing.JButton ehm;    // Bouton à afficher dans la fenetre graphique    
    private javax.swing.JScrollPane jScrollPane1;//composant de barres de défilement
    public static javax.swing.JToggleButton jToggleButton1;// Bouton retour à afficher dans la fenetre graphique 
    public static javax.swing.JTextArea r3;//champs de texte des résultats de l'alignement

   //Constructeur
	
    public ResAlignement() {
        initComponents();//méthode pour initialiser les composants de java swing
    }
    
                         
    private void initComponents() { //instancier les variables

        jScrollPane1 = new javax.swing.JScrollPane();
        r3 = new javax.swing.JTextArea();
        jToggleButton1 = new javax.swing.JToggleButton();
	    ehm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//contrôler la fermeture de la fenêtre

        r3.setEditable(false);//ne pas permettre la modification des résultats sur le champs du texte r3
        r3.setBackground(new java.awt.Color(240, 240, 240));
        r3.setColumns(20);
        r3.setFont(new java.awt.Font("Arabic Typesetting", 0, 18)); //police de l'écriture
        r3.setRows(5);
        r3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        r3.setMaximumSize(new java.awt.Dimension(10, 10));
        r3.setMinimumSize(new java.awt.Dimension(7, 7));
        r3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                r3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(r3);//Affecte le composant Scrollable à visualiser

        jToggleButton1.setBackground(new java.awt.Color(204, 204, 255));
        jToggleButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); 
        jToggleButton1.setText("Retour");
        jToggleButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {//ajouter un listener sur le bouton de retour
                jToggleButton1ActionPerformed(evt);//ajouter un évenement sur le bouton 
            }
        });
	ehm.setBackground(new java.awt.Color(204, 204, 255));
        ehm.setText("LOGO");//ajouter le text du bouton
        ehm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {//ajouter un listener sur le boouton logo
                ehmActionPerformed(evt);//ajouter un évenement sur le bouton logo
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1146, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(ehm, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ehm)
                .addGap(20, 20, 20))
        );

        pack();//permet de mettre une bonne dimension a la fenetre
    }                      

    private void r3AncestorAdded(javax.swing.event.AncestorEvent evt) {                                 
        

		
    }                                

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {  //l'évenement sur le bouton retout                                             
       //retour à la frameprincipale sans sortir du programme
        FramePrincipale t3 = new FramePrincipale();
        t3.setVisible(true);
        dispose();//fermer la fenêtre
        
    }                                              
 private void ehmActionPerformed(java.awt.event.ActionEvent evt) {   //l'évenement sur le bouton logo                                 
      
        try{ //creer un fichier à partir du jtextArea r3 pour manipuler avec le logo
            FileWriter lu = new FileWriter("fichier.txt"); //creer le fichier nommé fichier.txt
            BufferedWriter out = new BufferedWriter(lu);
            out.write(r3.getText());//recopier le texte de r3 dans le fichier 
            out.close();
        } catch (IOException ex) {
            
        }
        Weblogo weblogo = new Weblogo();//appeler la méthode weblogo

        weblogo.getWbAdressAndImage();

        weblogo.getJFrame();//afficher la frame du logo
        dispose();//fermer la frame
    }                                   

 
    public static void main(String args[]) {
        // Set du look and feel Nimbus 
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResAlignement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResAlignement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResAlignement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResAlignement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResAlignement().setVisible(true);
            }
        });
    }

                   
}
