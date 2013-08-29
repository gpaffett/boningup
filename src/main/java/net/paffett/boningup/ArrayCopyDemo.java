package net.paffett.boningup;

class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo1 = new char[7];

        System.arraycopy(copyFrom, 2, copyTo1, 0, 7);
        System.out.println(new String(copyTo1));
        
        
        char[] copyTo2 = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        
        System.out.println(new String(copyTo2));        
    }
}