package org.openkinect.tests;

import org.openkinect.processing.*;

import processing.core.*;

/**
 * broken getting
 * dlopen(libfreenect.dylib, 9): image not found
 * @author tom
 *
 */
public class MultiKinectV1 extends PApplet{
	
	private Kinect kinect;

	public static void main(String[] args) {
		PApplet.main(new String[] { "org.openkinect.tests.MultiKinectV1"});
	}

	public void settings() {
		size(512*3, 424*2);
	}
	
	
	public void setup(){
		kinect = new Kinect(this);
		kinect.startVideo();
		kinect.startDepth();
	}
	
	
	public void draw(){
		background(0);
		
		PImage depth = kinect.getDepthImage();
		image(depth, 0, 0);
		
		PImage rgb = kinect.getVideoImage();
		image(rgb, 512*2, 0, 512, 424);
	}
	
}
