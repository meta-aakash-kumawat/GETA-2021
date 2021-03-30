package Question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class CommandPrompt {

	Folder currentFolder;
	List<String> folders = new ArrayList<String>();

	public Folder getCurrentFolder() 
	{
		return currentFolder;
	}

	public void setCurrentFolder(Folder currentFolder) 
	{
		this.currentFolder = currentFolder;
	}

	public List<String> getFolders() 
	{
		return folders;
	}

	public CommandPrompt() 
	{
		currentFolder = new Folder("R");
	}
	
	public void runVcp()
	{
		String inputCommand;
		Scanner input = new Scanner(System.in);
		while (true)
		{
			printPath();
			inputCommand = input.nextLine();
			String[] commands = inputCommand.split(" ");
			if (commands.length == 1) 
			{
				switch (commands[0]) 
				{
				case "bk":
					bk();
					break;

				case "ls":
					ls();
					break;

				case "tree":
					tree();
					break;
				case "exit":
					System.exit(0);
					break;

				default:
					System.out.println("Command Not found");
				}
			}
			else if (commands.length == 2)
			{
				switch (commands[0])
				{
				case "mkdir":
					mkdir(commands[1]);
					break;

				case "cd":
					cd(commands[1]);
					break;

				case "find":
					find(commands[1]);
					break;

				default:
					System.out.println("Command Not found");
				}
			}

		}
	}

	public void mkdir(String folderName) 
	{
		boolean status = this.getCurrentFolder().mkdir(folderName);

		if (status == false)
		{
			System.out.println("folder already exist with same name then new folder will not create");
		}

	}
	
	public void cd(String folderName) 
	{
		Folder subFolder = this.getCurrentFolder().cd(folderName);
		if (subFolder != null) 
		{
			this.setCurrentFolder(subFolder);
			this.folders.add(subFolder.getName());
		}
		else 
		{
			System.out.println("folder doesn't exist with this name");
		}
	}

	public void find(String folderName)
	{
		Folder foundFolder = this.getCurrentFolder().find(folderName);
		if (foundFolder != null)
		{
			String path = getPathOfFolder(foundFolder);
			System.out.println(path);
		}
		else 
		{
			System.out.println("Not Found");
		}
	}
	
	private String getPathOfFolder(Folder foundFolder) 
	{

		Folder currentFolder = foundFolder;
		Stack<String> folders = new Stack<String>();
		String path = new String(" ");
		while (currentFolder != null) 
		{
			folders.push(currentFolder.getName());
			currentFolder = currentFolder.getParent();
		}
		while (!folders.empty()) 
		{
			path = path + "/" + folders.pop();
		}
		return path;
	}

	public void bk() 
	{
		if (this.getCurrentFolder().getParent() != null) 
		{
			this.setCurrentFolder(this.getCurrentFolder().getParent());
			this.folders.remove(this.folders.size() - 1);
		}

	}

	public void ls() 
	{
		List<Folder> subFolders = this.getCurrentFolder().ls();

		for (Folder subFolder : subFolders) 
		{
			System.out.println(subFolder.getDateAndTime() + "  " + subFolder.getName());
		}
	}

	public void tree() 
	{
		printTree(this.getCurrentFolder(), 0);

	}

	private void printTree(Folder currentDirectory, int nesting)
	{
		for (Folder subDirectory : currentDirectory.getSubFolders()) 
		{
			for (int i = 0; i < nesting; i++)
				System.out.print("|    ");
			if (subDirectory.getSubFolders().size() != 0) 
			{
				System.out.println("|---" + subDirectory.getName());
				printTree(subDirectory, nesting + 1);
			} 
			else
				System.out.println("|___" + subDirectory.getName());
		}
	}

	private void printPath() 
	{
		System.out.print("R:");
		for (String folderName : this.getFolders()) 
		{
			System.out.print("\\" + folderName);
		}

		System.out.print(">");
	}

	public static void main(String[] args) 
	{
		CommandPrompt command = new CommandPrompt();
		command.runVcp();
	}

}