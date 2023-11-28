package tema2;

import java.awt.*;

public class Point {
    float x, y;

    Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    public void changeCoords(float xn, float yn){
        this.x = xn;
        this.y = yn;
    }
    @Override
    public String toString(){
        return "PCT(" + x + ", " + y + ")";
    }

    public static void main(String[] args){
        float vect[] = {10.5f,20.5f,30.5f,40.7f,50.9f,60.25f};
        Poligon poligon = new Poligon(vect, vect.length);
        for(int i=0;i<vect.length/2;i++){
            System.out.println(poligon.points[i].toString());
        }
    }
}
