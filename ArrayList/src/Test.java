import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Podaj liczbê naturaln¹: ");	
		Scanner scanner = new Scanner(System.in);			
		String danaWej = scanner.nextLine();
		scanner.close();
		
		try 
		{//
			int liczba = Integer.parseInt(danaWej);
			int maxLiczbaSize = (String.valueOf(liczba)).length();
			int maxWynikSize = (String.valueOf(liczba * liczba)).length();
			List<String> wynikiList = new ArrayList<String>();
			
			
			for (int i = 0; i <= liczba; i++)
			{
				String wyniki = "";
			
				if (i == 0)
					wyniki = String.join("", Collections.nCopies(maxLiczbaSize, " ")) + " ";
				else
					wyniki = String.join("", Collections.nCopies(maxLiczbaSize - String.valueOf(i).length() + 1, " ")) + String.valueOf(i);
				
				for (int j = 1; j <= liczba; j++)
				{
					
					if (i == 0)
						wyniki += String.join("", Collections.nCopies(maxWynikSize - String.valueOf(j).length() + 1, " ")) + String.valueOf(j);
					else
						wyniki += String.join("", Collections.nCopies(maxWynikSize - String.valueOf(i*j).length() + 1, " ")) + String.valueOf(i*j);
				
				}
				
				wynikiList.add(wyniki);
			}			
			
			System.out.println("Tabliczka mno¿enia:");	
			for (String wynik : wynikiList)
			{
				System.out.println(wynik);
			}
			
		}
		catch (Exception e) {
			System.out.println("Nie podano liczby naturalnej.");
		}
		
	}

	
	
}
