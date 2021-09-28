package com.assign1;

class Rectangle implements PolygonShape {
    public void calculateArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
}