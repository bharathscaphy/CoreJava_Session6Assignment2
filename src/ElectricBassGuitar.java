
public class ElectricBassGuitar extends StringedInstruments {
	public ElectricBassGuitar()
	{
		super();
		this.name="Bass Guitar";
		this.noOfStrings = 4;
	}
	
	public ElectricBassGuitar(int noOfStrings)
	{
		super();
		this.name = "Bass Guitar";
		this.noOfStrings = noOfStrings;
	}
	@Override
	public void play()
	{
		System.out.println("The Electric "+noOfStrings+" Strings "+name);
	}
}
