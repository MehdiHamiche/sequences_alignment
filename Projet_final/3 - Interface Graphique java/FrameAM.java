package Projet_final;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;


public class FrameAM extends javax.swing.JFrame {
	
	  // déclarer les Variables    
	
    public static javax.swing.JButton btnaligne2; // Bouton à afficher dans la fenetre graphique
    public static javax.swing.JTextField fich;//champs pour afficher le nom du fichier
    public static javax.swing.JTextField gap;//champs de saisie de la valeur gap
    public static javax.swing.JComboBox<String> jComboBox; // ajouter une liste déroulante 
    private javax.swing.JLabel jLabel1;//label pour placer le texte
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;//composant de barres de défilement
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTextField match;//champs de saisie de la valeur match
    public static javax.swing.JTextField mismatch;//champs de saisie de la valeur mismatch
    public static javax.swing.JButton parcourir; // bouton pour parcourir le fichier fasta
    private javax.swing.JButton retour1; // Bouton à afficher dans la fenetre graphique
    public static javax.swing.JTextArea textArea;//champs de texte pour saisir les séquences manuellement

    // Constructeur
	
    public FrameAM() {
        
        initComponents();//méthode pour initialiser les composants de java swing
        this.setTitle("Alignement Multiple"); //titre de la fenêtre
        setExtendedState(JFrame.MAXIMIZED_BOTH);//Affichage en plein écran
        
    }

    FrameAM(String alignement_Multiple) {
        throw new UnsupportedOperationException("Not supported yet.");//Lancer une UnsupportedOperationException
    }
   
