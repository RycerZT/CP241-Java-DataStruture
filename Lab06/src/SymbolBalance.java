import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SymbolBalance
{
    public static void main(String[] args) throws Exception
    {
        //file io part from stackoverflow.com  http://stackoverflow.com/questions/20107717/trying-to-read-a-java-file-with-a-scanner-class
        File inputfile = new File("Test4.java"); //output for Test2.java: "Unbalanced! Symbol } is mismatched";
        //File inputfile = new File(args[0]);
        Scanner in = new Scanner(inputfile);
        //System.out.println(inputfile.exists());
        String lines = "";

        int j=0;
        while(in.hasNextLine()) //reading in the whole file and put them into the string.
        {
            String tempString = in.nextLine();

            //HANDLGING COMMENT BLOCKS:
            if(tempString.contains("/*")) //if the line read contains beginning of comment, discard this line. move on.
            {
                continue; //go to the next iteration of the loop.
            }
            else if (tempString.contains("*\\")) //the line is the end of a comment
            {
                continue; //don't add this line to the "lines" string because it is a comment
            }
            else if(tempString.contains("//")) //same reason as above
            {
                //splitting string from http://stackoverflow.com/questions/3481828/how-to-split-a-string-in-java
                String[] parts = tempString.split("//"); //splits the string to BEFORE // and AFTER //
                //only using the BEFORE part because the rest is just comment --> index 0 in parts[] array
                lines=lines.concat(parts[0]);
                continue;
            }

            //HANDING QUOTATION MARKS:
            else if(tempString.contains("\"")) //beginning of a quotation
            {
                int start = tempString.indexOf("\""); //returns the index of the first occurrence of "
                //System.out.println("start is "+start);
                int end = tempString.lastIndexOf("\""); //returns the index of the LAST occurrence of the "
                //System.out.println("end is "+end);
                if(start == end) //this means there's only 1 " in the string-->mismatched
                {
                    //lastIndexOf counts from the end of the string. if the end index is the same as the begin index of " occurance
                    //that means that there's only 1 " in this line, which usually means that it is mismatched..
                    System.out.println("Unbalanced! Symbol \" is mismatched");
                    System.exit(0);
                }
                else
                {
                    //By replacing the quotations, we ignore the literal string.
                    System.out.println("This is before trimming: " + tempString);
                    String newstring = tempString.substring(start, end+1); //returns a new string that is a substring of tempString
                    tempString = tempString.replace(newstring, "IGNORE"); //replaces each substring with a replacement string
                    System.out.println("This is after trimming: " + tempString);
                }
            }



            //If the line is not a comment line, then concatenate the line to the whole string
            lines = lines.concat(tempString);

        }
        //System.out.print(lines);
        //////////////////////////////////////////////////////////////////////////
        int i=0; //counter as we traverse through the string
        char temp = ' ';

        //Stack<Character> tempstack = new MyStack<Character>(); //NEED TO DECLARE A STACK HERER!!!!!!!!
        //System.out.println(lines);
        ArrayStack stack = new ArrayStack();
        while(i!=lines.length())
        {
            //READING in one character at a time from the string lines -->handle each char one at a time.
            temp = lines.charAt(i);
            //System.out.print(temp);
            if(temp == '(' || temp=='[' || temp =='{')
            {
                stack.push(temp);  //if the char is an opening symbol, then push onto the stack
            }
            else if ((temp == ')' || temp==']' || temp =='}')&& stack.empty())
            {
                //if the character is a closing symbol AND the stack is empty -->ERROR
                System.out.println("Unbalanced! Symbol " + temp + " is mismatched.");
                System.exit(0);
            }
            else if((temp == ')' || temp==']' || temp =='}')&& !stack.empty())
            {
                //if the character is a closing symbol BUT the stack is NOT empty, then pop the top
                char c = (char) stack.pop();

                //compare the top (c) to the temp (current character being read from the string) to see if matched.
                if(temp==')'&&(c!='('))
                {
                    //unexpected pairing --> ERROR is reported
                    System.out.println("Unbalanced! Symbol " + temp + " is mismatched.");
                    System.exit(0);
                }
                else if(temp==']'&&(c!='['))
                {
                    System.out.println("Unbalanced! Symbol " + temp + " is mismatched.");
                    System.exit(0);
                }
                else if(temp=='}'&&(c!='{'))
                {
                    System.out.println("Unbalanced! Symbol " + temp + " is mismatched.");
                    System.exit(0);
                }
            }

            i++;
        }

        //End of file (everything in lines string is read)
        //it needs to ignore the comment!!! System.out.println("Hey! --> " + tempstack.pop());
        if(stack.empty()) // if the stack is NOT empty
        {
            System.out.println("This file is balanced!");

        }
        else
        {
            System.out.println("Leftover " + stack.pop() + " in the stack");
            System.out.println("File not balanced!");
        }


    }

}