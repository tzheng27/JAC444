package shapes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new FileReader("shapes.txt"))) {
			String s = null;
			int count = 0;
			Shape[] shapes = new Shape[100];
			while ((s = br.readLine()) != null) {
				String[] tokens = s.split(",");
				
				if(tokens.length <= 1) {
					if(!(tokens[0].toUpperCase().equals("END"))) {
						System.out.println("Invalid side(s)!");
					}
				}
				else {
					if(tokens[0].toUpperCase().equals("CIRCLE")) {
						if(tokens.length == 2) {
							Circle temp = new Circle(Double.parseDouble(tokens[1]));
							if(temp.getRadius() != 0) {
								shapes[count] = temp;
								count++;
							}
						}
					}
					else if(tokens[0].toUpperCase().equals("SQUARE")) {
						if(tokens.length == 2) {
							Square temp = new Square(Double.parseDouble(tokens[1]));
							if(temp.getWidth() != 0) {
								shapes[count] = temp;
								count++;
							}
						}
					}
					else if(tokens[0].toUpperCase().equals("TRIANGLE")) {
						if(tokens.length == 4) {
							Triangle temp = new Triangle(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));
							if(temp.getS1() != 0 && temp.getS2() != 0 && temp.getS3() != 0) {
								shapes[count] = temp;
								count++;
							}
						}
					}
					else if(tokens[0].toUpperCase().equals("RECTANGLE")){
						if(tokens.length == 3) {
							Rectangle temp = new Rectangle(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]));
							if(temp.getLength() != 0 && temp.getWidth() != 0) {
								shapes[count] = temp;
								count++;
							}
						}
					}
					else if(tokens[0].toUpperCase().equals("PARALLELOGRAM")) {
						if(tokens.length == 3) {
							Parallelogram temp = new Parallelogram(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]));
							if(temp.getLength() != 0 && temp.getWidth() != 0) {
								shapes[count] = temp;
								count++;
							}
						}
					}
					else {
						if(tokens[0].toUpperCase().equals("SHAPE") && tokens.length==4) {
							Triangle temp = new Triangle(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));
							if(temp.getS1() != 0 && temp.getS2() != 0 && temp.getS3() != 0) {
								shapes[count] = temp;
								count++;
							}
						}
					}
				}
			}
			
			System.out.println();
			System.out.println(count + " shapes were created:");
			for(int i = 0; i < count; i++) {
				System.out.print(shapes[i].toString());
				System.out.print("perimeter = " + shapes[i].perimeter());
				System.out.println();
				//System.out.printf("perimeter = %f%n", shapes[i].perimeter());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
