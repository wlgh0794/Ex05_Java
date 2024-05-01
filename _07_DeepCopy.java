package chap05_Array;

public class _07_DeepCopy {

	public static void main(String[] args) {
		
		// ########################################
		
		// 2 . [ 깊은복사 ]
		// 깊은 복사는 Heep 메모리 영역에 새로운 배열을 생성해서 전달하기 때문에
		// 서로 다른 배열을 바라보게 하는 것이다 .
		// 원본값이 변하지 않음
		
		// [2-1] clone 메소드 사용
		
		// Heap 메모리 영역에 { 1 ,2 ,3 ,4 ,5 } 라는 새로운 배열을 생성하고 그 주소를 전달
		
		int arr[] = { 1 ,2 ,3 ,4 ,5 } ;
		
		int copyArr1[] = arr.clone();
		
		System.out.println( arr );
		System.out.println( copyArr1 );
		System.out.println( arr == copyArr1 );
		
		// ########################################
		
		// [2-2] - System.arraycopy() 사용
		
		int copyArr2[] = new int[5] ;
		
		System.arraycopy(arr, 0, copyArr2, 0, arr.length); 
		
		System.out.println(  arr  );
		
		System.out.println( copyArr2  );
		
		System.out.println( arr == copyArr2 );
		
		
		for ( int num : copyArr2 )
		{
			System.out.println( num );
			
		}
		
		copyArr1[0] = 100 ;
		copyArr2[0] = 1000 ;
		arr[0] = 10000 ;
		
		System.out.println( arr[0] );
		
		System.out.println( copyArr1[0] );
		
		System.out.println( copyArr1[2] );
		
 		
		// ########################################
		
	}

}
