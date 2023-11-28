package tema2;

public class Poligon {

    Point[] points;

    Poligon(int n){
        points = new Point[n];
        for (int i = 0; i < n; i++){
            points[i] = new Point(0, 0);
        }
    }
    Poligon(float[]vect, int m){
        this(m/2);
        for(int i=0;i<m/2;i++){
            points[i].changeCoords(vect[2 * i], vect[2 * i + 1]);
        }
    }
}
