class Output implements Runnable {
	private TaxiBase st;
	
	Output (TaxiBase st ){
		this.st =st ;
	}   
	public void run (){
		while (true ){
			st.go();
		}
	}
}