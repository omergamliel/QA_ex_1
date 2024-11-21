package QA_ex_1.QA_ex_1;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Avivit Lifshin , Omer Gamliel , Heli Cohen
 */
public class AppTest {
	
	question4 tester=new question4();

    /**
     * Regular - 2 positive numbers
     */
    @Test
    public void Test_case_1() {
    	String Expected_result= "A" ;
    	int a=28,b=24; //המשתנים ששולחים לפונקציה
    	String mod = "Regular";
    	String actual_result=tester.Compare(a, b, mod); //המשתנה יכיל את תוצאת הפונקציה לאחר שנפעיל אותה
        assertEquals(Expected_result, actual_result); //בודק אם מה שציפינו זהה למה שיצא בפועל- אם לא זהים יזרוק טעות
    }
    
    /**
     * Regular - 2 negative numbers
     */
    @Test
    public void Test_case_2() {
    	String Expected_result= "B" ;
    	int a= -28,b= -24; //המשתנים ששולחים לפונקציה
    	String mod = "Regular";
    	String actual_result=tester.Compare(a, b, mod); //המשתנה יכיל את תוצאת הפונקציה לאחר שנפעיל אותה
        assertEquals(Expected_result, actual_result); //בודק אם מה שציפינו זהה למה שיצא בפועל- אם לא זהים יזרוק טעות
    }
    
    /**
     * Negative - 2 positive numbers
     */
    @Test
    public void Test_case_4() {
    	String Expected_result= "A" ;
    	int a=28 ,b=38 ; //המשתנים ששולחים לפונקציה
    	String mod = "Negative";
    	String actual_result=tester.Compare(a, b, mod); //המשתנה יכיל את תוצאת הפונקציה לאחר שנפעיל אותה
        assertEquals(Expected_result, actual_result); //בודק אם מה שציפינו זהה למה שיצא בפועל- אם לא זהים יזרוק טעות
    }
    
    /**
     * Negative - 2 negative numbers
     */
    @Test
    public void Test_case_5() {
    	String Expected_result= "B" ;
    	int a=-28 ,b=-46 ; //המשתנים ששולחים לפונקציה
    	String mod = "Negative";
    	String actual_result=tester.Compare(a, b, mod); //המשתנה יכיל את תוצאת הפונקציה לאחר שנפעיל אותה
        assertEquals(Expected_result, actual_result); //בודק אם מה שציפינו זהה למה שיצא בפועל- אם לא זהים יזרוק טעות
    }
    
    /**
     * Reciprocal - 2 positive decimal numbers
     */
    @Test
    public void Test_case_7() {
    	String Expected_result= "A" ;
    	double a=0.2 ,b=0.5 ; //המשתנים ששולחים לפונקציה
    	String mod = "Reciprocal";
    	String actual_result=tester.Compare(a, b, mod); //המשתנה יכיל את תוצאת הפונקציה לאחר שנפעיל אותה
        assertEquals(Expected_result, actual_result); //בודק אם מה שציפינו זהה למה שיצא בפועל- אם לא זהים יזרוק טעות
    }
    
    /**
     * Reciprocal - 2 negative decimal numbers
     */
    @Test
    public void Test_case_8() {
    	String Expected_result= "B" ;
    	double a=-0.2 ,b=-0.5 ; //המשתנים ששולחים לפונקציה
    	String mod = "Reciprocal";
    	String actual_result=tester.Compare(a, b, mod); //המשתנה יכיל את תוצאת הפונקציה לאחר שנפעיל אותה
        assertEquals(Expected_result, actual_result); //בודק אם מה שציפינו זהה למה שיצא בפועל- אם לא זהים יזרוק טעות
    }

}
