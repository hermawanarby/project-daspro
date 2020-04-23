package perulangan3;

public class quiz {
	
int idx, jumlah;
		  
  public void run()
  {
    idx = 0;
    jumlah = 0;
    while (idx < 10)
    {
    	System.out.printf("idx: %d ", idx);
      
	    if (idx != 6)
		jumlah = jumlah + idx;	
	    idx = idx +  2;
    }
	  
}
	public static void main(String[] args) {
		quiz program = new quiz();
		program.run();
	}

}
