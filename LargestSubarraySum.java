// use the risk taker and non risk taker method
// non risk taker is happy with what is presented to him as of now
// he will stay at his current position until a known opportunity surface
// risk taker, on the other hand, is not happy with his current position
// and he will always want to advance the list to see if there is 
// something better out there
// non risk taker will always check on risk taker
// if risk taker is going great out there, non risk taker will join him, else he stays

import java.util.*

public class LargestSubarraySum
{
	public int findLargestSum(int[] arr)
	{
		int max = arr[0];
		int curr_max = arr[0];

		for(int i = 1; i < arr.length; i++)
		{
			curr_max = Math.max(curr_max+arr[i], arr[i]);
			max = Math.max(curr_max, max);
		}

		return max;
	}
}
