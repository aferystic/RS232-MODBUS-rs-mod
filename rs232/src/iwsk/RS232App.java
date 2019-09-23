/*
 * RS232App.java
 */

package iwsk;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

import javax.swing.*;

/**
 * The main class of the application.
 */
public class RS232App extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new RS232View().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of RS232App
     */
    public static RS232App getApplication() {
        return Application.getInstance(RS232App.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(RS232App.class, args);
    }
}
