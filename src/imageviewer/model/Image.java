package imageviewer.model;

import java.io.InputStream;

/**
 *
 * @author alvaroafonsolopez
 */
public interface Image {
    String name();
    InputStream stream();
    Image next();
    Image prev();
}
