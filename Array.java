public class Array{
	public static int[] resize(int n, int[] arr){
		int[] temp=new int[n];
		for (int i=0; i<arr.length; i++){
			temp[i]=arr[i]
		}
		temp[n-1]=4;

		return temp;
	}
	public static void main(String[] args){
		int[] arr={1,2,3};
		int[] value = resize(4,arr);
		for(int i=0; i<value.length; i++){
			System.out.println(value[i]);
		}
	}
}