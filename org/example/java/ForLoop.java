package org.example.java;
/*
 *
 *
 * @Farhat Ghani
 */

/*
This Loop displays every number from 0 to 999 evenly divisible by 12.
Every for loop has a variable that determines when the loop should begin and end.
This variable is called the counter ( or index).
The counter in the preceding loop is the variable dex.
This program illustrates the three parts of a for statement.
1. The initialization section: in the first part, the dex variable is given an initial value of 0.
2. The conditional section: In the second part, there is a conditional test like one might use in an if
 statement: dex< 1000.
3. The change section: The third part is a statement that changes the value of the dex variable,
 in this program by using the increment operator.
 */
public class ForLoop {

    public static void main(String args[]){

        for (int dex = 0; dex < 1000; dex++){
            if(dex % 12 == 0){
                System.out.println("#" + dex);
            }
        }
    }

}
