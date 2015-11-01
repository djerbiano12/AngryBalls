package outilsvues;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.lang.reflect.Field;

/**
 * Quelques outils pratiques dans des applis GUI
 * */
public class Outils {

	/**
	 * 
	 * place frame et calcule sa taille en fonction des dimensions de l'écran.
	 * Soient L et H respectivement la largeur et la hauteur de l'écran
	 * 
	 * Alors place l'origine de frame en (Ox*L,Oy*H) et la largeur de frame sera
	 * L*largeur et la hauteur de frame sera H*hauteur
	 * 
	 * 
	 * */
	public static void place(Frame frame, double largeur, double hauteur) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		Dimension screenSize = toolkit.getScreenSize();

		/*
		 * frame.setLocation((int)(screenSize.width*Ox),(int)(screenSize.height*Oy
		 * )); frame.setSize((int)(screenSize.width*largeur),
		 * (int)(screenSize.height*hauteur));
		 */
		frame.setSize((int) (screenSize.width * largeur),
				(int) (screenSize.height * hauteur));
		frame.setLocationRelativeTo(null);
	}

	public static Color getColor(String couleur) {
		if (couleur == null)
			return Color.white;
		try {
			Field field = Color.class.getField(couleur);
			return (Color) field.get(null);
		} catch (Exception e) {
			return Color.white;
		}
	}

}
