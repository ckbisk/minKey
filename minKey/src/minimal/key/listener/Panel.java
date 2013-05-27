package minimal.key.listener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Logger;

import javax.swing.JPanel;

public class Panel extends JPanel {

	Panel() {
		setFocusable(true);
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent event) {
				warn(event.toString());
			}

			@Override
			public void keyReleased(KeyEvent event) {
				warn(event.toString());
			}

			@Override
			public void keyPressed(KeyEvent event) {
				warn(event.toString());
			}
		});
	}

	private void warn(String msg) {
		Logger.getLogger(getClass().getName()).warning(msg);
	}

	private static final long serialVersionUID = 1L;
}
