package Nov28th2023;
/*
 * Given two integers d and n. Where d is the day, out of 7 days of the week, d varies from 0 to 6 as shown below.
0 - Sunday
1 - Monday
2 - Tuesday
3 - Wednesday
4 - Thursday
5 - Friday
6 - Saturday
 */

public class DaybeforeNdays {

	public static void main(String[] args) {
		int d=0;
		int n = 0;
		int x = n % 7; // number of days in the week 
		int ans = d - x;

		if (ans < 0) {
			ans += 7;
		}

		System.out.print(ans);

	}

}