    private void initComponents() { //instancier les variables

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jComboBox = new javax.swing.JComboBox<>();
        gap = new javax.swing.JTextField();
        match = new javax.swing.JTextField();
        mismatch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();//composant de barres de défilement
        textArea = new javax.swing.JTextArea();
        fich = new javax.swing.JTextField();
        parcourir = new javax.swing.JButton();
        btnaligne2 = new javax.swing.JButton();
        retour1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
      

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); //contrôler la fermeture de la fenêtre 

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));//arriere plan de la fenêtre
        jTabbedPane1.setForeground(new java.awt.Color(204, 102, 255));//couleur du font d'affichage
        jTabbedPane1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // Police et taille l'écriture 

        jPanel1.setLayout(null);//pour mettre l'image de fond sur toute la background

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PROTEINE", "ADN" }));//creation d'une liste déroulante avec valeurs ADN et PROTEINE 
        jComboBox.addActionListener(new java.awt.event.ActionListener() { //ajouter un listener sur la liste déroulante 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);//ajouter un actionperformed (un évenement) sur la liste déroulante après 
            }
        });
        jPanel1.add(jComboBox);//ajouter la liste déroulante sur le conteneur
        jComboBox.setBounds(100, 70, 120, 20);//redimensionne la composante

        gap.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.add(gap);//ajouter le champs gap sur le conteneur
        gap.setBounds(600, 140, 40, 30);//redimensionne la composante

 
        jPanel1.add(match);//ajouter le champs match sur le conteneur
        match.setBounds(190, 140, 40, 30);

        mismatch.setBackground(new java.awt.Color(240, 240, 240));
 
        jPanel1.add(mismatch);//ajouter le champs mismatch sur le conteneur
        mismatch.setBounds(410, 140, 40, 30);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gap :");//modifier le text du label à Gap
        jPanel1.add(jLabel1);
        jLabel1.setBounds(510, 150, 40, 14);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Match :");//modifier le text du label à Match
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 150, 50, 14);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mismatch :");//modifier le text du label à Mismatch
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 150, 60, 14);

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 14));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Veuillez saisir les séquences à aligner en format fasta:");//ajouter le texte sur le label
        jPanel1.add(jLabel9);
        jLabel9.setBounds(170, 210, 335, 30);

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
  
        jScrollPane2.setViewportView(textArea);//Affecte le composant Scrollable à visualiser.

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(60, 260, 585, 234);

        fich.setBackground(new java.awt.Color(240, 240, 240));
        fich.setText("Ou sélectionnez un fichier :");//ajouter le text 
        fich.addActionListener(new java.awt.event.ActionListener() {//ajouter le listener 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fichActionPerformed(evt);
            }
        });
        jPanel1.add(fich);//ajouter le champs du nom de fichier sur le conteneur
        fich.setBounds(830, 320, 309, 30);

        parcourir.setBackground(new java.awt.Color(204, 204, 255));
        parcourir.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); 
        parcourir.setText("parcourir");
        parcourir.addActionListener(new java.awt.event.ActionListener() {//ajouter le listener sur le bouton parcourir
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parcourirActionPerformed(evt); //l'évenement sur le bouton parcourir
            }
        });
        jPanel1.add(parcourir);//ajouter le bouton sur le conteneur
        parcourir.setBounds(950, 380, 85, 20);

        btnaligne2.setBackground(new java.awt.Color(204, 204, 255));
        btnaligne2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); 
        btnaligne2.setText("Aligner");//ajouter le texte du bouton
        btnaligne2.addActionListener(new java.awt.event.ActionListener() {//ajouter un listener sur le bouton aligner
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaligne2ActionPerformed(evt);//l'évenement sur le bouton aaligner
            }
        });
        jPanel1.add(btnaligne2);//ajouter le bouton sur le conteneur 
        btnaligne2.setBounds(640, 550, 150, 30);

        retour1.setText("Retour");//ajouter le text du bouton retour
        retour1.addActionListener(new java.awt.event.ActionListener() {//ajouter un listener
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retour1ActionPerformed(evt);//l'évenement sur le bouton retour
            }
        });
        jPanel1.add(retour1);//ajouter le bouton sur le conteneur
        retour1.setBounds(0, 0, 65, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\manal\\Desktop\\L2D1\\2020-l2d1\\branches\\Projet_final\\3 - Interface Graphique java\\dna.jpg")); //image arrière plan 
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));//définir le curseur par défaut
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 1920, 960);


        jTabbedPane1.addTab("BIOInfO.", jPanel1);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);
        jTabbedPane1.getAccessibleContext().setAccessibleName("");//associer le contexte au panel

        pack();//permet de mettre une bonne dimension a la fenetre
    }                      

    private void parcourirActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        JFileChooser parcourir = new JFileChooser(); //creer le fichier
        parcourir.showOpenDialog(null);
        File f = parcourir.getSelectedFile();//selectionner un fichier
        String filename = f.getAbsolutePath();//récupérer le chemin absolue su fichier
        fich.setText(filename); //afficher le nom du fichier parcourru sur ce textfield
    }                                         
                                  

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {   //l'évenement sur la liste déroulante                                                                            
      
        String selectedValue = jComboBox.getSelectedItem().toString();//choix des séquences à aligner : ADN ou PROTEINE
    }                                         

    private void fichActionPerformed(java.awt.event.ActionEvent evt) {                                     
       
        
    }                                    
                                          

    private void btnaligne2ActionPerformed(java.awt.event.ActionEvent evt) {      //l'évenement sur le bouton aligner                                     
       
        
        int g1, mi1, ma1;
        g1 = Integer.parseInt(gap.getText());//convertir la chaine saisie des gap, match et mismatch en entier pour faire les calculs de la classe alignement_multiple
        mi1 = Integer.parseInt(mismatch.getText());
        ma1 = Integer.parseInt(match.getText());
        Matrice.setMatch(ma1);
        Matrice.setMismatch(mi1);
        Matrice.setGap(g1);
         ResAlignement t1 = new ResAlignement(); //créer une instance et afficher le résultat de l'alignement sur la frame ResAlignement
         t1.setTitle("Alignement multiple"); //titre 
        t1.setVisible(true);//rendre visible
        
       Sequence.setNature(jComboBox.getSelectedItem().toString());//définir la nature de la séquence selon la valeur choisi de la liste déroulante
         if(textArea.getText().equals("")){ //si le champs textArea est égal à chaine vide 
            
            Fasta1 f=new Fasta1(fich.getName(),new File(fich.getText()));//Extrait les sequences

            ArrayList<Sequence> sequences = f.getSequences();	//du fichier fasta

            Alignement_Multiple alm1 = new Alignement_Multiple(f);

            alm1.calcul();//calcul de matrice et aligner

          
            t1.setVisible(true);//rendre la frame visible

            t1.r3.setText(alm1.toString());//récupérer et afficher le résultat sur le textArea de la frame ResAlignement 
            
          
               dispose();//fermer la fenêtre
           
        }
        
           else{ //sinon
              
            Fasta1 f1=new Fasta1(textArea.getText());//Extrait les sequences
           

            ArrayList<Sequence> sequences1 = f1.getSequences();	//du champs de texte
																		//

            Alignement_Multiple alm2 = new Alignement_Multiple(f1);

            alm2.calcul();

        
            
            t1.setVisible(true);
            t1.r3.setText(alm2.toString());
            
             
            dispose();//fermer la fenêtre
         
        
    }                                          
    }
    private void retour1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
      
        FramePrincipale p = new FramePrincipale();//boutton pour retourner vers la frame principale sans fermer tout le programme 
        p.setVisible(true);
        dispose();//fermer la fenêtre une fois appuyer sur le boutton retour
    }                                       
    
    
   
   public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {// On applique le look à la fenêtre intégral
                if ("Nimbus".equals(info.getName())) {//choix look and feel nimbus
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {// contrôler les composants de swing des threads (EDT (Event Dispatching Thread))
            public void run() {
                new FrameAM().setVisible(true);
                
            }
        });
    }
                  

    
}
