package exodecorateur_angryballs.solution.vues;

import java.awt.*;

import java.util.Vector;

import angryballs.models.Bille;

import outilsvues.EcouteurTerminaison;

import outilsvues.Outils;

/**
 * Vue dessinant les billes et contenant les 3 boutons de contrôle (arrêt du
 * programme, lancer les billes, arréter les billes)
 * 
 * ICI : IL N'Y A RIEN A CHANGER
 * 
 * 
 * */
public class CadreAngryBalls extends Frame implements VueBillard {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TextField présentation;
	Billard billard;
	public Button lancerBilles, arrêterBilles;
	Panel haut, centre, bas;
	static double width, height;
	EcouteurTerminaison ecouteurTerminaison;

	public CadreAngryBalls(String titre, String message, Vector<Bille> billes,
			Billard billard) throws HeadlessException {
		super(titre);
		Outils.place(this, 0.5, 0.5);
		this.ecouteurTerminaison = new EcouteurTerminaison(this);

		this.haut = new Panel();
		this.haut.setBackground(Color.LIGHT_GRAY);
		this.add(this.haut, BorderLayout.NORTH);

		this.centre = new Panel();
		this.add(this.centre, BorderLayout.CENTER);

		this.bas = new Panel();
		this.bas.setBackground(Color.LIGHT_GRAY);
		this.add(this.bas, BorderLayout.SOUTH);

		this.présentation = new TextField(message, 100);
		this.présentation.setEditable(false);
		this.haut.add(this.présentation);

		this.billard = billard;
		this.add(this.billard);

		width = this.largeurBillard();
		height = this.hauteurBillard();
		this.lancerBilles = new Button("lancer les billes");
		this.bas.add(this.lancerBilles);
		this.arrêterBilles = new Button("arrêter les billes");
		this.bas.add(this.arrêterBilles);

	}

	public double largeurBillard() {
		return this.billard.getWidth();

	}

	public double hauteurBillard() {
		return this.billard.getHeight();
	}

	@Override
	public void miseAJour() {
		this.billard.paint();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see exodecorateur.vues.VueBillard#montrer()
	 */
	@Override
	public void montrer() {
		this.setVisible(true);
	}

}