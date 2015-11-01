package exodecorateur_angryballs.solution.Ecouteurs;

import java.util.Observable;
import java.util.Observer;

import exodecorateur_angryballs.solution.AnimationBilles;

public abstract class Ecouteur implements Observer {

	AnimationBilles animationBilles;

	public Ecouteur(AnimationBilles animationBilles) {
		this.animationBilles = animationBilles;
	}

	@Override
	public abstract void update(Observable arg0, Object arg1);

}
