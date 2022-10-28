package es.studium.practica1psp;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Codigo
{
	public static void main(String[] args)
	{
		new Codigo();
	}

	public String lista1()
	{

		File carpeta = new File("C:\\Program files");
		File[] files = carpeta.listFiles();
		List<File> listTotal = Arrays.asList(files);
		List<File> listFiles = new ArrayList<File>();
		List<File> listDirectories = new ArrayList<File>();
		String rs = "";

		for (File element : listTotal)
		{
			if (element.isDirectory())
			{
				listDirectories.add(element);
			} else
			{
				listFiles.add(element);
			}
		}

		for (File element : listDirectories)
		{
			File[] files2 = element.listFiles();
			if (files2 != null)
			{
				List<File> listTotal2 = Arrays.asList(files2);
				List<File> listFiles2 = new ArrayList<File>();
				List<File> listDirectories2 = new ArrayList<File>();

				for (File element2 : listTotal2)
				{
					if (element2.isDirectory())
					{
						listDirectories2.add(element2);
					} else
					{
						listFiles2.add(element2);
						if (element2.getName().endsWith(".exe"))
						{
							rs += element2.getName() + "\n";
						}
					}
				}
			}
		}
		return rs;
	}
	public String lista2()
	{

		File carpeta = new File("C:\\Program files (x86)");
		File[] files = carpeta.listFiles();
		List<File> listTotal = Arrays.asList(files);
		List<File> listFiles = new ArrayList<File>();
		List<File> listDirectories = new ArrayList<File>();
		String rs = "";

		for (File element : listTotal)
		{
			if (element.isDirectory())
			{
				listDirectories.add(element);
			} else
			{
				listFiles.add(element);
			}
		}

		for (File element : listDirectories)
		{
			File[] files2 = element.listFiles();
			if (files2 != null)
			{
				List<File> listTotal2 = Arrays.asList(files2);
				List<File> listFiles2 = new ArrayList<File>();
				List<File> listDirectories2 = new ArrayList<File>();

				for (File element2 : listTotal2)
				{
					if (element2.isDirectory())
					{
						listDirectories2.add(element2);
					} else
					{
						listFiles2.add(element2);
						if (element2.getName().endsWith(".exe"))
						{
							rs += element2.getName() + "\n";
						}
					}
				}
			}
		}
		return rs;
	}

}
