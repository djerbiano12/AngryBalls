package exodecorateur_angryballs.solution.Ecouteurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import exodecorateur_angryballs.solution.AnimationBilles;

/**
 * ICI : IL N'Y A RIEN A CHANGER
 * 
 * */

public class EcouteurBoutonArr�ter extends EcouteurCadreJFrame implements
		ActionListener {

	public EcouteurBoutonArr�ter(AnimationBilles animationBilles) {
		super(animationBilles);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.animationBilles.arr�terAnimation();
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		try {
			if (arg1 instanceof EcouteurBoutonArr�ter) {
				EcouteurBoutonArr�ter P = (EcouteurBoutonArr�ter) arg1;
				this.getCadre().arr�terBilles.addActionListener(P);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
