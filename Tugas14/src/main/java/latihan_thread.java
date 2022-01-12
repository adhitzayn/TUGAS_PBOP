class MyThread1 extends Thread {   
    public void run() {
        try {
            for (int i=0; i<10; i++) {
                System.out.println("Thread pertama: detik ke-" + (i+1));         
                if (i != 9) {           
                    sleep(1000);
                } else {
                    System.out.println("Thread pertama selesai...\n");
                }
            }
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
    }
}

class MyThread2 extends Thread {   
    public void run() {
        try {
            for (int i=0; i<5; i++) {
                System.out.println("Thread kedua: detik ke-" + (i+1));
                if (i != 4) {           
                    System.out.println();           sleep(1000);
                } else {
                    System.out.println("Thread kedua selesai...\n");
                }
            }
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
    }
}

class latihan_thread {
  public static void main(String[] args) {

    MyThread1 t1 = new MyThread1();     t1.start();

    MyThread2 t2 = new MyThread2();     t2.start();
  }
}
