package chap05_Array;

public class _02_ArrayExample {

	public static void main(String[] args) {
		
		// #######################################################
		
		// 1 . 10개의 정수를 저장하는 배열을 생성하고 3의 배수만 10개 저장하세요.
		
		int count = 0 ;
		
		int num_list[ ] = new int[ 10 ] ;
		
		for ( int i = 0 ; i < num_list.length ; i++ )
		{
			num_list[ i ] = ( ( i + 1 ) * 3 ) ;
			
			System.out.println( " input 데이터  : " + i   );
		}
		
		// #######################################################
		
		// [ while ]
		
		int i = 0 ;
		
		int num_list2[] = new int[ 10 ] ;
		
		while( i <= num_list2.length )
		{
			
			num_list2[ i ] = ( ( i ) * 3 );
			
			System.out.println( " input 데이터  : " + num_list2[ i ]  ) ;				

			i++ ;
			
		}
		
		
		// #######################################################
			
		
		
		
		
		
		

	}

}
