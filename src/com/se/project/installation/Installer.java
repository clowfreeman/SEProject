/**
 * 
 */
package com.se.project.installation;

/**
 * @author ClPardos
 *
 */
public class Installer {
	public static void install(String username,String password){
		CertificateGenerator.generate(username,password);
	}
	//public String username;
	//public String password;
	//public String getUsername() {
    //    return username;

    //}
    //public void setUsername(String username) {
    //    this.username = username;

    //}
    //public String getPassword() {
    //    return password;
    //}
    //public void setPassword(String password) {
    //    this.password = password;
    //}
    //public void checkInstaller(){
    //	Valid a =new Valid();
    //	a.validate(username,password);
    //}
}

/*class Valid{
	Installer i;
	CertificateGenerator cg;
	public void validate(String username,String password){
		if ((i.username).equals(cg.username)&&(i.password).equals(cg.password)){
			// Aici se face instalarea
		}
		else {
			System.out.println("Username sau Password incorecte!");
		}
	}
}*/