
class ChemicalElement2 {
	
	private int atomicNumber;
	private char symbolicName;
	private String fullName;
	static boolean[] metals = new boolean[15];
	static
	{
		for(int i = 0; i < 15; i++)
		{
			if(i == 3 || i == 11 )
				metals[i] = true;
			else
				metals[i] = false;
		}
	}
	ChemicalElement2(int atomicNumber, char symbolicName, String fullName)
	{
		this.atomicNumber = atomicNumber;
		this.symbolicName = symbolicName;
		this.fullName = fullName;
	}
	
	public boolean equals(Object o)
	{
		ChemicalElement2 c = (ChemicalElement2)o;
		if(c.atomicNumber == atomicNumber && c.symbolicName == symbolicName &&
				c.fullName.equals(fullName))
				{
					return true;
				}
		return false;	
	}
	
	public boolean isTransitionMetal()
	{
		
		return (atomicNumber >= 21 && atomicNumber <= 31)? true : 
				(atomicNumber >= 39 && atomicNumber <= 48)? true :
				(atomicNumber >= 72 && atomicNumber <= 80)? true :
					(atomicNumber >= 104 && atomicNumber <= 112) ? true : false;	
					
					
		/*
		 * if((atomicNumber >= 21 && atomicNumber <= 31)||(atomicNumber >= 39 &&
		 * atomicNumber <= 48) ||(atomicNumber >= 72 && atomicNumber <=
		 * 80)||(atomicNumber >= 104 && atomicNumber <= 112)) return true; return false;
		 */
	}
	
	public boolean isMetal()
	{
		int[] metals = {13, 49, 50, 81, 82 , 83, 113, 114, 115, 116};
			
				
		switch(atomicNumber) 
		{
		case 13: return true;
		case 49: return true;
		case 50: return true;
		case 81: return true;
		case 82: return true;
		case 83: return true;
		case 113: return true;
		case 114: return true;
		case 115: return true;
		case 116: return true;
		}
				
				
				return false;
	}
	
	public boolean isAlkaliMetal() {
		
		return (atomicNumber < 15 && metals[atomicNumber])?true:false;
		/*if(atomicNumber < 15 && metals[atomicNumber])
			return true;
		return false;*/
	}
}

public class ChemicalElementApp2{
	
	public static void main(String[] args) {
		
		ChemicalElement2 ce = new ChemicalElement2(1, 'H', "Hydrogen");
		ChemicalElement2 ce1 = new ChemicalElement2(22, 'O', "Oxygen");
		
		if(ce.isAlkaliMetal())
		{
			System.out.println("It is an alkali metal");
		}
		else
		{
			System.out.println("It is not an alkali metal");
		}
		
		
		if(ce1.isTransitionMetal())
		{
			System.out.println("It is Transition metal");
		}
		else
		{
			System.out.println("It is not a Transition metal");
		}
		
	}

}
