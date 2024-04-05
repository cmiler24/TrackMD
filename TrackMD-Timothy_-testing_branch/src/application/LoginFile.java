package application;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LoginFile {
	 private String userName;
	 private String password;
	 private String type;
	 
	 //constructor
	 public LoginFile() {
		 
	 }
	 
	 //mutator for password
	 public void setPassword(String p) {
		 password =p;
	 }
	 
	 //mutator for user
	 public void setUserName(String s) {
		 userName = s;
	 }
	 
	 //mutator for type 
	 public void setType(String t) {
		 type = t;
	 }
	 
	 //getters for password
	 public String getPassword() {
		 return password;
	 }
	 
	 //getters for userName
	 public String getUserName() {
		 return userName;
	 }
	 
	 
	 //getters for type
	 public String getType() {
		 return type;
	 }
	 
	 
	 //create file
	 public void creatFile() throws IOException {
			File p =  new File(userName+".txt");
			if(p.exists() && !p.isDirectory()) {
				
			}
			else {
				FileWriter myWriter = new FileWriter(p);
				myWriter.write(this.userName+"\n"+password + "\n"+ type );
				myWriter.close();
			}
		 
	 }
	 
	 //access file
	 public void accessFile(String userName) throws FileNotFoundException {
		 File fOne = new File(userName+".txt");
		 Scanner scOne = new Scanner(fOne);
		 if(fOne.exists() && !fOne.isDirectory()) { 
				userName = scOne.nextLine();
				password = scOne.nextLine();
				type = scOne.nextLine();
		 }
		 scOne.close();
	 }
}