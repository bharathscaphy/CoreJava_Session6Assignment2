
public class Guitar {
	public static void main(String[] args)
	{
		//Default Values
		ElectricGuitar eg=new ElectricGuitar();
		ElectricBassGuitar ebg=new ElectricBassGuitar();
		
		eg.play();
		ebg.play();
		//Our Values
		eg = new ElectricGuitar(9);
		ebg = new ElectricBassGuitar(5);
		
		eg.play();
		ebg.play();
	}
}
