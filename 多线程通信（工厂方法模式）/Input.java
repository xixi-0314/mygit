class Input implements Runnable {
	   private TaxiBase st;
	   Input (TaxiBase st){
		   this.st=st;
	   }
	   public void run (){
		   while (true){
			   st.come();
		   }
	   }
}