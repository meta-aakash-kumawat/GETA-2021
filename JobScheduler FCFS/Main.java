
public class Main 
{
	public static void main(String args[])
	{
		JobScheduler job = new JobScheduler();
		
		int processes[][] = { {0,10}, {6,20}, {60,10}, {110,5} };
		
		int completionTime[]  = job.getCompletionTime(processes);
		int waitingTime[] = job.getWaitingTime(processes);
		int turmAroundTime[] = job.getTurnAroundTime(processes);
		
		for(int i = 0; i < processes.length; i++)
		{
			System.out.println("Process " +i);
			System.out.println("Completion time " +getCompletionTime[i]);
			System.out.println("Waiting time " +getWaitingTime[i]);
			System.out.println("Turn Around Time " +getTurmAroundTime[i]);
			System.out.println();
		}
		System.out.println("Average waiting time " +job.getAvgWaitingTime(processes));
		System.out.println();
		System.out.println("Maximum wating time " +job.maximumWitingTime(processes));
	}
}
 
