package basic;

import basicprim.RaportVeterinar;


public class Basic {
	public static void main(String[] args) {
		/*boolean eValabil = true;
		char literaPreferata = 'A';
		byte hexa = (byte) 0xdeadbeef;
		byte nrbyte = 125;
		short varsta = 42;
		int datorie = -40;
		long distanca = 160;
		double pret = 999.5;
		float pretF = 999.5F;
		System.out.print(pretF);
		
		/*Date d = new Date();
		d.b = true;
		d.c = 'a';
		d.i = 4;
		d.f = 4.5F;
		//d.s = "Laborator 2";
		d.setS("Laborator 2");
		
		System.out.println(d.b);
		System.out.println(d.c);
		System.out.println(d.i);
		System.out.println(d.f);
		System.out.println(d.getS());
		
		String[] masini = {"Dacia", "BMW", "Volvo"};
		int[] vectorint = new int[20];
		for(int i = 0;i<20;i++){
			vectorint[i] = (i+1) * (i+1);
		}
		System.out.println(masini[2]);
		System.out.println(vectorint[19]);
		System.out.println(vectorint.length);*/
		RaportVeterinar rv = new RaportVeterinar();
		rv.caini = 5;
		rv.pisici = 7;
		rv.afisareStatistica();
		
	}

}
