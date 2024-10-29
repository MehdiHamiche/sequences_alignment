package Projet_final;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FrameAG extends javax.swing.JFrame {
	
	 // déclaration des Variables           
	
    public static javax.swing.JButton btnaligne1;
    private javax.swing.JButton btnaligner1;// Bouton à afficher dans la fenetre graphique
    public static javax.swing.JTextField gap; //champs de saisie de la valeur gap
    private javax.swing.JButton jButton1; // Bouton à afficher dans la fenetre graphique
    public static javax.swing.JComboBox<String> jComboBox; //ajouter une liste déroulante 
    private javax.swing.JLabel jLabel1;//label pour placer le texte
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTextField match;//champs de saisie de la valeur match
    public static javax.swing.JTextField mismatch;//champs de saisie de la valeur mismatch
    public static javax.swing.JTextField textfield1;//champs de saisie de la première séquence 
    public static javax.swing.JTextField textfield2;//champs de saisie de la deuxième séquence
    
 	//Constructeur

    public FrameAG() {
        initComponents();//méthode pour initialiser les composants de java swing
        this.setTitle("Alignement Global");   //définir le titre de la fenêtre
        setExtendedState(JFrame.MAXIMIZED_BOTH);    //affichage de la fenêtre en plein écran
    }
    
	//méthodes
        
    private void initComponents() { //instancier les composants (variables)

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jComboBox = new javax.swing.JComboBox<>();
        gap = new javax.swing.JTextField();
        match = new javax.swing.JTextField();
        mismatch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textfield1 = new javax.swing.JTextField();
        textfield2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnaligne1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnaligner1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); //contrôler la fermeture de la fenêtre 

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255)); //arriere plan de la fenêtre
        jTabbedPane1.setForeground(new java.awt.Color(204, 102, 255)); //couleur du font d'affichage
        jTabbedPane1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // Police et taille l'écriture 

        jPanel1.setLayout(null); //pour mettre l'image de fond sur toute la background

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PROTEINE", "ADN" })); //creation d'une liste déroulante avec valeurs ADN et PROTEINE 
        jComboBox.addActionListener(new java.awt.event.ActionListener() { //ajouter un listener pour la liste déroulante 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);//ajouter un actionperformed (un évenement) sur la liste déroulante après 
            }
        });
        jPanel1.add(jComboBox);//ajouter la liste déroulante sur le conteneur
        jComboBox.setBounds(100, 70, 120, 20);//redimensionne la composante

        gap.setBackground(new java.awt.Color(240, 240, 240));

        jPanel1.add(gap);//ajouter le champs gap sur le conteneur
        gap.setBounds(600, 140, 40, 30);

        match.setBackground(new java.awt.Color(240, 240, 240));

        jPanel1.add(match);//ajouter le champs match sur le conteneur
        match.setBounds(190, 140, 40, 30);

        mismatch.setBackground(new java.awt.Color(240, 240, 240));

        jPanel1.add(mismatch);//ajouter le champs mismatch sur le conteneur
        mismatch.setBounds(410, 140, 40, 30);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gap :"); //modifier le text du label à GAP 
        jPanel1.add(jLabel1);
        jLabel1.setBounds(510, 150, 40, 14);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Match :"); //modifier le text du label à Match
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 150, 50, 14);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mismatch :"); //modifier le text du label à Mismatch
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 150, 60, 14);
        jPanel1.add(textfield1);//ajouter le textfield de la première séquence sur le conteneur
        textfield1.setBounds(370, 260, 480, 50);
        jPanel1.add(textfield2);//ajouter le textfield le la deuxième séquence sur le conteneur
        textfield2.setBounds(370, 400, 480, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Veuillez saisir la deuxième séquence : ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(480, 350, 270, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Veillez saisir la première séquence :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(480, 220, 340, 14);

        btnaligne1.setBackground(new java.awt.Color(204, 204, 255));
        btnaligne1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); 
        btnaligne1.setText("Aligner");
        btnaligne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {//l'évenement sur le bouton aligner
                btnaligne1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnaligne1);
        btnaligne1.setBounds(550, 520, 150, 30);

        jButton1.setText("Retour");
        jButton1.addActionListener(new java.awt.event.ActionListener() { //l'évenement sur le bouton retour
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(0, 0, 65, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\manal\\Desktop\\L2D1\\2020-l2d1\\branches\\Projet_final\\3 - Interface Graphique java\\dna.jpg")); //image arrière plan 
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));//mettre le curseur par défaut 
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 1920, 960);

        btnaligner1.setBackground(new java.awt.Color(204, 204, 255));
        btnaligner1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); 
        btnaligner1.setText("Aligner");
        btnaligner1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
        jPanel1.add(btnaligner1);
        btnaligner1.setBounds(190, 520, 100, 30);

        jTabbedPane1.addTab("BIOInfO.", jPanel1); //conteneur d'onglets nommé BIOInfO (nom de l'application)

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

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {      //l'évenement sur la liste déroulante                                    
        
        String selectedValue = jComboBox.getSelectedItem().toString();  //choix des séquences à aligner : ADN ou PROTEINE
    }                                         

                                        

    private void btnaligne1ActionPerformed(java.awt.event.ActionEvent evt) {    //l'évenement sur le bouton aligner                                       
      

        StringBuffer sequence1 = new StringBuffer(textfield1.getText());    // la première séquence saisie

        StringBuffer sequence2 = new StringBuffer(textfield2.getText());    //la deuxième séquence saisie

        int g, mi, ma;
        
       //convertir la chaine saisie des gap, match et mismatch en entier pour faire les calculs de la classe alignementG
        
        g = Integer.parseInt(gap.getText()); 

        mi = Integer.parseInt(mismatch.getText()); 

        ma = Integer.parseInt(match.getText());
        
      //prendre les valeurs de match(ma),mismatch(mi) et gap(g) saisies sur l'interface et appeler la méthode setMatch de la classe Match
        
        Matrice.setMatch(ma); 

        Matrice.setMismatch(mi);

        Matrice.setGap(g);

        AlignementG al1 = new AlignementG(sequence1,sequence2); //appeler la méthode AlignementG sur les attributs sequence1 et sequence2

        ResAlignement t = new ResAlignement(); // créer une instance et afficher le résultat de l'alignement sur la frame ResAlignement

        t.setTitle("Alignement global"); // définir le titre de la fenêtre des résultats

        t.setVisible(true); //rendre la fenêtre visible
        
      //afficher une erreur lors de non saisie de tout les champs des séquences :
        if(textfield1.getText().isEmpty() || textfield2.getText().isEmpty()  ){

            JOptionPane.showMessageDialog(this, "veuillez remplir tout les champs !");

        }

        t.r3.setText(al1.getMatrice().tableauToString()+ al1.toString()); //récupérer et afficher le résultat sur le textArea de la frame ResAlignement 

        dispose(); //fermer la fenêtre 

    }                                          

                                           

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {     //l'évenement sur le bouton retour                                    
       
        FramePrincipale p = new FramePrincipale(); //boutton pour retourner vers la frame principale sans fermer tout le programme 
        p.setVisible(true); //rendre visible
        dispose();//fermer la fenêtre une fois appuyer sur le boutton retour
    }                                        

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) { // On applique le look à la fenêtre intégral
                if ("Nimbus".equals(info.getName())) { //choix look and feel nimbus
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameAG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        java.awt.EventQueue.invokeLater(new Runnable() {// contrôler les composants de swing des threads (EDT (Event Dispatching Thread))
            public void run() {
                new FrameAG().setVisible(true);
            }
        });
    }

  
                      
}
