package exodecorateur_angryballs.solution.vues;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;
import mesmaths.geometrie.base.Vecteur;
import angryballs.models.Bille;

/**
 * responsable du dessin des billes
 * 
 * ICI : IL N'Y A RIEN A CHANGER
 * 
 * 
 * */
public abstract class Billard extends Canvas {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Vector<Bille> billes;

	public Billard(Vector<Bille> billes) {
		this.billes = billes;
	}

	public void dessine(Graphics g, Bille b, Vecteur pos, Color couleur,
			Color contour) {
		int width, height;
		int xMin, yMin;

		xMin = (int) Math.round(pos.x - b.getRayon());
		yMin = (int) Math.round(pos.y - b.getRayon());

		width = height = 2 * (int) Math.round(b.getRayon());

		g.setColor(couleur);
		g.fillOval(xMin, yMin, width, height);
		g.setColor(contour);
		g.drawOval(xMin, yMin, width, height);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.Canvas#paint(java.awt.Graphics)
	 */
	public abstract void paint();
	/*
	 * @Override public void paint(Graphics graphics) { int i;
	 * 
	 * for (i = 0; i < this.billes.size(); ++i)
	 * this.billes.get(i).dessine(graphics);
	 * 
	 * // System.out.println("billes dans le billard = " + billes); }
	 */

}
