class CPU
{
	double price;
	class Processor
	{
		double cores;
		String manufacturer;
		double getCache()
		{
			return 4.3;
		}
	}
	protected class RAM
	{
		double memory;
		String manufacturer;
		double getClockSpeed()
		{
			return 5.5;
		}
	}
}
public class CPUDetails
{
	public static void main(String[] args)
	{
	System.out.println("Merin Babu\n23MCA042\n13-02-24");
	CPU cpu=new CPU();
	CPU.Processor processor=cpu.new Processor();
	CPU.RAM ram=cpu.new RAM();
	System.out.println("Processor Cache=" + processor.getCache());
	System.out.println("Ram Clock speed" + ram.getClockSpeed());
	}
}
