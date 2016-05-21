class TableDemo1{
	public static void main(String[] args) {
		for(int i=1; i<=500; i++){
			for(int j=1; j<=10; j++){
				int s = i*j;
				System.out.print(s+"\t");
			}
			System.out.println();
		}
	}
}