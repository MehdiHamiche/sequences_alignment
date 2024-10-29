package Projet_final;

import java.util.ArrayList;
import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		StringBuffer seq1 =new StringBuffer( "ACTG");
		StringBuffer seq2 = new StringBuffer( "ACCTTG");

		Matrice.setMatch(4);
		Matrice.setMismatch(-4);
		Matrice.setGap(-4);
		Alignement al1 = new Alignement(seq1,seq2);
		
		al1.getMatrice().affiche();				//Verifie que la classe
		al1.getMatrice().afficheFleches();		//Matrice marche bien
	
		al1.afficheAlignement();
		System.out.println("\n");
		
		/////////////////////////////////////////////////////////////////////////////////////////
		
		StringBuffer seq3 =new StringBuffer( "MPRCLCQRINCYA");
		StringBuffer seq4 =new StringBuffer( "PYRCKCRNICIA");
		
		Matrice.setMatch(3);
		Matrice.setMismatch(-1);
		Matrice.setGap(-2);
		Alignement al2 = new Alignement(seq3,seq4);
		al2.afficheAlignement();
		
		System.out.println("\n\n");
		
		////////////////////////////////////////////////////////////////////////////////////////
		
		Sequence.setNature("ADN");
		Matrice.setMatch(4);
		Matrice.setMismatch(-4);
		Matrice.setGap(-4);
		
		Fasta f=new Fasta(">1\nACCTTG\n>2\nCTTG\n>3\nATGTTG")
				;				//Extrait les sequences 
		ArrayList<Sequence> sequences = f.getSequences();					//du fichier fasta
		
		Sequence.afficheList(sequences);																								//Affiche les
																										//sequences extraites
		System.out.println("\n");																		//


		Alignement_Multiple alm = new Alignement_Multiple(f);
		alm.calcul();
		alm.afficheSeqMult();
		System.out.println("\n\n");
		
		Sequence.setNature("PROTEINE");
		
		Fasta f1=new Fasta("INSULINE.fasta",new File( "INSULINE.fasta"));				//Extrait les sequences 
		ArrayList<Sequence> sequences1 = f1.getSequences();								//du fichier fasta
		
		Sequence.afficheList(sequences1);																//Affiche les
																										//sequences extraites
		System.out.println("\n");																		//


		Alignement_Multiple alm1 = new Alignement_Multiple(f1);
		
		alm1.calcul();
		
		alm1.afficheSeqMult();
		
		alm1.exporterAlnfa();
		
		Fasta f2=new Fasta("INSULINE.aln-fa",new File("INSULINE.aln-fa"));
		ArrayList<Sequence> sequences2 = f2.getSequences();
		Sequence.afficheList(sequences2);

	}

}



