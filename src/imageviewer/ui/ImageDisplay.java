package imageviewer.ui;

import imageviewer.model.Image;

/**
 *
 * @author alvaroafonsolopez
 */
public interface ImageDisplay {
    Image current();
    void show(Image image);
}
