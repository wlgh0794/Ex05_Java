package chap05_Array;

public class _03_ArrayExample {

	public static void main(String[] args) {
		
		
		// 3 . chArr의 요소 중 소문자는 대문자로 , 대문자는 소문자로 변환하여
		// convertArr에 저장하세요.
		
		char chArr[] = { 'b' , 'T' , 't' , 'C' } ;
		
		char convertArr[] = new char[ 4 ] ;
		

		for ( int i = 0 ; i < chArr.length; i++ )
		{
			
			if ( ( chArr[ i ] >= 'A' ) && (  chArr[ i ] <= 'Z' ) )
			{
				// [ 방법 1 ]
				
//				convertArr[i] = (char)( chArr[i] + 32 ) ;
				
				// [ 방법 2 ]
				
				convertArr[i] = Character.toLowerCase( chArr[i] ) ;
				
				
				System.out.println( "대문자 입니다." );
				
			}
			else
			{
				
				// [ 방법 1 ]
				
//				convertArr[i] = (char)( chArr[i] - 32 ) ;
				
				// [ 방법 2 ]	
				
				convertArr[i] = Character.toUpperCase( chArr[i] ) ;
				
				System.out.println( "소문자 입니다." );
							
			}
			
			System.out.println( "input 된 데이터 : " + convertArr[i] );
			
		}
 		
		for ( char c : convertArr ) 
		{
			
			System.out.print( c + " / ");
			
		}
		
		
		

	}

}
