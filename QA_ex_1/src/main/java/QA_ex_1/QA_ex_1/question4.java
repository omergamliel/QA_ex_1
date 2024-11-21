package QA_ex_1.QA_ex_1;

/**
 * Avivit Lifshin , Omer Gamliel , Heli Cohen
 */
public class question4 {
	
	public static String Compare (double a, double b, String mod) {
		switch(mod) {
		case "Regular":
			if(a<b)
				return "B";
			else
				return "A";
        case "Negative":
            if (-a >= -b) 
                return "A";
            else
                return "B";
        
        case "Reciprocal":
            double reciprocalA = 1.0 / a;
            double reciprocalB = 1.0 / b;
            if (reciprocalA >= reciprocalB) 
                return "A";
            else
                return "B";
        
        default:
            return "Invalid mode";
		}
	}

}
