package apps;

import java.io.File;

public class leo39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		
		File test1 = new File("/Users/test1");
		System.out.println(test1.exists());
		
		File[] roots = File.listRoots();
		for(File root :roots) {
			System.out.println(root.getAbsolutePath());
		}
		
	}

}
