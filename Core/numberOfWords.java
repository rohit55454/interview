class numberOfWords{
	public static void main(String[] args) {
		String s = "hello   hi this is k";
		int count = 0;

/*		String[] sarr = s.split(" ");
		
		for(int i=0; i<sarr.length; i++){
			System.out.println(sarr[i]);
			count++;
		}
		System.out.println("no. of words "+count);

*/
	//////////		OR 		///////////
/*		int len = s.split(" ").length;

		System.out.println("no. of words "+len);
*/
	///////		If String contains more white spaces......
		
		int len = s.split("\\s+").length;
		System.out.println("no. of words "+len);
	}
}