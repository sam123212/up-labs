public class Heapp{
    static {
        System.loadLibrary("Functions");
    }

    private native int HeapWork(int min,int max,int size);
 
    public static void main(String[] args) throws InterruptedException 
    {
	Heapp � = new Heapp();
        int val=�.HeapWork(0,8300,2000);
        System.out.println(val);         
    }
}
