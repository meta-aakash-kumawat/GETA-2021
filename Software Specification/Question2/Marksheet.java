
public class Marksheet 
{	
	/**
	 * To Find out the averages of all the given grades of n students
	 * @param grades contains grades of different subject of n students
	 * @param numberOfStudents contains number of students
	 * @return int[] averageOfGrades has average of the subjects
	 */
	public int[] average(int grades[][] , int numberOfStudents)
	{	int numberOfSubjects = grades.length;
		int averageOfGrades[] = new int[grades.length];
		for(int i = 0; i < numberOfSubjects; i++ )
		{	int sum = 0;
			for(int j = 0; j < numberOfStudents; j++)
			{
				sum = sum + grades[j][i];
			}
			averageOfGrades[i] = sum/numberOfStudents;
		}
		return averageOfGrades;
	}
	
	/**
	 * To find out the maximum of all the subjects 
	 * @param contains grades of different subject of n students
	 * @param numberOfStudents contains number of students
	 * @return int[] maxGrades has maximum of all the subjects
	 */
	public int[] maxOfGrades(int grades[][] , int numberOfStudents)
	{
		int numberOfSubjects = grades.length;
		int maxGrades[] = new int[numberOfStudents];
		for(int i = 0; i < numberOfSubjects; i++ )
		{	int max = 0;
			for(int j = 0; j < numberOfStudents; j++)
			{
				if( max < grades[j][i])
					max = grades[j][i];
			}
			maxGrades[i] = max;
		}
		return maxGrades;
	}
	
	/**
	 * To find out the minimum of all the subjects 
	 * @param contains grades of different subject of n students
	 * @param numberOfStudents contains number of students
	 * @return int[] minGrades has minimum of all the subjects
	 */
	public int[] minOfGrades(int grades[][] , int numberOfStudents)
	{
		int numberOfSubjects = grades.length;
		int minGrades[] = new int[numberOfStudents];
		for(int i = 0; i < numberOfSubjects; i++ )
		{	int min = 101;
			for(int j = 0; j < numberOfStudents; j++)
			{
				if( min > grades[j][i])
					min = grades[j][i];
			}
			minGrades[i] = min;
		}
		return minGrades;
	}
	/**
	 * To find out the percentage of students 
	 * @param contains grades of different subject of n students
	 * @param numberOfStudents contains number of students
	 * @return float[] percent has percentage of all the students who has score more than 40%
	 */
	public float[] percentage(int grades[][], int numberOfStudents)
	{
		int numberOfSubjects = grades.length;
		float percent[] = new float[numberOfStudents];
		for(int i = 0; i < numberOfStudents; i++)
		{	int sum = 0;
			for(int j = 0; j < numberOfSubjects ;j++)
			{
				sum = sum + grades[i][j];
			}
			float percentagee = 0;
			try
			{
				percentagee = ( (float) sum / (numberOfSubjects * 100) )* 100;
			}
			catch( ArithmeticException e)
			{
				System.out.println(e);
			}
			if( percentagee >= 40)
				percent[i] = percentagee;
			else
				percent[i] =0;
				
		}
		return percent;
	}
}
