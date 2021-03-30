package Question1;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Folder 
{
	String name;
	List<Folder> subFolders;
	Folder parent;
	Date dateAndTime;
	public Folder(String name) 
	{
		this.name = name;
		this.subFolders = new LinkedList<Folder>();
		this.parent = null;
		this.dateAndTime = Calendar.getInstance().getTime();

	}
	
	public String getDateAndTime() 
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String dateAndTime = dateFormat.format(this.dateAndTime);
		return dateAndTime;
	}

	public List<Folder> getSubFolders()
	{
		return subFolders;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public Folder getParent() 
	{
		return parent;
	}

	public void setParent(Folder parent) 
	{
		this.parent = parent;
	}

	public boolean mkdir(String folderName) 
	{
		Folder subFolder = findSubfolder(folderName);
		if (subFolder != null) 
		{
			return false;
		}
		subFolder = new Folder(folderName);
		subFolder.setParent(this);
		this.subFolders.add(subFolder);
		return true;

	}

	public Folder cd(String subFolderName) 
	{
		return findSubfolder(subFolderName);
	}

	public Folder bk() 
	{
		return this.getParent();
	}

	public List<Folder> ls()
	{
		return this.getSubFolders();
	}
	public Folder find(String subFolderName) 
	{
		List<Folder> subFolders = this.getSubFolders();
		Folder foundFolder;
		for (Folder subFolder : subFolders) 
		{
			if (subFolderName.equals(subFolder.getName()))
			{
				return subFolder;
			}
		}
		for (Folder subFolder : subFolders) 
		{
			foundFolder = subFolder.find(subFolderName);
			if (foundFolder != null) 
			{
				return foundFolder;
			}
		}
		return null;

	}
	private Folder findSubfolder(String folderName) 
	{
		for (Folder subFolder : this.getSubFolders()) 
		{
			if (folderName.equals(subFolder.getName())) 
			{
				return subFolder;
			}
		}
		return null;
	}

}