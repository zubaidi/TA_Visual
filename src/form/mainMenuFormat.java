/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Paint;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author Dj_Ubet
 */
public class mainMenuFormat extends JDesktopPane {
    private static final Color latar = Color.BLUE;
    private static final Color latar_2 = Color.WHITE;

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics = (Graphics2D) g.create();
        
        int midY = 100;

        Paint topPaint = new GradientPaint(0, 0, latar,
                0, midY, latar_2);
        graphics.setPaint(topPaint);
        graphics.fillRect(0, 0, getWidth(), midY);
        
        Paint bottomPaint = new GradientPaint(0, midY + 2, latar_2,
                0, getHeight(), latar);
        graphics.setPaint(bottomPaint);
        graphics.fillRect(0, midY, getWidth(), getHeight());

        Image img = new ImageIcon(getClass().getResource("/gambar/siswa.png")).getImage();

        int imgX = img.getWidth(null);
        int imgY = img.getHeight(null);
        graphics.drawImage(img, getWidth() - imgX, getHeight() - imgY, imgX, imgY, null);
        
        graphics.dispose();
              
    }
}
