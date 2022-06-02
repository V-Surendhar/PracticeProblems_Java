public class bits_zero{
  public static void main(String[] args){
  
    //number of bits it need to move to attain zero
    
    int num = 22; //10110
    int pos = 0;
    while(num > 0){
      num =num >> 1 ;
      pos ++;
    }
    System.out.println(pos);
  }
}
