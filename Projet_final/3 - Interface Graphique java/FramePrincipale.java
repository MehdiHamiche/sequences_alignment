package Projet_final;

import javax.swing.JFrame;

public class FramePrincipale extends javax.swing.JFrame {
	
    // déclaration des variables  
	
    public static javax.swing.JButton btnag;// Bouton alignement global à afficher dans la fenetre graphique
    private javax.swing.JButton btnam;// Bouton alignement multiple à afficher dans la fenetre graphique
    private javax.swing.JLabel jLabel1;//label pour placer du texte
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;//composant de barres de défilement
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;//champs de texte

    //Constructeur 
	
    public FramePrincipale() {
        initComponents();//méthode pour initialiser les composants de java swing
        setExtendedState(JFrame.MAXIMIZED_BOTH);//affichage en plein écran
    }

                            
    private void initComponents() {//instancier les variables

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnag = new javax.swing.JButton();
        btnam = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//contrôler la fermeture de la fenêtre

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));//arrière plan de la fenêtre
        jTabbedPane1.setForeground(new java.awt.Color(204, 102, 255));//couleur du font d'affichage
        jTabbedPane1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); //police et taille de l'écriture

        jPanel1.setLayout(null);//pour mettre l'image de fond sur toute la background

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); //police de l'écriture
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setText("PROJET L2D1");//ajouter le texte 
        jPanel1.add(jLabel1);
        jLabel1.setBounds(560, 60, 170, 60);

        jTextArea1.setEditable(false);//ne pas modifier le champs de texte
        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); //police de l'écriture
        jTextArea1.setRows(5);
        jTextArea1.setText("L'application BIOInfO est une application java permettant de réaliser des alignements des séquences protéiques ou nucléiques.\nOn a deux types d'alignements : \nAlignement Global : se fait avec deux séquences et des valeurs gap, match, et mismatch, en précisant la nature des séquences \nà aligner (protéine ou adn).\nAlignement multiple : comme l'alignement global mais avec au moins trois séquences.\nOn a aussi la possibilité de récupérer les logos à partir de l'alignement multiple des séquences.\n");//texte d'Introduction de l'application
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(140, 190, 1010, 170);

        btnag.setBackground(new java.awt.Color(204, 204, 255));
        btnag.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); 
        btnag.setText("Alignement Global ");//ajouter le texte
        btnag.addActionListener(new java.awt.event.ActionListener() {//ajouter un listener sur le bouton de l'alignement global
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagActionPerformed(evt);//ajouter un évenement sur le bouton
            }
        });
        jPanel1.add(btnag);
        btnag.setBounds(320, 480, 160, 30);//redimentionne la composante

        btnam.setBackground(new java.awt.Color(204, 204, 255));
        btnam.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); 
        btnam.setText("Alignement multiple");//ajouter le texte
        btnam.addActionListener(new java.awt.event.ActionListener() {//ajouter un listener sur le bouton alignement multiple
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnamActionPerformed(evt);//ajouter un évenement sur le bouton
            }
        });
        jPanel1.add(btnam);//ajouter le bouton sur le conteneur
        btnam.setBounds(740, 480, 160, 30);//redimension

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\manal\\Desktop\\L2D1\\2020-l2d1\\branches\\Projet_final\\3 - Interface Graphique java\\dna.jpg")); //image arrière plan 
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));//définir le curseur par défaut
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 1920, 960);

        jTabbedPane1.addTab("BIOInfO.", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1299, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();//permet de mettre une bonne dimension a la fenetre
    }                      

    private void btnagActionPerformed(java.awt.event.ActionEvent evt) {  //l'évenement sur le bouton alignement global                                    
        // vers la frame de l'alignement global
        FrameAG f = new FrameAG();
        f.setVisible(true);
        dispose();//fermer la fenêtre
      
    }                                     

    private void btnamActionPerformed(java.awt.event.ActionEvent evt) {  //l'évenement sur le bouton alignement multiple                                    
     //vers la frame alignement multiple
        FrameAM f = new FrameAM();
        f.setVisible(true);
        dispose();//fermer la fenêtre
    }                                     

    public static void main(String args[]) {
     //set le look and feel Nimbus
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipale().setVisible(true);
            }
        });
    }

                      
}
