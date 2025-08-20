class Main {
    public static void main(String[] args) {
       int num=980315;
       int count=0;
       
       if(num==0){
           count=1;
       }
       else{
           num=Math.abs(num);
           while(num!=0){
               count++;
               num=num/10;
           }
       }
       System.out.println(count);
        
    }
}
