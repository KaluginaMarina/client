package client.gui;

import java.awt.*;

public class Mouse {

    public static Point getXY(ClientGUI gui){
        PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        int x = (int) b.getX();
        int y = (int) b.getY();
        return new Point(x - gui.getX() - gui.panel.x, y - gui.getY() - gui.panel.y);
    }

    public static boolean insideEllipse(ClientGUI gui, Ellipse ellipse){
        Point position = Mouse.getXY(gui);
        if (Math.sqrt( (ellipse.x_center - position.x) * (ellipse.x_center - position.x) + (ellipse.y_center - position.y) * (ellipse.y_center - position.y) ) < (ellipse.widthNow * ellipse.coef) )
        {    System.out.println("(" + ellipse.x_center + "," + ellipse.y_center + ")  (" + position.x + "," + position.y + ")");
            System.out.println(ellipse.widthNow * ellipse.coef);
            System.out.println(Math.sqrt( (ellipse.x_center - position.x) * (ellipse.x_center - position.x) + (ellipse.y_center - position.y) * (ellipse.y_center - position.y) ) + "\n");
        }

        return Math.sqrt( (ellipse.x_center - position.x) * (ellipse.x_center - position.x) + (ellipse.y_center - position.y) * (ellipse.y_center - position.y) ) < (ellipse.widthNow * ellipse.coef);
    }
}
