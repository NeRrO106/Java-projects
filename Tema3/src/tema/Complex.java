package tema;

public class Complex {
    private int real, imaginar;
    Complex(int real, int imaginar){
        setReal(real);
        setImaginar(imaginar);
    }
    Complex(){
        this(-3,4);
    }
    Complex(Complex c){
        setReal(c.getReal());
        setImaginar(c.getImaginar());
    }

    public void showNumber(){
        if(getImaginar() > 0) System.out.println(getReal() + " + i * " + getImaginar());
        else if(getImaginar() < 0) System.out.println(getReal() + "-i * " + Math.abs(getImaginar()));
        else System.out.println(getReal());
    }

    public void addWithComplex(Complex c){
        setReal(getReal() + c.getReal());
        setImaginar(getImaginar() + c.getImaginar());
        showNumber();
    }

    int getReal(){
        return real;
    }
    int getImaginar(){
        return imaginar;
    }

    void setReal(int value){
        this.real = value;
    }
    void setImaginar(int value){
        this.imaginar = value;
    }

    public static void main(String[] args){
        Complex z1 = new Complex(7,9);
        Complex z2 = new Complex();
        Complex z3 = new Complex(z2);

        z1.addWithComplex(z2);
        z3.showNumber();

    }

}
