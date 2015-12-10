
public class InterViewProblems{

//  Given a list of integers of integers, for each index 
// 	you want to find the product of every integer except 
// 	the integer at that index
	public int [] product_of_all_nums(int [] num){
		int product=0;
		int [] productsArray = new int [num.length];

		for(int i = 0; i< num.length; i++){

			for( int j = i+1; i< num.length; i++){
				product*=;
				productsArray.add(product);
			}

		}
		return productsArray;
	}


	public static void main(String [] args){

		int [] integers = new int {1,7,3,4};

		System.out.println("result: " + Arrays.toString(product_of_all_nums(integers));


	}

}
