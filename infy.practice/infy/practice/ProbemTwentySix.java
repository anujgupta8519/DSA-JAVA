public class ProbemTwentySix {
    
	public static void printString(int num)
	{
		StringBuilder columnName = new StringBuilder();

		while (num> 0) {
	
			int rem = num% 26;
			if (rem == 0) {
				columnName.append("Z");
			num = (num/ 26) - 1;
			}
			else
			{
				columnName.append((char)((rem) + 64));
				num= num/ 26;
			}
		}
		System.out.println(columnName.reverse());
	}

	public static void main(String[] args)
	{
        printString(6);
		printString(26);
		printString(51);
		printString(52);
		printString(80);
		printString(676);
		printString(702);
		printString(705);
	}
}

