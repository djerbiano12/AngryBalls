package Sound;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Audio extends Thread {
	private URL url;
	private AudioClip sound;
	private static Audio mel = null;

	public Audio(String arb) {
		url = this.getClass().getClassLoader().getResource(arb);
		sound = Applet.newAudioClip(url);
		sound.play();
	}

	public void jouer() {
		sound.play();
	}

	public static Audio son(String arb) {
		if (Audio.mel == null) {
			try {
				Audio.mel = new Audio(arb);
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}

		}
		return Audio.mel;
	}

	public void jouerEnBoucle() {
		sound.loop();
	}

	public void arreter() {
		sound.stop();
	}
}