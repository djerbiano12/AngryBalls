package angryballs.models;

import java.util.Vector;

import exodecorateur_angryballs.solution.modele.OutilsBille;

import mesmaths.cinematique.Cinematique;
import mesmaths.geometrie.base.Geop;
import mesmaths.geometrie.base.Vecteur;

/**
 * Cas général d'une bille de billard
 * 
 * A MODIFIER
 * 
 * 
 * */
public abstract class Bille {
	// ----------------- classe Bille-------------------------------------

	/**
	 * @return the position
	 */
	public abstract Vecteur getPosition();

	/**
	 * @return the old position
	 */
	public abstract Vecteur getAncienne();

	/**
	 * @return the rayon
	 */
	public abstract double getRayon();

	/**
	 * @return the vitesse
	 */
	public abstract Vecteur getVitesse();

	/**
	 * @return the accélération
	 */
	public abstract Vecteur getAccélération();

	/**
	 * @return the clef
	 */
	public abstract int getClef();

	public abstract void setCouleur(String couleur);

	public abstract String getCouleur();

	/**
	 * @return setAncienne Position
	 */
	public abstract void setAncienne(Vecteur v);

	public double masse() {
		return BilleDeco.ro * Geop.volumeSphère(this.getRayon());
	}

	/**
	 * mise à jour de position et vitesse à t+deltaT à partir de position et
	 * vitesse à l'instant t
	 * 
	 * modifie le vecteur position et le vecteur vitesse
	 * 
	 * laisse le vecteur accélération intact
	 * 
	 * La bille subit par défaut un mouvement uniformément accéléré
	 * */
	public void déplacer(double deltaT) {
		Cinematique.mouvementUniformémentAccéléré(this.getPosition(),
				this.getVitesse(), this.getAccélération(), deltaT);
	}

	/**
	 * calcul (c-à-d mise à jour) éventuel du vecteur accélération. billes est
	 * la liste de toutes les billes en mouvement Cette méthode peut avoir
	 * besoin de "billes" si this subit l'attraction gravitationnelle des autres
	 * billes La nature du calcul du vecteur accélération de la bille est
	 * définie dans les classes dérivées A ce niveau le vecteur accélération est
	 * mis à zéro (c'est à dire pas d'accélération)
	 * */
	public abstract void gestionAccélération(Vector<Bille> billes);

	/**
	 * gestion de l'éventuelle collision de cette bille avec les autres billes
	 * 
	 * billes est la liste de toutes les billes en mouvement
	 * 
	 * Le comportement par défaut est le choc parfaitement élastique (c-à-d
	 * rebond sans amortissement)
	 * 
	 * @return true si il y a collision et dans ce cas les positions et vecteurs
	 *         vitesses des 2 billes impliquées dans le choc sont modifiées si
	 *         renvoie false, il n'y a pas de collision et les billes sont
	 *         laissées intactes
	 * */
	public boolean gestionCollisionBilleBille(Vector<Bille> billes) {
		return OutilsBille.gestionCollisionBilleBille(this, billes);
	}

	/**
	 * gestion de l'éventuelle collision de la bille (this) avec le contour
	 * rectangulaire de l'écran défini par (abscisseCoinHautGauche,
	 * ordonnéeCoinHautGauche, largeur, hauteur)
	 * 
	 * détecte si il y a collision et le cas échéant met à jour position et
	 * vitesse
	 * 
	 * La nature du comportement de la bille en réponse à cette collision est
	 * définie dans les classes dérivées
	 * */
	public abstract void collisionContour(double abscisseCoinHautGauche,
			double ordonnéeCoinHautGauche, double largeur, double hauteur);

	/*
	 * public void dessine(Graphics g) { int width, height; int xMin, yMin;
	 * 
	 * xMin = (int) Math.round(this.getPosition().x - this.getRayon()); yMin =
	 * (int) Math.round(this.getPosition().y - this.getRayon());
	 * 
	 * width = height = 2 * (int) Math.round(this.getRayon());
	 * 
	 * g.setColor(this.getCouleur()); g.fillOval(xMin, yMin, width, height);
	 * g.setColor(Color.CYAN); g.drawOval(xMin, yMin, width, height); }
	 */
	public String toString() {
		return "centre = " + this.getPosition() + " rayon = " + this.getRayon()
				+ " vitesse = " + this.getVitesse() + " accélération = "
				+ this.getAccélération() + " couleur = " + this.getCouleur()
				+ "clef = " + this.getClef();
	}

	// ----------------- classe Bille -------------------------------------
}
