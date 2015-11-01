package angryballs.models;

import java.util.Vector;

import mesmaths.geometrie.base.Vecteur;

public class BilleDeco extends Bille {
	public Vecteur position; // centre de la bille
	public Vecteur ancienne_position;
	public double rayon; // rayon > 0
	public Vecteur vitesse;
	public Vecteur accélération;
	public int clef; // identifiant unique de cette bille

	protected String couleur;

	private static int prochaineClef = 0;

	public static double ro = 1; // masse volumique

	/**
	 * @param centre
	 * @param rayon
	 * @param vitesse
	 * @param accélération
	 * @param couleur
	 */
	public BilleDeco(Vecteur centre, double rayon, Vecteur vitesse,
			Vecteur accélération, String couleur) {
		this.position = centre;
		this.ancienne_position = null;
		this.rayon = rayon;
		this.vitesse = vitesse;
		this.accélération = accélération;
		this.couleur = couleur;
		this.clef = BilleDeco.prochaineClef++;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param position
	 * @param rayon
	 * @param vitesse
	 * @param couleur
	 */
	public BilleDeco(Vecteur position, double rayon, Vecteur vitesse,
			String couleur) {
		this(position, rayon, vitesse, new Vecteur(), couleur);
	}

	/**
	 * @return the position
	 */
	public Vecteur getPosition() {
		return this.position;
	}

	/**
	 * @return the old position
	 */
	public Vecteur getAncienne() {
		return this.ancienne_position;
	}

	/**
	 * @return the rayon
	 */
	public double getRayon() {
		return this.rayon;
	}

	/**
	 * @return the vitesse
	 */
	public Vecteur getVitesse() {
		return this.vitesse;
	}

	/**
	 * @return the accélération
	 */
	public Vecteur getAccélération() {
		return this.accélération;
	}

	/**
	 * @return the clef
	 */
	public int getClef() {
		return this.clef;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getCouleur() {
		return couleur;
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche,
			double ordonnéeCoinHautGauche, double largeur, double hauteur) {

	}

	@Override
	public void gestionAccélération(Vector<Bille> billes) {
		this.getAccélération().set(Vecteur.VECTEURNUL);

	}

	@Override
	public void setAncienne(Vecteur v) {
		this.ancienne_position = v;

	}

}
