package net.nurbek.HackerRank.Algorithms.Warmup;

public class P10_Time
{
	public static void main(String[] args)
	{
		String time = "12:05:45PM";
		
		String ampm = time.substring(8);
		time = time.substring(0, 8);
		String [] timeArr = time.split(":");
		
		if(ampm.equals("PM"))
		{
			int t = Integer.parseInt(timeArr[0]);
			if(t >= 1 && t <= 11) timeArr[0] = Integer.toString(t+12);
		}
		else if(timeArr[0].equals("12")) timeArr[0] = "00";
		
		System.out.println(timeArr[0] + ":" + timeArr[1] + ":" + timeArr[2]);
	}
}