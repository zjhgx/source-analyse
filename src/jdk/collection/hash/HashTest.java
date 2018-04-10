package jdk.collection.hash;

public class HashTest {
	
	static final int MAXIMUM_CAPACITY = 1 << 30;	
	
	public static void main(String[] args){
		String key="test111";
        int hash = key.hashCode();
        String hex = Integer.toBinaryString(hash);        
        System.out.println("hash = " + hash);
        System.out.println("hex = " + hex);
        
        int hash_1 = hash & 0x7FFFFFFF;
        String hex_1 = Integer.toBinaryString(hash_1);        
        
        System.out.println("hash_1= " + hash_1);
        System.out.println("hex_1 = " + hex_1);

        int result=tableSizeFor(10000);
        System.out.println(result);
	}
	  /*
	   * 
	   * 这段代码把n的最高位是1后的位全部置成1,如0010000000变成0011111111，n+1表示获得比n大的最小2的幂
	   * 
	   * 
	   */
	  static final int tableSizeFor(int cap) {
	        int n = cap - 1;
	        String str = Integer.toBinaryString(n);
	        System.out.println(str);
	        System.out.println(n);
//10000000 --》 11000000
	        n |= n >>> 1;
    		String str1 = Integer.toBinaryString(n);
//	        System.out.println(str1);
//	        System.out.println(n);	        
//因为上面那步最高位至少两个1（如果本身只有一个1则以下操作就只有一个1），所以又向右移动了两位
	        n |= n >>> 2;
    		String str2 = Integer.toBinaryString(n);
//	        System.out.println(str2);	
//	        System.out.println(n);
	        
	        n |= n >>> 4;
	        n |= n >>> 8;
	        n |= n >>> 16;
//	        System.out.println(n);

	        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
	    }

}
