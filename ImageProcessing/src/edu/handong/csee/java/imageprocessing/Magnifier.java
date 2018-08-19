package edu.handong.csee.java.imageprocessing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Magnifier extends JPanel{
	BufferedImage image;

	Point p;
	
	int scale;

	Magnifier(BufferedImage image) {
		setSize(200, 200);
		setLocation(0, 0);
		setBackground(Color.blue);
		this.image = image;
		repaint();
	}

	public void paintComponent(Graphics g) {
		g.drawRect(0,  0, 50, 50);
		g.drawImage(image, 0, 0, 100, 100, this);
	}
}
