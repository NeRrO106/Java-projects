package basicprim;

public class RaportVeterinar {
	public int caini;
	public int pisici;
	
	public int numarAnimale(){
		return caini + pisici;
	}
	public void afisareStatistica(){
		System.out.println("Numarul animalelelor este: " + numarAnimale());
	}
}
