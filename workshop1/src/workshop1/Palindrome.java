package workshop1;

public class Palindrome {
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++) {
			Stack tool = new Stack(args[i]);
			char[] data = tool.getData();
			boolean equal = true;
			
			for(int j=0;j<(data.length)/2 && equal;j++) {
				char popElem = tool.pop();
				if(!(data[j]==popElem)) {
					equal = false;
				}
			}
			
			if(equal) {
				System.out.println(args[i] + " is a palindrome.");
			}
			else
			{
				System.out.println(args[i] + " is not a palindrome.");
			}
		}
	}
}
