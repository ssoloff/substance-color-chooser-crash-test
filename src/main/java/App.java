import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public final class App {
    public static void main(final String[] args) throws Exception {
        SwingUtilities.invokeAndWait(() -> {
            try {
                // commenting out the next line will prevent the JVM crash
                UIManager.setLookAndFeel("org.pushingpixels.substance.api.skin.SubstanceGraphiteLookAndFeel");
                JColorChooser.showDialog(null, "Choose Color", Color.BLACK);
            } catch (final Exception e) {
                e.printStackTrace();
            }
        });
    }
}
