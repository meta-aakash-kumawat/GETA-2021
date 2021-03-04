
public class JobScheduler 
{
	public int[] getCompletionTime(int processes[][])
	{
		int numberOfProcess = processes.length;
		int arrivalTimeIndex = 0;
		int burstTimeIndex = 1;
		int processTime = 0;
		int completionTimeProcesses[]=new int[numberOfProcess];
		for(int i = 0; i < numberOfProcess; i++)
		{
			if(i == 0)
			{
				processTime = processes[i][arrivalTimeIndex] + processes[i][burstTimeIndex];
				completionTimeProcesses[i] = processTime;
			}
			else if(processTime < processes[i][arrivalTimeIndex])
			{
				processTime = processes[i][arrivalTimeIndex] + processes[i][burstTimeIndex];
				completionTimeProcesses[i] = processTime;
			}
			else
			{
				processTime = processTime + processes[i][burstTimeIndex];
				completionTimeProcesses[i] = processTime;
			}
		}
		
		return completionTimeProcesses;
	}
	
	public int[] getTurnAroundTime(int processes[][])
	{
		int numberOfProcess = processes.length;
		int burstTimeIndex = 1;
		int arrivalTimeIndex = 0;
		int timeToComplete[] = getCompletionTime(processes);
		int timeToCompleteAfterArrival[] = new int[numberOfProcess];
		for(int i = 0; i < numberOfProcess; i++)
		{
			timeToCompleteAfterArrival[i] = timeToComplete[i] - processes[i][arrivalTimeIndex];
		}
		return timeToCompleteAfterArrival;
	}
	public int[] getWaitingTime(int processes[][])
	{
		int numberOfProcess = processes.length;
		int burstTimeIndex = 1;
		int turnAround[] = getTurnAroundTime(processes);
		int timeProcessToWait[] = new int[numberOfProcess];
		for(int i = 0; i < numberOfProcess; i++)
		{
			timeProcessToWait[i] = turnAround[i] - processes[i][burstTimeIndex];
		}
		return timeProcessToWait;
	}
	public int getAvgWaitingTime(int processes[][])
	{
		int numberOfProcess = processes.length;
		int timeToWait[] = getWaitingTime(processes);
		int totalWaitingTime = 0;
		for(int i = 0; i < numberOfProcess; i++)
		{
			totalWaitingTime = totalWaitingTime + timeToWait[i];
		}
		return totalWaitingTime/numberOfProcess;
	}
	public int maximumWitingTime(int processes[][])
	{
		int numberOfProcess = processes.length;
		int timeToWait[] = getWaitingTime(processes);
		int maxTime = 0;
		for(int i = 0; i < numberOfProcess ;i++)
		{
			if(maxTime <timeToWait[i])
			{
				maxTime = timeToWait[i];
			}
		}
		return maxTime;
	}
}
