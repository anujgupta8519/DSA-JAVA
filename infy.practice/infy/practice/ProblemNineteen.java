import java.util.*;
public class ProblemNineteen
{
	static List<Integer> tmp = new ArrayList<>();
	
	static void makeCombiUtil(int n, int si, int k)
	{
		if (k == 0) {

			for(int i = 0; i < tmp.size(); i++)
			{
				System.out.print(tmp.get(i) + " ");
			}
			System.out.println();
			return;
		}

		for (int i = si; i <= n; i++)
		{
			tmp.add(i);
           // System.out.println(i);
			makeCombiUtil(n, i + 1, k - 1);
     

			tmp.remove(tmp.size() - 1);
            
		}
	}

	static void makeCombi(int n, int k)
	{
		makeCombiUtil(n, 1, k);
		//return ans;
	}
	
	public static void main(String[] args)
	{
		makeCombi(4, 3);
	}
}
