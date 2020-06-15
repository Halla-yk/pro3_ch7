/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Abu Yasser
 */
public class ReadFile implements Runnable{


  public void run() {
      File f = new File("testfile.txt");
      synchronized (f) { // synchronized (this) 
		try {
			Scanner sc = new Scanner(f);
			while (sc.hasNextLine())
				System.out.println(sc.nextLine());

		} catch (FileNotFoundException e) {
				e.printStackTrace();
		}
	}


   }
    
}
