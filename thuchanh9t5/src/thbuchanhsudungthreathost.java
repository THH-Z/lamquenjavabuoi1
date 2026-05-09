public class thbuchanhsudungthreathost implements Runnable {
    
    Thread objTh; 

    public thbuchanhsudungthreathost() {
       System.out.println(Thread.currentThread().getName());
        objTh = new Thread(this); 
        System.out.println("Thead objTh isAlive: " + objTh.isAlive());
        objTh.setName("new Thread");
        objTh.start();
    }

    public void run() 
    {
       System.out.println(Thread.currentThread().getName());
       System.out.println(Thread.activeCount());
       System.out.println("Thead objTh isAlive ="+objTh.isAlive());
    }

    public static void main(String[] args) {
        new thbuchanhsudungthreathost();
    }
}