package imageviewer.control;


import java.io.File;
import imageviewer.model.Image;
import imageviewer.persistence.FileImageLoader;

/**
 *
 * @author alvaroafonsolopez
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("images");
        FileImageLoader imageLoader = new FileImageLoader(file);
        Image image = imageLoader.load();
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().show(image);
    }
}
