
public class ElectricGuitar extends StringedInstruments {
	public ElectricGuitar()
	{
		super();
		this.name = "Guitar";
		this.noOfStrings = 5;
	}
	public ElectricGuitar(int noOfStrings)
	{
		super();
		this.name = "Guitar";
		this.noOfStrings = noOfStrings;
	}
	@Override
	public void play()
	{
		System.out.println("The Electric "+noOfStrings+" String "+name);
	}
}
