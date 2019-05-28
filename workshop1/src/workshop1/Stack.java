package workshop1;

public class Stack {
	private char[] data;
	
	public Stack(){
		data = new char[0];
	}
	
	public Stack(String args) {
		data = args.toCharArray();
	}
	
	public char[] push(char input) {
		char[] temp = new char[data.length+1];
		for(int i=0; i<data.length;i++) {
			temp[i]=data[i];
		}
		temp[data.length]=input;
		data=temp;
		return data;
	}
	
	public char pop() {
		char[] temp = new char[data.length-1];
		char lastEle = data[data.length-1];
		for(int i=0;i<data.length-1;i++) {
			temp[i]=data[i];
		}
		data=temp;
		return lastEle;
	}
	
	public char peek() {
		return data[data.length-1];
	}
	
	public boolean empty() {
		return data.length==0;
	}
	
	public int search(char target) {
		int distance=-1, flag=0;
		for(int i=0;i<data.length && flag==0;i++) {
			if(data[i]==target) {
				flag=1;
				distance=i+1;
			}
		}
		return distance;
	}
	
	public char[] getData() {
		return data;
	}
}
