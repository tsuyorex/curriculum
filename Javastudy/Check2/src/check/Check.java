package check;

import constants.Constants;

public class Check {
	
    //	課題1：　フィールド変数の宣言
	private static String firstName;
	private static String lastName;

    public static void main(String[] args) {

    	
//    	課題1:　フィールド変数の初期化
    	firstName = "宗";
    	lastName = "剛";
    	
    	
    	printName(firstName,lastName);
    	

//    	課題3:　インスタンス化
    	Pet player1 = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);   	
    	
    	player1.introduce();
    	
    	
    	
    	RobotPet player2 = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
    	
    	player2.introduce();
    	
    }
    
    
//	課題2:　printNameメソッド        
    private static void printName (String firstname, String lastname) {
    	
    	String name;
    	
    	name = firstname + lastname;
    	
    	System.out.println("printNameメソッド → "+name);
    	
    }
    
}
