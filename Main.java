package Testat_11;

/*
 * Paetzel, Lukas
 * Praktikumsaufgaben - 1.1
 * 
 */

//Klasse
public class Main {
	
	//Deklaration der Variablen
	static int summe;	
	
	//Constructor
	public Main()
	{}
	
/*
 * --------------------------------------------------------------------------------------------------------------------------------	
 */
	
	//Aufgabe 1
	public static void determineMaximum(int a,int b,int c)
	{		
		if (a > b && a > c)
		{
			System.out.println(a);
		}
		else if (b > a && b > c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
	}
	
	
	//Mit Rückgabewert: "int"
	public static int determineMaximum2(int a,int b,int c)
	{
		if (a > b && a > c)
		{
			return a;
		}
		else if (b > a && b > c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}

/*
 * --------------------------------------------------------------------------------------------------------------------------------	
 */	
	
	//Aufgabe 2
	public static void interval(int a,int b)
	{	
		for (int i = a; i <= b; i++)
		{
			summe = summe + i;
		}
		
		System.out.println(summe);
	}
	
	
	//Mit Rückgabewert: "int"
	public static int interval2(int a,int b)
	{
		if (a < b)
		{
			for (int i = a; i <= b; i++)
			{
				summe = summe + i;
			}
			return a = summe;
			
		}
		else
		{
			for (int i = b; i <= a; i++)
			{
				summe = summe + i;
			}
			return b = summe;
		}
	}

/*
 * --------------------------------------------------------------------------------------------------------------------------------	
 */	
	
	//Aufgabe 3
	public static void isPythaTriple(int a,int b,int c)
	{
		boolean x;
		
			if (a * a + b * b == c * c)
			{
				x = true;			
			}
			else
			{
				x = false;
			}
		
		System.out.println(x);		
	}
	
	
	//Mit Rückgabewert: "boolean"
	public static boolean isPythaTriple2(int a,int b,int c)
	{
		if (a*a + b*b == c*c)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Musterlösung
	public static boolean isPythaTriple3(int a,int b,int c)
	{
		int aSquare = a * a;
		int bSquare = b * b;
		int cSquare = c * c;
		
		return (aSquare + bSquare == cSquare)
				|| (aSquare + cSquare == bSquare)
				|| (bSquare + cSquare == aSquare);
	}
	
/*
 * --------------------------------------------------------------------------------------------------------------------------------	
 */	
	
	//Aufgabe 4
	public static void digitSum(int a) 
	{
		int summe = 0;
		
			while (0 != a) 
			{
				// addiere die letzte ziffer der uebergebenen zahl zur summe
				summe = summe + (a % 10);
		
				// entferne die letzte ziffer der uebergebenen zahl
				a = a / 10;		
			}	
		
		System.out.println(summe);		
	}
	
/*
 * --------------------------------------------------------------------------------------------------------------------------------	
 */
	
	//Aufgabe 5
	public static void digitToString(int a)
	{
		String[] names = {"Null", "Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};
		
			if (a > 9)
			{
				System.out.println("Bitte geben Sie eine Zahl von 0 bis 9 ein, größere Zahlen sind nicht gestattet");
			}
			else
			{
				System.out.println(a + " --> " + names[a]);
			}		
	}

/*
 * --------------------------------------------------------------------------------------------------------------------------------	
 */	
	
	//Testat 1.1 --> Aufgabe
	
	//Lukas
	public static int Testat(int a,int b)
	{
		int count = 0;
		
		if (a < b)
		{
			for (int i = a; i <= b; i++)
			{
				if (i % 3 == 0 & i % 2 != 0)
				{
					count ++;
				}
			}			
			return count;
		}
		else
		{
			for (int i = b; i <= a; i++)
			{
				if (i % 3 == 0 & i % 2 != 0)
				{
					count++;
				}
			}			
			return count;
		}		
	}
	
	
	//Aaron
	public static int ungeradeDurchDrei(int a,int b)
	{
		int count = 0;
		if (a < b)
		{
			int n = a + 1;
			int m = b - 1;
			
			while (n <= m)
			{
				if (n % 3 == 0 & n % 2 != 0)
				{
					count ++;
				}				
				n++;
			}			
			return count;
		}
		else
		{
			return b;
		}
	}
	
/*
 * --------------------------------------------------------------------------------------------------------------------------------	
 */	
	
	//Aufgabe 6
	public static void intToString(int a)
	{
		
	}
	
/*
 * --------------------------------------------------------------------------------------------------------------------------------	
 */
	
	public static void main(String[] args) 
	{		
		Main objekt = new Main();
		
			System.out.println("Aufgabe 1");
			System.out.println(objekt.determineMaximum2(60, 90, 30));
		
			System.out.println("");
		
			System.out.println("Aufgabe 2");
			System.out.println(objekt.interval2(3, -1));
		
			System.out.println("");
		
			System.out.println("Aufgabe 3");
			System.out.println(objekt.isPythaTriple3(4, 5, 3));
		
			System.out.println("");
		
			System.out.println("Aufgabe 4");
			objekt.digitSum(-17);
		
			System.out.println("");
		
			System.out.println("Aufgabe 5");
			objekt.digitToString(0);
			
			System.out.println("Testat");
			System.out.println(objekt.Testat(1, 100));
			System.out.println();
			System.out.println(objekt.ungeradeDurchDrei(1, 100));
	}
}
