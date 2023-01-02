class Solution {
    public boolean detectCapitalUse(String word) {
        int lowcount=0;
        int uppcount=0;
        int onlyoneUpp=0;

        if(Character.isUpperCase(word.charAt(0))==true){
            onlyoneUpp++;

            }
     
   
        for(int i=1;i<word.length();i++){
            char ch = word.charAt(i);

            if(Character.isLowerCase(ch)==true){
                lowcount++;
                
            }
            if(Character.isUpperCase(ch)==true){
                uppcount++;

            }
            
        }

        if((onlyoneUpp==1 && lowcount==word.length()-1) ){
            return true;
        }
        
     
        if(lowcount==word.length()-1){
            return true;
        }
        if((onlyoneUpp==0 && uppcount==word.length()-1)){
            return false;
        }
        
        if(uppcount==word.length()-1){
            return true;
        }
       
        

        return false;
        
    }
}