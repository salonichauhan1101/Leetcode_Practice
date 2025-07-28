class Main {
    public static void main(String[] args) {
        int num=983021;
        int count=0;
        
        while(num!=0){
            int temp=num%10;
            if(temp>=0){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
