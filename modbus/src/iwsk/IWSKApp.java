///*
// * IWSKApp.java
// */
//
//package iwsk;
//
//import org.jdesktop.application.Application;
//import org.jdesktop.application.SingleFrameApplication;
//
///**
// * The main class of the application.
// */
//public class IWSKApp extends SingleFrameApplication {
//
//    /**
//     * At startup create and show the main frame of the application.
//     */
//    @Override protected void startup() {
//        show(new IWSKView(this));
//    }
//
//    /**
//     * This method is to initialize the specified window by injecting resources.
//     * Windows shown in our application come fully initialized from the GUI
//     * builder, so this additional configuration is not needed.
//     */
//    @Override protected void configureWindow(java.awt.Window root) {
//    }
//
//    /**
//     * A convenient static getter for the application instance.
//     * @return the instance of IWSKApp
//     */
//    public static IWSKApp getApplication() {
//        return Application.getInstance(IWSKApp.class);
//    }
//
//    /**
//     * Main method launching the application.
//     */
//    public static void main(String[] args) {
//        launch(IWSKApp.class, args);
//    }
//}

/*
 * IWSKApp.java
 */

package iwsk;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

import javax.swing.*;

/**
 * The main class of the application.
 */
public class IWSKApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
//        IWSKView GUI = new IWSKView();
////        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        GUI.pack(); // <=========== PACK
////        GUI.setVisible(true);
        //show(new IWSKView());
        JFrame frame = new JFrame("App");
        frame.setContentPane(new IWSKView().mainPanel);
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
     * @return the instance of IWSKApp
     */
    public static IWSKApp getApplication() {
        return Application.getInstance(IWSKApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(IWSKApp.class, args);
    }
}

