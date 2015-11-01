package exodecorateur_angryballs.solution;

import java.util.Vector;

import angryballs.models.Bille;
import angryballs.models.BilleDeco;
import angryballs.models.acceleration.FrottementVisqueux;
import angryballs.models.acceleration.Newton;
import angryballs.models.acceleration.Pesanteur;
import angryballs.models.acceleration.RU;
import angryballs.models.collision.BilleArretHorizontal;
import angryballs.models.collision.BilleArretVertical;
import angryballs.models.collision.BillePasseMurailles;
import angryballs.models.collision.BilleRebondir;

import mesmaths.geometrie.base.Vecteur;

import exodecorateur_angryballs.solution.Ecouteurs.EcouteurBoutonArrêter;
import exodecorateur_angryballs.solution.Ecouteurs.EcouteurBoutonLancer;
import exodecorateur_angryballs.solution.vues.BillardEnActif;
import exodecorateur_angryballs.solution.vues.BillardEnPassif;
import exodecorateur_angryballs.solution.vues.CadreAngryBalls;

//import exodecorateur_angryballs.modele.*;

/**
 * Gestion d'une liste de billes en mouvement ayant toutes un comportement
 * différent
 * 
 * Idéal pour mettre en place le DP decorator
 * */
public class TestAngryBalls {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// ------------------- création de la liste (pour l'instant vide) des
		// billes -----------------------

		Vector<Bille> billes = new Vector<Bille>();

		// ---------------- création de la vue responsable du dessin des billes
		// -------------------------

		CadreAngryBalls cadre = new CadreAngryBalls(
				"Angry balls",
				"Animation de billes ayant des comportements différents. Situation idéale pour mettre en place le DP Decorator",
				billes, new BillardEnPassif(billes));

		cadre.montrer(); // on rend visible la vue

		// ------------- remplissage de la liste avec 4 billes
		// -------------------------------

		double xMax, yMax;
		double vMax = 0.1;

		// xMax = AnimationBilles.cadre.largeurBillard(); // abscisse maximal
		// yMax = AnimationBilles.cadre.hauteurBillard(); // ordonnée maximale
		xMax = cadre.largeurBillard();
		yMax = cadre.hauteurBillard();

		double rayon = 0.05 * Math.min(xMax, yMax); // rayon des billes : ici
													// toutes les billes ont le
													// même rayon, mais ce n'est
													// pas obligatoire

		Vecteur p0, p1, p2, p3, p4, v0, v1, v2, v3, v4; // les positions des
														// centres des billes et
														// les vecteurs vitesse
														// au démarrage.
														// Elles vont être
														// choisies
														// aléatoirement

		// ------------------- création des vecteurs position des billes
		// ---------------------------------

		p0 = Vecteur.créationAléatoire(0, 0, xMax, yMax);
		p1 = Vecteur.créationAléatoire(0, 0, xMax, yMax);
		p2 = Vecteur.créationAléatoire(0, 0, xMax, yMax);
		p3 = Vecteur.créationAléatoire(0, 0, xMax, yMax);
		p4 = Vecteur.créationAléatoire(0, 0, xMax, yMax);

		// ------------------- création des vecteurs vitesse des billes
		// ---------------------------------

		v0 = Vecteur.créationAléatoire(-vMax, -vMax, vMax, vMax);
		v1 = Vecteur.créationAléatoire(-vMax, -vMax, vMax, 0);
		v2 = Vecteur.créationAléatoire(-vMax, -vMax, vMax, vMax);
		v3 = Vecteur.créationAléatoire(-vMax, -vMax, vMax, vMax);
		v4 = Vecteur.créationAléatoire(-vMax, -vMax, vMax, vMax);

		// --------------- ici commence la partie à changer
		// ---------------------------------

		// billes.add(new BilleMvtRURebond(p0, rayon, v0, Color.red));
		billes.add(new RU(
				new BilleRebondir(new BilleDeco(p0, rayon, v0, "red"))));

		// billes.add(new BilleMvtPesanteurFrottementRebond(p1, rayon, v1, new
		// Vecteur(0,0.001), Color.yellow));

		billes.add(new Pesanteur(new FrottementVisqueux(new BilleRebondir(
				new BilleDeco(p1, rayon, v1, "yellow"))), new Vecteur(0, 0.001)));

		// billes.add(new BilleMvtNewtonFrottementRebond(p2, rayon, v2,
		// Color.green));
		billes.add(new Newton(new FrottementVisqueux(new BilleRebondir(
				new BilleDeco(p2, rayon, v2, "green")))));

		// billes.add(new BilleMvtRUPasseMurailles(p3, rayon, v3, Color.cyan));
		billes.add(new RU(new BillePasseMurailles(new BilleDeco(p3, rayon, v3,
				"cyan"))));

		// billes.add(new BilleMvtNewtonArret(p4, rayon, v4, Color.black));
		billes.add(new Newton(new BilleArretHorizontal(new BilleArretVertical(
				new BilleDeco(p4, rayon, v4, "black")))));

		// ---------------------- ici finit la partie à changer
		// -------------------------------------------------------------

		System.out.println("billes = " + billes);

		// -------------------- création de l'objet responsable de l'animation
		// (c'est un thread séparé) -----------------------

		AnimationBilles animationBilles = new AnimationBilles(billes, cadre);
		
		// Observer
		
		animationBilles.ajouterObserver(new EcouteurBoutonLancer(
				animationBilles));
		animationBilles.ajouterObserver(new EcouteurBoutonArrêter(
				animationBilles));

	

	}

}
