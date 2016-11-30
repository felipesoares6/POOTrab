package model;

/**
 *
 * @author felipesoares
 */
public class ValidaCpf {
    
    static public boolean isNumeric(String str)  {  
     try  {  
        double d = Double.parseDouble(str);  
     } catch(NumberFormatException nfe) {  
        return false;  
     }  
        return true;  
    }    
   
    static public boolean validaCpf (String CPF){
        int d1, d2, digito1, digito2, resto, digitoCPF;
        String  nDigResult;

        CPF = CPF.replace(".","");
        CPF = CPF.replace("-","");
		
	if (CPF.equals("00000000000") || CPF.equals("11111111111") || CPF.equals("22222222222") 
			|| CPF.equals("33333333333") || CPF.equals("44444444444") || CPF.equals("55555555555") 
			|| CPF.equals("66666666666") || CPF.equals("77777777777") || CPF.equals("88888888888") || CPF.equals("99999999999") 
			|| (CPF.length() != 11)) {
            return false;
        }
		
        d1 = 0;
        d2 = 0;
        digito1 = 0;
        digito2 = 0;
        resto = 0;

        for (int nCount = 1; nCount < CPF.length() -1; nCount++)
        {
           digitoCPF = Integer.valueOf (CPF.substring(nCount -1, nCount)).intValue();           
           d1 = d1 + ( 11 - nCount ) * digitoCPF; 
           d2 = d2 + ( 12 - nCount ) * digitoCPF;
        }
        
        resto = (d1 % 11);
        
        if (resto < 2){
           digito1 = 0; 
        } else{
           digito1 = 11 - resto; 
        }
           
        d2 += 2 * digito1;

        resto = (d2 % 11);

        if (resto < 2){
           digito2 = 0; 
        } else {
           digito2 = 11 - resto; 
        }
       
        String nDigVerific = CPF.substring (CPF.length()-2, CPF.length());
    
        nDigResult = String.valueOf(digito1) + String.valueOf(digito2);

        return nDigVerific.equals(nDigResult);
    }
}
