package PracticeQuestions;

public class IncrementDecrementQuiz {

	public static void main(String[] args) 
    {
        int i = 12;
         
        i = i++ + ++i;
     
        System.out.println(i);
        
        test();
        }
	
	public static void test() 
	{
	    int a=11, b=22, c;
	     
	    c = a + b + a++ + b++ + ++a + ++b;
	    //  11 22   11 1  22 1  12     23
	     
	    System.out.println("a="+a); //11
	    System.out.println("b="+b); //22
	    System.out.println("c="+c);//103
	}

}


