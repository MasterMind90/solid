public class Middle{
	OutputInterface formatter ; 
	public Middle(OutputInterface out){
		this.formatter =  out;
		this.formatter.output();
	}

}