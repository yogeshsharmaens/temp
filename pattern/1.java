class HelloWorld {
    public void printFun(){
        int num=1;
        String str="";
        for(int i=0; i< 5; i++){
            str=str+" "+num++;
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        hw.printFun();
        
    }
}