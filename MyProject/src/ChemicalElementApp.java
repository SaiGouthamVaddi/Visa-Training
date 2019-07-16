
class ChemicalElement {
	
	private int atomicNumber;
	private char symbolicName;
	private String fullName;
	
	ChemicalElement(int atomicNumber, char symbolicName, String fullName)
	{
		this.atomicNumber = atomicNumber;
		this.symbolicName = symbolicName;
		this.fullName = fullName;
	}
	
	public boolean isTransitionMetal()
	{
		if((atomicNumber >= 21 && atomicNumber <= 31)||(atomicNumber >= 39 && atomicNumber <= 48)
				||(atomicNumber >= 72 && atomicNumber <= 80)||(atomicNumber >= 104 && atomicNumber <= 112))
			return true;
		return false;
	}
	
	public boolean isMetal()
	{
		int[] metals = {13, 49, 50, 81, 82 , 83, 113, 114, 115, 116};
			
				
				for(int an: metals)
				{
					if(an == atomicNumber)
					{
						return true;
					}
				}
				
				
				return false;
	}
	
	public boolean isAlkaliMetal()
	{
		int[] metals = {3, 11, 19, 37, 55, 87};
			
				
				for(int an: metals)
				{
					if(an == atomicNumber)
					{
						return true;
					}
				}
				
				
				return false;
	}
}

public class ChemicalElementApp {
	
	public static void main(String[] args) {
		
		ChemicalElement ce = new ChemicalElement(1, 'H', "Hydrogen");
		if(ce.isMetal())
			System.out.println("It is a Metal");
		else
			System.out.println("It is not a Metal!!");
	}

}
