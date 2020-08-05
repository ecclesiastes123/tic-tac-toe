package tictactoe;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        // char[][] arr = {{'X','O','X'},{'O','X','O'},{'X','X','O'}}; 
      //  System.out.print("Enter cells: ");  
        Scanner sc = new Scanner(System.in);
        
        char[][] arr = new char[3][3]; 
        //String str= sc.nextLine(); 
        int count = 0;
        int count_X = 0;
        int count_y = 0;
        boolean X_wins = false;
        boolean y_wins = false;
        boolean is_impossible = false;
        
        // ----------------------check co-ordinates--------------------------
        
         System.out.println("---------");    
         for(int i=0;i<3;i++)    
            { 
                System.out.println("|       |");    
            } 
        System.out.println("---------");   
        
        System.out.print("Enter the coordinates: ");
        String test = sc.nextLine();
        boolean check = true;
        boolean toggs = true;
        int a1=0;
        int b1=0;
        while (true){
        	// String test = sc.nextLine(); 
        	// The string you want to be an integer array. 
        	String[] integerStrings = test.split(" ");  
        	// Splits each spaced integer into a String array. 
        	int[] coords = new int[integerStrings.length];  
        	// Creates the integer array. 
        	for (int i = 0; i < coords.length; i++){ 
        		try {
        				coords[i] = Integer.parseInt(integerStrings[i]); 
        				check = true;
        			}
        		catch (NumberFormatException e) {
        			// do nothing.
        			System.out.println ("You should enter numbers!");
        			check = false;
        			break;
        		}
        	} 
        	if (check){
        	    
        		if( (coords[0] >= 1 && coords[0] <=3) && (coords[1] >= 1 && coords[1] <=3) ){
        			switch (coords[1]) {
        			  case 1:
        				b1 = coords[0] - 1;
        				a1 = 2;
        				break;
        			  case 2:
        				b1 = coords[0] - 1;
        				a1 = 1;
        				break;
        			case 3:
        				b1 = coords[0] - 1;
        				a1 = 0;
        				break;
        			  default:
        				break;
        			}
        			if(arr[a1][b1] == ' ' ||  arr[a1][b1] == '_' ||  arr[a1][b1] == 0 ){
        			    if (toggs){
        			        arr[a1][b1] = 'X';
        			        toggs = false;
        			    }
        			    else{
        			        arr[a1][b1] = 'O';
        			        toggs = true;
        			    }
        			
        				
        			    System.out.println("---------");    
        				for(int i=0;i<3;i++)    
        					{    
        						System.out.print("| ");       
        						for (int j=0;j<3;j++) {    
        						    if( arr[i][j] == 0 ) {
        						        System.out.print("  ");  
        						      }
        						      else{
        						          System.out.print(arr[i][j]+" ");
        						      }
        						}    
        						System.out.println("| ");    
        					} 
        				System.out.println("---------"); 
        				
        				
        //---------------------------Check-Possibility----------------------------------
                    /* for(int a=0; a<3;a++)
                     {            
                        for(int b=0; b<3;b++)
                        {
                           // arr[a][b]=str.charAt(count);
                            // count++;
                            
                            if (arr[a][b]=='X'){
                                count_X++;
                            }
                            else if (arr[a][b]=='O'){
                                count_y++;
                            }
                            else{
                                continue;
                            }
                        }
                     }
                     */
                      if (arr[a1][b1]=='X'){
                                count_X++;
                        }
                      else if (arr[a1][b1]=='O'){
                        count_y++;
                        }
                     
                   String row_1 = arr[0][0]+" "+arr[0][1]+" "+arr[0][2];
                   String row_2 = arr[1][0]+" "+arr[1][1]+" "+arr[1][2];
                   String row_3 = arr[2][0]+" "+arr[2][1]+" "+arr[2][2];
                   
                   String col_1 = arr[0][0]+" "+arr[1][0]+" "+arr[2][0];
                   String col_2 = arr[0][1]+" "+arr[1][1]+" "+arr[2][1];
                   String col_3 = arr[0][2]+" "+arr[1][2]+" "+arr[2][2];
                   
                   
                     
                   
                    System.out.println(count_X); 
                   
                           /* --------------------for rows ---------------------- */
                           
                    if ( count_X - count_y > 1 || count_y - count_X >1 ) {
                        //System.out.println ("Impossible");
                        System.out.print("Enter the coordinates: ");
        				test = sc.nextLine();
        				continue;
                    }
                   
                    else if ( row_1.equals("X X X") && ( row_2.equals("O O O")  || row_3.equals("O O O") ) ){
                       is_impossible=true;
                       // System.out.println("Impossible");
                       System.out.print("Enter the coordinates: ");
        				test = sc.nextLine();
        				continue;
                        
                   }
                    else if (row_2.equals("X X X")  && ( row_1.equals("O O O")  || row_3.equals("O O O") ) ){
                       is_impossible=true;
                       // System.out.println("Impossible");
                       System.out.print("Enter the coordinates: ");
        				test = sc.nextLine();
        				continue;
                        
                   }
                    else if (row_3.equals("X X X")  && ( row_1.equals("O O O")  || row_2.equals("O O O") ) ){
                       is_impossible=true;
                       // System.out.println("Impossible");
                       System.out.print("Enter the coordinates: ");
        				test = sc.nextLine();
        				continue;
                        
                   }
                   
                  
                   /* --------------------for cols ---------------------- */
                   
                    else if (col_1.equals("X X X")  && ( col_2.equals("O O O")  || col_3.equals("O O O") ) ){
                       is_impossible=true;
                       // System.out.println("Impossible");
                       System.out.print("Enter the coordinates: ");
        				test = sc.nextLine();
        				continue;
                
                   }
                    else if (col_2.equals("X X X")  && ( col_1.equals("O O O")  || col_3.equals("O O O") ) ){
                       is_impossible=true;
                       // System.out.println("Impossible");
                       System.out.print("Enter the coordinates: ");
        				test = sc.nextLine();
        				continue;
                
                   }
                    else if (col_3.equals("X X X")  && ( col_1.equals("O O O")  || col_2.equals("O O O") ) ){
                       is_impossible=true;
                       // System.out.println("Impossible");
                       System.out.print("Enter the coordinates: ");
        				test = sc.nextLine();
        				continue;
                
                   }
                    
                    
                    
                    else if( row_1.equals("X X X") ||  row_2.equals("X X X") || row_3.equals("X X X") ||
                        col_1.equals("X X X") || col_2.equals("X X X") || col_3.equals("X X X") || 
                        (arr[0][0]=='X' && arr[1][1]=='X' && arr[2][2]=='X') ||
                        (arr[2][0]=='X' && arr[1][1]=='X' && arr[0][2]=='X') ){
                            X_wins = true;
                            System.out.println("X wins");
                            break;
                        }
                    
                  
                    else if( row_1.equals("O O O") ||  row_2.equals("O O O") || row_3.equals("O O O") ||
                        col_1.equals("O O O") || col_2.equals("O O O") || col_3.equals("O O O") ||
                        (arr[0][0]=='O' && arr[1][1]=='O' && arr[2][2]=='O') ||
                        (arr[2][0]=='O' && arr[1][1]=='O' && arr[0][2]=='O') ){
                            y_wins = true;
                            System.out.println("O wins");
                            break;
                        }
                    
                    else if (count_X == 4 && count_y == 5 || count_X == 5 && count_y == 4  ){
                        System.out.println("Draw");
                        break;
                    }
                    else{
                        // System.out.println("Game not finished");
                        System.out.print("Enter the coordinates: ");
        				test = sc.nextLine();
        				continue;
                    }
                    
                    // break;
    //---------------------------Check-Possibility----------------------------------
        				
        			}
        			else{
        				System.out.println("This cell is occupied! Choose another one!"); 
        				System.out.print("Enter the coordinates: ");
        				test = sc.nextLine();
        				continue;
        			}
        		}
        		else{
        			System.out.println("Coordinates should be from 1 to 3!");
        			System.out.print("Enter the coordinates: ");
        			test = sc.nextLine();
        			continue;
        		}
        	}
        	else{
        		System.out.print("Enter the coordinates: ");
        		test = sc.nextLine();
        		continue;
        	}
        }

        // -------------------------check-co-ordinates-end------------------------------
        
    }
}
