
public class Main 
{
	public static void main(String args[])
	{
		JobScheduler job = new JobScheduler();
		
		int processes[][] = { {0,10}, {6,20}, {60,10}, {110,5} };
		
		int completionTime[]  = job.completionTime(processes);
		int waitingTime[] = job.waitingTime(processes);
		int turmAroundTime[] = job.turnAroundTime(processes);
		
		for(int i = 0; i < processes.length; i++)
		{
			System.out.println("Process " +i);
			System.out.println("Completion time " +completionTime[i]);
			System.out.println("Waiting time " +waitingTime[i]);
			System.out.println("Turn Around Time " +turmAroundTime[i]);
			System.out.println();
		}
		System.out.println("Average waiting time " +job.avgWaitingTime(processes));
		System.out.println();
		System.out.println("Maximum wating time " +job.maximumWitingTime(processes));
	}
}
 