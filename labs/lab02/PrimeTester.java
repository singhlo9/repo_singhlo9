public class PrimeTester {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Usage: not correct input");
			return;
					}
		int numStart = Integer.parseInt(args[0]);
		if(numStart >1){
			if(isPrime(numStart)){
				System.out.println("Prime");
				return;
						}
			//System.out.println("Prime");
			//	return;
			}
		System.out.println("Not Prime");
		return;




						}

	public static boolean isPrime(int s) {
		for (int i = 2; i < s; i++){
			if(s%i == 0){
				return false;}
//			System.out.println(s%i);
			}
		return true;
				}

}


